/**
 * Credit_RatingTypesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.co.graydon.xml.GraydonUKCommonTypes;

public class Credit_RatingTypesType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Credit_RatingTypesType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Augur_Score = "Augur_Score";
    public static final java.lang.String _Credit_Rating = "Credit_Rating";
    public static final java.lang.String _Credit_Score = "Credit_Score";
    public static final java.lang.String _Historical_Credit_Rating = "Historical_Credit_Rating";
    public static final java.lang.String _Maximum_Credit_Guide = "Maximum_Credit_Guide";
    public static final java.lang.String _Monthly_Credit_Guide = "Monthly_Credit_Guide";
    public static final java.lang.String _Previous_Credit_Score = "Previous_Credit_Score";
    public static final java.lang.String _Requested_Credit_Amount = "Requested_Credit_Amount";
    public static final java.lang.String _Risk_Category = "Risk_Category";
    public static final java.lang.String _Risk_Class = "Risk_Class";
    public static final Credit_RatingTypesType Augur_Score = new Credit_RatingTypesType(_Augur_Score);
    public static final Credit_RatingTypesType Credit_Rating = new Credit_RatingTypesType(_Credit_Rating);
    public static final Credit_RatingTypesType Credit_Score = new Credit_RatingTypesType(_Credit_Score);
    public static final Credit_RatingTypesType Historical_Credit_Rating = new Credit_RatingTypesType(_Historical_Credit_Rating);
    public static final Credit_RatingTypesType Maximum_Credit_Guide = new Credit_RatingTypesType(_Maximum_Credit_Guide);
    public static final Credit_RatingTypesType Monthly_Credit_Guide = new Credit_RatingTypesType(_Monthly_Credit_Guide);
    public static final Credit_RatingTypesType Previous_Credit_Score = new Credit_RatingTypesType(_Previous_Credit_Score);
    public static final Credit_RatingTypesType Requested_Credit_Amount = new Credit_RatingTypesType(_Requested_Credit_Amount);
    public static final Credit_RatingTypesType Risk_Category = new Credit_RatingTypesType(_Risk_Category);
    public static final Credit_RatingTypesType Risk_Class = new Credit_RatingTypesType(_Risk_Class);
    public java.lang.String getValue() { return _value_;}
    public static Credit_RatingTypesType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Credit_RatingTypesType enumeration = (Credit_RatingTypesType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Credit_RatingTypesType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Credit_RatingTypesType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xml.graydon.co.uk/GraydonUKCommonTypes", "Credit_RatingTypesType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
