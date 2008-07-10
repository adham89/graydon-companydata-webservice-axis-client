/**
 * CompanyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.co.graydon.ws.GraydonDataService.types;


/**
 * Details of a subject company.
 */
public class CompanyType  implements java.io.Serializable {
    /* Name of the subject company. */
    private java.lang.String name;

    /* Unique match identifier, supplied to be
     * 								used for product availabilty checking. */
    private java.lang.String companyMatchIdentifier;

    private uk.co.graydon.ws.GraydonDataService.types.CompanyIdentifierType[] companyIdentifiers;

    /* Registered address for the subject company */
    private uk.co.graydon.xml.GraydonUKCommonTypes.AddressType registeredAddress;

    /* Trading address of the subject company */
    private uk.co.graydon.xml.GraydonUKCommonTypes.AddressType tradingAddress;

    /* Date the subject company was
     * 								incorporated */
    private java.util.Date dateOfIncorporation;

    /* Date the subject company was known since. */
    private java.util.Date dateKnownSince;

    /* Date for the subject company's annual return. */
    private java.util.Date dateOfAnnualReturn;

    /* Date of the latest accounts held in association to the subject
     * company. */
    private java.util.Date dateOfLatestAccounts;

    /* Date the subject company's accounts were last filed. */
    private java.util.Date dateAccountsFiled;

    private uk.co.graydon.ws.GraydonDataService.types.LegalFormType legalForm;

    private uk.co.graydon.ws.GraydonDataService.types.ActivityType[] activites;

    private java.lang.String telephone;

    private java.lang.String facsimile;

    private java.lang.String email;

    public CompanyType() {
    }

    public CompanyType(
           java.lang.String name,
           java.lang.String companyMatchIdentifier,
           uk.co.graydon.ws.GraydonDataService.types.CompanyIdentifierType[] companyIdentifiers,
           uk.co.graydon.xml.GraydonUKCommonTypes.AddressType registeredAddress,
           uk.co.graydon.xml.GraydonUKCommonTypes.AddressType tradingAddress,
           java.util.Date dateOfIncorporation,
           java.util.Date dateKnownSince,
           java.util.Date dateOfAnnualReturn,
           java.util.Date dateOfLatestAccounts,
           java.util.Date dateAccountsFiled,
           uk.co.graydon.ws.GraydonDataService.types.LegalFormType legalForm,
           uk.co.graydon.ws.GraydonDataService.types.ActivityType[] activites,
           java.lang.String telephone,
           java.lang.String facsimile,
           java.lang.String email) {
           this.name = name;
           this.companyMatchIdentifier = companyMatchIdentifier;
           this.companyIdentifiers = companyIdentifiers;
           this.registeredAddress = registeredAddress;
           this.tradingAddress = tradingAddress;
           this.dateOfIncorporation = dateOfIncorporation;
           this.dateKnownSince = dateKnownSince;
           this.dateOfAnnualReturn = dateOfAnnualReturn;
           this.dateOfLatestAccounts = dateOfLatestAccounts;
           this.dateAccountsFiled = dateAccountsFiled;
           this.legalForm = legalForm;
           this.activites = activites;
           this.telephone = telephone;
           this.facsimile = facsimile;
           this.email = email;
    }


    /**
     * Gets the name value for this CompanyType.
     * 
     * @return name   * Name of the subject company.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CompanyType.
     * 
     * @param name   * Name of the subject company.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the companyMatchIdentifier value for this CompanyType.
     * 
     * @return companyMatchIdentifier   * Unique match identifier, supplied to be
     * 								used for product availabilty checking.
     */
    public java.lang.String getCompanyMatchIdentifier() {
        return companyMatchIdentifier;
    }


    /**
     * Sets the companyMatchIdentifier value for this CompanyType.
     * 
     * @param companyMatchIdentifier   * Unique match identifier, supplied to be
     * 								used for product availabilty checking.
     */
    public void setCompanyMatchIdentifier(java.lang.String companyMatchIdentifier) {
        this.companyMatchIdentifier = companyMatchIdentifier;
    }


    /**
     * Gets the companyIdentifiers value for this CompanyType.
     * 
     * @return companyIdentifiers
     */
    public uk.co.graydon.ws.GraydonDataService.types.CompanyIdentifierType[] getCompanyIdentifiers() {
        return companyIdentifiers;
    }


    /**
     * Sets the companyIdentifiers value for this CompanyType.
     * 
     * @param companyIdentifiers
     */
    public void setCompanyIdentifiers(uk.co.graydon.ws.GraydonDataService.types.CompanyIdentifierType[] companyIdentifiers) {
        this.companyIdentifiers = companyIdentifiers;
    }


    /**
     * Gets the registeredAddress value for this CompanyType.
     * 
     * @return registeredAddress   * Registered address for the subject company
     */
    public uk.co.graydon.xml.GraydonUKCommonTypes.AddressType getRegisteredAddress() {
        return registeredAddress;
    }


    /**
     * Sets the registeredAddress value for this CompanyType.
     * 
     * @param registeredAddress   * Registered address for the subject company
     */
    public void setRegisteredAddress(uk.co.graydon.xml.GraydonUKCommonTypes.AddressType registeredAddress) {
        this.registeredAddress = registeredAddress;
    }


