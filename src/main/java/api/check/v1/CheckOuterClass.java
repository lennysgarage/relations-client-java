// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rebac/v1/check.proto

package api.check.v1;

public final class CheckOuterClass {
  private CheckOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_rebac_v1_CheckRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_rebac_v1_CheckRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_rebac_v1_CheckResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_rebac_v1_CheckResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024rebac/v1/check.proto\022\014api.rebac.v1\032\034go" +
      "ogle/api/annotations.proto\032\034rebac/v1/rel" +
      "ationships.proto\"\200\001\n\014CheckRequest\022-\n\006obj" +
      "ect\030\001 \001(\0132\035.api.rebac.v1.ObjectReference" +
      "\022\020\n\010relation\030\002 \001(\t\022/\n\007subject\030\003 \001(\0132\036.ap" +
      "i.rebac.v1.SubjectReference\"\216\001\n\rCheckRes" +
      "ponse\0224\n\007allowed\030\001 \001(\0162#.api.rebac.v1.Ch" +
      "eckResponse.Allowed\"G\n\007Allowed\022\027\n\023ALLOWE" +
      "D_UNSPECIFIED\020\000\022\020\n\014ALLOWED_TRUE\020\001\022\021\n\rALL" +
      "OWED_FALSE\020\0022_\n\005Check\022V\n\005Check\022\032.api.reb" +
      "ac.v1.CheckRequest\032\033.api.rebac.v1.CheckR" +
      "esponse\"\024\202\323\344\223\002\016\"\t/v1/check:\001*B,\n\014api.che" +
      "ck.v1P\001Z\032ciam-rebac/api/rebac/v1;v1b\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          api.relations.v1.RelationshipsOuterClass.getDescriptor(),
        });
    internal_static_api_rebac_v1_CheckRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_rebac_v1_CheckRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_rebac_v1_CheckRequest_descriptor,
        new java.lang.String[] { "Object", "Relation", "Subject", });
    internal_static_api_rebac_v1_CheckResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_api_rebac_v1_CheckResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_rebac_v1_CheckResponse_descriptor,
        new java.lang.String[] { "Allowed", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    api.relations.v1.RelationshipsOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
