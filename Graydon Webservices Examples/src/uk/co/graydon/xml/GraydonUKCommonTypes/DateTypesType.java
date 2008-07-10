/**
 * DateTypesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.co.graydon.xml.GraydonUKCommonTypes;

public class DateTypesType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DateTypesType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "Account_Opened";
    public static final java.lang.String _value2 = "Accounting_Reference";
    public static final java.lang.String _value3 = "Accounts";
    public static final java.lang.String _value4 = "Accounts_Lodged";
    public static final java.lang.String _value5 = "Age_of_Company";
    public static final java.lang.String _value6 = "Annual_Return";
    public static final java.lang.String _value7 = "Appointment";
    public static final java.lang.String _value8 = "Current";
    public static final java.lang.String _value9 = "Date_Created";
    public static final java.lang.String _value10 = "Date_Fully_Satisfied";
    public static final java.lang.String _value11 = "Date_of_Birth";
    public static final java.lang.String _value12 = "Date_of_Document";
    public static final java.lang.String _value13 = "Date_of_Latest_Mortgage_Created";
    public static final java.lang.String _value14 = "Date_of_Latest_Satisfaction";
    public static final java.lang.String _value15 = "Date_of_Issue";
    public static final java.lang.String _value16 = "Date_Registered";
    public static final java.lang.String _value17 = "Enquiry";
    public static final java.lang.String _value18 = "Expirary";
    public static final java.lang.String _value19 = "Filed_at_Companies_House";
    public static final java.lang.String _value20 = "In";
    public static final java.lang.String _value21 = "Incorporation";
    public static final java.lang.String _value22 = "Latest_Accounts";
    public static final java.lang.String _value23 = "Legal_Form_Since";
    public static final java.lang.String _value24 = "Message";
    public static final java.lang.String _value25 = "Out";
    public static final java.lang.String _value26 = "Research";
    public static final java.lang.String _value27 = "Resignation";
    public static final java.lang.String _value28 = "Settled";
    public static final java.lang.String _value29 = "Summary";
    public static final java.lang.String _value30 = "Terms_in_Days";
    public static final java.lang.String _value31 = "Generation";
    public static final java.lang.String _value32 = "Order";
    public static final java.lang.String _value33 = "Last database update";
    public static final java.lang.String _value34 = "Latest_Accounts_at_CRO";
    public static final java.lang.String _value35 = "Registered";
    public static final DateTypesType value1 = new DateTypesType(_value1);
    public static final DateTypesType value2 = new DateTypesType(_value2);
    public static final DateTypesType value3 = new DateTypesType(_value3);
    public static final DateTypesType value4 = new DateTypesType(_value4);
    public static final DateTypesType value5 = new DateTypesType(_value5);
    public static final DateTypesType value6 = new DateTypesType(_value6);
    public static final DateTypesType value7 = new DateTypesType(_value7);
    public static final DateTypesType value8 = new DateTypesType(_value8);
    public static final DateTypesType value9 = new DateTypesType(_value9);
    public static final DateTypesType value10 = new DateTypesType(_value10);
    public static final DateTypesType value11 = new DateTypesType(_value11);
    public static final DateTypesType value12 = new DateTypesType(_value12);
    public static final DateTypesType value13 = new DateTypesType(_value13);
    public static final DateTypesType value14 = new DateTypesType(_value14);
    public static final DateTypesType value15 = new DateTypesType(_value15);
    public static final DateTypesType value16 = new DateTypesType(_value16);
    public static final DateTypesType value17 = new DateTypesType(_value17);
    public static final DateTypesType value18 = new DateTypesType(_value18);
    public static final DateTypesType value19 = new DateTypesType(_value19);
    public static final DateTypesType value20 = new DateTypesType(_value20);
    public static final DateTypesType value21 = new DateTypesType(_value21);
    public static final DateTypesType value22 = new DateTypesType(_value22);
    public static final DateTypesType value23 = new DateTypesType(_value23);
    public static final DateTypesType value24 = new DateTypesType(_value24);
    public static final DateTypesType value25 = new DateTypesType(_value25);
    public static final DateTypesType value26 = new DateTypesType(_value26);
    public static final DateTypesType value27 = new DateTypesType(_value27);
    public static final DateTypesType value28 = new DateTypesType(_value28);
    public static final DateTypesType value29 = new DateTypesType(_value29);
    public static final DateTypesType value30 = new DateTypesType(_value30);
    public static final DateTypesType value31 = new DateTypesType(_value31);
    public static final DateTypesType value32 = new DateTypesType(_value32);
    public static final DateTypesType value33 = new DateTypesType(_value33);
    public static final DateTypesType value34 = new DateTypesType(_value34);
    public static final DateTypesType value35 = new DateTypesType(_value35);
    public java.lang.String getValue() { return _value_;}
    public static DateTypesType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DateTypesType enumeration = (DateTypesType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DateTypesType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DateTypesType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xml.graydon.co.uk/GraydonUKCommonTypes", "DateTypesType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
