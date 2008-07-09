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
import uk.co.graydon.xml.GraydonUKCommonTypes.MimeTypesType;


/**
 * @author denisreilly
 *
 * Runnable axis 1.3 java client for Graydon Company Data Webservice
 * 
 * Operation : GetCompanyProducts
 * 
 * Argument0 = Partner Userid
 * Argument1 = Partner Password
 * Argument2 = Company Match Identifier 
 */
public class CompanyProducts {
	
	private static SimpleDateFormat 	SIMPLE_DATE 				= new SimpleDateFormat("dd/MM/yyyy");
	private static TimeZone 			GMT 						= TimeZone.getTimeZone("GMT");

	public static void main(String[] args) 
	{
		
		try
		{
			String partnerUserid			= null;
			String partnerPassword			= null;
			String companyMatchIdentifier 	= null;
			
			// set defaults
			SIMPLE_DATE.setTimeZone(GMT);
			
			// retrieve arguments
			if (args.length == 0)
				throw new Exception("Invalid arguments: Please specify match arguments");
			
			// populate match parameters with arguments
			partnerUserid 			= args[0].trim();
			partnerPassword 		= args[1].trim();
			companyMatchIdentifier 	= args[2].trim();
			
			if (partnerUserid == null || partnerPassword == null || companyMatchIdentifier == null)
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
			
			// create an instance of the getCompanyProducts_ParametersType
			GetCompanyProducts_ParametersType  getCompanyProducts_Parameters = new GetCompanyProducts_ParametersType();
			getCompanyProducts_Parameters.setCompanyMatchIdentifier(companyMatchIdentifier);				// set the company match identifier 
			getCompanyProducts_Parameters.setAuthentication_Parameters(authentication_parameters);			// set the authentication parameters
			
			// perform the 'getCompanyMatchesByIdentifier' operation
			try
			{
				GetCompanyProducts_ResultType getCompanyProducts_Result = binding.getCompanyProducts(getCompanyProducts_Parameters);
				
				
				// output service log details
				if (getCompanyProducts_Result.getService_Log() != null) 
					serviceLog(getCompanyProducts_Result.getService_Log());
				
				// check if matches have been populated
				if (getCompanyProducts_Result.getCompany() != null)
				{
					// get the returned companies and iterate thru each one
					CompanyType company = getCompanyProducts_Result.getCompany();
					System.out.println("Company\t\t\t:");																		// output iteration number
					System.out.println("Name\t\t\t: " + company.getName());														// output company name
					
					// get the returned company identifiers for the company
					CompanyIdentifierType companyIdentifiers[] = company.getCompanyIdentifiers(); 
					for (int y = 0; y < companyIdentifiers.length; y++)
					{
						System.out.println("Identifiers :");																	
						System.out.println("  Type\t\t\t: " + companyIdentifiers[y].getType());									// output identifier type
						System.out.println("  Identifier\t\t: " + companyIdentifiers[y].getIdentifier());						// output identifier
					}
					
					if (company.getRegisteredAddress() != null)
					{
						System.out.println("Registered Address :");
						if (company.getRegisteredAddress().getBuilding() != null)
							System.out.println("  Building\t\t: " + company.getRegisteredAddress().getBuilding());				// output the building
						if (company.getRegisteredAddress().getStreet() != null)
							System.out.println("  Street\t\t: " + company.getRegisteredAddress().getStreet());					// output the street
						if (company.getRegisteredAddress().getTown() != null)
							System.out.println("  Town\t\t: " + company.getRegisteredAddress().getTown());						// output the town
						if (company.getRegisteredAddress().getCity() != null)
							System.out.println("  City\t\t\t: " + company.getRegisteredAddress().getCity());					// output the city
						if (company.getRegisteredAddress().getCounty() != null)
							System.out.println("  County\t\t: " + company.getRegisteredAddress().getCounty());					// output the county
						if (company.getRegisteredAddress().getPostCode() != null)
							System.out.println("  PostCode\t\t: " + company.getRegisteredAddress().getPostCode());				// output the postCode
					}
					
					if (company.getTradingAddress() != null)
					{
						System.out.println("Trading Address :");
						if (company.getTradingAddress().getBuilding() != null)
							System.out.println("  Building\t\t: " + company.getTradingAddress().getBuilding());					// output the building
						if (company.getTradingAddress().getStreet() != null)
							System.out.println("  Street\t\t: " + company.getTradingAddress().getStreet());						// output the street
						if (company.getTradingAddress().getTown() != null)
							System.out.println("  Town\t\t: " + company.getTradingAddress().getTown());							// output the town
						if (company.getTradingAddress().getCity() != null)
							System.out.println("  City\t\t\t: " + company.getTradingAddress().getCity());						// output the city
						if (company.getTradingAddress().getCounty() != null)
							System.out.println("  County\t\t: " + company.getTradingAddress().getCounty());						// output the county
						if (company.getTradingAddress().getPostCode() != null)
							System.out.println("  PostCode\t\t: " + company.getTradingAddress().getPostCode());					// output the postCode
					}
					
					if (company.getDateOfIncorporation() != null)
						System.out.println("Incorporation Date\t: " + SIMPLE_DATE.format(company.getDateOfIncorporation()));	// output date of incorporation
					if (company.getDateAccountsFiled() != null)
						System.out.println("Accounts Filed Date\t: " + SIMPLE_DATE.format(company.getDateAccountsFiled()));		// output date of accounts filed
					if (company.getDateOfAnnualReturn() != null)
						System.out.println("Annual Return Date\t: " + SIMPLE_DATE.format(company.getDateOfAnnualReturn()));		// output date of annual return
					if (company.getDateOfLatestAccounts() != null)
						System.out.println("Latest Accounts Date\t: " + SIMPLE_DATE.format(company.getDateOfLatestAccounts()));	// output date of latest accounts
					if (company.getTelephone() != null)
						System.out.println("Telephone\t\t: " + company.getTelephone());											// output the telephone number
					if (company.getEmail() != null)
						System.out.println("Email\t\t\t: " + company.getEmail());												// output the email address
					if (company.getFacsimile() != null)
						System.out.println("Fax\t\t\t: " + company.getFacsimile());												// output the fax address
						
					// get the returned company identifiers for the company
					if (company.getActivites() != null)
					{
						ActivityType activities[] = company.getActivites(); 
						for (int y = 0; y < activities.length; y++)
						{
							System.out.println("Activities :");																	
							System.out.println("  Type\t\t\t: " + activities[y].getType());										// output activity type
							System.out.println("  Description\t\t: " + activities[y].getDescription());							// output activity description
						}
					}
					
					System.out.println(" ");
					System.out.println("Products:");	
					
					// get the returned company identifiers for the company
					if (getCompanyProducts_Result.getProducts() != null)
					{
						ProductType products[] 	= getCompanyProducts_Result.getProducts();
						for (int y = 0; y < products.length; y++)
						{
							System.out.println("Product :");	
							System.out.println("  Code\t\t\t: " + products[y].getCode());										// output product code
							System.out.println("  Type\t\t\t: " + products[y].getType());										// output product type
							System.out.println("  Level\t\t\t: " + products[y].getLevel());										// output product level
							System.out.println("  Service Speed\t\t: " + products[y].getServiceSpeed());						// output product service speed
							System.out.println("  Days From\t\t: " + products[y].getDaysFrom());								// output product days from
							System.out.println("  Days To\t\t: " + products[y].getDaysFrom());									// output product days to
							System.out.println("  Company Product Identifier: " + products[y].getCompanyProductIdentifier());	// output product company product identifier
							
							// get the returned company identifiers for the company
							if (products[y].getMimeTypes() != null)
							{
								System.out.println("  MimeTypes Available :");
								MimeTypesType mimeTypes[] = products[y].getMimeTypes(); 
								for (int z = 0; z < mimeTypes.length; z++)
								{																	
									System.out.println("    Type\t\t: " + mimeTypes[z].getValue());								// output mime type
								}
							}
							System.out.println(" ");
						}
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
