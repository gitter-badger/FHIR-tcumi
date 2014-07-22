package org.hl7.fhir.instance.model.element.type.quantity;

/*
  Copyright (c) 2011-2013, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/

// Generated on Fri, May 9, 2014 11:14+1000 for FHIR v0.0.81

import java.util.*;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.hl7.fhir.instance.model.DateAndTime;
import org.hl7.fhir.instance.model.Property;
import org.hl7.fhir.instance.model.ResourceType;
import org.hl7.fhir.instance.model.element.BackboneElement;
import org.hl7.fhir.instance.model.element.Resource;
import org.hl7.fhir.instance.model.element.type.Code;
import org.hl7.fhir.instance.model.element.type.CodeableConcept;
import org.hl7.fhir.instance.model.element.type.DateTime;
import org.hl7.fhir.instance.model.element.type.Enumeration;
import org.hl7.fhir.instance.model.element.type.Identifier;
import org.hl7.fhir.instance.model.element.type.Instant;
import org.hl7.fhir.instance.model.element.type.Integer;
import org.hl7.fhir.instance.model.element.type.Period;
import org.hl7.fhir.instance.model.element.type.ResourceReference;
import org.hl7.fhir.instance.model.element.type.String_;
import org.hl7.fhir.instance.model.element.type.uri.Uri;
import org.hl7.fhir.instance.model.factory.EnumFactory;

/**
 * A reference to a document.
 */
@JsonSerialize(include=JsonSerialize.Inclusion.NON_EMPTY)
public class DocumentReference extends Resource {

    public enum DocumentReferenceStatus {
        current, // This is the current reference for this document.
        superceded, // This reference has been superseded by another reference.
        enteredInError, // This reference was created in error.
        Null; // added to help the parsers
        public static DocumentReferenceStatus fromCode(String codeString) throws Exception {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("current".equals(codeString))
          return current;
        if ("superceded".equals(codeString))
          return superceded;
        if ("entered in error".equals(codeString))
          return enteredInError;
        throw new Exception("Unknown DocumentReferenceStatus code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case current: return "current";
            case superceded: return "superceded";
            case enteredInError: return "entered in error";
            default: return "?";
          }
        }
    }

  public static class DocumentReferenceStatusEnumFactory implements EnumFactory {
    public Enum<?> fromCode(String codeString) throws Exception {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("current".equals(codeString))
          return DocumentReferenceStatus.current;
        if ("superceded".equals(codeString))
          return DocumentReferenceStatus.superceded;
        if ("entered in error".equals(codeString))
          return DocumentReferenceStatus.enteredInError;
        throw new Exception("Unknown DocumentReferenceStatus code '"+codeString+"'");
        }
    public String toCode(Enum<?> code) throws Exception {
      if (code == DocumentReferenceStatus.current)
        return "current";
      if (code == DocumentReferenceStatus.superceded)
        return "superceded";
      if (code == DocumentReferenceStatus.enteredInError)
        return "entered in error";
      return "?";
      }
    }

    public enum DocumentRelationshipType {
        replaces, // This document logically replaces or supercedes the target document.
        transforms, // This document was generated by transforming the target document (e.g. format or language conversion).
        signs, // This document is a signature of the target document.
        appends, // This document adds additional information to the target document.
        Null; // added to help the parsers
        public static DocumentRelationshipType fromCode(String codeString) throws Exception {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("replaces".equals(codeString))
          return replaces;
        if ("transforms".equals(codeString))
          return transforms;
        if ("signs".equals(codeString))
          return signs;
        if ("appends".equals(codeString))
          return appends;
        throw new Exception("Unknown DocumentRelationshipType code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case replaces: return "replaces";
            case transforms: return "transforms";
            case signs: return "signs";
            case appends: return "appends";
            default: return "?";
          }
        }
    }

  public static class DocumentRelationshipTypeEnumFactory implements EnumFactory {
    public Enum<?> fromCode(String codeString) throws Exception {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("replaces".equals(codeString))
          return DocumentRelationshipType.replaces;
        if ("transforms".equals(codeString))
          return DocumentRelationshipType.transforms;
        if ("signs".equals(codeString))
          return DocumentRelationshipType.signs;
        if ("appends".equals(codeString))
          return DocumentRelationshipType.appends;
        throw new Exception("Unknown DocumentRelationshipType code '"+codeString+"'");
        }
    public String toCode(Enum<?> code) throws Exception {
      if (code == DocumentRelationshipType.replaces)
        return "replaces";
      if (code == DocumentRelationshipType.transforms)
        return "transforms";
      if (code == DocumentRelationshipType.signs)
        return "signs";
      if (code == DocumentRelationshipType.appends)
        return "appends";
      return "?";
      }
    }

    public static class DocumentReferenceRelatesToComponent extends BackboneElement {
        /**
         * The type of relationship that this document has with anther document.
         */
        protected Enumeration<DocumentRelationshipType> code;

        /**
         * The target document of this relationship.
         */
        protected ResourceReference target;

