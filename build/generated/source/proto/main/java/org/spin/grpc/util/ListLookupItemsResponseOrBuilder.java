// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: businessdata.proto

package org.spin.grpc.util;

public interface ListLookupItemsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:data.ListLookupItemsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 recordCount = 1;</code>
   */
  long getRecordCount();

  /**
   * <code>repeated .data.LookupItem records = 2;</code>
   */
  java.util.List<org.spin.grpc.util.LookupItem> 
      getRecordsList();
  /**
   * <code>repeated .data.LookupItem records = 2;</code>
   */
  org.spin.grpc.util.LookupItem getRecords(int index);
  /**
   * <code>repeated .data.LookupItem records = 2;</code>
   */
  int getRecordsCount();
  /**
   * <code>repeated .data.LookupItem records = 2;</code>
   */
  java.util.List<? extends org.spin.grpc.util.LookupItemOrBuilder> 
      getRecordsOrBuilderList();
  /**
   * <code>repeated .data.LookupItem records = 2;</code>
   */
  org.spin.grpc.util.LookupItemOrBuilder getRecordsOrBuilder(
      int index);

  /**
   * <code>string next_page_token = 3;</code>
   */
  java.lang.String getNextPageToken();
  /**
   * <code>string next_page_token = 3;</code>
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
