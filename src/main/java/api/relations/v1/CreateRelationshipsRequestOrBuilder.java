// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rebac/v1/relationships.proto

package api.relations.v1;

public interface CreateRelationshipsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.rebac.v1.CreateRelationshipsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool touch = 1;</code>
   * @return The touch.
   */
  boolean getTouch();

  /**
   * <code>repeated .api.rebac.v1.Relationship relationships = 2;</code>
   */
  java.util.List<api.relations.v1.Relationship> 
      getRelationshipsList();
  /**
   * <code>repeated .api.rebac.v1.Relationship relationships = 2;</code>
   */
  api.relations.v1.Relationship getRelationships(int index);
  /**
   * <code>repeated .api.rebac.v1.Relationship relationships = 2;</code>
   */
  int getRelationshipsCount();
  /**
   * <code>repeated .api.rebac.v1.Relationship relationships = 2;</code>
   */
  java.util.List<? extends api.relations.v1.RelationshipOrBuilder> 
      getRelationshipsOrBuilderList();
  /**
   * <code>repeated .api.rebac.v1.Relationship relationships = 2;</code>
   */
  api.relations.v1.RelationshipOrBuilder getRelationshipsOrBuilder(
      int index);
}
