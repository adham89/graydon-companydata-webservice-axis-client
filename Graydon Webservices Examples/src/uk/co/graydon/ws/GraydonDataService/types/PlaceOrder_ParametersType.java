/**
 * PlaceOrder_ParametersType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.co.graydon.ws.GraydonDataService.types;


/**
 * All the request parameters for the 'placeOrder' operation.
 */
public class PlaceOrder_ParametersType  implements java.io.Serializable {
    private uk.co.graydon.ws.GraydonDataService.types.Authentication_ParametersType authentication_Parameters;

    /* This parameter is user defined and can be used in conjuction
     * with specific solutions provided by Graydon */
    private uk.co.graydon.ws.GraydonDataService.types.PartnerElementType[] partnerData;

    /* This parameter should be populated with the person who created
     * the order. It is mandatory.
     * Any future problems encountered due to the order detail can be corresponded
     * through this email address. */
    private java.lang.String orderCreatorEmail;

    /* This parameter should be populated with the 'CompanyProductIdentifier'
     * returned in the response for the 'getCompanyProducts' operation.
     * Each 'Product' element in this response contains one of these elements
     * with a session unique value. */
    private java.lang.String companyProductIdentifier;

    private uk.co.graydon.ws.GraydonDataService.types.OrderType order;

    public PlaceOrder_ParametersType() {
    }

    public PlaceOrder_ParametersType(
           uk.co.graydon.ws.GraydonDataService.types.Authentication_ParametersType authentication_Parameters,
           uk.co.graydon.ws.GraydonDataService.types.PartnerElementType[] partnerData,
           java.lang.String orderCreatorEmail,
           java.lang.String companyProductIdentifier,
           uk.co.graydon.ws.GraydonDataService.types.OrderType order) {
           this.authentication_Parameters = authentication_Parameters;
           this.partnerData = partnerData;
           this.orderCreatorEmail = orderCreatorEmail;
           this.companyProductIdentifier = companyProductIdentifier;
           this.order = order;
    }


    /**
     * Gets the authentication_Parameters value for this PlaceOrder_ParametersType.
     * 
     * @return authentication_Parameters
     */
    public uk.co.graydon.ws.GraydonDataService.types.Authentication_ParametersType getAuthentication_Parameters() {
        return authentication_Parameters;
    }


    /**
     * Sets the authentication_Parameters value for this PlaceOrder_ParametersType.
     * 
     * @param authentication_Parameters
     */
    public void setAuthentication_Parameters(uk.co.graydon.ws.GraydonDataService.types.Authentication_ParametersType authentication_Parameters) {
        this.authentication_Parameters = authentication_Parameters;
    }


    /**
     * Gets the partnerData value for this PlaceOrder_ParametersType.
     * 
     * @return partnerData   * This parameter is user defined and can be used in conjuction
     * with specific solutions provided by Graydon
     */
    public uk.co.graydon.ws.GraydonDataService.types.PartnerElementType[] getPartnerData() {
        return partnerData;
    }


    /**
     * Sets the partnerData value for this PlaceOrder_ParametersType.
     * 
     * @param partnerData   * This parameter is user defined and can be used in conjuction
     * with specific solutions provided by Graydon
     */
    public void setPartnerData(uk.co.graydon.ws.GraydonDataService.types.PartnerElementType[] partnerData) {
        this.partnerData = partnerData;
    }


    /**
     * Gets the orderCreatorEmail value for this PlaceOrder_ParametersType.
     * 
     * @return orderCreatorEmail   * This parameter should be populated with the person who created
     * the order. It is mandatory.
     * Any future problems encountered due to the order detail can be corresponded
     * through this email address.
     */
    public java.lang.String getOrderCreatorEmail() {
        return orderCreatorEmail;
    }


    /**
     * Sets the orderCreatorEmail value for this PlaceOrder_ParametersType.
     * 
     * @param orderCreatorEmail   * This parameter should be populated with the person who created
     * the order. It is mandatory.
     * Any future problems encountered due to the order detail can be corresponded
     * through this email address.
     */
    public void setOrderCreatorEmail(java.lang.String orderCreatorEmail) {
        this.orderCreatorEmail = orderCreatorEmail;
    }


    /**
     * Gets the companyProductIdentifier value for this PlaceOrder_ParametersType.
     * 
     * @return companyProductIdentifier   * This parameter should be populated with the 'CompanyProductIdentifier'
     * returned in the response for the 'getCompanyProducts' operation.
     * Each 'Product' element in this response contains one of these elements
     * with a session unique value.
     */
    public java.lang.String getCompanyProductIdentifier() {
        return companyProductIdentifier;
    }


    /**
     * Sets the companyProductIdentifier value for this PlaceOrder_ParametersType.
     * 
     * @param companyProductIdentifier   * This parameter should be populated with the 'CompanyProductIdentifier'
     * returned in the response for the 'getCompanyProducts' operation.
     * Each 'Product' element in this response contains one of these elements
     * with a session unique value.
     */
    public void setCompanyProductIdentifier(java.lang.String companyProductIdentifier) {
        this.companyProductIdentifier = companyProductIdentifier;
    }


    /**
     * Gets the order value for this PlaceOrder_ParametersType.
     * 
     * @return order
     */
    public uk.co.graydon.ws.GraydonDataService.types.OrderType getOrder() {
        return order;
    }


    /**
     * Sets the order value for this PlaceOrder_ParametersType.
     * 
     * @param order
     */
    public void setOrder(uk.co.graydon.ws.GraydonDataService.types.OrderType order) {
        this.order = order;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlaceOrder_ParametersType)) return false;
        PlaceOrder_ParametersType other = (PlaceOrder_ParametersType) obj;
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
            ((this.partnerData==null && other.getPartnerData()==null) || 
             (this.partnerData!=null &&
              java.util.Arrays.equals(this.partnerData, other.getPartnerData()))) &&
            ((this.orderCreatorEmail==null && other.getOrderCreatorEmail()==null) || 
             (this.orderCreatorEmail!=null &&
              this.orderCreatorEmail.equals(other.getOrderCreatorEmail()))) &&
            ((this.companyProductIdentifier==null && other.getCompanyProductIdentifier()==null) || 
             (this.companyProductIdentifier!=null &&
              this.companyProductIdentifier.equals(other.getCompanyProductIdentifier()))) &&
            ((this.order==null && other.getOrder()==null) || 
             (this.order!=null &&
              this.order.equals(other.getOrder())));
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
        if (getAuthentication_Parameters() != null) {
            _hashCode += getAuthentication_Parameters().hashCode();
        }
        if (getPartnerData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartnerData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartnerData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOrderCreatorEmail() != null) {
            _hashCode += getOrderCreatorEmail().hashCode();
        }
        if (getCompanyProductIdentifier() != null) {
            _hashCode += getCompanyProductIdentifier().hashCode();
        }
        if (getOrder() != null) {
            _hashCode += getOrder().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PlaceOrder_ParametersType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "PlaceOrder_ParametersType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authentication_Parameters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Authentication_Parameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Authentication_ParametersType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "PartnerData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "PartnerElementType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "PartnerElement"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderCreatorEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "OrderCreatorEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyProductIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "CompanyProductIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Order"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "OrderType"));
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
