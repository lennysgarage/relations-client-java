// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kessel/relations/v1beta1/common.proto

// Protobuf Java Version: 3.25.1
package org.project_kessel.api.relations.v1beta1;

public interface RelationshipOrBuilder extends
    // @@protoc_insertion_point(interface_extends:kessel.relations.v1beta1.Relationship)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.kessel.relations.v1beta1.ObjectReference resource = 1 [json_name = "resource", (.validate.rules) = { ... }</code>
   * @return Whether the resource field is set.
   */
  boolean hasResource();
  /**
   * <code>.kessel.relations.v1beta1.ObjectReference resource = 1 [json_name = "resource", (.validate.rules) = { ... }</code>
   * @return The resource.
   */
  org.project_kessel.api.relations.v1beta1.ObjectReference getResource();
  /**
   * <code>.kessel.relations.v1beta1.ObjectReference resource = 1 [json_name = "resource", (.validate.rules) = { ... }</code>
   */
  org.project_kessel.api.relations.v1beta1.ObjectReferenceOrBuilder getResourceOrBuilder();

  /**
   * <code>string relation = 2 [json_name = "relation", (.validate.rules) = { ... }</code>
   * @return The relation.
   */
  java.lang.String getRelation();
  /**
   * <code>string relation = 2 [json_name = "relation", (.validate.rules) = { ... }</code>
   * @return The bytes for relation.
   */
  com.google.protobuf.ByteString
      getRelationBytes();

  /**
   * <code>.kessel.relations.v1beta1.SubjectReference subject = 3 [json_name = "subject", (.validate.rules) = { ... }</code>
   * @return Whether the subject field is set.
   */
  boolean hasSubject();
  /**
   * <code>.kessel.relations.v1beta1.SubjectReference subject = 3 [json_name = "subject", (.validate.rules) = { ... }</code>
   * @return The subject.
   */
  org.project_kessel.api.relations.v1beta1.SubjectReference getSubject();
  /**
   * <code>.kessel.relations.v1beta1.SubjectReference subject = 3 [json_name = "subject", (.validate.rules) = { ... }</code>
   */
  org.project_kessel.api.relations.v1beta1.SubjectReferenceOrBuilder getSubjectOrBuilder();
}
