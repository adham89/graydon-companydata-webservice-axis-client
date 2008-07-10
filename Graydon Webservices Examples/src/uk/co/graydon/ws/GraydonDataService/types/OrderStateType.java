/**
 * OrderStateType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.co.graydon.ws.GraydonDataService.types;

public class OrderStateType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected OrderStateType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Completed = "Completed";
    public static final java.lang.String _Assigned = "Assigned";
    public static final java.lang.String _InError = "InError";
    public static final java.lang.String _Initialised = "Initialised";
    public static final java.lang.String _Delivered = "Delivered";
    public static final java.lang.String _Notified = "Notified";
    public static final java.lang.String _ReCompleted = "ReCompleted";
    public static final OrderStateType Completed = new OrderStateType(_Completed);
    public static final OrderStateType Assigned = new OrderStateType(_Assigned);
    public static final OrderStateType InError = new OrderStateType(_InError);
    public static final OrderStateType Initialised = new OrderStateType(_Initialised);
    public static final OrderStateType Delivered = new OrderStateType(_Delivered);
    public static final OrderStateType Notified = new OrderStateType(_Notified);
    public static final OrderStateType ReCompleted = new OrderStateType(_ReCompleted);
    public java.lang.String getValue() { return _value_;}
    public static OrderStateType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        OrderStateType enumeration = (OrderStateType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static OrderStateType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(OrderStateType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "OrderStateType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
