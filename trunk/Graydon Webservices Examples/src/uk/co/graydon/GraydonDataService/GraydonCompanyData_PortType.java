/**
 * GraydonCompanyData_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.co.graydon.GraydonDataService;

public interface GraydonCompanyData_PortType extends java.rmi.Remote {

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
    public uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatches_ResultType getCompanyMatchesByIdentifier(uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatchesByIdentifier_ParametersType parameters) throws java.rmi.RemoteException, uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType;

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
    public uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatches_ResultType getCompanyMatchesByName(uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatchesByName_ParametersType parameters) throws java.rmi.RemoteException, uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType;

    /**
     * Get a list of matches for a company by using the a company
     * name keyword and city/postcode  for the country being matched in.
     * Specify the 'Country' parameter within the 'CompanyMatches_Parameters',
     * also supply the 'Keyword', 'City' and 'PostCode' parameter (Last two
     * elements are optional).
     * Determine which identifier should be suDetermine which search method
     * is available and which of these is the best using the 'getCompanyMatchMethods',
     * the response will give you an array of available match methods.
     * The response is an array of 'Company' elements within the 'CompanyMatches'
     * element, this has all the information on the matched company held
     * in many elements.
     * If no companies are found to match the given search criteria a 'graydonComanyData_Fault'
     * is thrown containing appropriate error information.
     */
    public uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatches_ResultType getCompanyMatchesByKeyword(uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatchesByKeyword_ParametersType parameters) throws java.rmi.RemoteException, uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType;

    /**
     * Get the list of products and their availability for a subject
     * company. Provide the 'CompanyMatchIdentifier' parameter (This is provided
     * on each company match).
     * The subject company should be identified via a matching operation
     * prior to this operations use.
     */
    public uk.co.graydon.ws.GraydonDataService.types.GetCompanyProducts_ResultType getCompanyProducts(uk.co.graydon.ws.GraydonDataService.types.GetCompanyProducts_ParametersType parameters) throws java.rmi.RemoteException, uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType;

    /**
     * Get the report for your subject company. Provide the 'OrderReference'
     * parameter which was returned when the 'placeOrder' operation was performed.
     * You can only get a company report once the originating order's state
     * is either 'Completed', 'CompletedwithUpdate' or 'Delivered'.
     * Determine the order's state using the 'checkOrders' operation. 
     * The 'MimeType' parameter determines which of these are populated with
     * the report 'ReportXML', 'ReportBinary' and 'ReportText'.
     */
    public uk.co.graydon.ws.GraydonDataService.types.GetCompanyReport_ResultType getCompanyReport(uk.co.graydon.ws.GraydonDataService.types.GetCompanyReport_ParametersType parameters) throws java.rmi.RemoteException, uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType;

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
    public uk.co.graydon.ws.GraydonDataService.types.PlaceOrder_ResultType placeOrder(uk.co.graydon.ws.GraydonDataService.types.PlaceOrder_ParametersType parameters) throws java.rmi.RemoteException, uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType;

    /**
     * Get the availability of products and services for a single
     * or all countries. Provide the 'Country' parameter when a single country
     * is desired.
     * The response contains a single or multiple 'CountryAndProduct' elements
     * which inturn cotains the 'Country' and multiple 'Product' elements
     * with the relevant details.
     */
    public uk.co.graydon.ws.GraydonDataService.types.GetCountryAvailability_ResultType getCountryAvailability(uk.co.graydon.ws.GraydonDataService.types.GetCountryAvailability_ParametersType parameters) throws java.rmi.RemoteException, uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType;

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
    public uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatches_ResultType getCompanyMatchesByPostCode(uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatchesByPostCode_ParametersType parameters) throws java.rmi.RemoteException, uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType;

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
    public uk.co.graydon.ws.GraydonDataService.types.Ping_ResultType ping(uk.co.graydon.ws.GraydonDataService.types.Ping_ParametersType parameters) throws java.rmi.RemoteException, uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType;

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
    public uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatchIdentifiers_ResultType getCompanyMatchIdentifiers(uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatchIdentifiers_ParametersType parameters) throws java.rmi.RemoteException, uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType;

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
    public uk.co.graydon.ws.GraydonDataService.types.CheckOrders_ResultType checkOrders(uk.co.graydon.ws.GraydonDataService.types.CheckOrders_ParametersType parameters) throws java.rmi.RemoteException, uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType;

    /**
     * Get the demonstration companies available for a single or all
     * countries. Provide the 'Country' parameter when a single country is
     * desired.
     * The response contains a single or multiple 'Company' elements which
     * icontains the relevant details for the demonstration company.
     */
    public uk.co.graydon.ws.GraydonDataService.types.GetDemoCompanies_ResultType getDemoCompanies(uk.co.graydon.ws.GraydonDataService.types.GetDemoCompanies_ParametersType parameters) throws java.rmi.RemoteException, uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType;

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
    public uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatchMethods_ResultType getCompanyMatchMethods(uk.co.graydon.ws.GraydonDataService.types.GetCompanyMatchMethods_ParametersType parameters) throws java.rmi.RemoteException, uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType;

    /**
     * Get the available Graydon XSL stylesheets for a particular
     * country.
     * The stylesheets can be used to transform Graydon XML into HTML and
     * are useful for determining how the GraydonCompanySchema is structured.
     */
    public uk.co.graydon.ws.GraydonDataService.types.GetCountryStylesheets_ResultType getCountryStylesheets(uk.co.graydon.ws.GraydonDataService.types.GetCountryStylesheet_ParametersType parameters) throws java.rmi.RemoteException, uk.co.graydon.ws.GraydonDataService.types.GraydonCompanyData_FaultType;
}
