/*
 * Created on 11-Jun-2008
 *
 * GraydonDataServices examples
 * 
 */
package uk.co.graydon.GraydonDataService.examples;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

import org.apache.axis.message.MessageElement;

import uk.co.graydon.GraydonDataService.*;
import uk.co.graydon.ws.GraydonDataService.types.*;
import uk.co.graydon.xml.GraydonUKCommonTypes.*;


/**
 * @author denisreilly
 *
 * Runnable axis 1.3 java client for Graydon Company Data Webservice
 * 
 * Operation : GetCompanyReport
 * 
 * Argument0 = Partner Userid
 * Argument1 = Partner Password
 * Argument2 = Order Reference 
 */
public class CompanyReport {
	
	private static SimpleDateFormat 	SIMPLE_DATE 				= new SimpleDateFormat("dd/MM/yyyy");
	private static TimeZone 			GMT 						= TimeZone.getTimeZone("GMT");

	public static void main(String[] args) 
	{
		
		try
		{
			String partnerUserid			= null;
			String partnerPassword			= null;
			String orderReference		 	= null;
			
			// set defaults
			SIMPLE_DATE.setTimeZone(GMT);
			
			// retrieve arguments
			if (args.length == 0)
				throw new Exception("Invalid arguments: Please specify match arguments");
			
			// populate match parameters with arguments
			partnerUserid 			= args[0].trim();
			partnerPassword 		= args[1].trim();
			orderReference		 	= args[2].trim();
			
			if (partnerUserid == null || partnerPassword == null || orderReference == null)
				throw new Exception("Invalid arguments: Please specify match arguments");
			
			// create an instance of the graydon webservice proxy
			GraydonCompanyData_BindingStub 	binding	= (GraydonCompanyData_BindingStub) new GraydonCompanyDataLocator().getSOAPPort();
			
			// Time out after a two minutes
			binding.setTimeout(120000);
			
			// create an instance of the authentication parameters
			Authentication_ParametersType authentication_parameters	= new Authentication_ParametersType();
			
			// set the partner userid and password
			authentication_parameters.setPartnerUserId(partnerUserid);
			authentication_parameters.setPartnerPassword(partnerPassword);
			
			// create an instance of the getCompanyReport_ParametersType
			GetCompanyReport_ParametersType  getCompanyReport_Parameters = new GetCompanyReport_ParametersType();
			getCompanyReport_Parameters.setOrderReference(Integer.parseInt(orderReference));				// set the order reference
			getCompanyReport_Parameters.setAuthentication_Parameters(authentication_parameters);			// set the authentication parameters
			getCompanyReport_Parameters.setLanguageCode(LanguageCodesType.E);								// set the language code
			getCompanyReport_Parameters.setMimeType(MimeTypesType.xml);										// set the mime type
			
			// perform the 'getCompanyReport' operation
			try
			{
				GetCompanyReport_ResultType getCompanyReport_Result = binding.getCompanyReport(getCompanyReport_Parameters);
				
				// output service log details
				if (getCompanyReport_Result.getService_Log() != null) 
					serviceLog(getCompanyReport_Result.getService_Log());
				
				// check if report have been populated
				if (getCompanyReport_Result.getReportXML() != null)
				{
					System.out.println("Report Response:");
					System.out.println("  Mime Type\t: " + getCompanyReport_Result.getReportMimeType());	
					
					// check the report mimetype
					if (getCompanyReport_Result.getReportMimeType() == MimeTypesType.xml)
					{
						StringBuffer xmlReport = new StringBuffer("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>");
						MessageElement SOAPElement[]		= getCompanyReport_Result.getReportXML().get_any();
						for (int i = 0; i < SOAPElement.length; i++) 
						{
							xmlReport.append(SOAPElement[i].getAsString());
						}
						System.out.println("Report :");
						System.out.println(xmlReport.toString());	
					}	
					
				}
			}
			catch (GraydonCompanyData_FaultType fault) // capture any faults
			{
				// check fault type
				if (fault.getFaultType() == FaultTypeType.Expected)
				{
					// check for no matches
					if (fault.getFaultReturnCode().equals("CWS5000"))
						System.err.println("My Message: " + "No matches where found for the name supplied");
				}
				
				System.out.println("Graydon Message: " + fault.getFaultMessage());
			}
		}
		catch (Exception e)
		{
			System.err.println("Exception : " + e);
		}
	}
	
	/**
	* Service log output
	*
	*/
	private static void serviceLog(Service_LogType service_Log)
	{
		System.out.println("Service_Log :");																	
		System.out.println("  PartnerUserId\t\t: " + service_Log.getPartnerUserId());												// output partner userid
		System.out.println("  SessionId\t\t: " + service_Log.getSessionID());														// output sessionId
		System.out.println("  Transaction Identifier: " + service_Log.getTransactionIdentifier());									// output transaction identifier
		System.out.println("  Request Date\t\t: " + SIMPLE_DATE.format(service_Log.getRequestTimestamp().getDate()));				// output request date
		System.out.println("  Request Time\t\t: " + service_Log.getRequestTimestamp().getTime());									// output request time
		System.out.println("  Response Date\t\t: " + SIMPLE_DATE.format(service_Log.getResponseTimestamp().getDate()));				// output response date
		System.out.println("  Response Time\t\t: " + service_Log.getResponseTimestamp().getTime());									// output response time
		System.out.println(" ");
	}
}
