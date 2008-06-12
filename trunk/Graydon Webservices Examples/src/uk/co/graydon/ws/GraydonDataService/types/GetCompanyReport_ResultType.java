/**
 * GetCompanyReport_ResultType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.co.graydon.ws.GraydonDataService.types;


/**
 * All the response elements for the 'getCompanyReport' operation.
 */
public class GetCompanyReport_ResultType  implements java.io.Serializable {
    private uk.co.graydon.ws.GraydonDataService.types.Service_LogType service_Log;

    /* The value for this element determines whether 'ReportXML',
     * 'ReportBinary' or 'ReportText' will be populated with the report.
     * For example if the 'ReportMimeType' value is 'pdf' then the 'ReportBinary'
     * element contains the report. 
     * 'ReportMimeType' value is 'xml' then the 'ReportXML' element contains
     * the report. 
     * 'ReportMimeType' value is 'html' then the 'ReportText' element contains
     * the report. */
    private uk.co.graydon.xml.GraydonUKCommonTypes.MimeTypesType reportMimeType;

    /* The report as XML elements. The schema the XML relates to depends
     * on individual partner configuration.
     * The default schema is the 'GraydonUKCompanySchema'.  
     * This will be populated for reports requested with mime type 'xml' */
    private uk.co.graydon.ws.GraydonDataService.types.GetCompanyReport_ResultTypeReportXML reportXML;

    /* The report as a binary string. This will contain any binary
     * format mime type requested. */
    private byte[] reportBinary;

    /* The report as a text string. This will be populated for reports
     * requested with mime type 'htmll'. */
    private java.lang.String reportText;

    public GetCompanyReport_ResultType() {
    }

    public GetCompanyReport_ResultType(
           uk.co.graydon.ws.GraydonDataService.types.Service_LogType service_Log,
           uk.co.graydon.xml.GraydonUKCommonTypes.MimeTypesType reportMimeType,
           uk.co.graydon.ws.GraydonDataService.types.GetCompanyReport_ResultTypeReportXML reportXML,
           byte[] reportBinary,
           java.lang.String reportText) {
           this.service_Log = service_Log;
           this.reportMimeType = reportMimeType;
           this.reportXML = reportXML;
           this.reportBinary = reportBinary;
           this.reportText = reportText;
    }


    /**
     * Gets the service_Log value for this GetCompanyReport_ResultType.
     * 
     * @return service_Log
     */
    public uk.co.graydon.ws.GraydonDataService.types.Service_LogType getService_Log() {
        return service_Log;
    }


    /**
     * Sets the service_Log value for this GetCompanyReport_ResultType.
     * 
     * @param service_Log
     */
    public void setService_Log(uk.co.graydon.ws.GraydonDataService.types.Service_LogType service_Log) {
        this.service_Log = service_Log;
    }


    /**
     * Gets the reportMimeType value for this GetCompanyReport_ResultType.
     * 
     * @return reportMimeType   * The value for this element determines whether 'ReportXML',
     * 'ReportBinary' or 'ReportText' will be populated with the report.
     * For example if the 'ReportMimeType' value is 'pdf' then the 'ReportBinary'
     * element contains the report. 
     * 'ReportMimeType' value is 'xml' then the 'ReportXML' element contains
     * the report. 
     * 'ReportMimeType' value is 'html' then the 'ReportText' element contains
     * the report.
     */
    public uk.co.graydon.xml.GraydonUKCommonTypes.MimeTypesType getReportMimeType() {
        return reportMimeType;
    }


    /**
     * Sets the reportMimeType value for this GetCompanyReport_ResultType.
     * 
     * @param reportMimeType   * The value for this element determines whether 'ReportXML',
     * 'ReportBinary' or 'ReportText' will be populated with the report.
     * For example if the 'ReportMimeType' value is 'pdf' then the 'ReportBinary'
     * element contains the report. 
     * 'ReportMimeType' value is 'xml' then the 'ReportXML' element contains
     * the report. 
     * 'ReportMimeType' value is 'html' then the 'ReportText' element contains
     * the report.
     */
    public void setReportMimeType(uk.co.graydon.xml.GraydonUKCommonTypes.MimeTypesType reportMimeType) {
        this.reportMimeType = reportMimeType;
    }


