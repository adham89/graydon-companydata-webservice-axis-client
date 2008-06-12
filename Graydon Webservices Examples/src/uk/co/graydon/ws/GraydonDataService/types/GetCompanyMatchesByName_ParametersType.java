/**
 * GetCompanyMatchesByName_ParametersType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.co.graydon.ws.GraydonDataService.types;


/**
 * All the request parameters for the 'getCompanyMatchesByName' operation.
 */
public class GetCompanyMatchesByName_ParametersType  implements java.io.Serializable {
    private uk.co.graydon.ws.GraydonDataService.types.Authentication_ParametersType authentication_Parameters;

    private uk.co.graydon.ws.GraydonDataService.types.CompanyMatches_ParametersType companyMatches_Parameters;

    /* Full or partial name of the company to be matched. */
    private java.lang.String name;

    /* City of the company being matched. Use this if applicable to
     * narrow down the matched list returned. */
    private java.lang.String city;

    private java.lang.String postCode;

    public GetCompanyMatchesByName_ParametersType() {
    }

    public GetCompanyMatchesByName_ParametersType(
           uk.co.graydon.ws.GraydonDataService.types.Authentication_ParametersType authentication_Parameters,
           uk.co.graydon.ws.GraydonDataService.types.CompanyMatches_ParametersType companyMatches_Parameters,
           java.lang.String name,
           java.lang.String city,
           java.lang.String postCode) {
           this.authentication_Parameters = authentication_Parameters;
           this.companyMatches_Parameters = companyMatches_Parameters;
           this.name = name;
           this.city = city;
           this.postCode = postCode;
    }


    /**
     * Gets the authentication_Parameters value for this GetCompanyMatchesByName_ParametersType.
     * 
     * @return authentication_Parameters
     */
    public uk.co.graydon.ws.GraydonDataService.types.Authentication_ParametersType getAuthentication_Parameters() {
        return authentication_Parameters;
    }


    /**
     * Sets the authentication_Parameters value for this GetCompanyMatchesByName_ParametersType.
     * 
     * @param authentication_Parameters
     */
    public void setAuthentication_Parameters(uk.co.graydon.ws.GraydonDataService.types.Authentication_ParametersType authentication_Parameters) {
        this.authentication_Parameters = authentication_Parameters;
    }


    /**
     * Gets the companyMatches_Parameters value for this GetCompanyMatchesByName_ParametersType.
     * 
     * @return companyMatches_Parameters
     */
    public uk.co.graydon.ws.GraydonDataService.types.CompanyMatches_ParametersType getCompanyMatches_Parameters() {
        return companyMatches_Parameters;
    }


    /**
     * Sets the companyMatches_Parameters value for this GetCompanyMatchesByName_ParametersType.
     * 
     * @param companyMatches_Parameters
     */
    public void setCompanyMatches_Parameters(uk.co.graydon.ws.GraydonDataService.types.CompanyMatches_ParametersType companyMatches_Parameters) {
        this.companyMatches_Parameters = companyMatches_Parameters;
    }


    /**
     * Gets the name value for this GetCompanyMatchesByName_ParametersType.
     * 
     * @return name   * Full or partial name of the company to be matched.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this GetCompanyMatchesByName_ParametersType.
     * 
     * @param name   * Full or partial name of the company to be matched.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the city value for this GetCompanyMatchesByName_ParametersType.
     * 
     * @return city   * City of the company being matched. Use this if applicable to
     * narrow down the matched list returned.
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this GetCompanyMatchesByName_ParametersType.
     * 
     * @param city   * City of the company being matched. Use this if applicable to
     * narrow down the matched list returned.
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the postCode value for this GetCompanyMatchesByName_ParametersType.
     * 
     * @return postCode
     */
    public java.lang.String getPostCode() {
        return postCode;
    }


    /**
     * Sets the postCode value for this GetCompanyMatchesByName_ParametersType.
     * 
     * @param postCode
     */
    public void setPostCode(java.lang.String postCode) {
        this.postCode = postCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCompanyMatchesByName_ParametersType)) return false;
        GetCompanyMatchesByName_ParametersType other = (GetCompanyMatchesByName_ParametersType) obj;
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
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getPostCode() != null) {
            _hashCode += getPostCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCompanyMatchesByName_ParametersType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCompanyMatchesByName_ParametersType"));
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
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "City"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "PostCode"));
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
