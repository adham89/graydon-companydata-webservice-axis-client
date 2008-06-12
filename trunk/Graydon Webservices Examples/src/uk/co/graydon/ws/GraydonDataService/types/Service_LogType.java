/**
 * Service_LogType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.co.graydon.ws.GraydonDataService.types;


/**
 * Standard service response information
 */
public class Service_LogType  implements java.io.Serializable {
    private java.lang.String partnerUserId;

    private java.lang.String partnerClientId;

    /* Unique transaction identifier.
     * This provides a quick and simple way to refer to problem or suspect
     * requests/responses through the web service. */
    private java.lang.String transactionIdentifier;

    /* Unique session identifier */
    private java.lang.String sessionID;

    /* Recorded date and time for receipt of the service request */
    private uk.co.graydon.ws.GraydonDataService.types.TimeStampType requestTimestamp;

    /* Recorded date and time for delivery of the service response. */
    private uk.co.graydon.ws.GraydonDataService.types.TimeStampType responseTimestamp;

    /* Service additional diagnostic information. Help to determine
     * any problems whilst using the service. */
    private java.lang.String diagnosticInformation;

    private java.lang.String country;

    public Service_LogType() {
    }

    public Service_LogType(
           java.lang.String partnerUserId,
           java.lang.String partnerClientId,
           java.lang.String transactionIdentifier,
           java.lang.String sessionID,
           uk.co.graydon.ws.GraydonDataService.types.TimeStampType requestTimestamp,
           uk.co.graydon.ws.GraydonDataService.types.TimeStampType responseTimestamp,
           java.lang.String diagnosticInformation,
           java.lang.String country) {
           this.partnerUserId = partnerUserId;
           this.partnerClientId = partnerClientId;
           this.transactionIdentifier = transactionIdentifier;
           this.sessionID = sessionID;
           this.requestTimestamp = requestTimestamp;
           this.responseTimestamp = responseTimestamp;
           this.diagnosticInformation = diagnosticInformation;
           this.country = country;
    }


    /**
     * Gets the partnerUserId value for this Service_LogType.
     * 
     * @return partnerUserId
     */
    public java.lang.String getPartnerUserId() {
        return partnerUserId;
    }


    /**
     * Sets the partnerUserId value for this Service_LogType.
     * 
     * @param partnerUserId
     */
    public void setPartnerUserId(java.lang.String partnerUserId) {
        this.partnerUserId = partnerUserId;
    }


    /**
     * Gets the partnerClientId value for this Service_LogType.
     * 
     * @return partnerClientId
     */
    public java.lang.String getPartnerClientId() {
        return partnerClientId;
    }


    /**
     * Sets the partnerClientId value for this Service_LogType.
     * 
     * @param partnerClientId
     */
    public void setPartnerClientId(java.lang.String partnerClientId) {
        this.partnerClientId = partnerClientId;
    }


    /**
     * Gets the transactionIdentifier value for this Service_LogType.
     * 
     * @return transactionIdentifier   * Unique transaction identifier.
     * This provides a quick and simple way to refer to problem or suspect
     * requests/responses through the web service.
     */
    public java.lang.String getTransactionIdentifier() {
        return transactionIdentifier;
    }


    /**
     * Sets the transactionIdentifier value for this Service_LogType.
     * 
     * @param transactionIdentifier   * Unique transaction identifier.
     * This provides a quick and simple way to refer to problem or suspect
     * requests/responses through the web service.
     */
    public void setTransactionIdentifier(java.lang.String transactionIdentifier) {
        this.transactionIdentifier = transactionIdentifier;
    }


    /**
     * Gets the sessionID value for this Service_LogType.
     * 
     * @return sessionID   * Unique session identifier
     */
    public java.lang.String getSessionID() {
        return sessionID;
    }


    /**
     * Sets the sessionID value for this Service_LogType.
     * 
     * @param sessionID   * Unique session identifier
     */
    public void setSessionID(java.lang.String sessionID) {
        this.sessionID = sessionID;
    }


    /**
     * Gets the requestTimestamp value for this Service_LogType.
     * 
     * @return requestTimestamp   * Recorded date and time for receipt of the service request
     */
    public uk.co.graydon.ws.GraydonDataService.types.TimeStampType getRequestTimestamp() {
        return requestTimestamp;
    }


