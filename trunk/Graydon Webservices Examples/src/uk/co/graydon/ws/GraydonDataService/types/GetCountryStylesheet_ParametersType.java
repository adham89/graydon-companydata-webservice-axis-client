/**
 * GetCountryStylesheet_ParametersType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.co.graydon.ws.GraydonDataService.types;

public class GetCountryStylesheet_ParametersType  implements java.io.Serializable {
    private uk.co.graydon.ws.GraydonDataService.types.Authentication_ParametersType authenication_Parameters;

    /* Specify the 'Country' parameter to return the available countries
     * and products for a single country. */
    private java.lang.String country;

    public GetCountryStylesheet_ParametersType() {
    }

    public GetCountryStylesheet_ParametersType(
           uk.co.graydon.ws.GraydonDataService.types.Authentication_ParametersType authenication_Parameters,
           java.lang.String country) {
           this.authenication_Parameters = authenication_Parameters;
           this.country = country;
    }


    /**
     * Gets the authenication_Parameters value for this GetCountryStylesheet_ParametersType.
     * 
     * @return authenication_Parameters
     */
    public uk.co.graydon.ws.GraydonDataService.types.Authentication_ParametersType getAuthenication_Parameters() {
        return authenication_Parameters;
    }


    /**
     * Sets the authenication_Parameters value for this GetCountryStylesheet_ParametersType.
     * 
     * @param authenication_Parameters
     */
    public void setAuthenication_Parameters(uk.co.graydon.ws.GraydonDataService.types.Authentication_ParametersType authenication_Parameters) {
        this.authenication_Parameters = authenication_Parameters;
    }


    /**
     * Gets the country value for this GetCountryStylesheet_ParametersType.
     * 
     * @return country   * Specify the 'Country' parameter to return the available countries
     * and products for a single country.
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this GetCountryStylesheet_ParametersType.
     * 
     * @param country   * Specify the 'Country' parameter to return the available countries
     * and products for a single country.
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCountryStylesheet_ParametersType)) return false;
        GetCountryStylesheet_ParametersType other = (GetCountryStylesheet_ParametersType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.authenication_Parameters==null && other.getAuthenication_Parameters()==null) || 
             (this.authenication_Parameters!=null &&
              this.authenication_Parameters.equals(other.getAuthenication_Parameters()))) &&
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
        if (getAuthenication_Parameters() != null) {
            _hashCode += getAuthenication_Parameters().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCountryStylesheet_ParametersType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCountryStylesheet_ParametersType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authenication_Parameters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Authenication_Parameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Authentication_ParametersType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Country"));
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
