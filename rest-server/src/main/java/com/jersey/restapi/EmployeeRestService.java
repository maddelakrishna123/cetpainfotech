package com.jersey.restapi;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path(value="/employees")

public class EmployeeRestService {

	
	@Path(value="/hello")
	@GET
	public String welcome()
	{
		return "Rest Api Jersey Library Demo ";
	}
	
	@Path(value="emp/{id}")
	@GET
	@Produces(value = MediaType.APPLICATION_JSON)
	public Employee getEmployee(@PathParam("id") int id)
	{
		System.out.println(id);
		return new Employee(1010, "krishna kumar", "krishna@gmail.com", "8500493754", 300000, "krishna123", "12345");
	}
	@Path("/emp")
	@POST
	@Produces(value = MediaType.APPLICATION_JSON)
	public Response createNewEmployee( Employee emp) // 201 Created
	{
		
		System.out.println(emp);
		return Response.status(201).entity(emp).build();
	}
	
	
}
