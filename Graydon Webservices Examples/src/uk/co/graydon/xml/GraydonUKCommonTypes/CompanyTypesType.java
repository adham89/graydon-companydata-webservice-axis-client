/**
 * CompanyTypesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.co.graydon.xml.GraydonUKCommonTypes;

public class CompanyTypesType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CompanyTypesType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Associate = "Associate";
    public static final java.lang.String _Branch = "Branch";
    public static final java.lang.String _Client = "Client";
    public static final java.lang.String _Enquiry = "Enquiry";
    public static final java.lang.String _Holding = "Holding";
    public static final java.lang.String _Known_As = "Known_As";
    public static final java.lang.String _Lender = "Lender";
    public static final java.lang.String _OtherDirectorship = "OtherDirectorship";
    public static final java.lang.String _Parent = "Parent";
    public static final java.lang.String _Shareholder = "Shareholder";
    public static final java.lang.String _Subject = "Subject";
    public static final java.lang.String _Subsidiary = "Subsidiary";
    public static final java.lang.String _Trustee = "Trustee";
    public static final java.lang.String _UltimateHolding = "UltimateHolding";
    public static final CompanyTypesType Associate = new CompanyTypesType(_Associate);
    public static final CompanyTypesType Branch = new CompanyTypesType(_Branch);
    public static final CompanyTypesType Client = new CompanyTypesType(_Client);
    public static final CompanyTypesType Enquiry = new CompanyTypesType(_Enquiry);
    public static final CompanyTypesType Holding = new CompanyTypesType(_Holding);
    public static final CompanyTypesType Known_As = new CompanyTypesType(_Known_As);
    public static final CompanyTypesType Lender = new CompanyTypesType(_Lender);
    public static final CompanyTypesType OtherDirectorship = new CompanyTypesType(_OtherDirectorship);
    public static final CompanyTypesType Parent = new CompanyTypesType(_Parent);
    public static final CompanyTypesType Shareholder = new CompanyTypesType(_Shareholder);
    public static final CompanyTypesType Subject = new CompanyTypesType(_Subject);
    public static final CompanyTypesType Subsidiary = new CompanyTypesType(_Subsidiary);
    public static final CompanyTypesType Trustee = new CompanyTypesType(_Trustee);
    public static final CompanyTypesType UltimateHolding = new CompanyTypesType(_UltimateHolding);
    public java.lang.String getValue() { return _value_;}
    public static CompanyTypesType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CompanyTypesType enumeration = (CompanyTypesType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CompanyTypesType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
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
        new org.apache.axis.description.TypeDesc(CompanyTypesType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xml.graydon.co.uk/GraydonUKCommonTypes", "CompanyTypesType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
