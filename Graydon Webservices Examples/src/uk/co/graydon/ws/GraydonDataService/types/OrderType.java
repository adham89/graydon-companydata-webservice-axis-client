/**
 * OrderType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.co.graydon.ws.GraydonDataService.types;


/**
 * Order details.
 */
public class OrderType  implements java.io.Serializable {
    /* Language of the ordered report */
    private uk.co.graydon.xml.GraydonUKCommonTypes.LanguageCodesType languageCode;

    /* Name of the subject company */
    private java.lang.String name;

    /* Speed of service for the ordered report. */
    private uk.co.graydon.ws.GraydonDataService.types.ServiceSpeedType serviceSpeed;

    /* Country of the subject company. */
    private java.lang.String country;

    /* Registered address of the subject
     * 								company. */
    private uk.co.graydon.xml.GraydonUKCommonTypes.AddressType address;

    /* Company Identifiers used for the subject company. */
    private uk.co.graydon.ws.GraydonDataService.types.CompanyIdentifierType companyIdentifier;

    /* Partner's credit opinion value for the
     * 								subject company. */
    private java.lang.Integer creditOpinion;

    /* Partner's credit opinion currency for the credit opinion. */
    private uk.co.graydon.xml.GraydonUKCommonTypes.CurrencyType creditOpinionCurrency;

    /* Partner's credit opinion period for the credit opinion. */
    private java.lang.Integer creditOpinionPeriod;

    /* Client reference for the order. */
    private java.lang.String clientReference;

    /* Attention of detail for the order */
    private java.lang.String attentionOf;

    /* Bankers details for the subject company */
    private java.lang.String bankers;

    /* Special remarks on the subject company */
    private java.lang.String specialRemarks;

    /* Telephone number for the subject
     * 								company. */
    private java.lang.String telephone;

    public OrderType() {
    }

    public OrderType(
           uk.co.graydon.xml.GraydonUKCommonTypes.LanguageCodesType languageCode,
           java.lang.String name,
           uk.co.graydon.ws.GraydonDataService.types.ServiceSpeedType serviceSpeed,
           java.lang.String country,
           uk.co.graydon.xml.GraydonUKCommonTypes.AddressType address,
           uk.co.graydon.ws.GraydonDataService.types.CompanyIdentifierType companyIdentifier,
           java.lang.Integer creditOpinion,
           uk.co.graydon.xml.GraydonUKCommonTypes.CurrencyType creditOpinionCurrency,
           java.lang.Integer creditOpinionPeriod,
           java.lang.String clientReference,
           java.lang.String attentionOf,
           java.lang.String bankers,
           java.lang.String specialRemarks,
           java.lang.String telephone) {
           this.languageCode = languageCode;
           this.name = name;
           this.serviceSpeed = serviceSpeed;
           this.country = country;
           this.address = address;
           this.companyIdentifier = companyIdentifier;
           this.creditOpinion = creditOpinion;
           this.creditOpinionCurrency = creditOpinionCurrency;
           this.creditOpinionPeriod = creditOpinionPeriod;
           this.clientReference = clientReference;
           this.attentionOf = attentionOf;
           this.bankers = bankers;
           this.specialRemarks = specialRemarks;
           this.telephone = telephone;
    }


    /**
     * Gets the languageCode value for this OrderType.
     * 
     * @return languageCode   * Language of the ordered report
     */
    public uk.co.graydon.xml.GraydonUKCommonTypes.LanguageCodesType getLanguageCode() {
        return languageCode;
    }


    /**
     * Sets the languageCode value for this OrderType.
     * 
     * @param languageCode   * Language of the ordered report
     */
    public void setLanguageCode(uk.co.graydon.xml.GraydonUKCommonTypes.LanguageCodesType languageCode) {
        this.languageCode = languageCode;
    }


    /**
     * Gets the name value for this OrderType.
     * 
     * @return name   * Name of the subject company
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this OrderType.
     * 
     * @param name   * Name of the subject company
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the serviceSpeed value for this OrderType.
     * 
     * @return serviceSpeed   * Speed of service for the ordered report.
     */
    public uk.co.graydon.ws.GraydonDataService.types.ServiceSpeedType getServiceSpeed() {
        return serviceSpeed;
    }


    /**
     * Sets the serviceSpeed value for this OrderType.
     * 
     * @param serviceSpeed   * Speed of service for the ordered report.
     */
    public void setServiceSpeed(uk.co.graydon.ws.GraydonDataService.types.ServiceSpeedType serviceSpeed) {
        this.serviceSpeed = serviceSpeed;
    }


