// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: krotoplus/compiler/config.proto

package com.github.marcoferrer.krotoplus.config;

public final class Config {
  private Config() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_krotoplus_compiler_CompilerConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_krotoplus_compiler_CompilerConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_krotoplus_compiler_FileFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_krotoplus_compiler_FileFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_krotoplus_compiler_GrpcStubExtsGenOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_krotoplus_compiler_GrpcStubExtsGenOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_krotoplus_compiler_GrpcCoroutinesGenOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_krotoplus_compiler_GrpcCoroutinesGenOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_krotoplus_compiler_ProtoBuildersGenOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_krotoplus_compiler_ProtoBuildersGenOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_krotoplus_compiler_GeneratorScriptsGenOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_krotoplus_compiler_GeneratorScriptsGenOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_krotoplus_compiler_ExtenableMessagesGenOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_krotoplus_compiler_ExtenableMessagesGenOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_krotoplus_compiler_InsertionsGenOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_krotoplus_compiler_InsertionsGenOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_krotoplus_compiler_InsertionsGenOptions_Entry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_krotoplus_compiler_InsertionsGenOptions_Entry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_krotoplus_compiler_MockServicesGenOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_krotoplus_compiler_MockServicesGenOptions_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037krotoplus/compiler/config.proto\022\022kroto" +
      "plus.compiler\032 google/protobuf/descripto" +
      "r.proto\"\372\003\n\016CompilerConfig\022B\n\016grpc_stub_" +
      "exts\030\024 \003(\0132*.krotoplus.compiler.GrpcStub" +
      "ExtsGenOptions\022A\n\rmock_services\030\025 \003(\0132*." +
      "krotoplus.compiler.MockServicesGenOption" +
      "s\022C\n\016proto_builders\030\026 \003(\0132+.krotoplus.co" +
      "mpiler.ProtoBuildersGenOptions\022L\n\023extend" +
      "able_messages\030\027 \003(\0132/.krotoplus.compiler" +
      ".ExtenableMessagesGenOptions\022<\n\ninsertio" +
      "ns\030\030 \003(\0132(.krotoplus.compiler.Insertions" +
      "GenOptions\022I\n\021generator_scripts\030\031 \003(\0132.." +
      "krotoplus.compiler.GeneratorScriptsGenOp" +
      "tions\022E\n\017grpc_coroutines\030\032 \003(\0132,.krotopl" +
      "us.compiler.GrpcCoroutinesGenOptions\"8\n\n" +
      "FileFilter\022\024\n\014include_path\030\001 \003(\t\022\024\n\014excl" +
      "ude_path\030\002 \003(\t\"d\n\026GrpcStubExtsGenOptions" +
      "\022.\n\006filter\030\001 \001(\0132\036.krotoplus.compiler.Fi" +
      "leFilter\022\032\n\022support_coroutines\030\002 \001(\010\"J\n\030" +
      "GrpcCoroutinesGenOptions\022.\n\006filter\030\001 \001(\013" +
      "2\036.krotoplus.compiler.FileFilter\"{\n\027Prot" +
      "oBuildersGenOptions\022.\n\006filter\030\001 \001(\0132\036.kr" +
      "otoplus.compiler.FileFilter\022\027\n\017unwrap_bu" +
      "ilders\030\002 \001(\010\022\027\n\017use_dsl_markers\030\003 \001(\010\"x\n" +
      "\032GeneratorScriptsGenOptions\022.\n\006filter\030\001 " +
      "\001(\0132\036.krotoplus.compiler.FileFilter\022\023\n\013s" +
      "cript_path\030\002 \003(\t\022\025\n\rscript_bundle\030\003 \001(\t\"" +
      "\302\001\n\033ExtenableMessagesGenOptions\022.\n\006filte" +
      "r\030\001 \001(\0132\036.krotoplus.compiler.FileFilter\022" +
      "\034\n\024companion_field_name\030\002 \001(\t\022\034\n\024compani" +
      "on_class_name\030\003 \001(\t\022\031\n\021companion_extends" +
      "\030\004 \001(\t\022\034\n\024companion_implements\030\005 \001(\t\"\376\001\n" +
      "\024InsertionsGenOptions\022.\n\006filter\030\001 \001(\0132\036." +
      "krotoplus.compiler.FileFilter\022=\n\005entry\030\002" +
      " \003(\0132..krotoplus.compiler.InsertionsGenO" +
      "ptions.Entry\032w\n\005Entry\0221\n\005point\030\001 \001(\0162\".k" +
      "rotoplus.compiler.InsertionPoint\022\017\n\007cont" +
      "ent\030\002 \003(\t\022\023\n\013script_path\030\003 \003(\t\022\025\n\rscript" +
      "_bundle\030\004 \001(\t\"\275\001\n\026MockServicesGenOptions" +
      "\022.\n\006filter\030\001 \001(\0132\036.krotoplus.compiler.Fi" +
      "leFilter\022\033\n\023implement_as_object\030\002 \001(\010\022\035\n" +
      "\025generate_service_list\030\003 \001(\010\022\034\n\024service_" +
      "list_package\030\004 \001(\t\022\031\n\021service_list_name\030" +
      "\005 \001(\t*\257\001\n\016InsertionPoint\022\013\n\007UNKNOWN\020\000\022\025\n" +
      "\021INTERFACE_EXTENDS\020\001\022\026\n\022MESSAGE_IMPLEMEN" +
      "TS\020\002\022\026\n\022BUILDER_IMPLEMENTS\020\003\022\021\n\rBUILDER_" +
      "SCOPE\020\004\022\017\n\013CLASS_SCOPE\020\005\022\016\n\nENUM_SCOPE\020\006" +
      "\022\025\n\021OUTER_CLASS_SCOPE\020\007B+\n\'com.github.ma" +
      "rcoferrer.krotoplus.configP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DescriptorProtos.getDescriptor(),
        }, assigner);
    internal_static_krotoplus_compiler_CompilerConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_krotoplus_compiler_CompilerConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_krotoplus_compiler_CompilerConfig_descriptor,
        new java.lang.String[] { "GrpcStubExts", "MockServices", "ProtoBuilders", "ExtendableMessages", "Insertions", "GeneratorScripts", "GrpcCoroutines", });
    internal_static_krotoplus_compiler_FileFilter_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_krotoplus_compiler_FileFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_krotoplus_compiler_FileFilter_descriptor,
        new java.lang.String[] { "IncludePath", "ExcludePath", });
    internal_static_krotoplus_compiler_GrpcStubExtsGenOptions_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_krotoplus_compiler_GrpcStubExtsGenOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_krotoplus_compiler_GrpcStubExtsGenOptions_descriptor,
        new java.lang.String[] { "Filter", "SupportCoroutines", });
    internal_static_krotoplus_compiler_GrpcCoroutinesGenOptions_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_krotoplus_compiler_GrpcCoroutinesGenOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_krotoplus_compiler_GrpcCoroutinesGenOptions_descriptor,
        new java.lang.String[] { "Filter", });
    internal_static_krotoplus_compiler_ProtoBuildersGenOptions_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_krotoplus_compiler_ProtoBuildersGenOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_krotoplus_compiler_ProtoBuildersGenOptions_descriptor,
        new java.lang.String[] { "Filter", "UnwrapBuilders", "UseDslMarkers", });
    internal_static_krotoplus_compiler_GeneratorScriptsGenOptions_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_krotoplus_compiler_GeneratorScriptsGenOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_krotoplus_compiler_GeneratorScriptsGenOptions_descriptor,
        new java.lang.String[] { "Filter", "ScriptPath", "ScriptBundle", });
    internal_static_krotoplus_compiler_ExtenableMessagesGenOptions_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_krotoplus_compiler_ExtenableMessagesGenOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_krotoplus_compiler_ExtenableMessagesGenOptions_descriptor,
        new java.lang.String[] { "Filter", "CompanionFieldName", "CompanionClassName", "CompanionExtends", "CompanionImplements", });
    internal_static_krotoplus_compiler_InsertionsGenOptions_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_krotoplus_compiler_InsertionsGenOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_krotoplus_compiler_InsertionsGenOptions_descriptor,
        new java.lang.String[] { "Filter", "Entry", });
    internal_static_krotoplus_compiler_InsertionsGenOptions_Entry_descriptor =
      internal_static_krotoplus_compiler_InsertionsGenOptions_descriptor.getNestedTypes().get(0);
    internal_static_krotoplus_compiler_InsertionsGenOptions_Entry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_krotoplus_compiler_InsertionsGenOptions_Entry_descriptor,
        new java.lang.String[] { "Point", "Content", "ScriptPath", "ScriptBundle", });
    internal_static_krotoplus_compiler_MockServicesGenOptions_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_krotoplus_compiler_MockServicesGenOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_krotoplus_compiler_MockServicesGenOptions_descriptor,
        new java.lang.String[] { "Filter", "ImplementAsObject", "GenerateServiceList", "ServiceListPackage", "ServiceListName", });
    com.google.protobuf.DescriptorProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
