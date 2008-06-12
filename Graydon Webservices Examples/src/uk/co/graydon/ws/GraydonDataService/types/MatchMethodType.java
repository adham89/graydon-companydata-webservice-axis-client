/**
 * MatchMethodType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.co.graydon.ws.GraydonDataService.types;


/**
 * Descriptive detail of the match method.
 * If more than one 'MatchMethod' is provided, then their order dictates
 * the usage preference.
 */
public class MatchMethodType  implements java.io.Serializable {
    /* If this element is 'true' then this 'MatchMethod' iteration
     * is to be considered the best match method within its context. */
    private boolean bestMethod;

    /* This is the matching method e.g. 'Keyword', 'Name' etc. */
    private uk.co.graydon.ws.GraydonDataService.types.MatchingMethodType matchingMethod;

    /* If 'true' then the 'City' parameter may also be supplied for
     * the match. */
    private boolean withCity;

    /* If true then the 'PostCode' parameter may also be supplied
     * for the match. */
    private boolean withPostCode;

    /* A description in English detailing the match methods and any
     * possible idiosyncrasies */
    private java.lang.String description;

    private int maxLength;

    public MatchMethodType() {
    }

    public MatchMethodType(
           boolean bestMethod,
           uk.co.graydon.ws.GraydonDataService.types.MatchingMethodType matchingMethod,
           boolean withCity,
           boolean withPostCode,
           java.lang.String description,
           int maxLength) {
           this.bestMethod = bestMethod;
           this.matchingMethod = matchingMethod;
           this.withCity = withCity;
           this.withPostCode = withPostCode;
           this.description = description;
           this.maxLength = maxLength;
    }


    /**
     * Gets the bestMethod value for this MatchMethodType.
     * 
     * @return bestMethod   * If this element is 'true' then this 'MatchMethod' iteration
     * is to be considered the best match method within its context.
     */
    public boolean isBestMethod() {
        return bestMethod;
    }


    /**
     * Sets the bestMethod value for this MatchMethodType.
     * 
     * @param bestMethod   * If this element is 'true' then this 'MatchMethod' iteration
     * is to be considered the best match method within its context.
     */
    public void setBestMethod(boolean bestMethod) {
        this.bestMethod = bestMethod;
    }


    /**
     * Gets the matchingMethod value for this MatchMethodType.
     * 
     * @return matchingMethod   * This is the matching method e.g. 'Keyword', 'Name' etc.
     */
    public uk.co.graydon.ws.GraydonDataService.types.MatchingMethodType getMatchingMethod() {
        return matchingMethod;
    }


    /**
     * Sets the matchingMethod value for this MatchMethodType.
     * 
     * @param matchingMethod   * This is the matching method e.g. 'Keyword', 'Name' etc.
     */
    public void setMatchingMethod(uk.co.graydon.ws.GraydonDataService.types.MatchingMethodType matchingMethod) {
        this.matchingMethod = matchingMethod;
    }


    /**
     * Gets the withCity value for this MatchMethodType.
     * 
     * @return withCity   * If 'true' then the 'City' parameter may also be supplied for
     * the match.
     */
    public boolean isWithCity() {
        return withCity;
    }


    /**
     * Sets the withCity value for this MatchMethodType.
     * 
     * @param withCity   * If 'true' then the 'City' parameter may also be supplied for
     * the match.
     */
    public void setWithCity(boolean withCity) {
        this.withCity = withCity;
    }


    /**
     * Gets the withPostCode value for this MatchMethodType.
     * 
     * @return withPostCode   * If true then the 'PostCode' parameter may also be supplied
     * for the match.
     */
    public boolean isWithPostCode() {
        return withPostCode;
    }


    /**
     * Sets the withPostCode value for this MatchMethodType.
     * 
     * @param withPostCode   * If true then the 'PostCode' parameter may also be supplied
     * for the match.
     */
    public void setWithPostCode(boolean withPostCode) {
        this.withPostCode = withPostCode;
    }


    /**
     * Gets the description value for this MatchMethodType.
     * 
     * @return description   * A description in English detailing the match methods and any
     * possible idiosyncrasies
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this MatchMethodType.
     * 
     * @param description   * A description in English detailing the match methods and any
     * possible idiosyncrasies
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the maxLength value for this MatchMethodType.
     * 
     * @return maxLength
     */
    public int getMaxLength() {
        return maxLength;
    }


    /**
     * Sets the maxLength value for this MatchMethodType.
     * 
     * @param maxLength
     */
    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MatchMethodType)) return false;
        MatchMethodType other = (MatchMethodType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.bestMethod == other.isBestMethod() &&
            ((this.matchingMethod==null && other.getMatchingMethod()==null) || 
             (this.matchingMethod!=null &&
              this.matchingMethod.equals(other.getMatchingMethod()))) &&
            this.withCity == other.isWithCity() &&
            this.withPostCode == other.isWithPostCode() &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            this.maxLength == other.getMaxLength();
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
        _hashCode += (isBestMethod() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMatchingMethod() != null) {
            _hashCode += getMatchingMethod().hashCode();
        }
        _hashCode += (isWithCity() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isWithPostCode() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        _hashCode += getMaxLength();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MatchMethodType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "MatchMethodType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bestMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "BestMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchingMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "MatchingMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "MatchingMethodType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("withCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "WithCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("withPostCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "WithPostCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxLength");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "MaxLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