    /**
     * Gets the tradingAddress value for this CompanyType.
     * 
     * @return tradingAddress   * Trading address of the subject company
     */
    public uk.co.graydon.xml.GraydonUKCommonTypes.AddressType getTradingAddress() {
        return tradingAddress;
    }


    /**
     * Sets the tradingAddress value for this CompanyType.
     * 
     * @param tradingAddress   * Trading address of the subject company
     */
    public void setTradingAddress(uk.co.graydon.xml.GraydonUKCommonTypes.AddressType tradingAddress) {
        this.tradingAddress = tradingAddress;
    }


    /**
     * Gets the dateOfIncorporation value for this CompanyType.
     * 
     * @return dateOfIncorporation   * Date the subject company was
     * 								incorporated
     */
    public java.util.Date getDateOfIncorporation() {
        return dateOfIncorporation;
    }


    /**
     * Sets the dateOfIncorporation value for this CompanyType.
     * 
     * @param dateOfIncorporation   * Date the subject company was
     * 								incorporated
     */
    public void setDateOfIncorporation(java.util.Date dateOfIncorporation) {
        this.dateOfIncorporation = dateOfIncorporation;
    }


    /**
     * Gets the dateKnownSince value for this CompanyType.
     * 
     * @return dateKnownSince   * Date the subject company was known since.
     */
    public java.util.Date getDateKnownSince() {
        return dateKnownSince;
    }


    /**
     * Sets the dateKnownSince value for this CompanyType.
     * 
     * @param dateKnownSince   * Date the subject company was known since.
     */
    public void setDateKnownSince(java.util.Date dateKnownSince) {
        this.dateKnownSince = dateKnownSince;
    }


    /**
     * Gets the dateOfAnnualReturn value for this CompanyType.
     * 
     * @return dateOfAnnualReturn   * Date for the subject company's annual return.
     */
    public java.util.Date getDateOfAnnualReturn() {
        return dateOfAnnualReturn;
    }


    /**
     * Sets the dateOfAnnualReturn value for this CompanyType.
     * 
     * @param dateOfAnnualReturn   * Date for the subject company's annual return.
     */
    public void setDateOfAnnualReturn(java.util.Date dateOfAnnualReturn) {
        this.dateOfAnnualReturn = dateOfAnnualReturn;
    }


    /**
     * Gets the dateOfLatestAccounts value for this CompanyType.
     * 
     * @return dateOfLatestAccounts   * Date of the latest accounts held in association to the subject
     * company.
     */
    public java.util.Date getDateOfLatestAccounts() {
        return dateOfLatestAccounts;
    }


    /**
     * Sets the dateOfLatestAccounts value for this CompanyType.
     * 
     * @param dateOfLatestAccounts   * Date of the latest accounts held in association to the subject
     * company.
     */
    public void setDateOfLatestAccounts(java.util.Date dateOfLatestAccounts) {
        this.dateOfLatestAccounts = dateOfLatestAccounts;
    }


    /**
     * Gets the dateAccountsFiled value for this CompanyType.
     * 
     * @return dateAccountsFiled   * Date the subject company's accounts were last filed.
     */
    public java.util.Date getDateAccountsFiled() {
        return dateAccountsFiled;
    }


    /**
     * Sets the dateAccountsFiled value for this CompanyType.
     * 
     * @param dateAccountsFiled   * Date the subject company's accounts were last filed.
     */
    public void setDateAccountsFiled(java.util.Date dateAccountsFiled) {
        this.dateAccountsFiled = dateAccountsFiled;
    }


    /**
     * Gets the legalForm value for this CompanyType.
     * 
     * @return legalForm
     */
    public uk.co.graydon.ws.GraydonDataService.types.LegalFormType getLegalForm() {
        return legalForm;
    }


    /**
     * Sets the legalForm value for this CompanyType.
     * 
     * @param legalForm
     */
    public void setLegalForm(uk.co.graydon.ws.GraydonDataService.types.LegalFormType legalForm) {
        this.legalForm = legalForm;
    }


    /**
     * Gets the activites value for this CompanyType.
     * 
     * @return activites
     */
    public uk.co.graydon.ws.GraydonDataService.types.ActivityType[] getActivites() {
        return activites;
    }


    /**
     * Sets the activites value for this CompanyType.
     * 
     * @param activites
     */
    public void setActivites(uk.co.graydon.ws.GraydonDataService.types.ActivityType[] activites) {
        this.activites = activites;
    }


    /**
     * Gets the telephone value for this CompanyType.
     * 
     * @return telephone
     */
    public java.lang.String getTelephone() {
        return telephone;
    }


    /**
     * Sets the telephone value for this CompanyType.
     * 
     * @param telephone
     */
    public void setTelephone(java.lang.String telephone) {
        this.telephone = telephone;
    }


    /**
     * Gets the facsimile value for this CompanyType.
     * 
     * @return facsimile
     */
    public java.lang.String getFacsimile() {
        return facsimile;
    }


