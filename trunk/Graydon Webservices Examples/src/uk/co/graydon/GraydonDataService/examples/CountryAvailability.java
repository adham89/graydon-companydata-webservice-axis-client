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
 * Operation : GetCountryAvailability
 * 
 * Argument0 = Partner Userid
 * Argument1 = Partner Password
 * Argument2 = Country
 */
public class CountryAvailability {
	
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
			
			// create an instance of the getCountryAvailability Parameters Type
			GetCountryAvailability_ParametersType  getCountryAvailability_Parameters = new GetCountryAvailability_ParametersType();
			getCountryAvailability_Parameters.setCountry(country);												// set the order reference
			getCountryAvailability_Parameters.setAuthentication_Parameters(authentication_parameters);			// set the authentication parameters
			getCountryAvailability_Parameters.setCountry(country);												// set the country
			
			// perform the 'getCountryAvailability' operation
			try
			{
				GetCountryAvailability_ResultType getCountryAvailability_Result = binding.getCountryAvailability(getCountryAvailability_Parameters);
				
				// output service log details
				if (getCountryAvailability_Result.getService_Log() != null) 
					serviceLog(getCountryAvailability_Result.getService_Log());
				
				// check if country availability has been returned
				if (getCountryAvailability_Result.getCountryAvailablity() != null)
				{		
					// get the country company match methods
					CountryAndProductType countryAndProduct[] = getCountryAvailability_Result.getCountryAvailablity();
					
					for (int x = 0; x < countryAndProduct.length; x++)
					{
						System.out.println("Availability:");
						System.out.println("Country\t\t\t: " + countryAndProduct[x].getCountry());	
						
						// get the match methods
						ProductType products[] = countryAndProduct[x].getProducts();
						for (int y = 0; y < products.length; y++)
						{
							System.out.println("  Product: ");
							System.out.println("  Type\t\t\t: " + products[y].getType());
							System.out.println("  Code\t\t\t: " + products[y].getCode());	
							System.out.println("  Level\t\t\t: " + products[y].getLevel());
							System.out.println("  Days From\t\t: " + products[y].getDaysFrom());
							System.out.println("  Days To\t\t: " + products[y].getDaysTo());
							System.out.println("  Service Speed\t\t: " + products[y].getServiceSpeed());
							
							//products[y].
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
