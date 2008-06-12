/**
 * GraydonCompanyData_BindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.co.graydon.GraydonDataService;

public class GraydonCompanyData_BindingStub extends org.apache.axis.client.Stub implements uk.co.graydon.GraydonDataService.GraydonCompanyData_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[14];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCompanyMatchesByIdentifier");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCompanyMatchesByIdentifier_Parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCompanyMatchesByIdentifier_ParametersType"), uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatchesByIdentifier_ParametersType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCompanyMatches_ResultType"));
        oper.setReturnClass(uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatches_ResultType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCompanyMatches_Result"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GraydonCompanyData_Fault"),
                      "uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType",
                      new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GraydonCompanyData_FaultType"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCompanyMatchesByName");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCompanyMatchesByName_Parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCompanyMatchesByName_ParametersType"), uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatchesByName_ParametersType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCompanyMatches_ResultType"));
        oper.setReturnClass(uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatches_ResultType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCompanyMatches_Result"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GraydonCompanyData_Fault"),
                      "uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType",
                      new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GraydonCompanyData_FaultType"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCompanyMatchesByKeyword");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCompanyMatchesByKeyword_Parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCompanyMatchesByKeyword_ParametersType"), uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatchesByKeyword_ParametersType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCompanyMatches_ResultType"));
        oper.setReturnClass(uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatches_ResultType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCompanyMatches_Result"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GraydonCompanyData_Fault"),
                      "uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType",
                      new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GraydonCompanyData_FaultType"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCompanyProducts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCompanyProducts_Parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCompanyProducts_ParametersType"), uk.co.graydon.ws.GraydonDataService.types.GetCompanyProducts_ParametersType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCompanyProducts_ResultType"));
        oper.setReturnClass(uk.co.graydon.ws.GraydonDataService.types.GetCompanyProducts_ResultType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCompanyProducts_Result"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GraydonCompanyData_Fault"),
                      "uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType",
                      new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GraydonCompanyData_FaultType"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCompanyReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCompanyReport_Parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCompanyReport_ParametersType"), uk.co.graydon.ws.GraydonDataService.types.GetCompanyReport_ParametersType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCompanyReport_ResultType"));
        oper.setReturnClass(uk.co.graydon.ws.GraydonDataService.types.GetCompanyReport_ResultType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCompanyReport_Result"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GraydonCompanyData_Fault"),
                      "uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType",
                      new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GraydonCompanyData_FaultType"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("placeOrder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "PlaceOrder_Parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "PlaceOrder_ParametersType"), uk.co.graydon.ws.GraydonDataService.types.PlaceOrder_ParametersType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "PlaceOrder_ResultType"));
        oper.setReturnClass(uk.co.graydon.ws.GraydonDataService.types.PlaceOrder_ResultType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "PlaceOrder_Result"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GraydonCompanyData_Fault"),
                      "uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType",
                      new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GraydonCompanyData_FaultType"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCountryAvailability");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCountryAvailability_Parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCountryAvailability_ParametersType"), uk.co.graydon.ws.GraydonDataService.types.GetCountryAvailability_ParametersType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCountryAvailability_ResultType"));
        oper.setReturnClass(uk.co.graydon.ws.GraydonDataService.types.GetCountryAvailability_ResultType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCountryAvailability_Result"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GraydonCompanyData_Fault"),
                      "uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType",
                      new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GraydonCompanyData_FaultType"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCompanyMatchesByPostCode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCompanyMatchesByPostCode_Parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCompanyMatchesByPostCode_ParametersType"), uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatchesByPostCode_ParametersType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCompanyMatches_ResultType"));
        oper.setReturnClass(uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatches_ResultType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCompanyMatches_Result"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GraydonCompanyData_Fault"),
                      "uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType",
                      new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GraydonCompanyData_FaultType"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ping");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Ping_Parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Ping_ParametersType"), uk.co.graydon.ws.GraydonDataService.types.Ping_ParametersType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Ping_ResultType"));
        oper.setReturnClass(uk.co.graydon.ws.GraydonDataService.types.Ping_ResultType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Ping_Result"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GraydonCompanyData_Fault"),
                      "uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType",
                      new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GraydonCompanyData_FaultType"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCompanyMatchIdentifiers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCompanyMatchIdentifiers_Parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCompanyMatchIdentifiers_ParametersType"), uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatchIdentifiers_ParametersType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCompanyMatchIdentifiers_ResultType"));
        oper.setReturnClass(uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatchIdentifiers_ResultType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCompanyMatchIdentifiers_Result"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GraydonCompanyData_Fault"),
                      "uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType",
                      new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GraydonCompanyData_FaultType"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("checkOrders");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "CheckOrders_Parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "CheckOrders_ParametersType"), uk.co.graydon.ws.GraydonDataService.types.CheckOrders_ParametersType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "CheckOrders_ResultType"));
        oper.setReturnClass(uk.co.graydon.ws.GraydonDataService.types.CheckOrders_ResultType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "CheckOrders_Result"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GraydonCompanyData_Fault"),
                      "uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType",
                      new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GraydonCompanyData_FaultType"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDemoCompanies");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetDemoCompanies_Parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetDemoCompanies_ParametersType"), uk.co.graydon.ws.GraydonDataService.types.GetDemoCompanies_ParametersType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetDemoCompanies_ResultType"));
        oper.setReturnClass(uk.co.graydon.ws.GraydonDataService.types.GetDemoCompanies_ResultType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetDemoCompanies_Result"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GraydonCompanyData_Fault"),
                      "uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType",
                      new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GraydonCompanyData_FaultType"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCompanyMatchMethods");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCompanyMatchMethods_Parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCompanyMatchMethods_ParametersType"), uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatchMethods_ParametersType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCompanyMatchMethods_ResultType"));
        oper.setReturnClass(uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatchMethods_ResultType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCompanyMatchMethods_Result"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GraydonCompanyData_Fault"),
                      "uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType",
                      new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GraydonCompanyData_FaultType"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCountryStylesheets");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCountryStylesheet_Parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCountryStylesheet_ParametersType"), uk.co.graydon.ws.GraydonDataService.types.GetCountryStylesheet_ParametersType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCountryStylesheets_ResultType"));
        oper.setReturnClass(uk.co.graydon.ws.GraydonDataService.types.GetCountryStylesheets_ResultType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCountryStylesheets_Result"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GraydonCompanyData_Fault"),
                      "uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType",
                      new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GraydonCompanyData_FaultType"), 
                      true
                     ));
        _operations[13] = oper;

    }

    public GraydonCompanyData_BindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public GraydonCompanyData_BindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public GraydonCompanyData_BindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", ">GetCompanyReport_ResultType>ReportXML");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.GetCompanyReport_ResultTypeReportXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", ">GetCountryStylesheets_ResultType>CountryStylesheets");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.GetCountryStylesheets_ResultTypeCountryStylesheets.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "ActivityType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.ActivityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "ArrayOfActivityType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.ActivityType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "ActivityType");
            qName2 = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Activity");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "ArrayOfAnyType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.ArrayOfAnyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "ArrayOfCompanyIdentifierType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.CompanyIdentifierType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "CompanyIdentifierType");
            qName2 = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "CompanyIdentifier");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "ArrayOfCompanyMatchIdentifierType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.CompanyMatchIdentifierType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "CompanyMatchIdentifierType");
            qName2 = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "CompanyMatchIdentifier");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "ArrayOfCompanyMatchMethodType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.CompanyMatchedMethodType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "CompanyMatchedMethodType");
            qName2 = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "CompanyMatchMethod");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "ArrayOfCompanyType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.CompanyType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "CompanyType");
            qName2 = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Company");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "ArrayOfCountryAndCompanyType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.CountryAndCompanyType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "CountryAndCompanyType");
            qName2 = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "CountryAndCompany");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "ArrayOfCountryAndProductType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.CountryAndProductType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "CountryAndProductType");
            qName2 = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "CountryAndProduct");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "ArrayOfMatchMethodType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.MatchMethodType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "MatchMethodType");
            qName2 = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "MatchMethod");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "ArrayOfMimeTypeType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.xml.GraydonUKCommonTypes.MimeTypesType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xml.graydon.co.uk/GraydonUKCommonTypes", "MimeTypesType");
            qName2 = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "MimeType");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "ArrayOfOrderStatusType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.OrderStatusType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "OrderStatusType");
            qName2 = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "OrderStatus");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "ArrayOfPartnerelementType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.PartnerElementType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "PartnerElementType");
            qName2 = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "PartnerElement");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "ArrayOfProductStylesheetType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.ProductStylesheetType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "ProductStylesheetType");
            qName2 = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "ProductStylesheet");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "ArrayOfProductType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.ProductType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "ProductType");
            qName2 = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Product");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Authentication_ParametersType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.Authentication_ParametersType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "CheckOrders_ParametersType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.CheckOrders_ParametersType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "CheckOrders_ResultType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.CheckOrders_ResultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "ClientReferenceType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "CompanyIdentifierType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.CompanyIdentifierType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "CompanyMatchedMethodType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.CompanyMatchedMethodType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "CompanyMatches_ParametersType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.CompanyMatches_ParametersType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "CompanyMatchIdentifierType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.CompanyMatchIdentifierType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "CompanyType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.CompanyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "CountryAndCompanyType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.CountryAndCompanyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "CountryAndProductType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.CountryAndProductType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "FaultTypeType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.FaultTypeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCompanyMatches_ResultType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatches_ResultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCompanyMatchesByIdentifier_ParametersType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatchesByIdentifier_ParametersType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCompanyMatchesByKeyword_ParametersType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatchesByKeyword_ParametersType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCompanyMatchesByName_ParametersType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatchesByName_ParametersType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCompanyMatchesByPostCode_ParametersType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatchesByPostCode_ParametersType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCompanyMatchIdentifiers_ParametersType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatchIdentifiers_ParametersType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCompanyMatchIdentifiers_ResultType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatchIdentifiers_ResultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCompanyMatchMethods_ParametersType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatchMethods_ParametersType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCompanyMatchMethods_ResultType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatchMethods_ResultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCompanyProducts_ParametersType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.GetCompanyProducts_ParametersType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCompanyProducts_ResultType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.GetCompanyProducts_ResultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCompanyReport_ParametersType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.GetCompanyReport_ParametersType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCompanyReport_ResultType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.GetCompanyReport_ResultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCountryAvailability_ParametersType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.GetCountryAvailability_ParametersType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCountryAvailability_ResultType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.GetCountryAvailability_ResultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCountryStylesheet_ParametersType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.GetCountryStylesheet_ParametersType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetCountryStylesheets_ResultType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.GetCountryStylesheets_ResultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetDemoCompanies_ParametersType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.GetDemoCompanies_ParametersType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GetDemoCompanies_ResultType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.GetDemoCompanies_ResultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "GraydonCompanyData_FaultType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "InternalIdentifierType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "KeywordType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "LegalFormType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.LegalFormType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "MatchingMethodType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.MatchingMethodType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "MatchMethodType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.MatchMethodType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "OrderStateType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.OrderStateType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "OrderStatusType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.OrderStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "OrderType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.OrderType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "PartnerClientIdType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "PartnerElementFormatType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.PartnerElementFormatType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "PartnerElementType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.PartnerElementType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "PartnerPasswordType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "PartnerUserIdType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Ping_ParametersType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.Ping_ParametersType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Ping_ResultType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.Ping_ResultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "PingStateType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.PingStateType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "PingType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.PingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "PlaceOrder_ParametersType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.PlaceOrder_ParametersType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "PlaceOrder_ResultType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.PlaceOrder_ResultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "ProductStylesheetType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.ProductStylesheetType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "ProductType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.ProductType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "ProductTypeType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.ProductTypeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "ReportDeliveryType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.ReportDeliveryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "Service_LogType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.Service_LogType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "ServiceSpeedType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.ServiceSpeedType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "SessionIDType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "TimeStampType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.ws.GraydonDataService.types.TimeStampType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.graydon.co.uk/GraydonDataService/types", "TransactionIdentifierType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xml.graydon.co.uk/GraydonUKCommonTypes", "ActivityTypesType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.xml.GraydonUKCommonTypes.ActivityTypesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xml.graydon.co.uk/GraydonUKCommonTypes", "AddressType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.xml.GraydonUKCommonTypes.AddressType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xml.graydon.co.uk/GraydonUKCommonTypes", "CityType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xml.graydon.co.uk/GraydonUKCommonTypes", "CommunicationType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xml.graydon.co.uk/GraydonUKCommonTypes", "CommunicationTypesType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.xml.GraydonUKCommonTypes.CommunicationTypesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xml.graydon.co.uk/GraydonUKCommonTypes", "CompanyIdType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xml.graydon.co.uk/GraydonUKCommonTypes", "CompanyIdTypesType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.xml.GraydonUKCommonTypes.CompanyIdTypesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xml.graydon.co.uk/GraydonUKCommonTypes", "CompanyNameType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xml.graydon.co.uk/GraydonUKCommonTypes", "CompanyTypesType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.xml.GraydonUKCommonTypes.CompanyTypesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xml.graydon.co.uk/GraydonUKCommonTypes", "CountryDialCodeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xml.graydon.co.uk/GraydonUKCommonTypes", "CountryISOCodeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xml.graydon.co.uk/GraydonUKCommonTypes", "CountryType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xml.graydon.co.uk/GraydonUKCommonTypes", "Credit_RatingTypesType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.xml.GraydonUKCommonTypes.Credit_RatingTypesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xml.graydon.co.uk/GraydonUKCommonTypes", "CurrencyDescriptionType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.xml.GraydonUKCommonTypes.CurrencyDescriptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xml.graydon.co.uk/GraydonUKCommonTypes", "CurrencyType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.xml.GraydonUKCommonTypes.CurrencyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xml.graydon.co.uk/GraydonUKCommonTypes", "DateFormatType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.xml.GraydonUKCommonTypes.DateFormatType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xml.graydon.co.uk/GraydonUKCommonTypes", "DateTypesType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.xml.GraydonUKCommonTypes.DateTypesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xml.graydon.co.uk/GraydonUKCommonTypes", "DirectorsTypesType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.xml.GraydonUKCommonTypes.DirectorsTypesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xml.graydon.co.uk/GraydonUKCommonTypes", "EmployeesTypesType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.xml.GraydonUKCommonTypes.EmployeesTypesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xml.graydon.co.uk/GraydonUKCommonTypes", "FreeTextTypesType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.xml.GraydonUKCommonTypes.FreeTextTypesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xml.graydon.co.uk/GraydonUKCommonTypes", "LanguageCodesType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.xml.GraydonUKCommonTypes.LanguageCodesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xml.graydon.co.uk/GraydonUKCommonTypes", "MimeTypesType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.xml.GraydonUKCommonTypes.MimeTypesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xml.graydon.co.uk/GraydonUKCommonTypes", "NameTypesType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://xml.graydon.co.uk/GraydonUKCommonTypes", "OrderReferenceType");
            cachedSerQNames.add(qName);
            cls = int.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xml.graydon.co.uk/GraydonUKCommonTypes", "PostCodeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xml.graydon.co.uk/GraydonUKCommonTypes", "ProductCode");
            cachedSerQNames.add(qName);
            cls = int.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xml.graydon.co.uk/GraydonUKCommonTypes", "TaxonomyTypesType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xml.graydon.co.uk/GraydonUKCommonTypes", "TimeTypesType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.xml.GraydonUKCommonTypes.TimeTypesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xml.graydon.co.uk/GraydonUKCommonTypes", "TitleTypesType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.xml.GraydonUKCommonTypes.TitleTypesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xml.graydon.co.uk/GraydonUKCommonTypes", "UnitsTypesType");
            cachedSerQNames.add(qName);
            cls = uk.co.graydon.xml.GraydonUKCommonTypes.UnitsTypesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }


    /**
     * Get a match for a company by using the appropriate identifier
     * for the country being matched in. Specify the 'Country' parameter
     * within the 'CompanyMatches_Parameters', also supply the 'CompanyIdentifier'
     * parameter.
     * Determine which identifier should be supplied by using the 'getCompanyMatchIdentifiers'
     * operation beforehand, this response with the identifier type used
     * to search in the desired country.
     * Determine which search method is available and which of these is the
     * best using the 'getCompanyMatchMethods', the response will give you
     * an array of available match methods.
     * The response is a single 'Company' element within the 'CompanyMatches'
     * element, this has all the information on the matched company held
     * in many elements.
     * If no companies are found to match the given search criteria a 'graydonComanyData_Fault'
     * is thrown containing appropriate error information.
     */
    public uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatches_ResultType getCompanyMatchesByIdentifier(uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatchesByIdentifier_ParametersType parameters) throws java.rmi.RemoteException, uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://graydon.co.uk/CompanyData_web_service/getCompanyMatchesByIdentifier");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getCompanyMatchesByIdentifier"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatches_ResultType) _resp;
            } catch (java.lang.Exception _exception) {
                return (uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatches_ResultType) org.apache.axis.utils.JavaUtils.convert(_resp, uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatches_ResultType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType) {
              throw (uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Get a list of matches for a company by using the company name
     * and city for the country being matched in. Specify the 'Country' parameter
     * within the 'CompanyMatches_Parameters', also supply the 'Name', 'City'
     * parameter (The last element is optional).
     * Determine which search method is available and which of these is the
     * best using the 'getCompanyMatchMethods', the response will give you
     * an array of available match methods.
     * The response is an array of 'Company' elements within the 'CompanyMatches'
     * element, this has all the information on the matched company held
     * in many elements.
     * If no companies are found to match the given search criteria a 'graydonComanyData_Fault'
     * is thrown containing appropriate error information.
     */
    public uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatches_ResultType getCompanyMatchesByName(uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatchesByName_ParametersType parameters) throws java.rmi.RemoteException, uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://graydon.co.uk/CompanyData_web_service/getCompanyMatchesByName");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getCompanyMatchesByName"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatches_ResultType) _resp;
            } catch (java.lang.Exception _exception) {
                return (uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatches_ResultType) org.apache.axis.utils.JavaUtils.convert(_resp, uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatches_ResultType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType) {
              throw (uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Get a list of matches for a company by using the a company
     * name keyword and city/postcode for the country being matched in. Specify
     * the 'Country' parameter within the 'CompanyMatches_Parameters', also
     * supply the 'Keyword', 'City' and 'PostCode' parameter (Last two elements
     * are optional).
     * Determine which search method is available and which of these is the
     * best using the 'getCompanyMatchMethods', the response will give you
     * an array of available match methods.
     * The response is an array of 'Company' elements within the 'CompanyMatches'
     * element, this has all the information on the matched company held
     * in many elements.
     * If no companies are found to match the given search criteria a 'graydonComanyData_Fault'
     * is thrown containing appropriate error information.
     */
    public uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatches_ResultType getCompanyMatchesByKeyword(uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatchesByKeyword_ParametersType parameters) throws java.rmi.RemoteException, uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://graydon.co.uk/CompanyData_web_service/getCompanyMatchesByKeyword");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getCompanyMatchesByKeyword"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatches_ResultType) _resp;
            } catch (java.lang.Exception _exception) {
                return (uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatches_ResultType) org.apache.axis.utils.JavaUtils.convert(_resp, uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatches_ResultType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType) {
              throw (uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Get the list of products and their availability for a subject
     * company. Provide the 'CompanyMatchIdentifier' parameter (This is provided
     * on each company match).
     * The subject company should be identified via a matching operation
     * prior to this operations use.
     */
    public uk.co.graydon.ws.GraydonDataService.types.GetCompanyProducts_ResultType getCompanyProducts(uk.co.graydon.ws.GraydonDataService.types.GetCompanyProducts_ParametersType parameters) throws java.rmi.RemoteException, uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://graydon.co.uk/CompanyData_web_service/getCompanyProducts");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getCompanyProducts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uk.co.graydon.ws.GraydonDataService.types.GetCompanyProducts_ResultType) _resp;
            } catch (java.lang.Exception _exception) {
                return (uk.co.graydon.ws.GraydonDataService.types.GetCompanyProducts_ResultType) org.apache.axis.utils.JavaUtils.convert(_resp, uk.co.graydon.ws.GraydonDataService.types.GetCompanyProducts_ResultType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType) {
              throw (uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Get the report for your subject company. Provide the 'OrderReference'
     * parameter which was returned when the 'placeOrder' operation was performed.
     * You can only get a company report once the originating order's state
     * is either 'Completed', 'CompletedwithUpdate' or 'Delivered'.
     * Determine the order's state using the 'checkOrders' operation. 
     * The 'MimeType' parameter determines which of these are populated with
     * the report 'ReportXML', 'ReportBinary' and 'ReportText'.
     */
    public uk.co.graydon.ws.GraydonDataService.types.GetCompanyReport_ResultType getCompanyReport(uk.co.graydon.ws.GraydonDataService.types.GetCompanyReport_ParametersType parameters) throws java.rmi.RemoteException, uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://graydon.co.uk/CompanyData_web_service/getCompanyReport");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getCompanyReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uk.co.graydon.ws.GraydonDataService.types.GetCompanyReport_ResultType) _resp;
            } catch (java.lang.Exception _exception) {
                return (uk.co.graydon.ws.GraydonDataService.types.GetCompanyReport_ResultType) org.apache.axis.utils.JavaUtils.convert(_resp, uk.co.graydon.ws.GraydonDataService.types.GetCompanyReport_ResultType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType) {
              throw (uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Place an order for a report on the subject company. Provide
     * the 'CompanyProductIdentifier' parameter returned from the 'getCompanyProducts'.
     * The subject company should be have it's product availability checked
     * prior to this operations use.
     * The response contains a unique 'OrderReference' is returned, to be
     * later used to get the report.
     * It also the 'OrderState' within the 'OrderStatus' element, use this
     * to determine if the 'getReport' operation can be performed for the
     * order.
     */
    public uk.co.graydon.ws.GraydonDataService.types.PlaceOrder_ResultType placeOrder(uk.co.graydon.ws.GraydonDataService.types.PlaceOrder_ParametersType parameters) throws java.rmi.RemoteException, uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://graydon.co.uk/CompanyData_web_service/placeOrder");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "placeOrder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uk.co.graydon.ws.GraydonDataService.types.PlaceOrder_ResultType) _resp;
            } catch (java.lang.Exception _exception) {
                return (uk.co.graydon.ws.GraydonDataService.types.PlaceOrder_ResultType) org.apache.axis.utils.JavaUtils.convert(_resp, uk.co.graydon.ws.GraydonDataService.types.PlaceOrder_ResultType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType) {
              throw (uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Get the availability of products and services for a single
     * or all countries. Provide the 'Country' parameter when a single country
     * is desired.
     * The response contains a single or multiple 'CountryAndProduct' elements
     * which inturn cotains the 'Country' and multiple 'Product' elements
     * with the relevant details.
     */
    public uk.co.graydon.ws.GraydonDataService.types.GetCountryAvailability_ResultType getCountryAvailability(uk.co.graydon.ws.GraydonDataService.types.GetCountryAvailability_ParametersType parameters) throws java.rmi.RemoteException, uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://graydon.co.uk/CompanyData_web_service/getCountryAvailability");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getCountryAvailability"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uk.co.graydon.ws.GraydonDataService.types.GetCountryAvailability_ResultType) _resp;
            } catch (java.lang.Exception _exception) {
                return (uk.co.graydon.ws.GraydonDataService.types.GetCountryAvailability_ResultType) org.apache.axis.utils.JavaUtils.convert(_resp, uk.co.graydon.ws.GraydonDataService.types.GetCountryAvailability_ResultType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType) {
              throw (uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Get a list of matches for a company by using the company's
     * postcode for the country being matched in. Specify the 'Country' parameter
     * within the 'CompanyMatches_Parameters', also supply the 'Name', 'City'
     * parameter (The last element is optional).
     * Determine which search method is available and which of these is the
     * best using the 'getCompanyMatchMethods', the response will give you
     * an array of available match methods.
     * The response is an array of 'Company' elements within the 'CompanyMatches'
     * element, this has all the information on the matched company held
     * in many elements.
     * If no companies are found to match the given search criteria a 'graydonComanyData_Fault'
     * is thrown containing appropriate error information.
     */
    public uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatches_ResultType getCompanyMatchesByPostCode(uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatchesByPostCode_ParametersType parameters) throws java.rmi.RemoteException, uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://graydon.co.uk/CompanyData_web_service/getCompanyMatchesByPostCode");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getCompanyMatchesByPostCode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatches_ResultType) _resp;
            } catch (java.lang.Exception _exception) {
                return (uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatches_ResultType) org.apache.axis.utils.JavaUtils.convert(_resp, uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatches_ResultType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType) {
              throw (uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * This operation can be performed in using two methods "basic"
     * or "complete", as specified in the "PingMethod" parameter for the
     * operation. 
     * The "basic" method is simply to confirm that the 'GraydonCompanyData'
     * web service is available. This could be used to log supposed availability
     * of the service on a periodic basis.
     * The "complete" method actually performs a check on backend servers
     * and is therefore more comprehensive. You could use this before performing
     * a periodic batch operation, to determine whether it should be run.
     */
    public uk.co.graydon.ws.GraydonDataService.types.Ping_ResultType ping(uk.co.graydon.ws.GraydonDataService.types.Ping_ParametersType parameters) throws java.rmi.RemoteException, uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://graydon.co.uk/CompanyData_web_service/ping");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ping"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uk.co.graydon.ws.GraydonDataService.types.Ping_ResultType) _resp;
            } catch (java.lang.Exception _exception) {
                return (uk.co.graydon.ws.GraydonDataService.types.Ping_ResultType) org.apache.axis.utils.JavaUtils.convert(_resp, uk.co.graydon.ws.GraydonDataService.types.Ping_ResultType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType) {
              throw (uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Get a list of company identifiers for a single or all country.
     * Provide the 'Country' parameter to request identifiers for a single
     * country.
     * Use this to determine which type of identifier can be used with the
     * 'getCompanyMatchesByIdentifier' method.
     * The response contains an array of 'CompanyMatchIdentifier', each containing
     * the related 'Country' and the 'CompanyIdentifier' element holding
     * the 'Type' for that country.
     */
    public uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatchIdentifiers_ResultType getCompanyMatchIdentifiers(uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatchIdentifiers_ParametersType parameters) throws java.rmi.RemoteException, uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://graydon.co.uk/CompanyData_web_service/getCompanyMatchIdentifiers");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getCompanyMatchIdentifiers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatchIdentifiers_ResultType) _resp;
            } catch (java.lang.Exception _exception) {
                return (uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatchIdentifiers_ResultType) org.apache.axis.utils.JavaUtils.convert(_resp, uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatchIdentifiers_ResultType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType) {
              throw (uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Check the status and detail of a single or all order history
     * within a given period. The period can be specified using the 'DateFrom'
     * 'DateTo' parameters, along with the type of order state you wish returned
     * using the 'OrderState' parameter.
     * A single order can be checked using just the 'OrderReference' parameter.
     * The response	will contains the 'OrdersStatus' element which in turn
     * holds one ore more 'OrderStatus' elements. This will have all the
     * information relating to the order including it's unique 'OrderReference'
     * element. 
     * This can be used to retrieve the related report if the order state
     * is 'completed'.
     * The maximum number of 'OrderStatus' elements returned is 250.
     */
    public uk.co.graydon.ws.GraydonDataService.types.CheckOrders_ResultType checkOrders(uk.co.graydon.ws.GraydonDataService.types.CheckOrders_ParametersType parameters) throws java.rmi.RemoteException, uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://graydon.co.uk/CompanyData_web_service/checkOrders");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "checkOrders"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uk.co.graydon.ws.GraydonDataService.types.CheckOrders_ResultType) _resp;
            } catch (java.lang.Exception _exception) {
                return (uk.co.graydon.ws.GraydonDataService.types.CheckOrders_ResultType) org.apache.axis.utils.JavaUtils.convert(_resp, uk.co.graydon.ws.GraydonDataService.types.CheckOrders_ResultType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType) {
              throw (uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Get the demonstration companies available for a single or all
     * countries. Provide the 'Country' parameter when a single country is
     * desired.
     * The response contains a single or multiple 'Company' elements which
     * icontains the relevant details for the demonstration company.
     */
    public uk.co.graydon.ws.GraydonDataService.types.GetDemoCompanies_ResultType getDemoCompanies(uk.co.graydon.ws.GraydonDataService.types.GetDemoCompanies_ParametersType parameters) throws java.rmi.RemoteException, uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://graydon.co.uk/CompanyData_web_service/getDemoCompanies");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getDemoCompanies"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uk.co.graydon.ws.GraydonDataService.types.GetDemoCompanies_ResultType) _resp;
            } catch (java.lang.Exception _exception) {
                return (uk.co.graydon.ws.GraydonDataService.types.GetDemoCompanies_ResultType) org.apache.axis.utils.JavaUtils.convert(_resp, uk.co.graydon.ws.GraydonDataService.types.GetDemoCompanies_ResultType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType) {
              throw (uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Get the available matching methods for a single or all countries.
     * Provide the 'Country' parameter if you want methods for a single country
     * and not all.
     * This helps determine the best search method to implement per country
     * and the availability of additional search criteria such as 'City'.
     * The response is a single or array of 'CompanyMatchMethods' each contains
     * the related country and an array of available 'MatchMethod' elements.
     * 
     * The order of the 'MatchMethods' elements determines order of preference
     * for searching in that country.
     */
    public uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatchMethods_ResultType getCompanyMatchMethods(uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatchMethods_ParametersType parameters) throws java.rmi.RemoteException, uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://graydon.co.uk/CompanyData_web_service/getCompanyMatchMethods");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getCompanyMatchMethods"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatchMethods_ResultType) _resp;
            } catch (java.lang.Exception _exception) {
                return (uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatchMethods_ResultType) org.apache.axis.utils.JavaUtils.convert(_resp, uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatchMethods_ResultType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType) {
              throw (uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public uk.co.graydon.ws.GraydonDataService.types.GetCountryStylesheets_ResultType getCountryStylesheets(uk.co.graydon.ws.GraydonDataService.types.GetCountryStylesheet_ParametersType parameters) throws java.rmi.RemoteException, uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://graydon.co.uk/CompanyData_web_service/getCountryStylesheets");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getCountryStylesheets"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uk.co.graydon.ws.GraydonDataService.types.GetCountryStylesheets_ResultType) _resp;
            } catch (java.lang.Exception _exception) {
                return (uk.co.graydon.ws.GraydonDataService.types.GetCountryStylesheets_ResultType) org.apache.axis.utils.JavaUtils.convert(_resp, uk.co.graydon.ws.GraydonDataService.types.GetCountryStylesheets_ResultType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType) {
              throw (uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
