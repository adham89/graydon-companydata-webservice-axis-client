/**
 * ProductType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.co.graydon.ws.GraydonDataService.types;


/**
 * All the details related to a product.
 */
public class ProductType  implements java.io.Serializable {
    private int code;

    /* This is the speed of service available
     * 								for the product. This is only supplied
     * 								for products that require an agency
     * 								investigate of the subject company. */
    private uk.co.graydon.ws.GraydonDataService.types.ServiceSpeedType serviceSpeed;

    /* The product level relates to the level of data available for
     * this type of product. '1' representing the lowest. */
    private int level;

    /* Type of product this can either be 'Database' which means the
     * report will be built from existing data on the database,
     * or 'Investigation' which requires a reporter to collate further information
     * on the subject company and add it to the database in order for a report
     * to be built. */
    private uk.co.graydon.ws.GraydonDataService.types.ProductTypeType type;

    /* Number of delivery days from. */
    private java.lang.Integer daysFrom;

    /* Number of delivery days to. */
    private java.lang.Integer daysTo;

    /* This is a unique identifier that should be used to when the
     * subsequent 'placeOrder' operation is used. */
    private java.lang.String companyProductIdentifier;

    private uk.co.graydon.xml.GraydonUKCommonTypes.MimeTypesType[] mimeTypes;

    public ProductType() {
    }

    public ProductType(
           int code,
           uk.co.graydon.ws.GraydonDataService.types.ServiceSpeedType serviceSpeed,
           int level,
           uk.co.graydon.ws.GraydonDataService.types.ProductTypeType type,
           java.lang.Integer daysFrom,
           java.lang.Integer daysTo,
           java.lang.String companyProductIdentifier,
           uk.co.graydon.xml.GraydonUKCommonTypes.MimeTypesType[] mimeTypes) {
           this.code = code;
           this.serviceSpeed = serviceSpeed;
           this.level = level;
           this.type = type;
           this.daysFrom = daysFrom;
           this.daysTo = daysTo;
           this.companyProductIdentifier = companyProductIdentifier;
           this.mimeTypes = mimeTypes;
    }


    /**
     * Gets the code value for this ProductType.
     * 
     * @return code
     */
    public int getCode() {
        return code;
    }


    /**
     * Sets the code value for this ProductType.
     * 
     * @param code
     */
    public void setCode(int code) {
        this.code = code;
    }


    /**
     * Gets the serviceSpeed value for this ProductType.
     * 
     * @return serviceSpeed   * This is the speed of service available
     * 								for the product. This is only supplied
     * 								for products that require an agency
     * 								investigate of the subject company.
     */
    public uk.co.graydon.ws.GraydonDataService.types.ServiceSpeedType getServiceSpeed() {
        return serviceSpeed;
    }


    /**
     * Sets the serviceSpeed value for this ProductType.
     * 
     * @param serviceSpeed   * This is the speed of service available
     * 								for the product. This is only supplied
     * 								for products that require an agency
     * 								investigate of the subject company.
     */
    public void setServiceSpeed(uk.co.graydon.ws.GraydonDataService.types.ServiceSpeedType serviceSpeed) {
        this.serviceSpeed = serviceSpeed;
    }


    /**
     * Gets the level value for this ProductType.
     * 
     * @return level   * The product level relates to the level of data available for
     * this type of product. '1' representing the lowest.
     */
    public int getLevel() {
        return level;
    }


    /**
     * Sets the level value for this ProductType.
     * 
     * @param level   * The product level relates to the level of data available for
     * this type of product. '1' representing the lowest.
     */
    public void setLevel(int level) {
        this.level = level;
    }


    /**
     * Gets the type value for this ProductType.
     * 
     * @return type   * Type of product this can either be 'Database' which means the
     * report will be built from existing data on the database,
     * or 'Investigation' which requires a reporter to collate further information
     * on the subject company and add it to the database in order for a report
     * to be built.
     */
    public uk.co.graydon.ws.GraydonDataService.types.ProductTypeType getType() {
        return type;
    }


    /**
     * Sets the type value for this ProductType.
     * 
     * @param type   * Type of product this can either be 'Database' which means the
     * report will be built from existing data on the database,
     * or 'Investigation' which requires a reporter to collate further information
     * on the subject company and add it to the database in order for a report
     * to be built.
     */
    public void setType(uk.co.graydon.ws.GraydonDataService.types.ProductTypeType type) {
        this.type = type;
    }


