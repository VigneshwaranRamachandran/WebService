package com.SoftwareAg.ExceptionHandleInRestFullService;

public class CustomerDataNotFoundException extends RuntimeException{
	 
	private static final long serialVersionUID = 1L;
 
	public CustomerDataNotFoundException(String exceptionMsg)
	{
		super(exceptionMsg);
	}
	
}