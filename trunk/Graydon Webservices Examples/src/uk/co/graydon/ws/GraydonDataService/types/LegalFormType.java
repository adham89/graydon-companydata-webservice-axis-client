/**
 * LegalFormType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.co.graydon.ws.GraydonDataService.types;


/**
 * Legal form for the subject company.
 */
public class LegalFormType  implements java.io.Serializable {
    /* Unique graydon code used to define legal
     * 								form */
    private java.lang.String code;

    /* Local country agency code used to define
     * 								legal form */
    private java.lang.String localCode;

    /* Legal form description */
    private java.lang.String description;

    public LegalFormType() {
    }

    public LegalFormType(
           java.lang.String code,
           java.lang.String localCode,
           java.lang.String description) {
           this.code = code;
           this.localCode = localCode;
           this.description = description;
    }


    /**
     * Gets the code value for this LegalFormType.
     * 
     * @return code   * Unique graydon code used to define legal
     * 								form
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this LegalFormType.
     * 
     * @param code   * Unique graydon code used to define legal
     * 								form
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the localCode value for this LegalFormType.
     * 
     * @return localCode   * Local country agency code used to define
     * 								legal form
     */
    public java.lang.String getLocalCode() {
        return localCode;
    }


    /**
     * Sets the localCode value for this LegalFormType.
     * 
     * @param localCode   * Local country agency code used to define
     * 								legal form
     */
    public void setLocalCode(java.lang.String localCode) {
        this.localCode = localCode;
    }


    /**
     * Gets the description value for this LegalFormType.
     * 
     * @return description   * Legal form description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this LegalFormType.
     * 
     * @param description   * Legal form description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LegalFormType)) return false;
        LegalFormType other = (LegalFormType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.localCode==null && other.getLocalCode()==null) || 
             (this.localCode!=null &&
              this.localCode.equals(other.getLocalCode()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription())));
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
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getLocalCode() != null) {
            _hashCode += getLocalCode().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LegalFormType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "LegalFormType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "LocalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Description"));
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
