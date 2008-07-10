/**
 * GetCountryStylesheets_ResultTypeCountryStylesheets.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.co.graydon.ws.GraydonDataService.types;

public class GetCountryStylesheets_ResultTypeCountryStylesheets  implements java.io.Serializable {
    private java.lang.String country;

    private uk.co.graydon.ws.GraydonDataService.types.ProductStylesheetType[] productStylesheets;

    public GetCountryStylesheets_ResultTypeCountryStylesheets() {
    }

    public GetCountryStylesheets_ResultTypeCountryStylesheets(
           java.lang.String country,
           uk.co.graydon.ws.GraydonDataService.types.ProductStylesheetType[] productStylesheets) {
           this.country = country;
           this.productStylesheets = productStylesheets;
    }


    /**
     * Gets the country value for this GetCountryStylesheets_ResultTypeCountryStylesheets.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this GetCountryStylesheets_ResultTypeCountryStylesheets.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the productStylesheets value for this GetCountryStylesheets_ResultTypeCountryStylesheets.
     * 
     * @return productStylesheets
     */
    public uk.co.graydon.ws.GraydonDataService.types.ProductStylesheetType[] getProductStylesheets() {
        return productStylesheets;
    }


    /**
     * Sets the productStylesheets value for this GetCountryStylesheets_ResultTypeCountryStylesheets.
     * 
     * @param productStylesheets
     */
    public void setProductStylesheets(uk.co.graydon.ws.GraydonDataService.types.ProductStylesheetType[] productStylesheets) {
        this.productStylesheets = productStylesheets;
    }

    private java.lang.Object __equalsCalc = null;
    @Override
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCountryStylesheets_ResultTypeCountryStylesheets)) return false;
        GetCountryStylesheets_ResultTypeCountryStylesheets other = (GetCountryStylesheets_ResultTypeCountryStylesheets) obj;
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
            ((this.productStylesheets==null && other.getProductStylesheets()==null) || 
             (this.productStylesheets!=null &&
              java.util.Arrays.equals(this.productStylesheets, other.getProductStylesheets())));
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
        if (getProductStylesheets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductStylesheets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductStylesheets(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCountryStylesheets_ResultTypeCountryStylesheets.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", ">GetCountryStylesheets_ResultType>CountryStylesheets"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productStylesheets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "ProductStylesheets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "ProductStylesheetType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "ProductStylesheet"));
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
