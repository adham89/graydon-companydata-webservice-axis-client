/**
 * GraydonCompanyData_FaultType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.co.graydon.ws.GraydonDataService.types;


/**
 * This is the fault response. It is return if incorrect use of the
 * webservice is detected or 'expected' and 'unexpected' errors are encountered.
 */
public class GraydonCompanyData_FaultType  extends org.apache.axis.AxisFault  implements java.io.Serializable {
    /* Unique transaction identifier. This
     * 								provides a quick and simple way to refer
     * 								to problem or suspect requests/responses
     * 								through the web service. */
    private java.lang.String transactionIdentifier;

    /* The 'FaultType' can be 'expected' or 'unexpected'
     * 'expected' describes errors that are encountered during the normal
     * flow of processing service operations. These should be coded for by
     * the partner. 
     * 'unexpected' can relate to connectivity, system or application errors
     * that are not in the normal flow of processing. */
    private uk.co.graydon.ws.GraydonDataService.types.FaultTypeType faultType;

    /* The fault is a unquie identifier for the error encountered. */
    private java.lang.String faultReturnCode;

    /* A description or stack trace of the error. */
    private java.lang.String faultMessage;

    /* A 'tip' in English on possible solution to rectifying the error. */
    private java.lang.String faultTip;

    public GraydonCompanyData_FaultType() {
    }

    public GraydonCompanyData_FaultType(
           java.lang.String transactionIdentifier,
           uk.co.graydon.ws.GraydonDataService.types.FaultTypeType faultType,
           java.lang.String faultReturnCode,
           java.lang.String faultMessage,
           java.lang.String faultTip) {
        this.transactionIdentifier = transactionIdentifier;
        this.faultType = faultType;
        this.faultReturnCode = faultReturnCode;
        this.faultMessage = faultMessage;
        this.faultTip = faultTip;
    }


    /**
     * Gets the transactionIdentifier value for this GraydonCompanyData_FaultType.
     * 
     * @return transactionIdentifier   * Unique transaction identifier. This
     * 								provides a quick and simple way to refer
     * 								to problem or suspect requests/responses
     * 								through the web service.
     */
    public java.lang.String getTransactionIdentifier() {
        return transactionIdentifier;
    }


    /**
     * Sets the transactionIdentifier value for this GraydonCompanyData_FaultType.
     * 
     * @param transactionIdentifier   * Unique transaction identifier. This
     * 								provides a quick and simple way to refer
     * 								to problem or suspect requests/responses
     * 								through the web service.
     */
    public void setTransactionIdentifier(java.lang.String transactionIdentifier) {
        this.transactionIdentifier = transactionIdentifier;
    }


    /**
     * Gets the faultType value for this GraydonCompanyData_FaultType.
     * 
     * @return faultType   * The 'FaultType' can be 'expected' or 'unexpected'
     * 'expected' describes errors that are encountered during the normal
     * flow of processing service operations. These should be coded for by
     * the partner. 
     * 'unexpected' can relate to connectivity, system or application errors
     * that are not in the normal flow of processing.
     */
    public uk.co.graydon.ws.GraydonDataService.types.FaultTypeType getFaultType() {
        return faultType;
    }


    /**
     * Sets the faultType value for this GraydonCompanyData_FaultType.
     * 
     * @param faultType   * The 'FaultType' can be 'expected' or 'unexpected'
     * 'expected' describes errors that are encountered during the normal
     * flow of processing service operations. These should be coded for by
     * the partner. 
     * 'unexpected' can relate to connectivity, system or application errors
     * that are not in the normal flow of processing.
     */
    public void setFaultType(uk.co.graydon.ws.GraydonDataService.types.FaultTypeType faultType) {
        this.faultType = faultType;
    }


    /**
     * Gets the faultReturnCode value for this GraydonCompanyData_FaultType.
     * 
     * @return faultReturnCode   * The fault is a unquie identifier for the error encountered.
     */
    public java.lang.String getFaultReturnCode() {
        return faultReturnCode;
    }


    /**
     * Sets the faultReturnCode value for this GraydonCompanyData_FaultType.
     * 
     * @param faultReturnCode   * The fault is a unquie identifier for the error encountered.
     */
    public void setFaultReturnCode(java.lang.String faultReturnCode) {
        this.faultReturnCode = faultReturnCode;
    }


    /**
     * Gets the faultMessage value for this GraydonCompanyData_FaultType.
     * 
     * @return faultMessage   * A description or stack trace of the error.
     */
    public java.lang.String getFaultMessage() {
        return faultMessage;
    }


    /**
     * Sets the faultMessage value for this GraydonCompanyData_FaultType.
     * 
     * @param faultMessage   * A description or stack trace of the error.
     */
    public void setFaultMessage(java.lang.String faultMessage) {
        this.faultMessage = faultMessage;
    }


    /**
     * Gets the faultTip value for this GraydonCompanyData_FaultType.
     * 
     * @return faultTip   * A 'tip' in English on possible solution to rectifying the error.
     */
    public java.lang.String getFaultTip() {
        return faultTip;
    }


    /**
     * Sets the faultTip value for this GraydonCompanyData_FaultType.
     * 
     * @param faultTip   * A 'tip' in English on possible solution to rectifying the error.
     */
    public void setFaultTip(java.lang.String faultTip) {
        this.faultTip = faultTip;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GraydonCompanyData_FaultType)) return false;
        GraydonCompanyData_FaultType other = (GraydonCompanyData_FaultType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transactionIdentifier==null && other.getTransactionIdentifier()==null) || 
             (this.transactionIdentifier!=null &&
              this.transactionIdentifier.equals(other.getTransactionIdentifier()))) &&
            ((this.faultType==null && other.getFaultType()==null) || 
             (this.faultType!=null &&
              this.faultType.equals(other.getFaultType()))) &&
            ((this.faultReturnCode==null && other.getFaultReturnCode()==null) || 
             (this.faultReturnCode!=null &&
              this.faultReturnCode.equals(other.getFaultReturnCode()))) &&
            ((this.faultMessage==null && other.getFaultMessage()==null) || 
             (this.faultMessage!=null &&
              this.faultMessage.equals(other.getFaultMessage()))) &&
            ((this.faultTip==null && other.getFaultTip()==null) || 
             (this.faultTip!=null &&
              this.faultTip.equals(other.getFaultTip())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getTransactionIdentifier() != null) {
            _hashCode += getTransactionIdentifier().hashCode();
        }
        if (getFaultType() != null) {
            _hashCode += getFaultType().hashCode();
        }
        if (getFaultReturnCode() != null) {
            _hashCode += getFaultReturnCode().hashCode();
        }
        if (getFaultMessage() != null) {
            _hashCode += getFaultMessage().hashCode();
        }
        if (getFaultTip() != null) {
            _hashCode += getFaultTip().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GraydonCompanyData_FaultType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GraydonCompanyData_FaultType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "TransactionIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faultType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "FaultType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "FaultTypeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faultReturnCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "FaultReturnCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faultMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "FaultMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faultTip");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "FaultTip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
