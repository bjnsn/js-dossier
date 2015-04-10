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

public interface SourceFileRenderSpecOrBuilder extends
    // @@protoc_insertion_point(interface_extends:dossier.SourceFileRenderSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>required .dossier.Resources resources = 1;</code>
   *
   * <pre>
   * The resources to include.
   * </pre>
   */
  boolean hasResources();
  /**
   * <code>required .dossier.Resources resources = 1;</code>
   *
   * <pre>
   * The resources to include.
   * </pre>
   */
  com.github.jsdossier.proto.Resources getResources();
  /**
   * <code>required .dossier.Resources resources = 1;</code>
   *
   * <pre>
   * The resources to include.
   * </pre>
   */
  com.github.jsdossier.proto.ResourcesOrBuilder getResourcesOrBuilder();

  /**
   * <code>required .dossier.SourceFile file = 2;</code>
   *
   * <pre>
   * The file to render.
   * </pre>
   */
  boolean hasFile();
  /**
   * <code>required .dossier.SourceFile file = 2;</code>
   *
   * <pre>
   * The file to render.
   * </pre>
   */
  com.github.jsdossier.proto.SourceFile getFile();
  /**
   * <code>required .dossier.SourceFile file = 2;</code>
   *
   * <pre>
   * The file to render.
   * </pre>
   */
  com.github.jsdossier.proto.SourceFileOrBuilder getFileOrBuilder();

  /**
   * <code>required .dossier.Index index = 3;</code>
   *
   * <pre>
   * Navigation index.
   * </pre>
   */
  boolean hasIndex();
  /**
   * <code>required .dossier.Index index = 3;</code>
   *
   * <pre>
   * Navigation index.
   * </pre>
   */
  com.github.jsdossier.proto.Index getIndex();
  /**
   * <code>required .dossier.Index index = 3;</code>
   *
   * <pre>
   * Navigation index.
   * </pre>
   */
  com.github.jsdossier.proto.IndexOrBuilder getIndexOrBuilder();
}
