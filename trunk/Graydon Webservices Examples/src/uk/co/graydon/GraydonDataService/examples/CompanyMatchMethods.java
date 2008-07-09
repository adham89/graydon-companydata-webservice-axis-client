/*
 * Created on 11-Jun-2008
 *
 * GraydonDataServices examples
 * 
 */
package uk.co.graydon.GraydonDataService.examples;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

import uk.co.graydon.GraydonDataService.*;
import uk.co.graydon.ws.GraydonDataService.types.*;


/**
 * @author denisreilly
 *
 * Runnable axis 1.3 java client for Graydon Company Data Webservice
 * 
 * Operation : GetCompanyMatchMethods
 * 
 * Argument0 = Partner Userid
 * Argument1 = Partner Password
 * Argument2 = Country
 */
public class CompanyMatchMethods {
	
	private static SimpleDateFormat 	SIMPLE_DATE 				= new SimpleDateFormat("dd/MM/yyyy");
	private static TimeZone 			GMT 						= TimeZone.getTimeZone("GMT");

	public static void main(String[] args) 
	{
		
		try
		{
			String partnerUserid			= null;
			String partnerPassword			= null;
			String country				 	= null;
			
			// set defaults
			SIMPLE_DATE.setTimeZone(GMT);
			
			// retrieve arguments
			if (args.length == 0)
				throw new Exception("Invalid arguments: Please specify match arguments");
			
			// populate match parameters with arguments
			partnerUserid 			= args[0].trim();
			partnerPassword 		= args[1].trim();
			if (args.length > 2)
				country		 			= args[2].trim();
			
			if (partnerUserid == null || partnerPassword == null)
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
			
			// create an instance of the getCompanyMatchMethods_ParametersType
			GetCompanyMatchMethods_ParametersType  getCompanyMatchMethods_Parameters = new GetCompanyMatchMethods_ParametersType();
			getCompanyMatchMethods_Parameters.setCountry(country);												// set the country
			getCompanyMatchMethods_Parameters.setAuthentication_Parameters(authentication_parameters);			// set the authentication parameters

			
			// perform the 'getCompanyMatchMethods' operation
			try
			{
				GetCompanyMatchMethods_ResultType getCompanyMatchMethods_Result = binding.getCompanyMatchMethods(getCompanyMatchMethods_Parameters);
				
				// output service log details
				if (getCompanyMatchMethods_Result.getService_Log() != null) 
					serviceLog(getCompanyMatchMethods_Result.getService_Log());
				
				// check if report have been populated
				if (getCompanyMatchMethods_Result.getCompanyMatchMethods() != null)
				{		
					// get the country company match methods
					CompanyMatchedMethodType companyMatchMethods[] = getCompanyMatchMethods_Result.getCompanyMatchMethods();
					
					for (int x = 0; x < companyMatchMethods.length; x++)
					{
						System.out.println("Match Methods:");
						System.out.println("Country\t\t\t: " + companyMatchMethods[x].getCountry());	
						
						// get the match methods
						MatchMethodType matchMethods[] = companyMatchMethods[x].getMatchMethods();
						for (int y = 0; y < matchMethods.length; y++)
						{
							System.out.println("  Match Method\t\t: " + matchMethods[y].getMatchingMethod());	
							System.out.println("  Description\t\t: " + matchMethods[y].getDescription());
							System.out.println("  Best Method\t\t: " + matchMethods[y].isBestMethod());
							System.out.println("  Max Length\t\t: " + matchMethods[y].getMaxLength());
							System.out.println("  With City\t\t: " + matchMethods[y].isWithCity());
							System.out.println("  With PostCode\t\t: " + matchMethods[y].isWithPostCode());
						}
						System.out.println(" ");
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
						System.err.println("My Message: " + "No match methods for country selected");
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