    /**
     * Gets the daysFrom value for this ProductType.
     * 
     * @return daysFrom   * Number of delivery days from.
     */
    public java.lang.Integer getDaysFrom() {
        return daysFrom;
    }


    /**
     * Sets the daysFrom value for this ProductType.
     * 
     * @param daysFrom   * Number of delivery days from.
     */
    public void setDaysFrom(java.lang.Integer daysFrom) {
        this.daysFrom = daysFrom;
    }


    /**
     * Gets the daysTo value for this ProductType.
     * 
     * @return daysTo   * Number of delivery days to.
     */
    public java.lang.Integer getDaysTo() {
        return daysTo;
    }


    /**
     * Sets the daysTo value for this ProductType.
     * 
     * @param daysTo   * Number of delivery days to.
     */
    public void setDaysTo(java.lang.Integer daysTo) {
        this.daysTo = daysTo;
    }


    /**
     * Gets the companyProductIdentifier value for this ProductType.
     * 
     * @return companyProductIdentifier   * This is a unique identifier that should be used to when the
     * subsequent 'placeOrder' operation is used.
     */
    public java.lang.String getCompanyProductIdentifier() {
        return companyProductIdentifier;
    }


    /**
     * Sets the companyProductIdentifier value for this ProductType.
     * 
     * @param companyProductIdentifier   * This is a unique identifier that should be used to when the
     * subsequent 'placeOrder' operation is used.
     */
    public void setCompanyProductIdentifier(java.lang.String companyProductIdentifier) {
        this.companyProductIdentifier = companyProductIdentifier;
    }


    /**
     * Gets the mimeTypes value for this ProductType.
     * 
     * @return mimeTypes
     */
    public uk.co.graydon.xml.GraydonUKCommonTypes.MimeTypesType[] getMimeTypes() {
        return mimeTypes;
    }


    /**
     * Sets the mimeTypes value for this ProductType.
     * 
     * @param mimeTypes
     */
    public void setMimeTypes(uk.co.graydon.xml.GraydonUKCommonTypes.MimeTypesType[] mimeTypes) {
        this.mimeTypes = mimeTypes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductType)) return false;
        ProductType other = (ProductType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.code == other.getCode() &&
            ((this.serviceSpeed==null && other.getServiceSpeed()==null) || 
             (this.serviceSpeed!=null &&
              this.serviceSpeed.equals(other.getServiceSpeed()))) &&
            this.level == other.getLevel() &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.daysFrom==null && other.getDaysFrom()==null) || 
             (this.daysFrom!=null &&
              this.daysFrom.equals(other.getDaysFrom()))) &&
            ((this.daysTo==null && other.getDaysTo()==null) || 
             (this.daysTo!=null &&
              this.daysTo.equals(other.getDaysTo()))) &&
            ((this.companyProductIdentifier==null && other.getCompanyProductIdentifier()==null) || 
             (this.companyProductIdentifier!=null &&
              this.companyProductIdentifier.equals(other.getCompanyProductIdentifier()))) &&
            ((this.mimeTypes==null && other.getMimeTypes()==null) || 
             (this.mimeTypes!=null &&
              java.util.Arrays.equals(this.mimeTypes, other.getMimeTypes())));
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
        _hashCode += getCode();
        if (getServiceSpeed() != null) {
            _hashCode += getServiceSpeed().hashCode();
        }
        _hashCode += getLevel();
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getDaysFrom() != null) {
            _hashCode += getDaysFrom().hashCode();
        }
        if (getDaysTo() != null) {
            _hashCode += getDaysTo().hashCode();
        }
        if (getCompanyProductIdentifier() != null) {
            _hashCode += getCompanyProductIdentifier().hashCode();
        }
        if (getMimeTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMimeTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMimeTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "ProductType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceSpeed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "ServiceSpeed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "ServiceSpeedType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("level");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Level"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "ProductTypeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daysFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "DaysFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daysTo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "DaysTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("mimeTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "MimeTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xml.graydon.co.uk/GraydonUKCommonTypes", "MimeTypesType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "MimeType"));
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
