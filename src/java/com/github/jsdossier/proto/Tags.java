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
 * Protobuf type {@code dossier.Tags}
 */
public final class Tags extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:dossier.Tags)
    TagsOrBuilder {
  // Use Tags.newBuilder() to construct.
  private Tags(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private Tags(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final Tags defaultInstance;
  public static Tags getDefaultInstance() {
    return defaultInstance;
  }

  public Tags getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private Tags(
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
          case 8: {
            bitField0_ |= 0x00000001;
            isConst_ = input.readBool();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            isDeprecated_ = input.readBool();
            break;
          }
          case 24: {
            bitField0_ |= 0x00000004;
            isDict_ = input.readBool();
            break;
          }
          case 32: {
            bitField0_ |= 0x00000008;
            isFinal_ = input.readBool();
            break;
          }
          case 40: {
            bitField0_ |= 0x00000010;
            isInterface_ = input.readBool();
            break;
          }
          case 48: {
            bitField0_ |= 0x00000020;
            isModule_ = input.readBool();
            break;
          }
          case 56: {
            bitField0_ |= 0x00000040;
            isStruct_ = input.readBool();
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
    return com.github.jsdossier.proto.Dossier.internal_static_dossier_Tags_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.jsdossier.proto.Dossier.internal_static_dossier_Tags_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.jsdossier.proto.Tags.class, com.github.jsdossier.proto.Tags.Builder.class);
  }

  public static com.google.protobuf.Parser<Tags> PARSER =
      new com.google.protobuf.AbstractParser<Tags>() {
    public Tags parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Tags(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<Tags> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  public static final int IS_CONST_FIELD_NUMBER = 1;
  private boolean isConst_;
  /**
   * <code>optional bool is_const = 1;</code>
   */
  public boolean hasIsConst() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional bool is_const = 1;</code>
   */
  public boolean getIsConst() {
    return isConst_;
  }

  public static final int IS_DEPRECATED_FIELD_NUMBER = 2;
  private boolean isDeprecated_;
  /**
   * <code>optional bool is_deprecated = 2;</code>
   */
  public boolean hasIsDeprecated() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional bool is_deprecated = 2;</code>
   */
  public boolean getIsDeprecated() {
    return isDeprecated_;
  }

  public static final int IS_DICT_FIELD_NUMBER = 3;
  private boolean isDict_;
  /**
   * <code>optional bool is_dict = 3;</code>
   */
  public boolean hasIsDict() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional bool is_dict = 3;</code>
   */
  public boolean getIsDict() {
    return isDict_;
  }

  public static final int IS_FINAL_FIELD_NUMBER = 4;
  private boolean isFinal_;
  /**
   * <code>optional bool is_final = 4;</code>
   */
  public boolean hasIsFinal() {
    return ((bitField0_ & 0x00000008) == 0x00000008);
  }
  /**
   * <code>optional bool is_final = 4;</code>
   */
  public boolean getIsFinal() {
    return isFinal_;
  }

  public static final int IS_INTERFACE_FIELD_NUMBER = 5;
  private boolean isInterface_;
  /**
   * <code>optional bool is_interface = 5;</code>
   */
  public boolean hasIsInterface() {
    return ((bitField0_ & 0x00000010) == 0x00000010);
  }
  /**
   * <code>optional bool is_interface = 5;</code>
   */
  public boolean getIsInterface() {
    return isInterface_;
  }

  public static final int IS_MODULE_FIELD_NUMBER = 6;
  private boolean isModule_;
  /**
   * <code>optional bool is_module = 6;</code>
   */
  public boolean hasIsModule() {
    return ((bitField0_ & 0x00000020) == 0x00000020);
  }
  /**
   * <code>optional bool is_module = 6;</code>
   */
  public boolean getIsModule() {
    return isModule_;
  }

  public static final int IS_STRUCT_FIELD_NUMBER = 7;
  private boolean isStruct_;
  /**
   * <code>optional bool is_struct = 7;</code>
   */
  public boolean hasIsStruct() {
    return ((bitField0_ & 0x00000040) == 0x00000040);
  }
  /**
   * <code>optional bool is_struct = 7;</code>
   */
  public boolean getIsStruct() {
    return isStruct_;
  }

  private void initFields() {
    isConst_ = false;
    isDeprecated_ = false;
    isDict_ = false;
    isFinal_ = false;
    isInterface_ = false;
    isModule_ = false;
    isStruct_ = false;
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
      output.writeBool(1, isConst_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeBool(2, isDeprecated_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeBool(3, isDict_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      output.writeBool(4, isFinal_);
    }
    if (((bitField0_ & 0x00000010) == 0x00000010)) {
      output.writeBool(5, isInterface_);
    }
    if (((bitField0_ & 0x00000020) == 0x00000020)) {
      output.writeBool(6, isModule_);
    }
    if (((bitField0_ & 0x00000040) == 0x00000040)) {
      output.writeBool(7, isStruct_);
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
        .computeBoolSize(1, isConst_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, isDeprecated_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, isDict_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, isFinal_);
    }
    if (((bitField0_ & 0x00000010) == 0x00000010)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, isInterface_);
    }
    if (((bitField0_ & 0x00000020) == 0x00000020)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, isModule_);
    }
    if (((bitField0_ & 0x00000040) == 0x00000040)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(7, isStruct_);
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

  public static com.github.jsdossier.proto.Tags parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.jsdossier.proto.Tags parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.jsdossier.proto.Tags parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.jsdossier.proto.Tags parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.jsdossier.proto.Tags parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.github.jsdossier.proto.Tags parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.github.jsdossier.proto.Tags parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.github.jsdossier.proto.Tags parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.github.jsdossier.proto.Tags parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.github.jsdossier.proto.Tags parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(com.github.jsdossier.proto.Tags prototype) {
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
   * Protobuf type {@code dossier.Tags}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:dossier.Tags)
      com.github.jsdossier.proto.TagsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.jsdossier.proto.Dossier.internal_static_dossier_Tags_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.jsdossier.proto.Dossier.internal_static_dossier_Tags_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.jsdossier.proto.Tags.class, com.github.jsdossier.proto.Tags.Builder.class);
    }

    // Construct using com.github.jsdossier.proto.Tags.newBuilder()
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
      isConst_ = false;
      bitField0_ = (bitField0_ & ~0x00000001);
      isDeprecated_ = false;
      bitField0_ = (bitField0_ & ~0x00000002);
      isDict_ = false;
      bitField0_ = (bitField0_ & ~0x00000004);
      isFinal_ = false;
      bitField0_ = (bitField0_ & ~0x00000008);
      isInterface_ = false;
      bitField0_ = (bitField0_ & ~0x00000010);
      isModule_ = false;
      bitField0_ = (bitField0_ & ~0x00000020);
      isStruct_ = false;
      bitField0_ = (bitField0_ & ~0x00000040);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.jsdossier.proto.Dossier.internal_static_dossier_Tags_descriptor;
    }

    public com.github.jsdossier.proto.Tags getDefaultInstanceForType() {
      return com.github.jsdossier.proto.Tags.getDefaultInstance();
    }

    public com.github.jsdossier.proto.Tags build() {
      com.github.jsdossier.proto.Tags result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.github.jsdossier.proto.Tags buildPartial() {
      com.github.jsdossier.proto.Tags result = new com.github.jsdossier.proto.Tags(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.isConst_ = isConst_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.isDeprecated_ = isDeprecated_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      result.isDict_ = isDict_;
      if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
        to_bitField0_ |= 0x00000008;
      }
      result.isFinal_ = isFinal_;
      if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
        to_bitField0_ |= 0x00000010;
      }
      result.isInterface_ = isInterface_;
      if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
        to_bitField0_ |= 0x00000020;
      }
      result.isModule_ = isModule_;
      if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
        to_bitField0_ |= 0x00000040;
      }
      result.isStruct_ = isStruct_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.jsdossier.proto.Tags) {
        return mergeFrom((com.github.jsdossier.proto.Tags)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.jsdossier.proto.Tags other) {
      if (other == com.github.jsdossier.proto.Tags.getDefaultInstance()) return this;
      if (other.hasIsConst()) {
        setIsConst(other.getIsConst());
      }
      if (other.hasIsDeprecated()) {
        setIsDeprecated(other.getIsDeprecated());
      }
      if (other.hasIsDict()) {
        setIsDict(other.getIsDict());
      }
      if (other.hasIsFinal()) {
        setIsFinal(other.getIsFinal());
      }
      if (other.hasIsInterface()) {
        setIsInterface(other.getIsInterface());
      }
      if (other.hasIsModule()) {
        setIsModule(other.getIsModule());
      }
      if (other.hasIsStruct()) {
        setIsStruct(other.getIsStruct());
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
      com.github.jsdossier.proto.Tags parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.jsdossier.proto.Tags) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private boolean isConst_ ;
    /**
     * <code>optional bool is_const = 1;</code>
     */
    public boolean hasIsConst() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional bool is_const = 1;</code>
     */
    public boolean getIsConst() {
      return isConst_;
    }
    /**
     * <code>optional bool is_const = 1;</code>
     */
    public Builder setIsConst(boolean value) {
      bitField0_ |= 0x00000001;
      isConst_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool is_const = 1;</code>
     */
    public Builder clearIsConst() {
      bitField0_ = (bitField0_ & ~0x00000001);
      isConst_ = false;
      onChanged();
      return this;
    }

    private boolean isDeprecated_ ;
    /**
     * <code>optional bool is_deprecated = 2;</code>
     */
    public boolean hasIsDeprecated() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional bool is_deprecated = 2;</code>
     */
    public boolean getIsDeprecated() {
      return isDeprecated_;
    }
    /**
     * <code>optional bool is_deprecated = 2;</code>
     */
    public Builder setIsDeprecated(boolean value) {
      bitField0_ |= 0x00000002;
      isDeprecated_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool is_deprecated = 2;</code>
     */
    public Builder clearIsDeprecated() {
      bitField0_ = (bitField0_ & ~0x00000002);
      isDeprecated_ = false;
      onChanged();
      return this;
    }

    private boolean isDict_ ;
    /**
     * <code>optional bool is_dict = 3;</code>
     */
    public boolean hasIsDict() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional bool is_dict = 3;</code>
     */
    public boolean getIsDict() {
      return isDict_;
    }
    /**
     * <code>optional bool is_dict = 3;</code>
     */
    public Builder setIsDict(boolean value) {
      bitField0_ |= 0x00000004;
      isDict_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool is_dict = 3;</code>
     */
    public Builder clearIsDict() {
      bitField0_ = (bitField0_ & ~0x00000004);
      isDict_ = false;
      onChanged();
      return this;
    }

    private boolean isFinal_ ;
    /**
     * <code>optional bool is_final = 4;</code>
     */
    public boolean hasIsFinal() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional bool is_final = 4;</code>
     */
    public boolean getIsFinal() {
      return isFinal_;
    }
    /**
     * <code>optional bool is_final = 4;</code>
     */
    public Builder setIsFinal(boolean value) {
      bitField0_ |= 0x00000008;
      isFinal_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool is_final = 4;</code>
     */
    public Builder clearIsFinal() {
      bitField0_ = (bitField0_ & ~0x00000008);
      isFinal_ = false;
      onChanged();
      return this;
    }

    private boolean isInterface_ ;
    /**
     * <code>optional bool is_interface = 5;</code>
     */
    public boolean hasIsInterface() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional bool is_interface = 5;</code>
     */
    public boolean getIsInterface() {
      return isInterface_;
    }
    /**
     * <code>optional bool is_interface = 5;</code>
     */
    public Builder setIsInterface(boolean value) {
      bitField0_ |= 0x00000010;
      isInterface_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool is_interface = 5;</code>
     */
    public Builder clearIsInterface() {
      bitField0_ = (bitField0_ & ~0x00000010);
      isInterface_ = false;
      onChanged();
      return this;
    }

    private boolean isModule_ ;
    /**
     * <code>optional bool is_module = 6;</code>
     */
    public boolean hasIsModule() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional bool is_module = 6;</code>
     */
    public boolean getIsModule() {
      return isModule_;
    }
    /**
     * <code>optional bool is_module = 6;</code>
     */
    public Builder setIsModule(boolean value) {
      bitField0_ |= 0x00000020;
      isModule_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool is_module = 6;</code>
     */
    public Builder clearIsModule() {
      bitField0_ = (bitField0_ & ~0x00000020);
      isModule_ = false;
      onChanged();
      return this;
    }

    private boolean isStruct_ ;
    /**
     * <code>optional bool is_struct = 7;</code>
     */
    public boolean hasIsStruct() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <code>optional bool is_struct = 7;</code>
     */
    public boolean getIsStruct() {
      return isStruct_;
    }
    /**
     * <code>optional bool is_struct = 7;</code>
     */
    public Builder setIsStruct(boolean value) {
      bitField0_ |= 0x00000040;
      isStruct_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool is_struct = 7;</code>
     */
    public Builder clearIsStruct() {
      bitField0_ = (bitField0_ & ~0x00000040);
      isStruct_ = false;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:dossier.Tags)
  }

  static {
    defaultInstance = new Tags(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:dossier.Tags)
}

