/**
 * DateFormatType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.co.graydon.xml.GraydonUKCommonTypes;

public class DateFormatType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DateFormatType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "CCYY";
    public static final java.lang.String _value2 = "CCYYMMDD";
    public static final java.lang.String _value3 = "DD";
    public static final java.lang.String _value4 = "DDMM";
    public static final java.lang.String _value5 = "DDMMCCYY";
    public static final java.lang.String _value6 = "MM";
    public static final java.lang.String _value7 = "MMCCYY";
    public static final java.lang.String _value8 = "MMDDCCYY";
    public static final java.lang.String _value9 = "DD/MM/CCYY";
    public static final DateFormatType value1 = new DateFormatType(_value1);
    public static final DateFormatType value2 = new DateFormatType(_value2);
    public static final DateFormatType value3 = new DateFormatType(_value3);
    public static final DateFormatType value4 = new DateFormatType(_value4);
    public static final DateFormatType value5 = new DateFormatType(_value5);
    public static final DateFormatType value6 = new DateFormatType(_value6);
    public static final DateFormatType value7 = new DateFormatType(_value7);
    public static final DateFormatType value8 = new DateFormatType(_value8);
    public static final DateFormatType value9 = new DateFormatType(_value9);
    public java.lang.String getValue() { return _value_;}
    public static DateFormatType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DateFormatType enumeration = (DateFormatType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DateFormatType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DateFormatType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xml.graydon.co.uk/GraydonUKCommonTypes", "DateFormatType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
