package com.SoftwareAg.ExceptionHandleInRestFullService;



	import javax.ws.rs.GET;
	import javax.ws.rs.Path;
	import javax.ws.rs.PathParam;
	import javax.ws.rs.core.Response;
	 
	@Path("/exception")
	public class RESTResource  {
		
		@GET
		@Path("/checkProfile/{id}")
		public Response getAdminDetails(@PathParam("id") String id) {
			
			String msg = RESTService.checkCustomerStatus(id);
	 
			return Response.status(200).entity(msg).build(); 
		} 	
	}
	
	
