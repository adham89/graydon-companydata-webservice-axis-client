/**
 * OrderStatusType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.co.graydon.ws.GraydonDataService.types;


/**
 * All status and detail for a specific order
 */
public class OrderStatusType  implements java.io.Serializable {
    /* Graydon's unique order reference for this order. */
    private int orderReference;

    private uk.co.graydon.ws.GraydonDataService.types.OrderType order;

    /* The current state of the order i.e. 'Complete' */
    private uk.co.graydon.ws.GraydonDataService.types.OrderStateType orderState;

    /* The date the order was placed. */
    private java.util.Date dateOrdered;

    /* The date the order was completed */
    private java.util.Date dateCompleted;

    /* Date the order is due. This is only applicable to investigated
     * orders. */
    private java.util.Date dateDue;

    public OrderStatusType() {
    }

    public OrderStatusType(
           int orderReference,
           uk.co.graydon.ws.GraydonDataService.types.OrderType order,
           uk.co.graydon.ws.GraydonDataService.types.OrderStateType orderState,
           java.util.Date dateOrdered,
           java.util.Date dateCompleted,
           java.util.Date dateDue) {
           this.orderReference = orderReference;
           this.order = order;
           this.orderState = orderState;
           this.dateOrdered = dateOrdered;
           this.dateCompleted = dateCompleted;
           this.dateDue = dateDue;
    }


    /**
     * Gets the orderReference value for this OrderStatusType.
     * 
     * @return orderReference   * Graydon's unique order reference for this order.
     */
    public int getOrderReference() {
        return orderReference;
    }


    /**
     * Sets the orderReference value for this OrderStatusType.
     * 
     * @param orderReference   * Graydon's unique order reference for this order.
     */
    public void setOrderReference(int orderReference) {
        this.orderReference = orderReference;
    }


    /**
     * Gets the order value for this OrderStatusType.
     * 
     * @return order
     */
    public uk.co.graydon.ws.GraydonDataService.types.OrderType getOrder() {
        return order;
    }


    /**
     * Sets the order value for this OrderStatusType.
     * 
     * @param order
     */
    public void setOrder(uk.co.graydon.ws.GraydonDataService.types.OrderType order) {
        this.order = order;
    }


    /**
     * Gets the orderState value for this OrderStatusType.
     * 
     * @return orderState   * The current state of the order i.e. 'Complete'
     */
    public uk.co.graydon.ws.GraydonDataService.types.OrderStateType getOrderState() {
        return orderState;
    }


    /**
     * Sets the orderState value for this OrderStatusType.
     * 
     * @param orderState   * The current state of the order i.e. 'Complete'
     */
    public void setOrderState(uk.co.graydon.ws.GraydonDataService.types.OrderStateType orderState) {
        this.orderState = orderState;
    }


    /**
     * Gets the dateOrdered value for this OrderStatusType.
     * 
     * @return dateOrdered   * The date the order was placed.
     */
    public java.util.Date getDateOrdered() {
        return dateOrdered;
    }


    /**
     * Sets the dateOrdered value for this OrderStatusType.
     * 
     * @param dateOrdered   * The date the order was placed.
     */
    public void setDateOrdered(java.util.Date dateOrdered) {
        this.dateOrdered = dateOrdered;
    }


    /**
     * Gets the dateCompleted value for this OrderStatusType.
     * 
     * @return dateCompleted   * The date the order was completed
     */
    public java.util.Date getDateCompleted() {
        return dateCompleted;
    }


    /**
     * Sets the dateCompleted value for this OrderStatusType.
     * 
     * @param dateCompleted   * The date the order was completed
     */
    public void setDateCompleted(java.util.Date dateCompleted) {
        this.dateCompleted = dateCompleted;
    }


    /**
     * Gets the dateDue value for this OrderStatusType.
     * 
     * @return dateDue   * Date the order is due. This is only applicable to investigated
     * orders.
     */
    public java.util.Date getDateDue() {
        return dateDue;
    }


    /**
     * Sets the dateDue value for this OrderStatusType.
     * 
     * @param dateDue   * Date the order is due. This is only applicable to investigated
     * orders.
     */
    public void setDateDue(java.util.Date dateDue) {
        this.dateDue = dateDue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderStatusType)) return false;
        OrderStatusType other = (OrderStatusType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.orderReference == other.getOrderReference() &&
            ((this.order==null && other.getOrder()==null) || 
             (this.order!=null &&
              this.order.equals(other.getOrder()))) &&
            ((this.orderState==null && other.getOrderState()==null) || 
             (this.orderState!=null &&
              this.orderState.equals(other.getOrderState()))) &&
            ((this.dateOrdered==null && other.getDateOrdered()==null) || 
             (this.dateOrdered!=null &&
              this.dateOrdered.equals(other.getDateOrdered()))) &&
            ((this.dateCompleted==null && other.getDateCompleted()==null) || 
             (this.dateCompleted!=null &&
              this.dateCompleted.equals(other.getDateCompleted()))) &&
            ((this.dateDue==null && other.getDateDue()==null) || 
             (this.dateDue!=null &&
              this.dateDue.equals(other.getDateDue())));
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
        _hashCode += getOrderReference();
        if (getOrder() != null) {
            _hashCode += getOrder().hashCode();
        }
        if (getOrderState() != null) {
            _hashCode += getOrderState().hashCode();
        }
        if (getDateOrdered() != null) {
            _hashCode += getDateOrdered().hashCode();
        }
        if (getDateCompleted() != null) {
            _hashCode += getDateCompleted().hashCode();
        }
        if (getDateDue() != null) {
            _hashCode += getDateDue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderStatusType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "OrderStatusType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "OrderReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Order"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "OrderType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "OrderState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "OrderStateType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOrdered");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "DateOrdered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateCompleted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "DateCompleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateDue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "DateDue"));
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
