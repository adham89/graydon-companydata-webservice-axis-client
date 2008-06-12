/**
 * GetCompanyMatchesByPostCode_ParametersType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.co.graydon.ws.GraydonDataService.types;


/**
 * All the request parameters for the 'getCompanyMatchesByPostCode'
 * operation.
 */
public class GetCompanyMatchesByPostCode_ParametersType  implements java.io.Serializable {
    private uk.co.graydon.ws.GraydonDataService.types.Authentication_ParametersType authentication_Parameters;

    private uk.co.graydon.ws.GraydonDataService.types.CompanyMatches_ParametersType companyMatches_Parameters;

    /* Postal code for the company to be matched. This can be partial
     * of full. */
    private java.lang.String postCode;

    public GetCompanyMatchesByPostCode_ParametersType() {
    }

    public GetCompanyMatchesByPostCode_ParametersType(
           uk.co.graydon.ws.GraydonDataService.types.Authentication_ParametersType authentication_Parameters,
           uk.co.graydon.ws.GraydonDataService.types.CompanyMatches_ParametersType companyMatches_Parameters,
           java.lang.String postCode) {
           this.authentication_Parameters = authentication_Parameters;
           this.companyMatches_Parameters = companyMatches_Parameters;
           this.postCode = postCode;
    }


    /**
     * Gets the authentication_Parameters value for this GetCompanyMatchesByPostCode_ParametersType.
     * 
     * @return authentication_Parameters
     */
    public uk.co.graydon.ws.GraydonDataService.types.Authentication_ParametersType getAuthentication_Parameters() {
        return authentication_Parameters;
    }


    /**
     * Sets the authentication_Parameters value for this GetCompanyMatchesByPostCode_ParametersType.
     * 
     * @param authentication_Parameters
     */
    public void setAuthentication_Parameters(uk.co.graydon.ws.GraydonDataService.types.Authentication_ParametersType authentication_Parameters) {
        this.authentication_Parameters = authentication_Parameters;
    }


    /**
     * Gets the companyMatches_Parameters value for this GetCompanyMatchesByPostCode_ParametersType.
     * 
     * @return companyMatches_Parameters
     */
    public uk.co.graydon.ws.GraydonDataService.types.CompanyMatches_ParametersType getCompanyMatches_Parameters() {
        return companyMatches_Parameters;
    }


    /**
     * Sets the companyMatches_Parameters value for this GetCompanyMatchesByPostCode_ParametersType.
     * 
     * @param companyMatches_Parameters
     */
    public void setCompanyMatches_Parameters(uk.co.graydon.ws.GraydonDataService.types.CompanyMatches_ParametersType companyMatches_Parameters) {
        this.companyMatches_Parameters = companyMatches_Parameters;
    }


    /**
     * Gets the postCode value for this GetCompanyMatchesByPostCode_ParametersType.
     * 
     * @return postCode   * Postal code for the company to be matched. This can be partial
     * of full.
     */
    public java.lang.String getPostCode() {
        return postCode;
    }


    /**
     * Sets the postCode value for this GetCompanyMatchesByPostCode_ParametersType.
     * 
     * @param postCode   * Postal code for the company to be matched. This can be partial
     * of full.
     */
    public void setPostCode(java.lang.String postCode) {
        this.postCode = postCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCompanyMatchesByPostCode_ParametersType)) return false;
        GetCompanyMatchesByPostCode_ParametersType other = (GetCompanyMatchesByPostCode_ParametersType) obj;
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
            ((this.companyMatches_Parameters==null && other.getCompanyMatches_Parameters()==null) || 
             (this.companyMatches_Parameters!=null &&
              this.companyMatches_Parameters.equals(other.getCompanyMatches_Parameters()))) &&
            ((this.postCode==null && other.getPostCode()==null) || 
             (this.postCode!=null &&
              this.postCode.equals(other.getPostCode())));
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
        if (getAuthentication_Parameters() != null) {
            _hashCode += getAuthentication_Parameters().hashCode();
        }
        if (getCompanyMatches_Parameters() != null) {
            _hashCode += getCompanyMatches_Parameters().hashCode();
        }
        if (getPostCode() != null) {
            _hashCode += getPostCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCompanyMatchesByPostCode_ParametersType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCompanyMatchesByPostCode_ParametersType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authentication_Parameters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Authentication_Parameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Authentication_ParametersType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyMatches_Parameters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "CompanyMatches_Parameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "CompanyMatches_ParametersType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "PostCode"));
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
