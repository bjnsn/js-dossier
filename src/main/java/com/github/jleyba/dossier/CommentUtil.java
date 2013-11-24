// Copyright 2013 Jason Leyba
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.github.jleyba.dossier;

import static com.google.common.base.Preconditions.checkArgument;

import com.github.jleyba.dossier.proto.Dossier;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSTypeExpression;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.Nullable;

/**
 * Utility class for working with JSDoc comments.
 */
class CommentUtil {
  private CommentUtil() {}  // Utility class.

  private static Pattern SUMMARY_REGEX = Pattern.compile("(.*?\\.)[\\s$]", Pattern.DOTALL);
  private static final Pattern TAGLET_START_PATTERN = Pattern.compile("\\{@(\\w+)\\s");

  /**
   * Extracts summary sentence from the provided comment text. This is the substring up to the
   * first period (.) followed by a blank, tab, or newline.
   */
  static String getSummary(String text) {
    Matcher matcher = SUMMARY_REGEX.matcher(text);
    if (matcher.find()) {
      return matcher.group(1);
    }
    return text;
  }

  /**
   * Extracts hte summary sentence from the block comment of the given {@link JSDocInfo} object.
   * @see #getSummary(String)
   */
  static String getSummary(@Nullable JSDocInfo info) {
    if (info == null) {
      return "";
    }
    return getSummary(extractCommentString(info.getOriginalCommentString()));
  }

  /**
   * Extracts the block comment string from the given {@link JSDocInfo} object.
   */
  static Dossier.Comment getBlockDescription(Linker linker, @Nullable JSDocInfo info) {
    if (info == null) {
      return Dossier.Comment.getDefaultInstance();
    }

    String comment = info.getBlockDescription();
    if (!Strings.isNullOrEmpty(comment)) {
      // The Closure compiler trims each line in a block description, which can throw off
      // the formatting in the comment (e.g. <pre> tags). To avoid this, we re-parse the
      // comment.
      comment = extractCommentString(info.getOriginalCommentString());
    } else if (info.isDefine()) {
      // The comment may be of the form:
      // \**
      //  * @define {type} Comment text.
      //  *\
      for (JSDocInfo.Marker marker : info.getMarkers()) {
        if ("define".equals(marker.getAnnotation().getItem())) {
          if (marker.getDescription() != null) {
            comment = marker.getDescription().getItem();
          }
          break;  // Only one @define annotation is allowed.
        }
      }
    }

    if (Strings.isNullOrEmpty(comment)) {
      return Dossier.Comment.getDefaultInstance();
    }

    return parseComment(comment, linker);
  }

  static String getMarkerDescription(JSDocInfo info, String annotation) {
    for (JSDocInfo.Marker marker : info.getMarkers()) {
      if (annotation.equals(marker.getAnnotation().getItem())) {
        return extractCommentString(info.getOriginalCommentString(), marker);
      }
    }
    return "";
  }

  static String extractCommentString(String originalCommentString, JSDocInfo.Marker marker) {
    int startLine = marker.getDescription().getStartLine();
    int endLine = marker.getDescription().getEndLine();

    Iterable<String> lines = Splitter.on('\n').split(originalCommentString);
    lines = Iterables.skip(lines, startLine - 1);
    if (startLine != endLine) {
      lines = Iterables.limit(lines, endLine - startLine);
    }

    ArrayList<String> lineList = Lists.newArrayList(lines);
    for (int i = 0; i < lineList.size(); ++i) {
      String line = lineList.get(i);
      if (i == 0) {
        // Offset index by 1 to skip space after the annotation.
        int index = marker.getDescription().getPositionOnStartLine() + 1;
        line = line.substring(index);

      } else if (i == lineList.size() - 1) {
        int index = marker.getDescription().getPositionOnEndLine();
        line = line.substring(index);

      } else {
        line = leftTrimCommentLine(line);
      }

      int index = line.indexOf("*/");
      if (index != -1) {
        line = line.substring(0, index);
      }

      lineList.set(i, line);
    }

    return Joiner.on('\n').join(lineList);
  }

  private static String extractCommentString(@Nullable String originalCommentString) {
    if (Strings.isNullOrEmpty(originalCommentString)) {
      return "";
    }

    // The Closure compiler trims whitespace from each line of the block comment string, which
    // ruins formatting on <pre> blocks, so we have to do a quick and dirty re-parse.

    // Trim the opening \** and closing \*
    String comment = originalCommentString;
    int index = comment.lastIndexOf("*/");
    if (index != -1) {
      comment = comment.substring(0, index);
    }
    index = comment.indexOf("/**");
    if (index != -1) {
      comment = comment.substring(index + 3);
    }

    StringBuilder builder = new StringBuilder();
    for (String line : Splitter.on('\n').split(comment)) {
      line = leftTrimCommentLine(line);

      // Check for an annotation (@foo) by scanning ahead for the first non-whitespace
      // character on the line. This indicates we have reached the end of the block comment.
      boolean annotation = false;
      for (int i = 0; i < line.length() && !annotation; ++i) {
        char c = line.charAt(i);
        if ('@' == c && (i + 1 < line.length())) {
          c = line.charAt(i + 1);
          annotation = ('A' <= c && c <= 'Z') || ('a' <= c && c <= 'z');
        } else if (!Character.isWhitespace(c)) {
          break;
        }
      }

      if (annotation) {
        break;
      }
      builder.append(line).append("\n");
    }
    return builder.toString();
  }