      public DocumentReferenceRelatesToComponent() {
        super();
      }

      public DocumentReferenceRelatesToComponent(Enumeration<DocumentRelationshipType> code, ResourceReference target) {
        super();
        this.code = code;
        this.target = target;
      }

        /**
         * @return {@link #code} (The type of relationship that this document has with anther document.)
         */
        public Enumeration<DocumentRelationshipType> getCode() { 
          return this.code;
        }

        /**
         * @param value {@link #code} (The type of relationship that this document has with anther document.)
         */
        public DocumentReferenceRelatesToComponent setCode(Enumeration<DocumentRelationshipType> value) { 
          this.code = value;
          return this;
        }

        /**
         * @return The type of relationship that this document has with anther document.
         */
        public DocumentRelationshipType getCodeSimple() { 
          return this.code == null ? null : this.code.getValue();
        }

        /**
         * @param value The type of relationship that this document has with anther document.
         */
        public DocumentReferenceRelatesToComponent setCodeSimple(DocumentRelationshipType value) { 
            if (this.code == null)
              this.code = new Enumeration<DocumentRelationshipType>();
            this.code.setValue(value);
          return this;
        }

        /**
         * @return {@link #target} (The target document of this relationship.)
         */
        public ResourceReference getTarget() { 
          return this.target;
        }

        /**
         * @param value {@link #target} (The target document of this relationship.)
         */
        public DocumentReferenceRelatesToComponent setTarget(ResourceReference value) { 
          this.target = value;
          return this;
        }

        protected void listChildren(List<Property> childrenList) {
          super.listChildren(childrenList);
          childrenList.add(new Property("code", "code", "The type of relationship that this document has with anther document.", 0, java.lang.Integer.MAX_VALUE, code));
          childrenList.add(new Property("target", "Resource(DocumentReference)", "The target document of this relationship.", 0, java.lang.Integer.MAX_VALUE, target));
        }

      public DocumentReferenceRelatesToComponent copy(DocumentReference e) {
        DocumentReferenceRelatesToComponent dst = new DocumentReferenceRelatesToComponent();
        dst.code = code == null ? null : code.copy();
        dst.target = target == null ? null : target.copy();
        return dst;
      }

  }

    public static class DocumentReferenceServiceComponent extends BackboneElement {
        /**
         * The type of the service that can be used to access the documents.
         */
        protected CodeableConcept type;

        /**
         * Where the service end-point is located.
         */
        protected String_ address;

        /**
         * A list of named parameters that is used in the service call.
         */
        protected List<DocumentReferenceServiceParameterComponent> parameter = new ArrayList<DocumentReferenceServiceParameterComponent>();

      public DocumentReferenceServiceComponent() {
        super();
      }

      public DocumentReferenceServiceComponent(CodeableConcept type) {
        super();
        this.type = type;
      }

        /**
         * @return {@link #type} (The type of the service that can be used to access the documents.)
         */
        public CodeableConcept getType() { 
          return this.type;
        }

        /**
         * @param value {@link #type} (The type of the service that can be used to access the documents.)
         */
        public DocumentReferenceServiceComponent setType(CodeableConcept value) { 
          this.type = value;
          return this;
        }

        /**
         * @return {@link #address} (Where the service end-point is located.)
         */
        public String_ getAddress() { 
          return this.address;
        }

        /**
         * @param value {@link #address} (Where the service end-point is located.)
         */
        public DocumentReferenceServiceComponent setAddress(String_ value) { 
          this.address = value;
          return this;
        }

        /**
         * @return Where the service end-point is located.
         */
        public String getAddressSimple() { 
          return this.address == null ? null : this.address.getValue();
        }

