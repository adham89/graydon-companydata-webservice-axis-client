/**
 * GraydonCompanyData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.co.graydon.GraydonDataService;

public interface GraydonCompanyData extends javax.xml.rpc.Service {

/**
 * Graydon Company Data Webservice. Provides access to millions of
 * companies across many countries.
 */
    public java.lang.String getSOAPPortAddress();

    public uk.co.graydon.GraydonDataService.GraydonCompanyData_PortType getSOAPPort() throws javax.xml.rpc.ServiceException;

    public uk.co.graydon.GraydonDataService.GraydonCompanyData_PortType getSOAPPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
