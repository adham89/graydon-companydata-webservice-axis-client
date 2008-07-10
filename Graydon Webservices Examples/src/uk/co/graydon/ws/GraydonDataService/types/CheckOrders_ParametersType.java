/**
 * CheckOrders_ParametersType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.co.graydon.ws.GraydonDataService.types;


/**
 * All request parameters for the 'checkOrders' operation.
 */
public class CheckOrders_ParametersType  implements java.io.Serializable {
    private uk.co.graydon.ws.GraydonDataService.types.Authentication_ParametersType authentication_Parameters;

    /* Graydon's unique order reference, supplied when the order was
     * orginally placed. Use when a single order is to be checked. */
    private java.lang.Integer orderReference;

    private java.lang.String clientReference;

    /* Using this in conjunction with the 'DateFrom', 'DateTo' parameters
     * is optional. Current date is assumed if not supplied.
     * This determines which state type i.e. 'Completed' the returned orders
     * are in. */
    private uk.co.graydon.ws.GraydonDataService.types.OrderStateType orderState;

    /* Use this in conjunction with the
     * 								'OrderState' and 'DateTo' parameters. */
    private java.util.Date dateFrom;

    public CheckOrders_ParametersType() {
    }

    public CheckOrders_ParametersType(
           uk.co.graydon.ws.GraydonDataService.types.Authentication_ParametersType authentication_Parameters,
           java.lang.Integer orderReference,
           java.lang.String clientReference,
           uk.co.graydon.ws.GraydonDataService.types.OrderStateType orderState,
           java.util.Date dateFrom) {
           this.authentication_Parameters = authentication_Parameters;
           this.orderReference = orderReference;
           this.clientReference = clientReference;
           this.orderState = orderState;
           this.dateFrom = dateFrom;
    }


    /**
     * Gets the authentication_Parameters value for this CheckOrders_ParametersType.
     * 
     * @return authentication_Parameters
     */
    public uk.co.graydon.ws.GraydonDataService.types.Authentication_ParametersType getAuthentication_Parameters() {
        return authentication_Parameters;
    }


    /**
     * Sets the authentication_Parameters value for this CheckOrders_ParametersType.
     * 
     * @param authentication_Parameters
     */
    public void setAuthentication_Parameters(uk.co.graydon.ws.GraydonDataService.types.Authentication_ParametersType authentication_Parameters) {
        this.authentication_Parameters = authentication_Parameters;
    }


    /**
     * Gets the orderReference value for this CheckOrders_ParametersType.
     * 
     * @return orderReference   * Graydon's unique order reference, supplied when the order was
     * orginally placed. Use when a single order is to be checked.
     */
    public java.lang.Integer getOrderReference() {
        return orderReference;
    }


    /**
     * Sets the orderReference value for this CheckOrders_ParametersType.
     * 
     * @param orderReference   * Graydon's unique order reference, supplied when the order was
     * orginally placed. Use when a single order is to be checked.
     */
    public void setOrderReference(java.lang.Integer orderReference) {
        this.orderReference = orderReference;
    }


    /**
     * Gets the clientReference value for this CheckOrders_ParametersType.
     * 
     * @return clientReference
     */
    public java.lang.String getClientReference() {
        return clientReference;
    }


    /**
     * Sets the clientReference value for this CheckOrders_ParametersType.
     * 
     * @param clientReference
     */
    public void setClientReference(java.lang.String clientReference) {
        this.clientReference = clientReference;
    }


    /**
     * Gets the orderState value for this CheckOrders_ParametersType.
     * 
     * @return orderState   * Using this in conjunction with the 'DateFrom', 'DateTo' parameters
     * is optional. Current date is assumed if not supplied.
     * This determines which state type i.e. 'Completed' the returned orders
     * are in.
     */
    public uk.co.graydon.ws.GraydonDataService.types.OrderStateType getOrderState() {
        return orderState;
    }


    /**
     * Sets the orderState value for this CheckOrders_ParametersType.
     * 
     * @param orderState   * Using this in conjunction with the 'DateFrom', 'DateTo' parameters
     * is optional. Current date is assumed if not supplied.
     * This determines which state type i.e. 'Completed' the returned orders
     * are in.
     */
    public void setOrderState(uk.co.graydon.ws.GraydonDataService.types.OrderStateType orderState) {
        this.orderState = orderState;
    }


    /**
     * Gets the dateFrom value for this CheckOrders_ParametersType.
     * 
     * @return dateFrom   * Use this in conjunction with the
     * 								'OrderState' and 'DateTo' parameters.
     */
    public java.util.Date getDateFrom() {
        return dateFrom;
    }


    /**
     * Sets the dateFrom value for this CheckOrders_ParametersType.
     * 
     * @param dateFrom   * Use this in conjunction with the
     * 								'OrderState' and 'DateTo' parameters.
     */
    public void setDateFrom(java.util.Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    private java.lang.Object __equalsCalc = null;
    @Override
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CheckOrders_ParametersType)) return false;
        CheckOrders_ParametersType other = (CheckOrders_ParametersType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.authentication_Parameters==null && other.getAuthentication_Parameters()==null) || 
             (this.authentication_Parameters!=null &&
              this.authentication_Parameters.equals(other.getAuthentication_Parameters()))) &&
            ((this.orderReference==null && other.getOrderReference()==null) || 
             (this.orderReference!=null &&
              this.orderReference.equals(other.getOrderReference()))) &&
            ((this.clientReference==null && other.getClientReference()==null) || 
             (this.clientReference!=null &&
              this.clientReference.equals(other.getClientReference()))) &&
            ((this.orderState==null && other.getOrderState()==null) || 
             (this.orderState!=null &&
              this.orderState.equals(other.getOrderState()))) &&
            ((this.dateFrom==null && other.getDateFrom()==null) || 
             (this.dateFrom!=null &&
              this.dateFrom.equals(other.getDateFrom())));
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
        if (getAuthentication_Parameters() != null) {
            _hashCode += getAuthentication_Parameters().hashCode();
        }
        if (getOrderReference() != null) {
            _hashCode += getOrderReference().hashCode();
        }
        if (getClientReference() != null) {
            _hashCode += getClientReference().hashCode();
        }
        if (getOrderState() != null) {
            _hashCode += getOrderState().hashCode();
        }
        if (getDateFrom() != null) {
            _hashCode += getDateFrom().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CheckOrders_ParametersType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "CheckOrders_ParametersType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authentication_Parameters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Authentication_Parameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Authentication_ParametersType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "OrderReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "ClientReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "OrderState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "OrderStateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "DateFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
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
