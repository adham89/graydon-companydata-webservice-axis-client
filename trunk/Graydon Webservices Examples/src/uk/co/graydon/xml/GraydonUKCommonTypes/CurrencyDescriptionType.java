/**
 * CurrencyDescriptionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.co.graydon.xml.GraydonUKCommonTypes;

public class CurrencyDescriptionType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CurrencyDescriptionType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "Euro";
    public static final java.lang.String _value2 = "Japanese Yen";
    public static final java.lang.String _value3 = "US Dollar";
    public static final CurrencyDescriptionType value1 = new CurrencyDescriptionType(_value1);
    public static final CurrencyDescriptionType value2 = new CurrencyDescriptionType(_value2);
    public static final CurrencyDescriptionType value3 = new CurrencyDescriptionType(_value3);
    public java.lang.String getValue() { return _value_;}
    public static CurrencyDescriptionType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CurrencyDescriptionType enumeration = (CurrencyDescriptionType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CurrencyDescriptionType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    @Override
	public boolean equals(java.lang.Object obj) {return (obj == this);}
    @Override
	public int hashCode() { return toString().hashCode();}
    @Override
	public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CurrencyDescriptionType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xml.graydon.co.uk/GraydonUKCommonTypes", "CurrencyDescriptionType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
