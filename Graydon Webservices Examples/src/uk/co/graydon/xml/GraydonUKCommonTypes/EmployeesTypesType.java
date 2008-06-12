/**
 * EmployeesTypesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.co.graydon.xml.GraydonUKCommonTypes;

public class EmployeesTypesType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected EmployeesTypesType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Employed = "Employed";
    public static final java.lang.String _Full_Time_Employees = "Full_Time_Employees";
    public static final java.lang.String _Head_Office_Employees = "Head_Office_Employees";
    public static final java.lang.String _Staff_Employeed = "Staff_Employeed";
    public static final java.lang.String _Staff_Employees = "Staff_Employees";
    public static final EmployeesTypesType Employed = new EmployeesTypesType(_Employed);
    public static final EmployeesTypesType Full_Time_Employees = new EmployeesTypesType(_Full_Time_Employees);
    public static final EmployeesTypesType Head_Office_Employees = new EmployeesTypesType(_Head_Office_Employees);
    public static final EmployeesTypesType Staff_Employeed = new EmployeesTypesType(_Staff_Employeed);
    public static final EmployeesTypesType Staff_Employees = new EmployeesTypesType(_Staff_Employees);
    public java.lang.String getValue() { return _value_;}
    public static EmployeesTypesType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        EmployeesTypesType enumeration = (EmployeesTypesType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static EmployeesTypesType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(EmployeesTypesType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xml.graydon.co.uk/GraydonUKCommonTypes", "EmployeesTypesType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
