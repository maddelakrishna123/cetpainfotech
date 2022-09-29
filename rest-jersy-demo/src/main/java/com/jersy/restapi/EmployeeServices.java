package com.jersy.restapi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("emp")
public class EmployeeServices {
  @Path(value = "/hello")
  @GET
	public String hello()
	{
		return "Hello";
	}
  @Path("/emp/{id}")
  @GET
  @Produces(value = MediaType.APPLICATION_JSON)
  public Response getEmployee(@PathParam("id") int id)
  {
	 return  Response.status(200).entity(new Employee(1010, "krishna kumar", "krishna@gmail.com", "8500493754", 30000, "krishna@gmail.com", "1234556")).build();
	  //return Response.ok(new Employee(1010, "krishna kumar", "krishna@gmail.com", "8500493754", 30000, "krishna@gmail.com", "1234556")).build();
  }
}