    /**
     * Gets the country value for this OrderType.
     * 
     * @return country   * Country of the subject company.
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this OrderType.
     * 
     * @param country   * Country of the subject company.
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the address value for this OrderType.
     * 
     * @return address   * Registered address of the subject
     * 								company.
     */
    public uk.co.graydon.xml.GraydonUKCommonTypes.AddressType getAddress() {
        return address;
    }


    /**
     * Sets the address value for this OrderType.
     * 
     * @param address   * Registered address of the subject
     * 								company.
     */
    public void setAddress(uk.co.graydon.xml.GraydonUKCommonTypes.AddressType address) {
        this.address = address;
    }


    /**
     * Gets the companyIdentifier value for this OrderType.
     * 
     * @return companyIdentifier   * Company Identifiers used for the subject company.
     */
    public uk.co.graydon.ws.GraydonDataService.types.CompanyIdentifierType getCompanyIdentifier() {
        return companyIdentifier;
    }


    /**
     * Sets the companyIdentifier value for this OrderType.
     * 
     * @param companyIdentifier   * Company Identifiers used for the subject company.
     */
    public void setCompanyIdentifier(uk.co.graydon.ws.GraydonDataService.types.CompanyIdentifierType companyIdentifier) {
        this.companyIdentifier = companyIdentifier;
    }


    /**
     * Gets the creditOpinion value for this OrderType.
     * 
     * @return creditOpinion   * Partner's credit opinion value for the
     * 								subject company.
     */
    public java.lang.Integer getCreditOpinion() {
        return creditOpinion;
    }


    /**
     * Sets the creditOpinion value for this OrderType.
     * 
     * @param creditOpinion   * Partner's credit opinion value for the
     * 								subject company.
     */
    public void setCreditOpinion(java.lang.Integer creditOpinion) {
        this.creditOpinion = creditOpinion;
    }


    /**
     * Gets the creditOpinionCurrency value for this OrderType.
     * 
     * @return creditOpinionCurrency   * Partner's credit opinion currency for the credit opinion.
     */
    public uk.co.graydon.xml.GraydonUKCommonTypes.CurrencyType getCreditOpinionCurrency() {
        return creditOpinionCurrency;
    }


    /**
     * Sets the creditOpinionCurrency value for this OrderType.
     * 
     * @param creditOpinionCurrency   * Partner's credit opinion currency for the credit opinion.
     */
    public void setCreditOpinionCurrency(uk.co.graydon.xml.GraydonUKCommonTypes.CurrencyType creditOpinionCurrency) {
        this.creditOpinionCurrency = creditOpinionCurrency;
    }


    /**
     * Gets the creditOpinionPeriod value for this OrderType.
     * 
     * @return creditOpinionPeriod   * Partner's credit opinion period for the credit opinion.
     */
    public java.lang.Integer getCreditOpinionPeriod() {
        return creditOpinionPeriod;
    }


    /**
     * Sets the creditOpinionPeriod value for this OrderType.
     * 
     * @param creditOpinionPeriod   * Partner's credit opinion period for the credit opinion.
     */
    public void setCreditOpinionPeriod(java.lang.Integer creditOpinionPeriod) {
        this.creditOpinionPeriod = creditOpinionPeriod;
    }


    /**
     * Gets the clientReference value for this OrderType.
     * 
     * @return clientReference   * Client reference for the order.
     */
    public java.lang.String getClientReference() {
        return clientReference;
    }


    /**
     * Sets the clientReference value for this OrderType.
     * 
     * @param clientReference   * Client reference for the order.
     */
    public void setClientReference(java.lang.String clientReference) {
        this.clientReference = clientReference;
    }


    /**
     * Gets the attentionOf value for this OrderType.
     * 
     * @return attentionOf   * Attention of detail for the order
     */
    public java.lang.String getAttentionOf() {
        return attentionOf;
    }


    /**
     * Sets the attentionOf value for this OrderType.
     * 
     * @param attentionOf   * Attention of detail for the order
     */
    public void setAttentionOf(java.lang.String attentionOf) {
        this.attentionOf = attentionOf;
    }


    /**
     * Gets the bankers value for this OrderType.
     * 
     * @return bankers   * Bankers details for the subject company
     */
    public java.lang.String getBankers() {
        return bankers;
    }


    /**
     * Sets the bankers value for this OrderType.
     * 
     * @param bankers   * Bankers details for the subject company
     */
    public void setBankers(java.lang.String bankers) {
        this.bankers = bankers;
    }


    /**
     * Gets the specialRemarks value for this OrderType.
     * 
     * @return specialRemarks   * Special remarks on the subject company
     */
    public java.lang.String getSpecialRemarks() {
        return specialRemarks;
    }


