/*
 Copyright 2013-2015 Jason Leyba

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dossier.proto

package com.github.jsdossier.proto;

/**
 * Protobuf type {@code dossier.SourceLink}
 *
 * <pre>
 * Defines a link to a symbol's definition in its rendered source file.
 * </pre>
 */
public final class SourceLink extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:dossier.SourceLink)
    SourceLinkOrBuilder {
  // Use SourceLink.newBuilder() to construct.
  private SourceLink(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private SourceLink(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final SourceLink defaultInstance;
  public static SourceLink getDefaultInstance() {
    return defaultInstance;
  }

  public SourceLink getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private SourceLink(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    initFields();
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownField(input, unknownFields,
                                   extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000001;
            path_ = bs;
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            line_ = input.readInt32();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e.getMessage()).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.jsdossier.proto.Dossier.internal_static_dossier_SourceLink_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.jsdossier.proto.Dossier.internal_static_dossier_SourceLink_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.jsdossier.proto.SourceLink.class, com.github.jsdossier.proto.SourceLink.Builder.class);
  }

  public static com.google.protobuf.Parser<SourceLink> PARSER =
      new com.google.protobuf.AbstractParser<SourceLink>() {
    public SourceLink parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SourceLink(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<SourceLink> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  public static final int PATH_FIELD_NUMBER = 1;
  private java.lang.Object path_;
  /**
   * <code>required string path = 1;</code>
   *
   * <pre>
   * Path from the current file to the rendered source file.
   * </pre>
   */
  public boolean hasPath() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>required string path = 1;</code>
   *
   * <pre>
   * Path from the current file to the rendered source file.
   * </pre>
   */
  public java.lang.String getPath() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        path_ = s;
      }
      return s;
    }
  }
  /**
   * <code>required string path = 1;</code>
   *
   * <pre>
   * Path from the current file to the rendered source file.
   * </pre>
   */
  public com.google.protobuf.ByteString
      getPathBytes() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      path_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LINE_FIELD_NUMBER = 2;
  private int line_;
  /**
   * <code>optional int32 line = 2;</code>
   *
   * <pre>
   * The line in the source file containing the symbol, if known.
   * </pre>
   */
  public boolean hasLine() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional int32 line = 2;</code>
   *
   * <pre>
   * The line in the source file containing the symbol, if known.
   * </pre>
   */
  public int getLine() {
    return line_;
  }

  private void initFields() {
    path_ = "";
    line_ = 0;
  }
  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (!hasPath()) {
      memoizedIsInitialized = 0;
      return false;
    }
    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeBytes(1, getPathBytes());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeInt32(2, line_);
    }
    getUnknownFields().writeTo(output);
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, getPathBytes());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, line_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  protected java.lang.Object writeReplace()
      throws java.io.ObjectStreamException {
    return super.writeReplace();
  }

  public static com.github.jsdossier.proto.SourceLink parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.jsdossier.proto.SourceLink parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.jsdossier.proto.SourceLink parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.jsdossier.proto.SourceLink parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.jsdossier.proto.SourceLink parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.github.jsdossier.proto.SourceLink parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.github.jsdossier.proto.SourceLink parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.github.jsdossier.proto.SourceLink parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.github.jsdossier.proto.SourceLink parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.github.jsdossier.proto.SourceLink parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(com.github.jsdossier.proto.SourceLink prototype) {
    return newBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() { return newBuilder(this); }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code dossier.SourceLink}
   *
   * <pre>
   * Defines a link to a symbol's definition in its rendered source file.
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:dossier.SourceLink)
      com.github.jsdossier.proto.SourceLinkOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.jsdossier.proto.Dossier.internal_static_dossier_SourceLink_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.jsdossier.proto.Dossier.internal_static_dossier_SourceLink_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.jsdossier.proto.SourceLink.class, com.github.jsdossier.proto.SourceLink.Builder.class);
    }

    // Construct using com.github.jsdossier.proto.SourceLink.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    private static Builder create() {
      return new Builder();
    }

    public Builder clear() {
      super.clear();
      path_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      line_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.jsdossier.proto.Dossier.internal_static_dossier_SourceLink_descriptor;
    }

    public com.github.jsdossier.proto.SourceLink getDefaultInstanceForType() {
      return com.github.jsdossier.proto.SourceLink.getDefaultInstance();
    }

    public com.github.jsdossier.proto.SourceLink build() {
      com.github.jsdossier.proto.SourceLink result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.github.jsdossier.proto.SourceLink buildPartial() {
      com.github.jsdossier.proto.SourceLink result = new com.github.jsdossier.proto.SourceLink(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.path_ = path_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.line_ = line_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.jsdossier.proto.SourceLink) {
        return mergeFrom((com.github.jsdossier.proto.SourceLink)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.jsdossier.proto.SourceLink other) {
      if (other == com.github.jsdossier.proto.SourceLink.getDefaultInstance()) return this;
      if (other.hasPath()) {
        bitField0_ |= 0x00000001;
        path_ = other.path_;
        onChanged();
      }
      if (other.hasLine()) {
        setLine(other.getLine());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      return this;
    }

    public final boolean isInitialized() {
      if (!hasPath()) {
        
        return false;
      }
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.github.jsdossier.proto.SourceLink parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.jsdossier.proto.SourceLink) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object path_ = "";
    /**
     * <code>required string path = 1;</code>
     *
     * <pre>
     * Path from the current file to the rendered source file.
     * </pre>
     */
    public boolean hasPath() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string path = 1;</code>
     *
     * <pre>
     * Path from the current file to the rendered source file.
     * </pre>
     */
    public java.lang.String getPath() {
      java.lang.Object ref = path_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          path_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>required string path = 1;</code>
     *
     * <pre>
     * Path from the current file to the rendered source file.
     * </pre>
     */
    public com.google.protobuf.ByteString
        getPathBytes() {
      java.lang.Object ref = path_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        path_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>required string path = 1;</code>
     *
     * <pre>
     * Path from the current file to the rendered source file.
     * </pre>
     */
    public Builder setPath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      path_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required string path = 1;</code>
     *
     * <pre>
     * Path from the current file to the rendered source file.
     * </pre>
     */
    public Builder clearPath() {
      bitField0_ = (bitField0_ & ~0x00000001);
      path_ = getDefaultInstance().getPath();
      onChanged();
      return this;
    }
    /**
     * <code>required string path = 1;</code>
     *
     * <pre>
     * Path from the current file to the rendered source file.
     * </pre>
     */
    public Builder setPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      path_ = value;
      onChanged();
      return this;
    }

    private int line_ ;
    /**
     * <code>optional int32 line = 2;</code>
     *
     * <pre>
     * The line in the source file containing the symbol, if known.
     * </pre>
     */
    public boolean hasLine() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 line = 2;</code>
     *
     * <pre>
     * The line in the source file containing the symbol, if known.
     * </pre>
     */
    public int getLine() {
      return line_;
    }
    /**
     * <code>optional int32 line = 2;</code>
     *
     * <pre>
     * The line in the source file containing the symbol, if known.
     * </pre>
     */
    public Builder setLine(int value) {
      bitField0_ |= 0x00000002;
      line_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 line = 2;</code>
     *
     * <pre>
     * The line in the source file containing the symbol, if known.
     * </pre>
     */
    public Builder clearLine() {
      bitField0_ = (bitField0_ & ~0x00000002);
      line_ = 0;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:dossier.SourceLink)
  }

  static {
    defaultInstance = new SourceLink(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:dossier.SourceLink)
}