    /**
     * Sets the requestTimestamp value for this Service_LogType.
     * 
     * @param requestTimestamp   * Recorded date and time for receipt of the service request
     */
    public void setRequestTimestamp(uk.co.graydon.ws.GraydonDataService.types.TimeStampType requestTimestamp) {
        this.requestTimestamp = requestTimestamp;
    }


    /**
     * Gets the responseTimestamp value for this Service_LogType.
     * 
     * @return responseTimestamp   * Recorded date and time for delivery of the service response.
     */
    public uk.co.graydon.ws.GraydonDataService.types.TimeStampType getResponseTimestamp() {
        return responseTimestamp;
    }


    /**
     * Sets the responseTimestamp value for this Service_LogType.
     * 
     * @param responseTimestamp   * Recorded date and time for delivery of the service response.
     */
    public void setResponseTimestamp(uk.co.graydon.ws.GraydonDataService.types.TimeStampType responseTimestamp) {
        this.responseTimestamp = responseTimestamp;
    }


    /**
     * Gets the diagnosticInformation value for this Service_LogType.
     * 
     * @return diagnosticInformation   * Service additional diagnostic information. Help to determine
     * any problems whilst using the service.
     */
    public java.lang.String getDiagnosticInformation() {
        return diagnosticInformation;
    }


    /**
     * Sets the diagnosticInformation value for this Service_LogType.
     * 
     * @param diagnosticInformation   * Service additional diagnostic information. Help to determine
     * any problems whilst using the service.
     */
    public void setDiagnosticInformation(java.lang.String diagnosticInformation) {
        this.diagnosticInformation = diagnosticInformation;
    }


    /**
     * Gets the country value for this Service_LogType.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this Service_LogType.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Service_LogType)) return false;
        Service_LogType other = (Service_LogType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.partnerUserId==null && other.getPartnerUserId()==null) || 
             (this.partnerUserId!=null &&
              this.partnerUserId.equals(other.getPartnerUserId()))) &&
            ((this.partnerClientId==null && other.getPartnerClientId()==null) || 
             (this.partnerClientId!=null &&
              this.partnerClientId.equals(other.getPartnerClientId()))) &&
            ((this.transactionIdentifier==null && other.getTransactionIdentifier()==null) || 
             (this.transactionIdentifier!=null &&
              this.transactionIdentifier.equals(other.getTransactionIdentifier()))) &&
            ((this.sessionID==null && other.getSessionID()==null) || 
             (this.sessionID!=null &&
              this.sessionID.equals(other.getSessionID()))) &&
            ((this.requestTimestamp==null && other.getRequestTimestamp()==null) || 
             (this.requestTimestamp!=null &&
              this.requestTimestamp.equals(other.getRequestTimestamp()))) &&
            ((this.responseTimestamp==null && other.getResponseTimestamp()==null) || 
             (this.responseTimestamp!=null &&
              this.responseTimestamp.equals(other.getResponseTimestamp()))) &&
            ((this.diagnosticInformation==null && other.getDiagnosticInformation()==null) || 
             (this.diagnosticInformation!=null &&
              this.diagnosticInformation.equals(other.getDiagnosticInformation()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry())));
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
        if (getPartnerUserId() != null) {
            _hashCode += getPartnerUserId().hashCode();
        }
        if (getPartnerClientId() != null) {
            _hashCode += getPartnerClientId().hashCode();
        }
        if (getTransactionIdentifier() != null) {
            _hashCode += getTransactionIdentifier().hashCode();
        }
        if (getSessionID() != null) {
            _hashCode += getSessionID().hashCode();
        }
        if (getRequestTimestamp() != null) {
            _hashCode += getRequestTimestamp().hashCode();
        }
        if (getResponseTimestamp() != null) {
            _hashCode += getResponseTimestamp().hashCode();
        }
        if (getDiagnosticInformation() != null) {
            _hashCode += getDiagnosticInformation().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Service_LogType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Service_LogType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "PartnerUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerClientId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "PartnerClientId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "TransactionIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "SessionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "RequestTimestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "TimeStampType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "ResponseTimestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "TimeStampType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diagnosticInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "DiagnosticInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Country"));
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

}