  private static String leftTrimCommentLine(String line) {
    for (int i = 0; i < line.length(); ++i) {
      char c = line.charAt(i);
      if ('*' == c) {
        line = line.substring(i + 1);
        break;
      }

      if (!Character.isWhitespace(c)) {
        break;
      }
    }
    return line;
  }

  private static Dossier.Comment.Token.Builder newToken(String text) {
    return Dossier.Comment.Token.newBuilder().setText(text);
  }

  /**
   * Parses the {@code text} of a JSDoc block comment.
   */
  static Dossier.Comment parseComment(String text, Linker linker) {
    Dossier.Comment.Builder builder = Dossier.Comment.newBuilder();
    if (Strings.isNullOrEmpty(text)) {
      return builder.build();
    }

    int start = 0;
    while (true) {
      int tagletStart = findInlineTagStart(text, start);
      if (tagletStart == -1) {
        if (start < text.length()) {
          builder.addToken(newToken(text.substring(start)));
        }
        break;
      } else if (tagletStart > start) {
        builder.addToken(newToken(text.substring(start, tagletStart)));
      }

      int tagletEnd = findInlineTagEnd(text, tagletStart + 1);
      if (tagletEnd == -1) {
        builder.addToken(newToken(text.substring(start)));
        break;
      }

      String tagletName = getTagletName(text, tagletStart);
      String tagletPrefix = "{@" + tagletName + " ";
      String tagletText = text.substring(tagletStart + tagletPrefix.length(), tagletEnd);
      switch (tagletName) {
        case "code":
          builder.addToken(newToken(tagletText).setIsCode(true));
          break;

        case "link":
        case "linkplain":
          LinkInfo info = LinkInfo.fromText(tagletText);
          @Nullable String link = linker.getLink(info.type);

          Dossier.Comment.Token.Builder token = newToken(info.text)
              .setIsCode("link".equals(tagletName))
              .setUnresolvedLink(link == null);
          if (link != null) {
            token.setHref(link);
          }
          builder.addToken(token);
          break;

        case "literal":
          builder.addToken(newToken(tagletText).setIsLiteral(true));
          break;

        default:
          builder.addToken(newToken(tagletText));
      }
      start = tagletEnd + 1;
    }

    return builder.build();
  }

  private static int findInlineTagStart(String text, int start) {
    Matcher matcher = TAGLET_START_PATTERN.matcher(text);
    if (!matcher.find(start)) {
      return -1;
    } else if (text.indexOf('}', matcher.start()) == -1) {
      return -1;
    } else {
      return matcher.start();
    }
  }

  private static String getTagletName(String text, int start) {
    Matcher matcher = TAGLET_START_PATTERN.matcher(text);
    checkArgument(matcher.find(start));
    return matcher.group(1);
  }

  private static int findInlineTagEnd(String text, int start) {
    int end = text.indexOf('}', start);
    if (end == -1) {
      return -1;
    }

    int nestedOpen = text.indexOf('{', start);
    if (nestedOpen != -1 && nestedOpen < end) {
      int nestedClose = findInlineTagEnd(text, nestedOpen + 1);
      if (nestedClose == -1) {
        return -1;
      }
      return findInlineTagEnd(text, nestedClose + 1);
    }

    return end;
  }

  static String formatTypeExpression(JSTypeExpression expression, Linker resolver) {
    // If we use JSTypeExpression#evaluate(), all typedefs will be resolved to their native
    // types, which produces very verbose expressions.  Keep things simply and rebuild the type
    // expression ourselves. This has the added benefit of letting us resolve type links as we go.
    return formatTypeExpression(resolver, expression.getRoot());
  }

