/**
 * Ping_ResultType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.co.graydon.ws.GraydonDataService.types;


/**
 * All the response elements for the 'getDemoCompanies' operation.
 */
public class Ping_ResultType  implements java.io.Serializable {
    private uk.co.graydon.ws.GraydonDataService.types.Service_LogType service_Log;

    /* Use this element to determine what state the service is in.
     * The possible values are 'ServiceAvailable', 'ServiceNotAvailable' */
    private uk.co.graydon.ws.GraydonDataService.types.PingStateType pingState;

    /* Information message in English about the state of the service. */
    private java.lang.String pingMessage;

    public Ping_ResultType() {
    }

    public Ping_ResultType(
           uk.co.graydon.ws.GraydonDataService.types.Service_LogType service_Log,
           uk.co.graydon.ws.GraydonDataService.types.PingStateType pingState,
           java.lang.String pingMessage) {
           this.service_Log = service_Log;
           this.pingState = pingState;
           this.pingMessage = pingMessage;
    }


    /**
     * Gets the service_Log value for this Ping_ResultType.
     * 
     * @return service_Log
     */
    public uk.co.graydon.ws.GraydonDataService.types.Service_LogType getService_Log() {
        return service_Log;
    }


    /**
     * Sets the service_Log value for this Ping_ResultType.
     * 
     * @param service_Log
     */
    public void setService_Log(uk.co.graydon.ws.GraydonDataService.types.Service_LogType service_Log) {
        this.service_Log = service_Log;
    }


    /**
     * Gets the pingState value for this Ping_ResultType.
     * 
     * @return pingState   * Use this element to determine what state the service is in.
     * The possible values are 'ServiceAvailable', 'ServiceNotAvailable'
     */
    public uk.co.graydon.ws.GraydonDataService.types.PingStateType getPingState() {
        return pingState;
    }


    /**
     * Sets the pingState value for this Ping_ResultType.
     * 
     * @param pingState   * Use this element to determine what state the service is in.
     * The possible values are 'ServiceAvailable', 'ServiceNotAvailable'
     */
    public void setPingState(uk.co.graydon.ws.GraydonDataService.types.PingStateType pingState) {
        this.pingState = pingState;
    }


    /**
     * Gets the pingMessage value for this Ping_ResultType.
     * 
     * @return pingMessage   * Information message in English about the state of the service.
     */
    public java.lang.String getPingMessage() {
        return pingMessage;
    }


    /**
     * Sets the pingMessage value for this Ping_ResultType.
     * 
     * @param pingMessage   * Information message in English about the state of the service.
     */
    public void setPingMessage(java.lang.String pingMessage) {
        this.pingMessage = pingMessage;
    }

    private java.lang.Object __equalsCalc = null;
    @Override
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ping_ResultType)) return false;
        Ping_ResultType other = (Ping_ResultType) obj;
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
            ((this.pingState==null && other.getPingState()==null) || 
             (this.pingState!=null &&
              this.pingState.equals(other.getPingState()))) &&
            ((this.pingMessage==null && other.getPingMessage()==null) || 
             (this.pingMessage!=null &&
              this.pingMessage.equals(other.getPingMessage())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    @Override
	public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getService_Log() != null) {
            _hashCode += getService_Log().hashCode();
        }
        if (getPingState() != null) {
            _hashCode += getPingState().hashCode();
        }
        if (getPingMessage() != null) {
            _hashCode += getPingMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ping_ResultType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Ping_ResultType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service_Log");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Service_Log"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Service_LogType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pingState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "PingState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "PingStateType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pingMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "PingMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
