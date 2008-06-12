/**
 * ServiceSpeedType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.co.graydon.ws.GraydonDataService.types;

public class ServiceSpeedType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ServiceSpeedType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Normal = "Normal";
    public static final java.lang.String _Express = "Express";
    public static final java.lang.String _Superflash = "Superflash";
    public static final java.lang.String _Immediate = "Immediate";
    public static final java.lang.String _ImmediateWithUpdate = "ImmediateWithUpdate";
    public static final java.lang.String _Unknown = "Unknown";
    public static final java.lang.String _Delayed = "Delayed";
    public static final ServiceSpeedType Normal = new ServiceSpeedType(_Normal);
    public static final ServiceSpeedType Express = new ServiceSpeedType(_Express);
    public static final ServiceSpeedType Superflash = new ServiceSpeedType(_Superflash);
    public static final ServiceSpeedType Immediate = new ServiceSpeedType(_Immediate);
    public static final ServiceSpeedType ImmediateWithUpdate = new ServiceSpeedType(_ImmediateWithUpdate);
    public static final ServiceSpeedType Unknown = new ServiceSpeedType(_Unknown);
    public static final ServiceSpeedType Delayed = new ServiceSpeedType(_Delayed);
    public java.lang.String getValue() { return _value_;}
    public static ServiceSpeedType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ServiceSpeedType enumeration = (ServiceSpeedType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ServiceSpeedType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ServiceSpeedType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "ServiceSpeedType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
