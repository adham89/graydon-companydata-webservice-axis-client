/**
 * Authentication_ParametersType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.co.graydon.ws.GraydonDataService.types;


/**
 * Authentication parameters mandatory for every operation requested
 */
public class Authentication_ParametersType  implements java.io.Serializable {
    /* Graydon supplied unique client user identifier */
    private java.lang.String partnerUserId;

    /* Graydon supplied user identifier related password */
    private java.lang.String partnerPassword;

    /* Partner supplied client identifier. Used for transaction auditing
     * purposes. */
    private java.lang.String partnerClientId;

    /* Graydon supplied unique session identifier. For faster and
     * more reliable response implementation of sessions use is recommended. */
    private java.lang.String sessionID;

    public Authentication_ParametersType() {
    }

    public Authentication_ParametersType(
           java.lang.String partnerUserId,
           java.lang.String partnerPassword,
           java.lang.String partnerClientId,
           java.lang.String sessionID) {
           this.partnerUserId = partnerUserId;
           this.partnerPassword = partnerPassword;
           this.partnerClientId = partnerClientId;
           this.sessionID = sessionID;
    }


    /**
     * Gets the partnerUserId value for this Authentication_ParametersType.
     * 
     * @return partnerUserId   * Graydon supplied unique client user identifier
     */
    public java.lang.String getPartnerUserId() {
        return partnerUserId;
    }


    /**
     * Sets the partnerUserId value for this Authentication_ParametersType.
     * 
     * @param partnerUserId   * Graydon supplied unique client user identifier
     */
    public void setPartnerUserId(java.lang.String partnerUserId) {
        this.partnerUserId = partnerUserId;
    }


    /**
     * Gets the partnerPassword value for this Authentication_ParametersType.
     * 
     * @return partnerPassword   * Graydon supplied user identifier related password
     */
    public java.lang.String getPartnerPassword() {
        return partnerPassword;
    }


    /**
     * Sets the partnerPassword value for this Authentication_ParametersType.
     * 
     * @param partnerPassword   * Graydon supplied user identifier related password
     */
    public void setPartnerPassword(java.lang.String partnerPassword) {
        this.partnerPassword = partnerPassword;
    }


    /**
     * Gets the partnerClientId value for this Authentication_ParametersType.
     * 
     * @return partnerClientId   * Partner supplied client identifier. Used for transaction auditing
     * purposes.
     */
    public java.lang.String getPartnerClientId() {
        return partnerClientId;
    }


    /**
     * Sets the partnerClientId value for this Authentication_ParametersType.
     * 
     * @param partnerClientId   * Partner supplied client identifier. Used for transaction auditing
     * purposes.
     */
    public void setPartnerClientId(java.lang.String partnerClientId) {
        this.partnerClientId = partnerClientId;
    }


    /**
     * Gets the sessionID value for this Authentication_ParametersType.
     * 
     * @return sessionID   * Graydon supplied unique session identifier. For faster and
     * more reliable response implementation of sessions use is recommended.
     */
    public java.lang.String getSessionID() {
        return sessionID;
    }


    /**
     * Sets the sessionID value for this Authentication_ParametersType.
     * 
     * @param sessionID   * Graydon supplied unique session identifier. For faster and
     * more reliable response implementation of sessions use is recommended.
     */
    public void setSessionID(java.lang.String sessionID) {
        this.sessionID = sessionID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Authentication_ParametersType)) return false;
        Authentication_ParametersType other = (Authentication_ParametersType) obj;
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
            ((this.partnerPassword==null && other.getPartnerPassword()==null) || 
             (this.partnerPassword!=null &&
              this.partnerPassword.equals(other.getPartnerPassword()))) &&
            ((this.partnerClientId==null && other.getPartnerClientId()==null) || 
             (this.partnerClientId!=null &&
              this.partnerClientId.equals(other.getPartnerClientId()))) &&
            ((this.sessionID==null && other.getSessionID()==null) || 
             (this.sessionID!=null &&
              this.sessionID.equals(other.getSessionID())));
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
        if (getPartnerPassword() != null) {
            _hashCode += getPartnerPassword().hashCode();
        }
        if (getPartnerClientId() != null) {
            _hashCode += getPartnerClientId().hashCode();
        }
        if (getSessionID() != null) {
            _hashCode += getSessionID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Authentication_ParametersType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Authentication_ParametersType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "PartnerUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "PartnerPassword"));
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
        elemField.setFieldName("sessionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "SessionID"));
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
