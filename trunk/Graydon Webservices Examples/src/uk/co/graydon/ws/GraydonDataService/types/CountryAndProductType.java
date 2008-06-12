/**
 * CountryAndProductType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.co.graydon.ws.GraydonDataService.types;


/**
 * This details all information relating to the country and it's related
 * products.
 */
public class CountryAndProductType  implements java.io.Serializable {
    /* Country whose availability is being scrutinised. */
    private java.lang.String country;

    private uk.co.graydon.ws.GraydonDataService.types.ProductType[] products;

    public CountryAndProductType() {
    }

    public CountryAndProductType(
           java.lang.String country,
           uk.co.graydon.ws.GraydonDataService.types.ProductType[] products) {
           this.country = country;
           this.products = products;
    }


    /**
     * Gets the country value for this CountryAndProductType.
     * 
     * @return country   * Country whose availability is being scrutinised.
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this CountryAndProductType.
     * 
     * @param country   * Country whose availability is being scrutinised.
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the products value for this CountryAndProductType.
     * 
     * @return products
     */
    public uk.co.graydon.ws.GraydonDataService.types.ProductType[] getProducts() {
        return products;
    }


    /**
     * Sets the products value for this CountryAndProductType.
     * 
     * @param products
     */
    public void setProducts(uk.co.graydon.ws.GraydonDataService.types.ProductType[] products) {
        this.products = products;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CountryAndProductType)) return false;
        CountryAndProductType other = (CountryAndProductType) obj;
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
            ((this.products==null && other.getProducts()==null) || 
             (this.products!=null &&
              java.util.Arrays.equals(this.products, other.getProducts())));
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
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getProducts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProducts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProducts(), i);
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
        new org.apache.axis.description.TypeDesc(CountryAndProductType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "CountryAndProductType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("products");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Products"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "ProductType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Product"));
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