    /**
     * Gets the reportXML value for this GetCompanyReport_ResultType.
     * 
     * @return reportXML   * The report as XML elements. The schema the XML relates to depends
     * on individual partner configuration.
     * The default schema is the 'GraydonUKCompanySchema'.  
     * This will be populated for reports requested with mime type 'xml'
     */
    public uk.co.graydon.ws.GraydonDataService.types.GetCompanyReport_ResultTypeReportXML getReportXML() {
        return reportXML;
    }


    /**
     * Sets the reportXML value for this GetCompanyReport_ResultType.
     * 
     * @param reportXML   * The report as XML elements. The schema the XML relates to depends
     * on individual partner configuration.
     * The default schema is the 'GraydonUKCompanySchema'.  
     * This will be populated for reports requested with mime type 'xml'
     */
    public void setReportXML(uk.co.graydon.ws.GraydonDataService.types.GetCompanyReport_ResultTypeReportXML reportXML) {
        this.reportXML = reportXML;
    }


    /**
     * Gets the reportBinary value for this GetCompanyReport_ResultType.
     * 
     * @return reportBinary   * The report as a binary string. This will contain any binary
     * format mime type requested.
     */
    public byte[] getReportBinary() {
        return reportBinary;
    }


    /**
     * Sets the reportBinary value for this GetCompanyReport_ResultType.
     * 
     * @param reportBinary   * The report as a binary string. This will contain any binary
     * format mime type requested.
     */
    public void setReportBinary(byte[] reportBinary) {
        this.reportBinary = reportBinary;
    }


    /**
     * Gets the reportText value for this GetCompanyReport_ResultType.
     * 
     * @return reportText   * The report as a text string. This will be populated for reports
     * requested with mime type 'htmll'.
     */
    public java.lang.String getReportText() {
        return reportText;
    }


    /**
     * Sets the reportText value for this GetCompanyReport_ResultType.
     * 
     * @param reportText   * The report as a text string. This will be populated for reports
     * requested with mime type 'htmll'.
     */
    public void setReportText(java.lang.String reportText) {
        this.reportText = reportText;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCompanyReport_ResultType)) return false;
        GetCompanyReport_ResultType other = (GetCompanyReport_ResultType) obj;
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
            ((this.reportMimeType==null && other.getReportMimeType()==null) || 
             (this.reportMimeType!=null &&
              this.reportMimeType.equals(other.getReportMimeType()))) &&
            ((this.reportXML==null && other.getReportXML()==null) || 
             (this.reportXML!=null &&
              this.reportXML.equals(other.getReportXML()))) &&
            ((this.reportBinary==null && other.getReportBinary()==null) || 
             (this.reportBinary!=null &&
              java.util.Arrays.equals(this.reportBinary, other.getReportBinary()))) &&
            ((this.reportText==null && other.getReportText()==null) || 
             (this.reportText!=null &&
              this.reportText.equals(other.getReportText())));
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
        if (getReportMimeType() != null) {
            _hashCode += getReportMimeType().hashCode();
        }
        if (getReportXML() != null) {
            _hashCode += getReportXML().hashCode();
        }
        if (getReportBinary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReportBinary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReportBinary(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReportText() != null) {
            _hashCode += getReportText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCompanyReport_ResultType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCompanyReport_ResultType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service_Log");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Service_Log"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Service_LogType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportMimeType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "ReportMimeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xml.graydon.co.uk/GraydonUKCommonTypes", "MimeTypesType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportXML");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "ReportXML"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", ">GetCompanyReport_ResultType>ReportXML"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportBinary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "ReportBinary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "ReportText"));
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
