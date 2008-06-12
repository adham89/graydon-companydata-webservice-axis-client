/**
 * GetCompanyMatchesByIdentifier_ParametersType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.co.graydon.ws.GraydonDataService.types;


/**
 * All the request parameters for the 'getCompanyMatchesByIdentifier'
 * operation.
 */
public class GetCompanyMatchesByIdentifier_ParametersType  implements java.io.Serializable {
    private uk.co.graydon.ws.GraydonDataService.types.Authentication_ParametersType authentication_Parameters;

    private uk.co.graydon.ws.GraydonDataService.types.CompanyMatches_ParametersType companyMatches_Parameters;

    private java.lang.String identifier;

    public GetCompanyMatchesByIdentifier_ParametersType() {
    }

    public GetCompanyMatchesByIdentifier_ParametersType(
           uk.co.graydon.ws.GraydonDataService.types.Authentication_ParametersType authentication_Parameters,
           uk.co.graydon.ws.GraydonDataService.types.CompanyMatches_ParametersType companyMatches_Parameters,
           java.lang.String identifier) {
           this.authentication_Parameters = authentication_Parameters;
           this.companyMatches_Parameters = companyMatches_Parameters;
           this.identifier = identifier;
    }


    /**
     * Gets the authentication_Parameters value for this GetCompanyMatchesByIdentifier_ParametersType.
     * 
     * @return authentication_Parameters
     */
    public uk.co.graydon.ws.GraydonDataService.types.Authentication_ParametersType getAuthentication_Parameters() {
        return authentication_Parameters;
    }


    /**
     * Sets the authentication_Parameters value for this GetCompanyMatchesByIdentifier_ParametersType.
     * 
     * @param authentication_Parameters
     */
    public void setAuthentication_Parameters(uk.co.graydon.ws.GraydonDataService.types.Authentication_ParametersType authentication_Parameters) {
        this.authentication_Parameters = authentication_Parameters;
    }


    /**
     * Gets the companyMatches_Parameters value for this GetCompanyMatchesByIdentifier_ParametersType.
     * 
     * @return companyMatches_Parameters
     */
    public uk.co.graydon.ws.GraydonDataService.types.CompanyMatches_ParametersType getCompanyMatches_Parameters() {
        return companyMatches_Parameters;
    }


    /**
     * Sets the companyMatches_Parameters value for this GetCompanyMatchesByIdentifier_ParametersType.
     * 
     * @param companyMatches_Parameters
     */
    public void setCompanyMatches_Parameters(uk.co.graydon.ws.GraydonDataService.types.CompanyMatches_ParametersType companyMatches_Parameters) {
        this.companyMatches_Parameters = companyMatches_Parameters;
    }


    /**
     * Gets the identifier value for this GetCompanyMatchesByIdentifier_ParametersType.
     * 
     * @return identifier
     */
    public java.lang.String getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier value for this GetCompanyMatchesByIdentifier_ParametersType.
     * 
     * @param identifier
     */
    public void setIdentifier(java.lang.String identifier) {
        this.identifier = identifier;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCompanyMatchesByIdentifier_ParametersType)) return false;
        GetCompanyMatchesByIdentifier_ParametersType other = (GetCompanyMatchesByIdentifier_ParametersType) obj;
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
            ((this.identifier==null && other.getIdentifier()==null) || 
             (this.identifier!=null &&
              this.identifier.equals(other.getIdentifier())));
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
        if (getIdentifier() != null) {
            _hashCode += getIdentifier().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCompanyMatchesByIdentifier_ParametersType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCompanyMatchesByIdentifier_ParametersType"));
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
        elemField.setFieldName("identifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Identifier"));
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
