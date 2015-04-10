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
 * Protobuf type {@code dossier.Deprecation}
 *
 * <pre>
 * Describes a deprecation notice.
 * </pre>
 */
public final class Deprecation extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:dossier.Deprecation)
    DeprecationOrBuilder {
  // Use Deprecation.newBuilder() to construct.
  private Deprecation(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private Deprecation(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final Deprecation defaultInstance;
  public static Deprecation getDefaultInstance() {
    return defaultInstance;
  }

  public Deprecation getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private Deprecation(
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
            html_ = bs;
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
    return com.github.jsdossier.proto.Dossier.internal_static_dossier_Deprecation_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.jsdossier.proto.Dossier.internal_static_dossier_Deprecation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.jsdossier.proto.Deprecation.class, com.github.jsdossier.proto.Deprecation.Builder.class);
  }

  public static com.google.protobuf.Parser<Deprecation> PARSER =
      new com.google.protobuf.AbstractParser<Deprecation>() {
    public Deprecation parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Deprecation(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<Deprecation> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  public static final int HTML_FIELD_NUMBER = 1;
  private java.lang.Object html_;
  /**
   * <code>optional string html = 1;</code>
   */
  public boolean hasHtml() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional string html = 1;</code>
   */
  public java.lang.String getHtml() {
    java.lang.Object ref = html_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        html_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string html = 1;</code>
   */
  public com.google.protobuf.ByteString
      getHtmlBytes() {
    java.lang.Object ref = html_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      html_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private void initFields() {
    html_ = "";
  }
  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeBytes(1, getHtmlBytes());
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
        .computeBytesSize(1, getHtmlBytes());
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

  public static com.github.jsdossier.proto.Deprecation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.jsdossier.proto.Deprecation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.jsdossier.proto.Deprecation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.jsdossier.proto.Deprecation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.jsdossier.proto.Deprecation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.github.jsdossier.proto.Deprecation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.github.jsdossier.proto.Deprecation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.github.jsdossier.proto.Deprecation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.github.jsdossier.proto.Deprecation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.github.jsdossier.proto.Deprecation parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(com.github.jsdossier.proto.Deprecation prototype) {
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
   * Protobuf type {@code dossier.Deprecation}
   *
   * <pre>
   * Describes a deprecation notice.
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:dossier.Deprecation)
      com.github.jsdossier.proto.DeprecationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.jsdossier.proto.Dossier.internal_static_dossier_Deprecation_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.jsdossier.proto.Dossier.internal_static_dossier_Deprecation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.jsdossier.proto.Deprecation.class, com.github.jsdossier.proto.Deprecation.Builder.class);
    }

    // Construct using com.github.jsdossier.proto.Deprecation.newBuilder()
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
      html_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.jsdossier.proto.Dossier.internal_static_dossier_Deprecation_descriptor;
    }

    public com.github.jsdossier.proto.Deprecation getDefaultInstanceForType() {
      return com.github.jsdossier.proto.Deprecation.getDefaultInstance();
    }

    public com.github.jsdossier.proto.Deprecation build() {
      com.github.jsdossier.proto.Deprecation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.github.jsdossier.proto.Deprecation buildPartial() {
      com.github.jsdossier.proto.Deprecation result = new com.github.jsdossier.proto.Deprecation(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.html_ = html_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.jsdossier.proto.Deprecation) {
        return mergeFrom((com.github.jsdossier.proto.Deprecation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.jsdossier.proto.Deprecation other) {
      if (other == com.github.jsdossier.proto.Deprecation.getDefaultInstance()) return this;
      if (other.hasHtml()) {
        bitField0_ |= 0x00000001;
        html_ = other.html_;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.github.jsdossier.proto.Deprecation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.jsdossier.proto.Deprecation) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object html_ = "";
    /**
     * <code>optional string html = 1;</code>
     */
    public boolean hasHtml() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string html = 1;</code>
     */
    public java.lang.String getHtml() {
      java.lang.Object ref = html_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          html_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string html = 1;</code>
     */
    public com.google.protobuf.ByteString
        getHtmlBytes() {
      java.lang.Object ref = html_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        html_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string html = 1;</code>
     */
    public Builder setHtml(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      html_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string html = 1;</code>
     */
    public Builder clearHtml() {
      bitField0_ = (bitField0_ & ~0x00000001);
      html_ = getDefaultInstance().getHtml();
      onChanged();
      return this;
    }
    /**
     * <code>optional string html = 1;</code>
     */
    public Builder setHtmlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      html_ = value;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:dossier.Deprecation)
  }

  static {
    defaultInstance = new Deprecation(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:dossier.Deprecation)
}

