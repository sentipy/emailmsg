// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: emailmsg.proto

package com.sentilabs.email;

public final class Emailmsg {
  private Emailmsg() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface EmailMsgOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required string from = 1;
    /**
     * <code>required string from = 1;</code>
     */
    boolean hasFrom();
    /**
     * <code>required string from = 1;</code>
     */
    java.lang.String getFrom();
    /**
     * <code>required string from = 1;</code>
     */
    com.google.protobuf.ByteString
        getFromBytes();

    // required string to = 2;
    /**
     * <code>required string to = 2;</code>
     */
    boolean hasTo();
    /**
     * <code>required string to = 2;</code>
     */
    java.lang.String getTo();
    /**
     * <code>required string to = 2;</code>
     */
    com.google.protobuf.ByteString
        getToBytes();

    // required string subject = 3;
    /**
     * <code>required string subject = 3;</code>
     */
    boolean hasSubject();
    /**
     * <code>required string subject = 3;</code>
     */
    java.lang.String getSubject();
    /**
     * <code>required string subject = 3;</code>
     */
    com.google.protobuf.ByteString
        getSubjectBytes();

    // required string text = 4;
    /**
     * <code>required string text = 4;</code>
     */
    boolean hasText();
    /**
     * <code>required string text = 4;</code>
     */
    java.lang.String getText();
    /**
     * <code>required string text = 4;</code>
     */
    com.google.protobuf.ByteString
        getTextBytes();
  }
  /**
   * Protobuf type {@code EmailMsg}
   */
  public static final class EmailMsg extends
      com.google.protobuf.GeneratedMessage
      implements EmailMsgOrBuilder {
    // Use EmailMsg.newBuilder() to construct.
    private EmailMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private EmailMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final EmailMsg defaultInstance;
    public static EmailMsg getDefaultInstance() {
      return defaultInstance;
    }

    public EmailMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private EmailMsg(
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
              bitField0_ |= 0x00000001;
              from_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              to_ = input.readBytes();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              subject_ = input.readBytes();
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              text_ = input.readBytes();
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
      return Emailmsg.internal_static_EmailMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Emailmsg.internal_static_EmailMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Emailmsg.EmailMsg.class, Emailmsg.EmailMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<EmailMsg> PARSER =
        new com.google.protobuf.AbstractParser<EmailMsg>() {
      public EmailMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EmailMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<EmailMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required string from = 1;
    public static final int FROM_FIELD_NUMBER = 1;
    private java.lang.Object from_;
    /**
     * <code>required string from = 1;</code>
     */
    public boolean hasFrom() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string from = 1;</code>
     */
    public java.lang.String getFrom() {
      java.lang.Object ref = from_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          from_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string from = 1;</code>
     */
    public com.google.protobuf.ByteString
        getFromBytes() {
      java.lang.Object ref = from_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        from_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // required string to = 2;
    public static final int TO_FIELD_NUMBER = 2;
    private java.lang.Object to_;
    /**
     * <code>required string to = 2;</code>
     */
    public boolean hasTo() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string to = 2;</code>
     */
    public java.lang.String getTo() {
      java.lang.Object ref = to_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          to_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string to = 2;</code>
     */
    public com.google.protobuf.ByteString
        getToBytes() {
      java.lang.Object ref = to_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        to_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // required string subject = 3;
    public static final int SUBJECT_FIELD_NUMBER = 3;
    private java.lang.Object subject_;
    /**
     * <code>required string subject = 3;</code>
     */
    public boolean hasSubject() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required string subject = 3;</code>
     */
    public java.lang.String getSubject() {
      java.lang.Object ref = subject_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          subject_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string subject = 3;</code>
     */
    public com.google.protobuf.ByteString
        getSubjectBytes() {
      java.lang.Object ref = subject_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        subject_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // required string text = 4;
    public static final int TEXT_FIELD_NUMBER = 4;
    private java.lang.Object text_;
    /**
     * <code>required string text = 4;</code>
     */
    public boolean hasText() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required string text = 4;</code>
     */
    public java.lang.String getText() {
      java.lang.Object ref = text_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          text_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string text = 4;</code>
     */
    public com.google.protobuf.ByteString
        getTextBytes() {
      java.lang.Object ref = text_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        text_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      from_ = "";
      to_ = "";
      subject_ = "";
      text_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasFrom()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTo()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSubject()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasText()) {
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
        output.writeBytes(1, getFromBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getToBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getSubjectBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, getTextBytes());
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
          .computeBytesSize(1, getFromBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getToBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getSubjectBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getTextBytes());
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

    public static Emailmsg.EmailMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Emailmsg.EmailMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Emailmsg.EmailMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Emailmsg.EmailMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Emailmsg.EmailMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static Emailmsg.EmailMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static Emailmsg.EmailMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static Emailmsg.EmailMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static Emailmsg.EmailMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static Emailmsg.EmailMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(Emailmsg.EmailMsg prototype) {
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
     * Protobuf type {@code EmailMsg}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements Emailmsg.EmailMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Emailmsg.internal_static_EmailMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Emailmsg.internal_static_EmailMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Emailmsg.EmailMsg.class, Emailmsg.EmailMsg.Builder.class);
      }

      // Construct using Emailmsg.EmailMsg.newBuilder()
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
        from_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        to_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        subject_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        text_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Emailmsg.internal_static_EmailMsg_descriptor;
      }

      public Emailmsg.EmailMsg getDefaultInstanceForType() {
        return Emailmsg.EmailMsg.getDefaultInstance();
      }

      public Emailmsg.EmailMsg build() {
        Emailmsg.EmailMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public Emailmsg.EmailMsg buildPartial() {
        Emailmsg.EmailMsg result = new Emailmsg.EmailMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.from_ = from_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.to_ = to_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.subject_ = subject_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.text_ = text_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Emailmsg.EmailMsg) {
          return mergeFrom((Emailmsg.EmailMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Emailmsg.EmailMsg other) {
        if (other == Emailmsg.EmailMsg.getDefaultInstance()) return this;
        if (other.hasFrom()) {
          bitField0_ |= 0x00000001;
          from_ = other.from_;
          onChanged();
        }
        if (other.hasTo()) {
          bitField0_ |= 0x00000002;
          to_ = other.to_;
          onChanged();
        }
        if (other.hasSubject()) {
          bitField0_ |= 0x00000004;
          subject_ = other.subject_;
          onChanged();
        }
        if (other.hasText()) {
          bitField0_ |= 0x00000008;
          text_ = other.text_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasFrom()) {
          
          return false;
        }
        if (!hasTo()) {
          
          return false;
        }
        if (!hasSubject()) {
          
          return false;
        }
        if (!hasText()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Emailmsg.EmailMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Emailmsg.EmailMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required string from = 1;
      private java.lang.Object from_ = "";
      /**
       * <code>required string from = 1;</code>
       */
      public boolean hasFrom() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string from = 1;</code>
       */
      public java.lang.String getFrom() {
        java.lang.Object ref = from_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          from_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string from = 1;</code>
       */
      public com.google.protobuf.ByteString
          getFromBytes() {
        java.lang.Object ref = from_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          from_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string from = 1;</code>
       */
      public Builder setFrom(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        from_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string from = 1;</code>
       */
      public Builder clearFrom() {
        bitField0_ = (bitField0_ & ~0x00000001);
        from_ = getDefaultInstance().getFrom();
        onChanged();
        return this;
      }
      /**
       * <code>required string from = 1;</code>
       */
      public Builder setFromBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        from_ = value;
        onChanged();
        return this;
      }

      // required string to = 2;
      private java.lang.Object to_ = "";
      /**
       * <code>required string to = 2;</code>
       */
      public boolean hasTo() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string to = 2;</code>
       */
      public java.lang.String getTo() {
        java.lang.Object ref = to_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          to_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string to = 2;</code>
       */
      public com.google.protobuf.ByteString
          getToBytes() {
        java.lang.Object ref = to_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          to_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string to = 2;</code>
       */
      public Builder setTo(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        to_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string to = 2;</code>
       */
      public Builder clearTo() {
        bitField0_ = (bitField0_ & ~0x00000002);
        to_ = getDefaultInstance().getTo();
        onChanged();
        return this;
      }
      /**
       * <code>required string to = 2;</code>
       */
      public Builder setToBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        to_ = value;
        onChanged();
        return this;
      }

      // required string subject = 3;
      private java.lang.Object subject_ = "";
      /**
       * <code>required string subject = 3;</code>
       */
      public boolean hasSubject() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required string subject = 3;</code>
       */
      public java.lang.String getSubject() {
        java.lang.Object ref = subject_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          subject_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string subject = 3;</code>
       */
      public com.google.protobuf.ByteString
          getSubjectBytes() {
        java.lang.Object ref = subject_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          subject_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string subject = 3;</code>
       */
      public Builder setSubject(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        subject_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string subject = 3;</code>
       */
      public Builder clearSubject() {
        bitField0_ = (bitField0_ & ~0x00000004);
        subject_ = getDefaultInstance().getSubject();
        onChanged();
        return this;
      }
      /**
       * <code>required string subject = 3;</code>
       */
      public Builder setSubjectBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        subject_ = value;
        onChanged();
        return this;
      }

      // required string text = 4;
      private java.lang.Object text_ = "";
      /**
       * <code>required string text = 4;</code>
       */
      public boolean hasText() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required string text = 4;</code>
       */
      public java.lang.String getText() {
        java.lang.Object ref = text_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          text_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string text = 4;</code>
       */
      public com.google.protobuf.ByteString
          getTextBytes() {
        java.lang.Object ref = text_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          text_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string text = 4;</code>
       */
      public Builder setText(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        text_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string text = 4;</code>
       */
      public Builder clearText() {
        bitField0_ = (bitField0_ & ~0x00000008);
        text_ = getDefaultInstance().getText();
        onChanged();
        return this;
      }
      /**
       * <code>required string text = 4;</code>
       */
      public Builder setTextBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        text_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:EmailMsg)
    }

    static {
      defaultInstance = new EmailMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:EmailMsg)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_EmailMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_EmailMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016emailmsg.proto\"C\n\010EmailMsg\022\014\n\004from\030\001 \002" +
      "(\t\022\n\n\002to\030\002 \002(\t\022\017\n\007subject\030\003 \002(\t\022\014\n\004text\030" +
      "\004 \002(\t"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_EmailMsg_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_EmailMsg_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_EmailMsg_descriptor,
              new java.lang.String[] { "From", "To", "Subject", "Text", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
