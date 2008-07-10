/**
 * ActivityType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.co.graydon.ws.GraydonDataService.types;


/**
 * Activity of the subject company
 */
public class ActivityType  implements java.io.Serializable {
    /* The type of classification system for which Code is meaningful.
     * Examples include SIC or NACE. */
    private java.lang.String type;

    /* Activity description code. For example, if the Type is SIC
     * (Standard Industrial Classification), the value for Code will be the
     * company's SIC code. */
    private java.lang.String code;

    /* The textual description of the Code. For example, if the Type
     * is "NACE" and Code is '6420' the description would be 'A group engaged
     * in the supply of communication products, services and equipment.' */
    private java.lang.String description;

    public ActivityType() {
    }

    public ActivityType(
           java.lang.String type,
           java.lang.String code,
           java.lang.String description) {
           this.type = type;
           this.code = code;
           this.description = description;
    }


    /**
     * Gets the type value for this ActivityType.
     * 
     * @return type   * The type of classification system for which Code is meaningful.
     * Examples include SIC or NACE.
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this ActivityType.
     * 
     * @param type   * The type of classification system for which Code is meaningful.
     * Examples include SIC or NACE.
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the code value for this ActivityType.
     * 
     * @return code   * Activity description code. For example, if the Type is SIC
     * (Standard Industrial Classification), the value for Code will be the
     * company's SIC code.
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this ActivityType.
     * 
     * @param code   * Activity description code. For example, if the Type is SIC
     * (Standard Industrial Classification), the value for Code will be the
     * company's SIC code.
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the description value for this ActivityType.
     * 
     * @return description   * The textual description of the Code. For example, if the Type
     * is "NACE" and Code is '6420' the description would be 'A group engaged
     * in the supply of communication products, services and equipment.'
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ActivityType.
     * 
     * @param description   * The textual description of the Code. For example, if the Type
     * is "NACE" and Code is '6420' the description would be 'A group engaged
     * in the supply of communication products, services and equipment.'
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    private java.lang.Object __equalsCalc = null;
    @Override
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ActivityType)) return false;
        ActivityType other = (ActivityType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ActivityType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "ActivityType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
