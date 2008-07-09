/**
 * GraydonCompanyDataLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.co.graydon.GraydonDataService;

public class GraydonCompanyDataLocator extends org.apache.axis.client.Service implements uk.co.graydon.GraydonDataService.GraydonCompanyData {

/**
 * Graydon Company Data Webservice. Provides access to millions of
 * companies across many countries.
 */

    public GraydonCompanyDataLocator() {
    }


    public GraydonCompanyDataLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GraydonCompanyDataLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SOAPPort
    private java.lang.String SOAPPort_address = "https://www.webservices.graydon.co.uk:443/CompanyData_webservice/services/SOAPPort";
    //private java.lang.String SOAPPort_address = "http://test.webservices.graydon.co.uk/CompanyData_webservice/services/SOAPPort";
    //private java.lang.String SOAPPort_address = "http://localhost:9080/CompanyData_webservice/services/SOAPPort";

    public java.lang.String getSOAPPortAddress() {
        return SOAPPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SOAPPortWSDDServiceName = "SOAPPort";

    public java.lang.String getSOAPPortWSDDServiceName() {
        return SOAPPortWSDDServiceName;
    }

    public void setSOAPPortWSDDServiceName(java.lang.String name) {
        SOAPPortWSDDServiceName = name;
    }

    public uk.co.graydon.GraydonDataService.GraydonCompanyData_PortType getSOAPPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SOAPPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSOAPPort(endpoint);
    }

    public uk.co.graydon.GraydonDataService.GraydonCompanyData_PortType getSOAPPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            uk.co.graydon.GraydonDataService.GraydonCompanyData_BindingStub _stub = new uk.co.graydon.GraydonDataService.GraydonCompanyData_BindingStub(portAddress, this);
            _stub.setPortName(getSOAPPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSOAPPortEndpointAddress(java.lang.String address) {
        SOAPPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (uk.co.graydon.GraydonDataService.GraydonCompanyData_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                uk.co.graydon.GraydonDataService.GraydonCompanyData_BindingStub _stub = new uk.co.graydon.GraydonDataService.GraydonCompanyData_BindingStub(new java.net.URL(SOAPPort_address), this);
                _stub.setPortName(getSOAPPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("SOAPPort".equals(inputPortName)) {
            return getSOAPPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://graydon.co.uk/GraydonDataService/", "GraydonCompanyData");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://graydon.co.uk/GraydonDataService/", "SOAPPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SOAPPort".equals(portName)) {
            setSOAPPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