    /**
     * Sets the facsimile value for this CompanyType.
     * 
     * @param facsimile
     */
    public void setFacsimile(java.lang.String facsimile) {
        this.facsimile = facsimile;
    }


    /**
     * Gets the email value for this CompanyType.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this CompanyType.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }

    private java.lang.Object __equalsCalc = null;
    @Override
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CompanyType)) return false;
        CompanyType other = (CompanyType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.companyMatchIdentifier==null && other.getCompanyMatchIdentifier()==null) || 
             (this.companyMatchIdentifier!=null &&
              this.companyMatchIdentifier.equals(other.getCompanyMatchIdentifier()))) &&
            ((this.companyIdentifiers==null && other.getCompanyIdentifiers()==null) || 
             (this.companyIdentifiers!=null &&
              java.util.Arrays.equals(this.companyIdentifiers, other.getCompanyIdentifiers()))) &&
            ((this.registeredAddress==null && other.getRegisteredAddress()==null) || 
             (this.registeredAddress!=null &&
              this.registeredAddress.equals(other.getRegisteredAddress()))) &&
            ((this.tradingAddress==null && other.getTradingAddress()==null) || 
             (this.tradingAddress!=null &&
              this.tradingAddress.equals(other.getTradingAddress()))) &&
            ((this.dateOfIncorporation==null && other.getDateOfIncorporation()==null) || 
             (this.dateOfIncorporation!=null &&
              this.dateOfIncorporation.equals(other.getDateOfIncorporation()))) &&
            ((this.dateKnownSince==null && other.getDateKnownSince()==null) || 
             (this.dateKnownSince!=null &&
              this.dateKnownSince.equals(other.getDateKnownSince()))) &&
            ((this.dateOfAnnualReturn==null && other.getDateOfAnnualReturn()==null) || 
             (this.dateOfAnnualReturn!=null &&
              this.dateOfAnnualReturn.equals(other.getDateOfAnnualReturn()))) &&
            ((this.dateOfLatestAccounts==null && other.getDateOfLatestAccounts()==null) || 
             (this.dateOfLatestAccounts!=null &&
              this.dateOfLatestAccounts.equals(other.getDateOfLatestAccounts()))) &&
            ((this.dateAccountsFiled==null && other.getDateAccountsFiled()==null) || 
             (this.dateAccountsFiled!=null &&
              this.dateAccountsFiled.equals(other.getDateAccountsFiled()))) &&
            ((this.legalForm==null && other.getLegalForm()==null) || 
             (this.legalForm!=null &&
              this.legalForm.equals(other.getLegalForm()))) &&
            ((this.activites==null && other.getActivites()==null) || 
             (this.activites!=null &&
              java.util.Arrays.equals(this.activites, other.getActivites()))) &&
            ((this.telephone==null && other.getTelephone()==null) || 
             (this.telephone!=null &&
              this.telephone.equals(other.getTelephone()))) &&
            ((this.facsimile==null && other.getFacsimile()==null) || 
             (this.facsimile!=null &&
              this.facsimile.equals(other.getFacsimile()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getCompanyMatchIdentifier() != null) {
            _hashCode += getCompanyMatchIdentifier().hashCode();
        }
        if (getCompanyIdentifiers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCompanyIdentifiers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCompanyIdentifiers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRegisteredAddress() != null) {
            _hashCode += getRegisteredAddress().hashCode();
        }
        if (getTradingAddress() != null) {
            _hashCode += getTradingAddress().hashCode();
        }
        if (getDateOfIncorporation() != null) {
            _hashCode += getDateOfIncorporation().hashCode();
        }
        if (getDateKnownSince() != null) {
            _hashCode += getDateKnownSince().hashCode();
        }
        if (getDateOfAnnualReturn() != null) {
            _hashCode += getDateOfAnnualReturn().hashCode();
        }
        if (getDateOfLatestAccounts() != null) {
            _hashCode += getDateOfLatestAccounts().hashCode();
        }
        if (getDateAccountsFiled() != null) {
            _hashCode += getDateAccountsFiled().hashCode();
        }
        if (getLegalForm() != null) {
            _hashCode += getLegalForm().hashCode();
        }
        if (getActivites() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActivites());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActivites(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTelephone() != null) {
            _hashCode += getTelephone().hashCode();
        }
        if (getFacsimile() != null) {
            _hashCode += getFacsimile().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CompanyType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "CompanyType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyMatchIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "CompanyMatchIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyIdentifiers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "CompanyIdentifiers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "CompanyIdentifierType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "CompanyIdentifier"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registeredAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "RegisteredAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xml.graydon.co.uk/GraydonUKCommonTypes", "AddressType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tradingAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "TradingAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xml.graydon.co.uk/GraydonUKCommonTypes", "AddressType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfIncorporation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "DateOfIncorporation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateKnownSince");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "DateKnownSince"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfAnnualReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "DateOfAnnualReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfLatestAccounts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "DateOfLatestAccounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateAccountsFiled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "DateAccountsFiled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legalForm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "LegalForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "LegalFormType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activites");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Activites"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "ActivityType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Activity"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telephone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Telephone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("facsimile");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Facsimile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Email"));
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
