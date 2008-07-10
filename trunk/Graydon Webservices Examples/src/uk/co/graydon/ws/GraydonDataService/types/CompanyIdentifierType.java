/**
 * CompanyIdentifierType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.co.graydon.ws.GraydonDataService.types;


/**
 * Indentifiers used for the subject company.
 */
public class CompanyIdentifierType  implements java.io.Serializable {
    /* Identifier for the subject company */
    private java.lang.String identifier;

    /* Type of identifier for the subject company */
    private uk.co.graydon.xml.GraydonUKCommonTypes.CompanyIdTypesType type;

    /* Description in english for the type of identifier for the subject
     * company. This is not required for matching. */
    private java.lang.String description;

    public CompanyIdentifierType() {
    }

    public CompanyIdentifierType(
           java.lang.String identifier,
           uk.co.graydon.xml.GraydonUKCommonTypes.CompanyIdTypesType type,
           java.lang.String description) {
           this.identifier = identifier;
           this.type = type;
           this.description = description;
    }


    /**
     * Gets the identifier value for this CompanyIdentifierType.
     * 
     * @return identifier   * Identifier for the subject company
     */
    public java.lang.String getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier value for this CompanyIdentifierType.
     * 
     * @param identifier   * Identifier for the subject company
     */
    public void setIdentifier(java.lang.String identifier) {
        this.identifier = identifier;
    }


    /**
     * Gets the type value for this CompanyIdentifierType.
     * 
     * @return type   * Type of identifier for the subject company
     */
    public uk.co.graydon.xml.GraydonUKCommonTypes.CompanyIdTypesType getType() {
        return type;
    }


    /**
     * Sets the type value for this CompanyIdentifierType.
     * 
     * @param type   * Type of identifier for the subject company
     */
    public void setType(uk.co.graydon.xml.GraydonUKCommonTypes.CompanyIdTypesType type) {
        this.type = type;
    }


    /**
     * Gets the description value for this CompanyIdentifierType.
     * 
     * @return description   * Description in english for the type of identifier for the subject
     * company. This is not required for matching.
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CompanyIdentifierType.
     * 
     * @param description   * Description in english for the type of identifier for the subject
     * company. This is not required for matching.
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    private java.lang.Object __equalsCalc = null;
    @Override
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CompanyIdentifierType)) return false;
        CompanyIdentifierType other = (CompanyIdentifierType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.identifier==null && other.getIdentifier()==null) || 
             (this.identifier!=null &&
              this.identifier.equals(other.getIdentifier()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
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
        if (getIdentifier() != null) {
            _hashCode += getIdentifier().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CompanyIdentifierType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "CompanyIdentifierType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Identifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xml.graydon.co.uk/GraydonUKCommonTypes", "CompanyIdTypesType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Description"));
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
