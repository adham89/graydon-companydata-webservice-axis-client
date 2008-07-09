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
 * Operation : PlaceOrder
 * 
 * Argument0 = Partner Userid
 * Argument1 = Partner Password
 * Argument2 = Company Product Identifier 
 */

public class PlaceOrder {
	
	private static SimpleDateFormat 	SIMPLE_DATE 				= new SimpleDateFormat("dd/MM/yyyy");
	private static TimeZone 			GMT 						= TimeZone.getTimeZone("GMT");

	/**
	* Main method
	*
	*/
	public static void main(String[] args) 
	{
		
		try
		{
			String partnerUserid			= null;
			String partnerPassword			= null;
			String companyProductIdentifier = null;
			
			// set defaults
			SIMPLE_DATE.setTimeZone(GMT);
			
			// retrieve arguments
			if (args.length == 0)
				throw new Exception("Invalid arguments: Please specify match arguments");
			
			// populate match parameters with arguments
			partnerUserid 				= args[0].trim();
			partnerPassword 			= args[1].trim();
			companyProductIdentifier 	= args[2].trim();
			
			if (partnerUserid == null || partnerPassword == null || companyProductIdentifier == null)
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
			PlaceOrder_ParametersType  placeOrder_Parameters = new PlaceOrder_ParametersType();
			placeOrder_Parameters.setCompanyProductIdentifier(companyProductIdentifier);			// set the company product identifier 
			placeOrder_Parameters.setAuthentication_Parameters(authentication_parameters);			// set the authentication parameters
			PartnerElementType[] partnerElements = {new PartnerElementType("Dummy", PartnerElementFormatType.String, "Dummy")};
			placeOrder_Parameters.setPartnerData(partnerElements);									// set any partner data
			placeOrder_Parameters.setOrderCreatorEmail("denis@graydon.co.uk");						// set the order creator email
			
			
			// perform the 'getCompanyMatchesByIdentifier' operation
			try
			{
				PlaceOrder_ResultType placeOrder_Result = binding.placeOrder(placeOrder_Parameters);
				
				// output service log details
				if (placeOrder_Result.getService_Log() != null) 
					serviceLog(placeOrder_Result.getService_Log());
				
				// check if an order status has been returned
				if (placeOrder_Result.getOrderStatus() != null)
				{	
					// get the order status detail
					OrderStatusType orderStatus = placeOrder_Result.getOrderStatus();
					System.out.println("Order Status\t\t\t:");
					System.out.println("  Order Reference\t\t: " + orderStatus.getOrderReference());								// output company name
					System.out.println("  Order State\t\t\t: " + orderStatus.getOrderState());										// output order state
					System.out.println("  Date Ordered\t\t\t: " + SIMPLE_DATE.format(orderStatus.getDateOrdered()));				// output date ordered
					System.out.println("  Date Completed\t\t: " + SIMPLE_DATE.format(orderStatus.getDateCompleted()));				// output date completed
					
					// get some order details
					if (orderStatus.getOrder()!= null)
					{
						OrderType order = orderStatus.getOrder();
						System.out.println("Order \t\t\t:");			
						System.out.println("  Company Name\t\t\t: " + order.getName());												// output company name
						System.out.println("  Company Identifier\t\t: " + order.getCompanyIdentifier().getIdentifier());			// output company identifier
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