  private static String formatTypeExpression(Linker resolver, Node node) {
    switch (node.getType()) {
      case Token.LC:     // Record type.
        return formatRecordType(resolver, node.getFirstChild());

      case Token.BANG:   // Not nullable.
        return "!" + formatTypeExpression(resolver, node.getFirstChild());

      case Token.QMARK:  // Nullable or unknown.
        Node firstChild = node.getFirstChild();
        if (firstChild != null) {
          return "?" + formatTypeExpression(resolver, firstChild);
        } else {
          return "?";
        }

      case Token.EQUALS:
        return formatTypeExpression(resolver, node.getFirstChild()) + "=";

      case Token.ELLIPSIS:
        return "..." + formatTypeExpression(resolver, node.getFirstChild());

      case Token.STAR:
        return "*";

      case Token.LB:  // Array type.  Is this really valid?
        return "[]";

      case Token.PIPE:
        List<String> types = Lists.newArrayList();
        for (Node child = node.getFirstChild(); child != null; child = child.getNext()) {
          types.add(formatTypeExpression(resolver, child));
        }
        return "(" + Joiner.on("|").join(types) + ")";

      case Token.EMPTY:  // When the return value of a function is not specified.
        return "";

      case Token.VOID:
        return "void";

      case Token.STRING:
        return formatTypeString(resolver, node);

      case Token.FUNCTION:
        return formatFunctionType(resolver, node);

      default:
        throw new IllegalStateException(
            "Unexpected node in type expression: " + node);
    }
  }

  private static String formatTypeString(final Linker linker, Node node) {
    String output = node.getString();

    @Nullable String path = linker.getLink(output);
    if (path != null) {
      output = String.format("<a href=\"%s\">%s</a>", path, output);
    }

    List<String> templateNames = getTemplateTypeNames(node);
    if (!templateNames.isEmpty()) {
      templateNames = Lists.transform(templateNames, new Function<String, String>() {
        @Override
        public String apply(String input) {
          @Nullable String path = linker.getLink(input);
          if (path == null) {
            return input;
          }
          return String.format("<a href=\"%s\">%s</a>", path, input);
        }
      });
      output += ".&lt;" + Joiner.on(", ").join(templateNames) + "&gt;";
    }

    return output;
  }

  private static ImmutableList<String> getTemplateTypeNames(Node node) {
    checkArgument(node.isString());
    ImmutableList.Builder<String> builder = ImmutableList.builder();
    if (node.getFirstChild() != null && node.getFirstChild().isBlock()) {
      for (Node name = node.getFirstChild().getFirstChild();
          name != null && name.isString(); name = name.getNext()) {
        builder.add(name.getString());
      }
    }
    return builder.build();
  }

  private static String formatFunctionType(Linker resolver, Node node) {
    List<String> parts = new ArrayList<>();

    Node current = node.getFirstChild();
    if (current.getType() == Token.THIS || current.getType() == Token.NEW) {
      Node context = current.getFirstChild();
      String contextType = current.getType() == Token.NEW ? "new: " : "this: ";
      String thisType = formatTypeExpression(resolver, context);
      parts.add(contextType + thisType);
      current = current.getNext();
    }

    if (current.getType() == Token.PARAM_LIST) {
      for (Node arg = current.getFirstChild(); arg != null; arg = arg.getNext()) {
        if (arg.getType() == Token.ELLIPSIS) {
          if (arg.getChildCount() == 0) {
            parts.add("...");
          } else {
            parts.add(formatTypeExpression(resolver, arg.getFirstChild()));
          }
        } else {
          String type = formatTypeExpression(resolver, arg);
          if (arg.getType() == Token.EQUALS) {
            type += "=";
          }
          parts.add(type);
        }
      }
      current = current.getNext();
    }

    StringBuilder builder = new StringBuilder("function(")
        .append(Joiner.on(", ").join(parts))
        .append(")");

    String returnType = formatTypeExpression(resolver, current);
    if (!Strings.isNullOrEmpty(returnType)) {
      builder.append(": ").append(returnType);
    }

    return builder.toString();
  }

  private static String formatRecordType(Linker resolver, Node node) {
    StringBuilder builder = new StringBuilder();

    for (Node fieldTypeNode = node.getFirstChild(); fieldTypeNode != null;
        fieldTypeNode = fieldTypeNode.getNext()) {
      // Get the property's name.
      Node fieldNameNode = fieldTypeNode;
      boolean hasType = false;

      if (fieldTypeNode.getType() == Token.COLON) {
        fieldNameNode = fieldTypeNode.getFirstChild();
        hasType = true;
      }

      String fieldName = fieldNameNode.getString();
      if (fieldName.startsWith("'") || fieldName.startsWith("\"")) {
        fieldName = fieldName.substring(1, fieldName.length() - 1);
      }

      // Get the property type.
      String type;
      if (hasType) {
        type = formatTypeExpression(resolver, fieldTypeNode.getLastChild());
      } else {
        type = "?";
      }

      if (builder.length() != 0) {
        builder.append(", ");
      }
      builder.append(fieldName)
          .append(": ")
          .append(type);
    }

    return "{" + builder + "}";
  }

  private static class LinkInfo {

    private final String type;
    private final String text;

    private LinkInfo(String type, String text) {
      this.type = type;
      this.text = text;
    }

    static LinkInfo fromText(String text) {
      String linkedType = text;
      String linkText = text;
      int index = text.indexOf(' ');
      if (index != -1) {
        linkedType = text.substring(0, index);
        linkText= text.substring(index + 1);
      }
      return new LinkInfo(linkedType, linkText);
    }
  }
}
