/**
 * GetCompanyProducts_ParametersType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.co.graydon.ws.GraydonDataService.types;


/**
 * All the request parameters for the 'getCompanyProducts' operation.
 */
public class GetCompanyProducts_ParametersType  implements java.io.Serializable {
    private uk.co.graydon.ws.GraydonDataService.types.Authentication_ParametersType authentication_Parameters;

    /* This parameter should be populated with the 'CompanyMatchIdentifier'
     * returned in the 'getCompanyMatches*' operation response.
     * It is unique to the country matched company. */
    private java.lang.String companyMatchIdentifier;

    public GetCompanyProducts_ParametersType() {
    }

    public GetCompanyProducts_ParametersType(
           uk.co.graydon.ws.GraydonDataService.types.Authentication_ParametersType authentication_Parameters,
           java.lang.String companyMatchIdentifier) {
           this.authentication_Parameters = authentication_Parameters;
           this.companyMatchIdentifier = companyMatchIdentifier;
    }


    /**
     * Gets the authentication_Parameters value for this GetCompanyProducts_ParametersType.
     * 
     * @return authentication_Parameters
     */
    public uk.co.graydon.ws.GraydonDataService.types.Authentication_ParametersType getAuthentication_Parameters() {
        return authentication_Parameters;
    }


    /**
     * Sets the authentication_Parameters value for this GetCompanyProducts_ParametersType.
     * 
     * @param authentication_Parameters
     */
    public void setAuthentication_Parameters(uk.co.graydon.ws.GraydonDataService.types.Authentication_ParametersType authentication_Parameters) {
        this.authentication_Parameters = authentication_Parameters;
    }


    /**
     * Gets the companyMatchIdentifier value for this GetCompanyProducts_ParametersType.
     * 
     * @return companyMatchIdentifier   * This parameter should be populated with the 'CompanyMatchIdentifier'
     * returned in the 'getCompanyMatches*' operation response.
     * It is unique to the country matched company.
     */
    public java.lang.String getCompanyMatchIdentifier() {
        return companyMatchIdentifier;
    }


    /**
     * Sets the companyMatchIdentifier value for this GetCompanyProducts_ParametersType.
     * 
     * @param companyMatchIdentifier   * This parameter should be populated with the 'CompanyMatchIdentifier'
     * returned in the 'getCompanyMatches*' operation response.
     * It is unique to the country matched company.
     */
    public void setCompanyMatchIdentifier(java.lang.String companyMatchIdentifier) {
        this.companyMatchIdentifier = companyMatchIdentifier;
    }

    private java.lang.Object __equalsCalc = null;
    @Override
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCompanyProducts_ParametersType)) return false;
        GetCompanyProducts_ParametersType other = (GetCompanyProducts_ParametersType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.authentication_Parameters==null && other.getAuthentication_Parameters()==null) || 
             (this.authentication_Parameters!=null &&
              this.authentication_Parameters.equals(other.getAuthentication_Parameters()))) &&
            ((this.companyMatchIdentifier==null && other.getCompanyMatchIdentifier()==null) || 
             (this.companyMatchIdentifier!=null &&
              this.companyMatchIdentifier.equals(other.getCompanyMatchIdentifier())));
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
        if (getAuthentication_Parameters() != null) {
            _hashCode += getAuthentication_Parameters().hashCode();
        }
        if (getCompanyMatchIdentifier() != null) {
            _hashCode += getCompanyMatchIdentifier().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCompanyProducts_ParametersType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCompanyProducts_ParametersType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authentication_Parameters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Authentication_Parameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Authentication_ParametersType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyMatchIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "CompanyMatchIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
