package com.SoftwareAg.ExceptionHandleInRestFullService;

public class RESTService {
	
	static CallDB cdb = new CallDB();
	
	public static String checkCustomerStatus(String custId){
		
		MyData da = cdb.getStatus(custId);		
		
		if(da.getStatus() == null)
		{
			throw new CustomerDataNotFoundException("Customer status not found with id "+custId);
		}
		
		return da.getStatus().trim();
			
	}
}
