/**
 * GetCompanyReport_ParametersType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.co.graydon.ws.GraydonDataService.types;


/**
 * All the request parameters for the 'getCompanyReport' operation.
 */
public class GetCompanyReport_ParametersType  implements java.io.Serializable {
    private uk.co.graydon.ws.GraydonDataService.types.Authentication_ParametersType authentication_Parameters;

    /* Language the resulting report should be in. The default is
     * 'E' for English. */
    private uk.co.graydon.xml.GraydonUKCommonTypes.LanguageCodesType languageCode;

    /* This parameter should be populated with the eqvilant 'OrderReference'
     * element returned in the response for the 'placeOrder' operation. */
    private int orderReference;

    /* The mime type the resulting report should be in. i.e. 'xml',
     * 'html'. */
    private uk.co.graydon.xml.GraydonUKCommonTypes.MimeTypesType mimeType;

    public GetCompanyReport_ParametersType() {
    }

    public GetCompanyReport_ParametersType(
           uk.co.graydon.ws.GraydonDataService.types.Authentication_ParametersType authentication_Parameters,
           uk.co.graydon.xml.GraydonUKCommonTypes.LanguageCodesType languageCode,
           int orderReference,
           uk.co.graydon.xml.GraydonUKCommonTypes.MimeTypesType mimeType) {
           this.authentication_Parameters = authentication_Parameters;
           this.languageCode = languageCode;
           this.orderReference = orderReference;
           this.mimeType = mimeType;
    }


    /**
     * Gets the authentication_Parameters value for this GetCompanyReport_ParametersType.
     * 
     * @return authentication_Parameters
     */
    public uk.co.graydon.ws.GraydonDataService.types.Authentication_ParametersType getAuthentication_Parameters() {
        return authentication_Parameters;
    }


    /**
     * Sets the authentication_Parameters value for this GetCompanyReport_ParametersType.
     * 
     * @param authentication_Parameters
     */
    public void setAuthentication_Parameters(uk.co.graydon.ws.GraydonDataService.types.Authentication_ParametersType authentication_Parameters) {
        this.authentication_Parameters = authentication_Parameters;
    }


    /**
     * Gets the languageCode value for this GetCompanyReport_ParametersType.
     * 
     * @return languageCode   * Language the resulting report should be in. The default is
     * 'E' for English.
     */
    public uk.co.graydon.xml.GraydonUKCommonTypes.LanguageCodesType getLanguageCode() {
        return languageCode;
    }


    /**
     * Sets the languageCode value for this GetCompanyReport_ParametersType.
     * 
     * @param languageCode   * Language the resulting report should be in. The default is
     * 'E' for English.
     */
    public void setLanguageCode(uk.co.graydon.xml.GraydonUKCommonTypes.LanguageCodesType languageCode) {
        this.languageCode = languageCode;
    }


    /**
     * Gets the orderReference value for this GetCompanyReport_ParametersType.
     * 
     * @return orderReference   * This parameter should be populated with the eqvilant 'OrderReference'
     * element returned in the response for the 'placeOrder' operation.
     */
    public int getOrderReference() {
        return orderReference;
    }


    /**
     * Sets the orderReference value for this GetCompanyReport_ParametersType.
     * 
     * @param orderReference   * This parameter should be populated with the eqvilant 'OrderReference'
     * element returned in the response for the 'placeOrder' operation.
     */
    public void setOrderReference(int orderReference) {
        this.orderReference = orderReference;
    }


    /**
     * Gets the mimeType value for this GetCompanyReport_ParametersType.
     * 
     * @return mimeType   * The mime type the resulting report should be in. i.e. 'xml',
     * 'html'.
     */
    public uk.co.graydon.xml.GraydonUKCommonTypes.MimeTypesType getMimeType() {
        return mimeType;
    }


    /**
     * Sets the mimeType value for this GetCompanyReport_ParametersType.
     * 
     * @param mimeType   * The mime type the resulting report should be in. i.e. 'xml',
     * 'html'.
     */
    public void setMimeType(uk.co.graydon.xml.GraydonUKCommonTypes.MimeTypesType mimeType) {
        this.mimeType = mimeType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCompanyReport_ParametersType)) return false;
        GetCompanyReport_ParametersType other = (GetCompanyReport_ParametersType) obj;
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
            ((this.languageCode==null && other.getLanguageCode()==null) || 
             (this.languageCode!=null &&
              this.languageCode.equals(other.getLanguageCode()))) &&
            this.orderReference == other.getOrderReference() &&
            ((this.mimeType==null && other.getMimeType()==null) || 
             (this.mimeType!=null &&
              this.mimeType.equals(other.getMimeType())));
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
        if (getLanguageCode() != null) {
            _hashCode += getLanguageCode().hashCode();
        }
        _hashCode += getOrderReference();
        if (getMimeType() != null) {
            _hashCode += getMimeType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCompanyReport_ParametersType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCompanyReport_ParametersType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authentication_Parameters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Authentication_Parameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Authentication_ParametersType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languageCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "LanguageCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xml.graydon.co.uk/GraydonUKCommonTypes", "LanguageCodesType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "OrderReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimeType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "MimeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xml.graydon.co.uk/GraydonUKCommonTypes", "MimeTypesType"));
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
