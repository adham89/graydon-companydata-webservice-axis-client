/**
 * CompanyMatchedMethodType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.co.graydon.ws.GraydonDataService.types;


/**
 * All the available match methods per country.
 */
public class CompanyMatchedMethodType  implements java.io.Serializable {
    /* Online country name. */
    private java.lang.String country;

    private uk.co.graydon.ws.GraydonDataService.types.MatchMethodType[] matchMethods;

    public CompanyMatchedMethodType() {
    }

    public CompanyMatchedMethodType(
           java.lang.String country,
           uk.co.graydon.ws.GraydonDataService.types.MatchMethodType[] matchMethods) {
           this.country = country;
           this.matchMethods = matchMethods;
    }


    /**
     * Gets the country value for this CompanyMatchedMethodType.
     * 
     * @return country   * Online country name.
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this CompanyMatchedMethodType.
     * 
     * @param country   * Online country name.
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the matchMethods value for this CompanyMatchedMethodType.
     * 
     * @return matchMethods
     */
    public uk.co.graydon.ws.GraydonDataService.types.MatchMethodType[] getMatchMethods() {
        return matchMethods;
    }


    /**
     * Sets the matchMethods value for this CompanyMatchedMethodType.
     * 
     * @param matchMethods
     */
    public void setMatchMethods(uk.co.graydon.ws.GraydonDataService.types.MatchMethodType[] matchMethods) {
        this.matchMethods = matchMethods;
    }

    private java.lang.Object __equalsCalc = null;
    @Override
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CompanyMatchedMethodType)) return false;
        CompanyMatchedMethodType other = (CompanyMatchedMethodType) obj;
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
            ((this.matchMethods==null && other.getMatchMethods()==null) || 
             (this.matchMethods!=null &&
              java.util.Arrays.equals(this.matchMethods, other.getMatchMethods())));
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
        if (getMatchMethods() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMatchMethods());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMatchMethods(), i);
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
        new org.apache.axis.description.TypeDesc(CompanyMatchedMethodType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "CompanyMatchedMethodType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchMethods");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "MatchMethods"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "MatchMethodType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "MatchMethod"));
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
