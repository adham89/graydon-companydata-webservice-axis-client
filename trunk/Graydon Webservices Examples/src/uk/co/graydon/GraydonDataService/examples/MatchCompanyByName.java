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
 * Operation : GetCompanyMatchesByName
 * 
 * 
 */
public class MatchCompanyByName {
	
	private static SimpleDateFormat 	SIMPLE_DATE 				= new SimpleDateFormat("dd/MM/yyyy");
	private static TimeZone 			GMT 						= TimeZone.getTimeZone("GMT");

	public static void main(String[] args) 
	{
		
		try
		{
			// set defaults
			SIMPLE_DATE.setTimeZone(GMT);
			
			// create an instance of the graydon webservice proxy
			GraydonCompanyData_BindingStub 	binding	= (GraydonCompanyData_BindingStub) new GraydonCompanyDataLocator().getSOAPPort();
			
			// Time out after a two minutes
			binding.setTimeout(120000);
			
			// create an instance of the authentication parameters
			Authentication_ParametersType authentication_parameters	= new Authentication_ParametersType();
			
			// set the partner userid and password
			authentication_parameters.setPartnerUserId("GGWDEMO4");
			authentication_parameters.setPartnerPassword("MRF1xIT");
			
			// set the generic match parameters
			CompanyMatches_ParametersType companyMatches_Parameters = new CompanyMatches_ParametersType();
			companyMatches_Parameters.setCountry("United Kingdom");
			
			// create an instance of the getCompanyMatchesByName parameters
			GetCompanyMatchesByName_ParametersType  getCompanyMatchesByName_Parameters = new GetCompanyMatchesByName_ParametersType();
			getCompanyMatchesByName_Parameters.setName("Kentstone Properties");							// set the identifier to match with
			getCompanyMatchesByName_Parameters.setAuthentication_Parameters(authentication_parameters);	// set the authentication parameters
			getCompanyMatchesByName_Parameters.setCompanyMatches_Parameters(companyMatches_Parameters);
			// perform the 'getCompanyMatchesByIndentifier' operation
			try
			{
				GetCompanyMatches_ResultType getCompanyMatches_Result = binding.getCompanyMatchesByName(getCompanyMatchesByName_Parameters);
				
				// check if matches have been populated
				if (getCompanyMatches_Result.getCompanyMatches() != null)
				{
					// get the returned companies and iterate thru each one
					CompanyType company[] = getCompanyMatches_Result.getCompanyMatches();
					for (int x = 0; x < company.length; x++)
					{
						System.out.println("Company\t\t\t: #" + x);																	// output iteration number
						System.out.println("Name\t\t\t: " + company[x].getName());													// output company name
						
						// get the returned company identifiers for the company
						CompanyIdentifierType companyIdentifiers[] = company[x].getCompanyIdentifiers(); 
						for (int y = 0; y < companyIdentifiers.length; y++)
						{
							System.out.println("Identifiers :");																	
							System.out.println("  Type\t\t\t: " + companyIdentifiers[y].getType());									// output identifier type
							System.out.println("  Identifier\t\t: " + companyIdentifiers[y].getIdentifier());						// output identifier
						}
						
						if (company[x].getRegisteredAddress() != null)
						{
							System.out.println("Registered Address :");
							if (company[x].getRegisteredAddress().getBuilding() != null)
								System.out.println("  Building\t\t: " + company[x].getRegisteredAddress().getBuilding());			// output the building
							if (company[x].getRegisteredAddress().getStreet() != null)
								System.out.println("  Street\t\t: " + company[x].getRegisteredAddress().getStreet());				// output the street
							if (company[x].getRegisteredAddress().getTown() != null)
								System.out.println("  Town\t\t: " + company[x].getRegisteredAddress().getTown());					// output the town
							if (company[x].getRegisteredAddress().getCity() != null)
								System.out.println("  City\t\t\t\t: " + company[x].getRegisteredAddress().getCity());				// output the city
							if (company[x].getRegisteredAddress().getCounty() != null)
								System.out.println("  County\t\t: " + company[x].getRegisteredAddress().getCounty());				// output the county
							if (company[x].getRegisteredAddress().getPostCode() != null)
								System.out.println("  PostCode\t\t: " + company[x].getRegisteredAddress().getPostCode());			// output the postCode
						}
						
						if (company[x].getTradingAddress() != null)
						{
							System.out.println("Trading Address :");
							if (company[x].getTradingAddress().getBuilding() != null)
								System.out.println("  Building\t\t: " + company[x].getTradingAddress().getBuilding());				// output the building
							if (company[x].getTradingAddress().getStreet() != null)
								System.out.println("  Street\t\t: " + company[x].getTradingAddress().getStreet());					// output the street
							if (company[x].getTradingAddress().getTown() != null)
								System.out.println("  Town\t\t: " + company[x].getTradingAddress().getTown());						// output the town
							if (company[x].getTradingAddress().getCity() != null)
								System.out.println("  City\t\t\t\t: " + company[x].getTradingAddress().getCity());					// output the city
							if (company[x].getTradingAddress().getCounty() != null)
								System.out.println("  County\t\t: " + company[x].getTradingAddress().getCounty());					// output the county
							if (company[x].getTradingAddress().getPostCode() != null)
								System.out.println("  PostCode\t\t: " + company[x].getTradingAddress().getPostCode());				// output the postCode
						}
						
						if (company[x].getDateOfIncorporation() != null)
							System.out.println("Incorporation Date\t: " + SIMPLE_DATE.format(company[x].getDateOfIncorporation()));	// output date of incorporation
						if (company[x].getDateAccountsFiled() != null)
							System.out.println("Accounts Filed Date\t: " + SIMPLE_DATE.format(company[x].getDateAccountsFiled()));	// output date of accounts filed
						if (company[x].getDateOfAnnualReturn() != null)
							System.out.println("Annual Return Date\t: " + SIMPLE_DATE.format(company[x].getDateOfAnnualReturn()));	// output date of annual return
						if (company[x].getDateOfLatestAccounts() != null)
							System.out.println("Latest Accounts Date\t: " + SIMPLE_DATE.format(company[x].getDateOfLatestAccounts()));// output date of latest accounts
						if (company[x].getTelephone() != null)
							System.out.println("Telephone\t\t: " + company[x].getTelephone());										// output the telephone number
						if (company[x].getEmail() != null)
							System.out.println("Email\t\t\t: " + company[x].getEmail());											// output the email address
						if (company[x].getFacsimile() != null)
							System.out.println("Fax\t\t\t: " + company[x].getFacsimile());											// output the fax address
							
						// get the returned company identifiers for the company
						ActivityType activities[] = company[x].getActivites(); 
						for (int y = 0; y < activities.length; y++)
						{
							System.out.println("Activities :");																	
							System.out.println("  Type\t\t\t: " + activities[y].getType());											// output activity type
							System.out.println("  Description\t\t: " + activities[y].getDescription());								// output acitivity description
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
}
