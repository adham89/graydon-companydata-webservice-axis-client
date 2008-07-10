/**
 * CompanyMatches_ParametersType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.co.graydon.ws.GraydonDataService.types;


/**
 * Standard company match parameters.
 */
public class CompanyMatches_ParametersType  implements java.io.Serializable {
    /* The country to find matches in. */
    private java.lang.String country;

    /* Client reference relating to this match request. */
    private java.lang.String clientReference;

    public CompanyMatches_ParametersType() {
    }

    public CompanyMatches_ParametersType(
           java.lang.String country,
           java.lang.String clientReference) {
           this.country = country;
           this.clientReference = clientReference;
    }


    /**
     * Gets the country value for this CompanyMatches_ParametersType.
     * 
     * @return country   * The country to find matches in.
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this CompanyMatches_ParametersType.
     * 
     * @param country   * The country to find matches in.
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the clientReference value for this CompanyMatches_ParametersType.
     * 
     * @return clientReference   * Client reference relating to this match request.
     */
    public java.lang.String getClientReference() {
        return clientReference;
    }


    /**
     * Sets the clientReference value for this CompanyMatches_ParametersType.
     * 
     * @param clientReference   * Client reference relating to this match request.
     */
    public void setClientReference(java.lang.String clientReference) {
        this.clientReference = clientReference;
    }

    private java.lang.Object __equalsCalc = null;
    @Override
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CompanyMatches_ParametersType)) return false;
        CompanyMatches_ParametersType other = (CompanyMatches_ParametersType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.clientReference==null && other.getClientReference()==null) || 
             (this.clientReference!=null &&
              this.clientReference.equals(other.getClientReference())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    @Override
	public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getClientReference() != null) {
            _hashCode += getClientReference().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CompanyMatches_ParametersType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "CompanyMatches_ParametersType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "ClientReference"));
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
