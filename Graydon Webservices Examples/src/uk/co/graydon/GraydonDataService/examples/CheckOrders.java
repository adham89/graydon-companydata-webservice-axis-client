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
 * Operation : checkOrders
 * 
 * Argument0 = Partner Userid
 * Argument1 = Partner Password
 * Argument2 = Status
 */

public class CheckOrders {
	
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
			String state					= null;
			
			// set defaults
			SIMPLE_DATE.setTimeZone(GMT);
			
			// retrieve arguments
			if (args.length == 0)
				throw new Exception("Invalid arguments: Please specify match arguments");
			
			// populate match parameters with arguments
			partnerUserid 				= args[0].trim();
			partnerPassword 			= args[1].trim();
			state 						= args[2].trim();
			
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
			
			// create an instance of the CheckOrders_ParametersType
			CheckOrders_ParametersType  checkOrders_Parameters = new CheckOrders_ParametersType();
			checkOrders_Parameters.setOrderState(OrderStateType.fromString(state));					// set the order state 
			checkOrders_Parameters.setAuthentication_Parameters(authentication_parameters);			// set the authentication parameters
			
			
			// perform the 'checkOrders' operation
			try
			{
				CheckOrders_ResultType checkOrders_Result = binding.checkOrders(checkOrders_Parameters);
				
				// output service log details
				if (checkOrders_Result.getService_Log() != null) 
					serviceLog(checkOrders_Result.getService_Log());
				
				// check if an order status has been returned
				if (checkOrders_Result.getCheckOrders() != null)
				{	
					// get the order status detail
					OrderStatusType orderStatus[] = checkOrders_Result.getCheckOrders();
					
					for (int x = 0; x < orderStatus.length; x++)
					{
						System.out.println("Order Status:");
						System.out.println("  Order Reference\t: " + orderStatus[x].getOrderReference());							// output company name
						System.out.println("  Order State\t\t: " + orderStatus[x].getOrderState());									// output order state
						System.out.println("  Date Ordered\t\t: " + SIMPLE_DATE.format(orderStatus[x].getDateOrdered()));			// output date ordered
						System.out.println("  Date Completed\t: " + SIMPLE_DATE.format(orderStatus[x].getDateCompleted()));			// output date completed
						
						// get some order details
						if (orderStatus[x].getOrder()!= null)
						{
							OrderType order = orderStatus[x].getOrder();
							System.out.println("Order Detail:");			
							System.out.println("  Company Name\t\t: " + order.getName());											// output company name
							if (order.getCompanyIdentifier() != null)
								System.out.println("  Company Identifier\t: " + order.getCompanyIdentifier().getIdentifier());		// output company identifier
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