        /**
         * @param value Where the service end-point is located.
         */
        public DocumentReferenceServiceComponent setAddressSimple(String value) { 
          if (value == null)
            this.address = null;
          else {
            if (this.address == null)
              this.address = new String_();
            this.address.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #parameter} (A list of named parameters that is used in the service call.)
         */
        public List<DocumentReferenceServiceParameterComponent> getParameter() { 
          return this.parameter;
        }

    // syntactic sugar
        /**
         * @return {@link #parameter} (A list of named parameters that is used in the service call.)
         */
        public DocumentReferenceServiceParameterComponent addParameter() { 
          DocumentReferenceServiceParameterComponent t = new DocumentReferenceServiceParameterComponent();
          this.parameter.add(t);
          return t;
        }

        protected void listChildren(List<Property> childrenList) {
          super.listChildren(childrenList);
          childrenList.add(new Property("type", "CodeableConcept", "The type of the service that can be used to access the documents.", 0, java.lang.Integer.MAX_VALUE, type));
          childrenList.add(new Property("address", "string", "Where the service end-point is located.", 0, java.lang.Integer.MAX_VALUE, address));
          childrenList.add(new Property("parameter", "", "A list of named parameters that is used in the service call.", 0, java.lang.Integer.MAX_VALUE, parameter));
        }

      public DocumentReferenceServiceComponent copy(DocumentReference e) {
        DocumentReferenceServiceComponent dst = new DocumentReferenceServiceComponent();
        dst.type = type == null ? null : type.copy();
        dst.address = address == null ? null : address.copy();
        dst.parameter = new ArrayList<DocumentReferenceServiceParameterComponent>();
        for (DocumentReferenceServiceParameterComponent i : parameter)
          dst.parameter.add(i.copy(e));
        return dst;
      }

  }

    public static class DocumentReferenceServiceParameterComponent extends BackboneElement {
        /**
         * The name of a parameter.
         */
        protected String_ name;

        /**
         * The value of the named parameter.
         */
        protected String_ value;

      public DocumentReferenceServiceParameterComponent() {
        super();
      }

      public DocumentReferenceServiceParameterComponent(String_ name) {
        super();
        this.name = name;
      }

        /**
         * @return {@link #name} (The name of a parameter.)
         */
        public String_ getName() { 
          return this.name;
        }

        /**
         * @param value {@link #name} (The name of a parameter.)
         */
        public DocumentReferenceServiceParameterComponent setName(String_ value) { 
          this.name = value;
          return this;
        }

        /**
         * @return The name of a parameter.
         */
        public String getNameSimple() { 
          return this.name == null ? null : this.name.getValue();
        }

        /**
         * @param value The name of a parameter.
         */
        public DocumentReferenceServiceParameterComponent setNameSimple(String value) { 
            if (this.name == null)
              this.name = new String_();
            this.name.setValue(value);
          return this;
        }

        /**
         * @return {@link #value} (The value of the named parameter.)
         */
        public String_ getValue() { 
          return this.value;
        }

        /**
         * @param value {@link #value} (The value of the named parameter.)
         */
        public DocumentReferenceServiceParameterComponent setValue(String_ value) { 
          this.value = value;
          return this;
        }

        /**
         * @return The value of the named parameter.
         */
        public String getValueSimple() { 
          return this.value == null ? null : this.value.getValue();
        }

        /**
         * @param value The value of the named parameter.
         */
        public DocumentReferenceServiceParameterComponent setValueSimple(String value) { 
          if (value == null)
            this.value = null;
          else {
            if (this.value == null)
              this.value = new String_();
            this.value.setValue(value);
          }
          return this;
        }

        protected void listChildren(List<Property> childrenList) {
          super.listChildren(childrenList);
          childrenList.add(new Property("name", "string", "The name of a parameter.", 0, java.lang.Integer.MAX_VALUE, name));
          childrenList.add(new Property("value", "string", "The value of the named parameter.", 0, java.lang.Integer.MAX_VALUE, value));
        }

      public DocumentReferenceServiceParameterComponent copy(DocumentReference e) {
        DocumentReferenceServiceParameterComponent dst = new DocumentReferenceServiceParameterComponent();
        dst.name = name == null ? null : name.copy();
        dst.value = value == null ? null : value.copy();
        return dst;
      }

  }

    public static class DocumentReferenceContextComponent extends BackboneElement {
        /**
         * This list of codes represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the typeCode, such as a "History and Physical Report" in which the procedure being documented is necessarily a "History and Physical" act.
         */
        protected List<CodeableConcept> event = new ArrayList<CodeableConcept>();

        /**
         * The time period over which the service that is described by the document was provided.
         */
        protected Period period;

        /**
         * The kind of facility where the patient was seen.
         */
        protected CodeableConcept facilityType;

      public DocumentReferenceContextComponent() {
        super();
      }

        /**
         * @return {@link #event} (This list of codes represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the typeCode, such as a "History and Physical Report" in which the procedure being documented is necessarily a "History and Physical" act.)
         */
        public List<CodeableConcept> getEvent() { 
          return this.event;
        }

    // syntactic sugar
        /**
         * @return {@link #event} (This list of codes represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the typeCode, such as a "History and Physical Report" in which the procedure being documented is necessarily a "History and Physical" act.)
         */
        public CodeableConcept addEvent() { 
          CodeableConcept t = new CodeableConcept();
          this.event.add(t);
          return t;
        }

        /**
         * @return {@link #period} (The time period over which the service that is described by the document was provided.)
         */
        public Period getPeriod() { 
          return this.period;
        }

        /**
         * @param value {@link #period} (The time period over which the service that is described by the document was provided.)
         */
        public DocumentReferenceContextComponent setPeriod(Period value) { 
          this.period = value;
          return this;
        }

        /**
         * @return {@link #facilityType} (The kind of facility where the patient was seen.)
         */
        public CodeableConcept getFacilityType() { 
          return this.facilityType;
        }

        /**
         * @param value {@link #facilityType} (The kind of facility where the patient was seen.)
         */
        public DocumentReferenceContextComponent setFacilityType(CodeableConcept value) { 
          this.facilityType = value;
          return this;
        }

        protected void listChildren(List<Property> childrenList) {
          super.listChildren(childrenList);
          childrenList.add(new Property("event", "CodeableConcept", "This list of codes represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the typeCode, such as a 'History and Physical Report' in which the procedure being documented is necessarily a 'History and Physical' act.", 0, java.lang.Integer.MAX_VALUE, event));
          childrenList.add(new Property("period", "Period", "The time period over which the service that is described by the document was provided.", 0, java.lang.Integer.MAX_VALUE, period));
          childrenList.add(new Property("facilityType", "CodeableConcept", "The kind of facility where the patient was seen.", 0, java.lang.Integer.MAX_VALUE, facilityType));
        }

      public DocumentReferenceContextComponent copy(DocumentReference e) {
        DocumentReferenceContextComponent dst = new DocumentReferenceContextComponent();
        dst.event = new ArrayList<CodeableConcept>();
        for (CodeableConcept i : event)
          dst.event.add(i.copy());
        dst.period = period == null ? null : period.copy();
        dst.facilityType = facilityType == null ? null : facilityType.copy();
        return dst;
      }

  }

    /**
     * Document identifier as assigned by the source of the document. This identifier is specific to this version of the document. This unique identifier may be used elsewhere to identify this version of the document.
     */
    protected Identifier masterIdentifier;

    /**
     * Other identifiers associated with the document, including version independent, source record and workflow related identifiers.
     */
    protected List<Identifier> identifier = new ArrayList<Identifier>();

    /**
     * Who or what the document is about. The document can be about a person, (patient or healthcare practitioner), a device (I.e. machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that share a common exposure).
     */
    protected ResourceReference subject;

    /**
     * Specifies the particular kind of document (e.g. Patient Summary, Discharge Summary, Prescription, etc.).
     */
    protected CodeableConcept type;

    /**
     * A categorization for the type of the document. This may be implied by or derived from the code specified in the Document Type.
     */
    protected CodeableConcept class_;

    /**
     * Identifies who is responsible for adding the information to the document.
     */
    protected List<ResourceReference> author = new ArrayList<ResourceReference>();

    /**
     * Identifies the organization or group who is responsible for ongoing maintenance of and access to the document.
     */
    protected ResourceReference custodian;

    /**
     * A reference to a domain or server that manages policies under which the document is accessed and/or made available.
     */
    protected Uri policyManager;

    /**
     * Which person or organization authenticates that this document is valid.
     */
    protected ResourceReference authenticator;

    /**
     * When the document was created.
     */
    protected DateTime created;

    /**
     * When the document reference was created.
     */
    protected Instant indexed;

    /**
     * The status of this document reference.
     */
    protected Enumeration<DocumentReferenceStatus> status;

    /**
     * The status of the underlying document.
     */
    protected CodeableConcept docStatus;

    /**
     * Relationships that this document has with other document references that already exist.
     */
    protected List<DocumentReferenceRelatesToComponent> relatesTo = new ArrayList<DocumentReferenceRelatesToComponent>();

    /**
     * Human-readable description of the source document. This is sometimes known as the "title".
     */
    protected String_ description;

    /**
     * A code specifying the level of confidentiality of the XDS Document.
     */
    protected List<CodeableConcept> confidentiality = new ArrayList<CodeableConcept>();

    /**
     * The primary language in which the source document is written.
     */
    protected Code primaryLanguage;

    /**
     * The mime type of the source document.
     */
    protected Code mimeType;

    /**
     * An identifier that identifies that the format and content of the document conforms to additional rules beyond the base format indicated in the mimeType.
     */
    protected List<Uri> format = new ArrayList<Uri>();

    /**
     * The size of the source document this reference refers to in bytes.
     */
    protected Integer size;

    /**
     * A hash of the source document to ensure that changes have not occurred.
     */
    protected String_ hash;

    /**
     * A url at which the document can be accessed.
     */
    protected Uri location;

    /**
     * A description of a service call that can be used to retrieve the document.
     */
    protected DocumentReferenceServiceComponent service;

    /**
     * The clinical context in which the document was prepared.
     */
    protected DocumentReferenceContextComponent context;

    public DocumentReference() {
      super();
    }

    public DocumentReference(Identifier masterIdentifier, ResourceReference subject, CodeableConcept type, Instant indexed, Enumeration<DocumentReferenceStatus> status, Code mimeType) {
      super();
      this.masterIdentifier = masterIdentifier;
      this.subject = subject;
      this.type = type;
      this.indexed = indexed;
      this.status = status;
      this.mimeType = mimeType;
    }

    /**
     * @return {@link #masterIdentifier} (Document identifier as assigned by the source of the document. This identifier is specific to this version of the document. This unique identifier may be used elsewhere to identify this version of the document.)
     */
    public Identifier getMasterIdentifier() { 
      return this.masterIdentifier;
    }

    /**
     * @param value {@link #masterIdentifier} (Document identifier as assigned by the source of the document. This identifier is specific to this version of the document. This unique identifier may be used elsewhere to identify this version of the document.)
     */
    public DocumentReference setMasterIdentifier(Identifier value) { 
      this.masterIdentifier = value;
      return this;
    }

    /**
     * @return {@link #identifier} (Other identifiers associated with the document, including version independent, source record and workflow related identifiers.)
     */
    public List<Identifier> getIdentifier() { 
      return this.identifier;
    }

    // syntactic sugar
    /**
     * @return {@link #identifier} (Other identifiers associated with the document, including version independent, source record and workflow related identifiers.)
     */
    public Identifier addIdentifier() { 
      Identifier t = new Identifier();
      this.identifier.add(t);
      return t;
    }

    /**
     * @return {@link #subject} (Who or what the document is about. The document can be about a person, (patient or healthcare practitioner), a device (I.e. machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that share a common exposure).)
     */
    public ResourceReference getSubject() { 
      return this.subject;
    }

    /**
     * @param value {@link #subject} (Who or what the document is about. The document can be about a person, (patient or healthcare practitioner), a device (I.e. machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that share a common exposure).)
     */
    public DocumentReference setSubject(ResourceReference value) { 
      this.subject = value;
      return this;
    }

    /**
     * @return {@link #type} (Specifies the particular kind of document (e.g. Patient Summary, Discharge Summary, Prescription, etc.).)
     */
    public CodeableConcept getType() { 
      return this.type;
    }

    /**
     * @param value {@link #type} (Specifies the particular kind of document (e.g. Patient Summary, Discharge Summary, Prescription, etc.).)
     */
    public DocumentReference setType(CodeableConcept value) { 
      this.type = value;
      return this;
    }

    /**
     * @return {@link #class_} (A categorization for the type of the document. This may be implied by or derived from the code specified in the Document Type.)
     */
    public CodeableConcept getClass_() { 
      return this.class_;
    }

    /**
     * @param value {@link #class_} (A categorization for the type of the document. This may be implied by or derived from the code specified in the Document Type.)
     */
    public DocumentReference setClass_(CodeableConcept value) { 
      this.class_ = value;
      return this;
    }

    /**
     * @return {@link #author} (Identifies who is responsible for adding the information to the document.)
     */
    public List<ResourceReference> getAuthor() { 
      return this.author;
    }

    // syntactic sugar
    /**
     * @return {@link #author} (Identifies who is responsible for adding the information to the document.)
     */
    public ResourceReference addAuthor() { 
      ResourceReference t = new ResourceReference();
      this.author.add(t);
      return t;
    }

    /**
     * @return {@link #custodian} (Identifies the organization or group who is responsible for ongoing maintenance of and access to the document.)
     */
    public ResourceReference getCustodian() { 
      return this.custodian;
    }

    /**
     * @param value {@link #custodian} (Identifies the organization or group who is responsible for ongoing maintenance of and access to the document.)
     */
    public DocumentReference setCustodian(ResourceReference value) { 
      this.custodian = value;
      return this;
    }

    /**
     * @return {@link #policyManager} (A reference to a domain or server that manages policies under which the document is accessed and/or made available.)
     */
    public Uri getPolicyManager() { 
      return this.policyManager;
    }

    /**
     * @param value {@link #policyManager} (A reference to a domain or server that manages policies under which the document is accessed and/or made available.)
     */
    public DocumentReference setPolicyManager(Uri value) { 
      this.policyManager = value;
      return this;
    }

    /**
     * @return A reference to a domain or server that manages policies under which the document is accessed and/or made available.
     */
    public String getPolicyManagerSimple() { 
      return this.policyManager == null ? null : this.policyManager.getValue();
    }

    /**
     * @param value A reference to a domain or server that manages policies under which the document is accessed and/or made available.
     */
    public DocumentReference setPolicyManagerSimple(String value) { 
      if (value == null)
        this.policyManager = null;
      else {
        if (this.policyManager == null)
          this.policyManager = new Uri();
        this.policyManager.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #authenticator} (Which person or organization authenticates that this document is valid.)
     */
    public ResourceReference getAuthenticator() { 
      return this.authenticator;
    }

    /**
     * @param value {@link #authenticator} (Which person or organization authenticates that this document is valid.)
     */
    public DocumentReference setAuthenticator(ResourceReference value) { 
      this.authenticator = value;
      return this;
    }

    /**
     * @return {@link #created} (When the document was created.)
     */
    public DateTime getCreated() { 
      return this.created;
    }

    /**
     * @param value {@link #created} (When the document was created.)
     */
    public DocumentReference setCreated(DateTime value) { 
      this.created = value;
      return this;
    }

    /**
     * @return When the document was created.
     */
    public DateAndTime getCreatedSimple() { 
      return this.created == null ? null : this.created.getValue();
    }

    /**
     * @param value When the document was created.
     */
    public DocumentReference setCreatedSimple(DateAndTime value) { 
      if (value == null)
        this.created = null;
      else {
        if (this.created == null)
          this.created = new DateTime();
        this.created.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #indexed} (When the document reference was created.)
     */
    public Instant getIndexed() { 
      return this.indexed;
    }

    /**
     * @param value {@link #indexed} (When the document reference was created.)
     */
    public DocumentReference setIndexed(Instant value) { 
      this.indexed = value;
      return this;
    }

    /**
     * @return When the document reference was created.
     */
    public DateAndTime getIndexedSimple() { 
      return this.indexed == null ? null : this.indexed.getValue();
    }

    /**
     * @param value When the document reference was created.
     */
    public DocumentReference setIndexedSimple(DateAndTime value) { 
        if (this.indexed == null)
          this.indexed = new Instant();
        this.indexed.setValue(value);
      return this;
    }

    /**
     * @return {@link #status} (The status of this document reference.)
     */
    public Enumeration<DocumentReferenceStatus> getStatus() { 
      return this.status;
    }

    /**
     * @param value {@link #status} (The status of this document reference.)
     */
    public DocumentReference setStatus(Enumeration<DocumentReferenceStatus> value) { 
      this.status = value;
      return this;
    }

    /**
     * @return The status of this document reference.
     */
    public DocumentReferenceStatus getStatusSimple() { 
      return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value The status of this document reference.
     */
    public DocumentReference setStatusSimple(DocumentReferenceStatus value) { 
        if (this.status == null)
          this.status = new Enumeration<DocumentReferenceStatus>();
        this.status.setValue(value);
      return this;
    }

    /**
     * @return {@link #docStatus} (The status of the underlying document.)
     */
    public CodeableConcept getDocStatus() { 
      return this.docStatus;
    }

    /**
     * @param value {@link #docStatus} (The status of the underlying document.)
     */
    public DocumentReference setDocStatus(CodeableConcept value) { 
      this.docStatus = value;
      return this;
    }

    /**
     * @return {@link #relatesTo} (Relationships that this document has with other document references that already exist.)
     */
    public List<DocumentReferenceRelatesToComponent> getRelatesTo() { 
      return this.relatesTo;
    }

    // syntactic sugar
    /**
     * @return {@link #relatesTo} (Relationships that this document has with other document references that already exist.)
     */
    public DocumentReferenceRelatesToComponent addRelatesTo() { 
      DocumentReferenceRelatesToComponent t = new DocumentReferenceRelatesToComponent();
      this.relatesTo.add(t);
      return t;
    }

    /**
     * @return {@link #description} (Human-readable description of the source document. This is sometimes known as the "title".)
     */
    public String_ getDescription() { 
      return this.description;
    }

    /**
     * @param value {@link #description} (Human-readable description of the source document. This is sometimes known as the "title".)
     */
    public DocumentReference setDescription(String_ value) { 
      this.description = value;
      return this;
    }

    /**
     * @return Human-readable description of the source document. This is sometimes known as the "title".
     */
    public String getDescriptionSimple() { 
      return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value Human-readable description of the source document. This is sometimes known as the "title".
     */
    public DocumentReference setDescriptionSimple(String value) { 
      if (value == null)
        this.description = null;
      else {
        if (this.description == null)
          this.description = new String_();
        this.description.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #confidentiality} (A code specifying the level of confidentiality of the XDS Document.)
     */
    public List<CodeableConcept> getConfidentiality() { 
      return this.confidentiality;
    }

    // syntactic sugar
    /**
     * @return {@link #confidentiality} (A code specifying the level of confidentiality of the XDS Document.)
     */
    public CodeableConcept addConfidentiality() { 
      CodeableConcept t = new CodeableConcept();
      this.confidentiality.add(t);
      return t;
    }

    /**
     * @return {@link #primaryLanguage} (The primary language in which the source document is written.)
     */
    public Code getPrimaryLanguage() { 
      return this.primaryLanguage;
    }

    /**
     * @param value {@link #primaryLanguage} (The primary language in which the source document is written.)
     */
    public DocumentReference setPrimaryLanguage(Code value) { 
      this.primaryLanguage = value;
      return this;
    }

    /**
     * @return The primary language in which the source document is written.
     */
    public String getPrimaryLanguageSimple() { 
      return this.primaryLanguage == null ? null : this.primaryLanguage.getValue();
    }

    /**
     * @param value The primary language in which the source document is written.
     */
    public DocumentReference setPrimaryLanguageSimple(String value) { 
      if (value == null)
        this.primaryLanguage = null;
      else {
        if (this.primaryLanguage == null)
          this.primaryLanguage = new Code();
        this.primaryLanguage.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #mimeType} (The mime type of the source document.)
     */
    public Code getMimeType() { 
      return this.mimeType;
    }

    /**
     * @param value {@link #mimeType} (The mime type of the source document.)
     */
    public DocumentReference setMimeType(Code value) { 
      this.mimeType = value;
      return this;
    }

    /**
     * @return The mime type of the source document.
     */
    public String getMimeTypeSimple() { 
      return this.mimeType == null ? null : this.mimeType.getValue();
    }

    /**
     * @param value The mime type of the source document.
     */
    public DocumentReference setMimeTypeSimple(String value) { 
        if (this.mimeType == null)
          this.mimeType = new Code();
        this.mimeType.setValue(value);
      return this;
    }

    /**
     * @return {@link #format} (An identifier that identifies that the format and content of the document conforms to additional rules beyond the base format indicated in the mimeType.)
     */
    public List<Uri> getFormat() { 
      return this.format;
    }

    // syntactic sugar
    /**
     * @return {@link #format} (An identifier that identifies that the format and content of the document conforms to additional rules beyond the base format indicated in the mimeType.)
     */
    public Uri addFormat() { 
      Uri t = new Uri();
      this.format.add(t);
      return t;
    }

    /**
     * @param value {@link #format} (An identifier that identifies that the format and content of the document conforms to additional rules beyond the base format indicated in the mimeType.)
     */
    public Uri addFormatSimple(String value) { 
      Uri t = new Uri();
      t.setValue(value);
      this.format.add(t);
      return t;
    }

    /**
     * @return {@link #size} (The size of the source document this reference refers to in bytes.)
     */
    public Integer getSize() { 
      return this.size;
    }

    /**
     * @param value {@link #size} (The size of the source document this reference refers to in bytes.)
     */
    public DocumentReference setSize(Integer value) { 
      this.size = value;
      return this;
    }

    /**
     * @return The size of the source document this reference refers to in bytes.
     */
    public int getSizeSimple() { 
      return this.size == null ? null : this.size.getValue();
    }

    /**
     * @param value The size of the source document this reference refers to in bytes.
     */
    public DocumentReference setSizeSimple(int value) { 
      if (value == -1)
        this.size = null;
      else {
        if (this.size == null)
          this.size = new Integer();
        this.size.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #hash} (A hash of the source document to ensure that changes have not occurred.)
     */
    public String_ getHash() { 
      return this.hash;
    }

    /**
     * @param value {@link #hash} (A hash of the source document to ensure that changes have not occurred.)
     */
    public DocumentReference setHash(String_ value) { 
      this.hash = value;
      return this;
    }

    /**
     * @return A hash of the source document to ensure that changes have not occurred.
     */
    public String getHashSimple() { 
      return this.hash == null ? null : this.hash.getValue();
    }

    /**
     * @param value A hash of the source document to ensure that changes have not occurred.
     */
    public DocumentReference setHashSimple(String value) { 
      if (value == null)
        this.hash = null;
      else {
        if (this.hash == null)
          this.hash = new String_();
        this.hash.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #location} (A url at which the document can be accessed.)
     */
    public Uri getLocation() { 
      return this.location;
    }

    /**
     * @param value {@link #location} (A url at which the document can be accessed.)
     */
    public DocumentReference setLocation(Uri value) { 
      this.location = value;
      return this;
    }

    /**
     * @return A url at which the document can be accessed.
     */
    public String getLocationSimple() { 
      return this.location == null ? null : this.location.getValue();
    }

    /**
     * @param value A url at which the document can be accessed.
     */
    public DocumentReference setLocationSimple(String value) { 
      if (value == null)
        this.location = null;
      else {
        if (this.location == null)
          this.location = new Uri();
        this.location.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #service} (A description of a service call that can be used to retrieve the document.)
     */
    public DocumentReferenceServiceComponent getService() { 
      return this.service;
    }

    /**
     * @param value {@link #service} (A description of a service call that can be used to retrieve the document.)
     */
    public DocumentReference setService(DocumentReferenceServiceComponent value) { 
      this.service = value;
      return this;
    }

    /**
     * @return {@link #context} (The clinical context in which the document was prepared.)
     */
    public DocumentReferenceContextComponent getContext() { 
      return this.context;
    }

    /**
     * @param value {@link #context} (The clinical context in which the document was prepared.)
     */
    public DocumentReference setContext(DocumentReferenceContextComponent value) { 
      this.context = value;
      return this;
    }

      protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("masterIdentifier", "Identifier", "Document identifier as assigned by the source of the document. This identifier is specific to this version of the document. This unique identifier may be used elsewhere to identify this version of the document.", 0, java.lang.Integer.MAX_VALUE, masterIdentifier));
        childrenList.add(new Property("identifier", "Identifier", "Other identifiers associated with the document, including version independent, source record and workflow related identifiers.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("subject", "Resource(Patient|Practitioner|Group|Device)", "Who or what the document is about. The document can be about a person, (patient or healthcare practitioner), a device (I.e. machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that share a common exposure).", 0, java.lang.Integer.MAX_VALUE, subject));
        childrenList.add(new Property("type", "CodeableConcept", "Specifies the particular kind of document (e.g. Patient Summary, Discharge Summary, Prescription, etc.).", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("class", "CodeableConcept", "A categorization for the type of the document. This may be implied by or derived from the code specified in the Document Type.", 0, java.lang.Integer.MAX_VALUE, class_));
        childrenList.add(new Property("author", "Resource(Practitioner|Device|Patient|RelatedPerson)", "Identifies who is responsible for adding the information to the document.", 0, java.lang.Integer.MAX_VALUE, author));
        childrenList.add(new Property("custodian", "Resource(Organization)", "Identifies the organization or group who is responsible for ongoing maintenance of and access to the document.", 0, java.lang.Integer.MAX_VALUE, custodian));
        childrenList.add(new Property("policyManager", "uri", "A reference to a domain or server that manages policies under which the document is accessed and/or made available.", 0, java.lang.Integer.MAX_VALUE, policyManager));
        childrenList.add(new Property("authenticator", "Resource(Practitioner|Organization)", "Which person or organization authenticates that this document is valid.", 0, java.lang.Integer.MAX_VALUE, authenticator));
        childrenList.add(new Property("created", "dateTime", "When the document was created.", 0, java.lang.Integer.MAX_VALUE, created));
        childrenList.add(new Property("indexed", "instant", "When the document reference was created.", 0, java.lang.Integer.MAX_VALUE, indexed));
        childrenList.add(new Property("status", "code", "The status of this document reference.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("docStatus", "CodeableConcept", "The status of the underlying document.", 0, java.lang.Integer.MAX_VALUE, docStatus));
        childrenList.add(new Property("relatesTo", "", "Relationships that this document has with other document references that already exist.", 0, java.lang.Integer.MAX_VALUE, relatesTo));
        childrenList.add(new Property("description", "string", "Human-readable description of the source document. This is sometimes known as the 'title'.", 0, java.lang.Integer.MAX_VALUE, description));
        childrenList.add(new Property("confidentiality", "CodeableConcept", "A code specifying the level of confidentiality of the XDS Document.", 0, java.lang.Integer.MAX_VALUE, confidentiality));
        childrenList.add(new Property("primaryLanguage", "code", "The primary language in which the source document is written.", 0, java.lang.Integer.MAX_VALUE, primaryLanguage));
        childrenList.add(new Property("mimeType", "code", "The mime type of the source document.", 0, java.lang.Integer.MAX_VALUE, mimeType));
        childrenList.add(new Property("format", "uri", "An identifier that identifies that the format and content of the document conforms to additional rules beyond the base format indicated in the mimeType.", 0, java.lang.Integer.MAX_VALUE, format));
        childrenList.add(new Property("size", "integer", "The size of the source document this reference refers to in bytes.", 0, java.lang.Integer.MAX_VALUE, size));
        childrenList.add(new Property("hash", "string", "A hash of the source document to ensure that changes have not occurred.", 0, java.lang.Integer.MAX_VALUE, hash));
        childrenList.add(new Property("location", "uri", "A url at which the document can be accessed.", 0, java.lang.Integer.MAX_VALUE, location));
        childrenList.add(new Property("service", "", "A description of a service call that can be used to retrieve the document.", 0, java.lang.Integer.MAX_VALUE, service));
        childrenList.add(new Property("context", "", "The clinical context in which the document was prepared.", 0, java.lang.Integer.MAX_VALUE, context));
      }

      public DocumentReference copy() {
        DocumentReference dst = new DocumentReference();
        dst.masterIdentifier = masterIdentifier == null ? null : masterIdentifier.copy();
        dst.identifier = new ArrayList<Identifier>();
        for (Identifier i : identifier)
          dst.identifier.add(i.copy());
        dst.subject = subject == null ? null : subject.copy();
        dst.type = type == null ? null : type.copy();
        dst.class_ = class_ == null ? null : class_.copy();
        dst.author = new ArrayList<ResourceReference>();
        for (ResourceReference i : author)
          dst.author.add(i.copy());
        dst.custodian = custodian == null ? null : custodian.copy();
        dst.policyManager = policyManager == null ? null : policyManager.copy();
        dst.authenticator = authenticator == null ? null : authenticator.copy();
        dst.created = created == null ? null : created.copy();
        dst.indexed = indexed == null ? null : indexed.copy();
        dst.status = status == null ? null : status.copy();
        dst.docStatus = docStatus == null ? null : docStatus.copy();
        dst.relatesTo = new ArrayList<DocumentReferenceRelatesToComponent>();
        for (DocumentReferenceRelatesToComponent i : relatesTo)
          dst.relatesTo.add(i.copy(dst));
        dst.description = description == null ? null : description.copy();
        dst.confidentiality = new ArrayList<CodeableConcept>();
        for (CodeableConcept i : confidentiality)
          dst.confidentiality.add(i.copy());
        dst.primaryLanguage = primaryLanguage == null ? null : primaryLanguage.copy();
        dst.mimeType = mimeType == null ? null : mimeType.copy();
        dst.format = new ArrayList<Uri>();
        for (Uri i : format)
          dst.format.add(i.copy());
        dst.size = size == null ? null : size.copy();
        dst.hash = hash == null ? null : hash.copy();
        dst.location = location == null ? null : location.copy();
        dst.service = service == null ? null : service.copy(dst);
        dst.context = context == null ? null : context.copy(dst);
        return dst;
      }

      protected DocumentReference typedCopy() {
        return copy();
      }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.DocumentReference;
   }


}