    /**
     * Sets the specialRemarks value for this OrderType.
     * 
     * @param specialRemarks   * Special remarks on the subject company
     */
    public void setSpecialRemarks(java.lang.String specialRemarks) {
        this.specialRemarks = specialRemarks;
    }


    /**
     * Gets the telephone value for this OrderType.
     * 
     * @return telephone   * Telephone number for the subject
     * 								company.
     */
    public java.lang.String getTelephone() {
        return telephone;
    }


    /**
     * Sets the telephone value for this OrderType.
     * 
     * @param telephone   * Telephone number for the subject
     * 								company.
     */
    public void setTelephone(java.lang.String telephone) {
        this.telephone = telephone;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderType)) return false;
        OrderType other = (OrderType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.languageCode==null && other.getLanguageCode()==null) || 
             (this.languageCode!=null &&
              this.languageCode.equals(other.getLanguageCode()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.serviceSpeed==null && other.getServiceSpeed()==null) || 
             (this.serviceSpeed!=null &&
              this.serviceSpeed.equals(other.getServiceSpeed()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.companyIdentifier==null && other.getCompanyIdentifier()==null) || 
             (this.companyIdentifier!=null &&
              this.companyIdentifier.equals(other.getCompanyIdentifier()))) &&
            ((this.creditOpinion==null && other.getCreditOpinion()==null) || 
             (this.creditOpinion!=null &&
              this.creditOpinion.equals(other.getCreditOpinion()))) &&
            ((this.creditOpinionCurrency==null && other.getCreditOpinionCurrency()==null) || 
             (this.creditOpinionCurrency!=null &&
              this.creditOpinionCurrency.equals(other.getCreditOpinionCurrency()))) &&
            ((this.creditOpinionPeriod==null && other.getCreditOpinionPeriod()==null) || 
             (this.creditOpinionPeriod!=null &&
              this.creditOpinionPeriod.equals(other.getCreditOpinionPeriod()))) &&
            ((this.clientReference==null && other.getClientReference()==null) || 
             (this.clientReference!=null &&
              this.clientReference.equals(other.getClientReference()))) &&
            ((this.attentionOf==null && other.getAttentionOf()==null) || 
             (this.attentionOf!=null &&
              this.attentionOf.equals(other.getAttentionOf()))) &&
            ((this.bankers==null && other.getBankers()==null) || 
             (this.bankers!=null &&
              this.bankers.equals(other.getBankers()))) &&
            ((this.specialRemarks==null && other.getSpecialRemarks()==null) || 
             (this.specialRemarks!=null &&
              this.specialRemarks.equals(other.getSpecialRemarks()))) &&
            ((this.telephone==null && other.getTelephone()==null) || 
             (this.telephone!=null &&
              this.telephone.equals(other.getTelephone())));
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
        if (getLanguageCode() != null) {
            _hashCode += getLanguageCode().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getServiceSpeed() != null) {
            _hashCode += getServiceSpeed().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getCompanyIdentifier() != null) {
            _hashCode += getCompanyIdentifier().hashCode();
        }
        if (getCreditOpinion() != null) {
            _hashCode += getCreditOpinion().hashCode();
        }
        if (getCreditOpinionCurrency() != null) {
            _hashCode += getCreditOpinionCurrency().hashCode();
        }
        if (getCreditOpinionPeriod() != null) {
            _hashCode += getCreditOpinionPeriod().hashCode();
        }
        if (getClientReference() != null) {
            _hashCode += getClientReference().hashCode();
        }
        if (getAttentionOf() != null) {
            _hashCode += getAttentionOf().hashCode();
        }
        if (getBankers() != null) {
            _hashCode += getBankers().hashCode();
        }
        if (getSpecialRemarks() != null) {
            _hashCode += getSpecialRemarks().hashCode();
        }
        if (getTelephone() != null) {
            _hashCode += getTelephone().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "OrderType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languageCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "LanguageCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xml.graydon.co.uk/GraydonUKCommonTypes", "LanguageCodesType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceSpeed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "ServiceSpeed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "ServiceSpeedType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xml.graydon.co.uk/GraydonUKCommonTypes", "AddressType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "CompanyIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "CompanyIdentifierType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditOpinion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "CreditOpinion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditOpinionCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "CreditOpinionCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xml.graydon.co.uk/GraydonUKCommonTypes", "CurrencyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditOpinionPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "CreditOpinionPeriod"));
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
        elemField.setFieldName("attentionOf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "AttentionOf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Bankers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialRemarks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "SpecialRemarks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telephone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Telephone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
