/**
 * PlaceOrder_ResultType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.co.graydon.ws.GraydonDataService.types;


/**
 * All the response elements for the 'placeOrder' operation.
 */
public class PlaceOrder_ResultType  implements java.io.Serializable {
    private uk.co.graydon.ws.GraydonDataService.types.Service_LogType service_Log;

    private uk.co.graydon.ws.GraydonDataService.types.OrderStatusType orderStatus;

    public PlaceOrder_ResultType() {
    }

    public PlaceOrder_ResultType(
           uk.co.graydon.ws.GraydonDataService.types.Service_LogType service_Log,
           uk.co.graydon.ws.GraydonDataService.types.OrderStatusType orderStatus) {
           this.service_Log = service_Log;
           this.orderStatus = orderStatus;
    }


    /**
     * Gets the service_Log value for this PlaceOrder_ResultType.
     * 
     * @return service_Log
     */
    public uk.co.graydon.ws.GraydonDataService.types.Service_LogType getService_Log() {
        return service_Log;
    }


    /**
     * Sets the service_Log value for this PlaceOrder_ResultType.
     * 
     * @param service_Log
     */
    public void setService_Log(uk.co.graydon.ws.GraydonDataService.types.Service_LogType service_Log) {
        this.service_Log = service_Log;
    }


    /**
     * Gets the orderStatus value for this PlaceOrder_ResultType.
     * 
     * @return orderStatus
     */
    public uk.co.graydon.ws.GraydonDataService.types.OrderStatusType getOrderStatus() {
        return orderStatus;
    }


    /**
     * Sets the orderStatus value for this PlaceOrder_ResultType.
     * 
     * @param orderStatus
     */
    public void setOrderStatus(uk.co.graydon.ws.GraydonDataService.types.OrderStatusType orderStatus) {
        this.orderStatus = orderStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlaceOrder_ResultType)) return false;
        PlaceOrder_ResultType other = (PlaceOrder_ResultType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.service_Log==null && other.getService_Log()==null) || 
             (this.service_Log!=null &&
              this.service_Log.equals(other.getService_Log()))) &&
            ((this.orderStatus==null && other.getOrderStatus()==null) || 
             (this.orderStatus!=null &&
              this.orderStatus.equals(other.getOrderStatus())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getService_Log() != null) {
            _hashCode += getService_Log().hashCode();
        }
        if (getOrderStatus() != null) {
            _hashCode += getOrderStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PlaceOrder_ResultType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "PlaceOrder_ResultType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service_Log");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Service_Log"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Service_LogType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "OrderStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "OrderStatusType"));
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
