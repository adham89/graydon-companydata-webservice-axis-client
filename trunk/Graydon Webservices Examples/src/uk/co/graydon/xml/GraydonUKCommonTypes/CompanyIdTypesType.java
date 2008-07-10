/**
 * CompanyIdTypesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.co.graydon.xml.GraydonUKCommonTypes;

public class CompanyIdTypesType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CompanyIdTypesType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Buyers_Number = "Buyers_Number";
    public static final java.lang.String _Chamber_Of_Commerce = "Chamber_Of_Commerce";
    public static final java.lang.String _SIREN_Number = "SIREN_Number";
    public static final java.lang.String _SIRET_Number = "SIRET_Number";
    public static final java.lang.String _Unique_Company_Number = "Unique_Company_Number";
    public static final java.lang.String _National2 = "National2";
    public static final java.lang.String _VAT = "VAT";
    public static final java.lang.String _Internal = "Internal";
    public static final java.lang.String _National1 = "National1";
    public static final java.lang.String _Web_Address = "Web_Address";
    public static final java.lang.String _Fiscal_Code = "Fiscal_Code";
    public static final java.lang.String _National_Government_Business_Identification_Number = "National_Government_Business_Identification_Number";
    public static final java.lang.String _NIT = "NIT";
    public static final java.lang.String _RIF = "RIF";
    public static final java.lang.String _RUC_Number = "RUC_Number";
    public static final java.lang.String _TSR = "TSR";
    public static final java.lang.String _Unknown = "Unknown";
    public static final java.lang.String _Company_Registration_Number = "Company_Registration_Number";
    public static final CompanyIdTypesType Buyers_Number = new CompanyIdTypesType(_Buyers_Number);
    public static final CompanyIdTypesType Chamber_Of_Commerce = new CompanyIdTypesType(_Chamber_Of_Commerce);
    public static final CompanyIdTypesType SIREN_Number = new CompanyIdTypesType(_SIREN_Number);
    public static final CompanyIdTypesType SIRET_Number = new CompanyIdTypesType(_SIRET_Number);
    public static final CompanyIdTypesType Unique_Company_Number = new CompanyIdTypesType(_Unique_Company_Number);
    public static final CompanyIdTypesType National2 = new CompanyIdTypesType(_National2);
    public static final CompanyIdTypesType VAT = new CompanyIdTypesType(_VAT);
    public static final CompanyIdTypesType Internal = new CompanyIdTypesType(_Internal);
    public static final CompanyIdTypesType National1 = new CompanyIdTypesType(_National1);
    public static final CompanyIdTypesType Web_Address = new CompanyIdTypesType(_Web_Address);
    public static final CompanyIdTypesType Fiscal_Code = new CompanyIdTypesType(_Fiscal_Code);
    public static final CompanyIdTypesType National_Government_Business_Identification_Number = new CompanyIdTypesType(_National_Government_Business_Identification_Number);
    public static final CompanyIdTypesType NIT = new CompanyIdTypesType(_NIT);
    public static final CompanyIdTypesType RIF = new CompanyIdTypesType(_RIF);
    public static final CompanyIdTypesType RUC_Number = new CompanyIdTypesType(_RUC_Number);
    public static final CompanyIdTypesType TSR = new CompanyIdTypesType(_TSR);
    public static final CompanyIdTypesType Unknown = new CompanyIdTypesType(_Unknown);
    public static final CompanyIdTypesType Company_Registration_Number = new CompanyIdTypesType(_Company_Registration_Number);
    public java.lang.String getValue() { return _value_;}
    public static CompanyIdTypesType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CompanyIdTypesType enumeration = (CompanyIdTypesType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CompanyIdTypesType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CompanyIdTypesType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xml.graydon.co.uk/GraydonUKCommonTypes", "CompanyIdTypesType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
