package com.SoftwareAg.ExceptionHandleInRestFullService;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
 
@Provider
public class CustomerDataNotFoundExceptionMapper implements ExceptionMapper<CustomerDataNotFoundException>{
	
	public Response toResponse(CustomerDataNotFoundException ex)
	{
		return Response.status(Status.NOT_FOUND)
				.entity(new ErrorProps("404", ex.getMessage()))
				.build();
	}
}