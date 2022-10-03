package com.jersey.restapi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path(value="/employees")

public class EmployeeRestService {

	
	public Map<String, List<String>> getCatogerywiseSkillSet()
	{
		Map<String, List<String>> skillListMap = new HashMap<String, List<String>>();
		
		skillListMap.put("FrontEnd",Arrays.asList("HTML","Java Script","React","Angular"));
		skillListMap.put("BackEnd",Arrays.asList("Java","Python","DotNet","DataScience"));
		return skillListMap;
	}
	
	// Response - Plain Text, XML, JSON , File , IMAGES 
	
	@Path(value="/hello")
	@GET
	public String welcome()
	{
		System.out.println("Welcome method invoked");
		return "Rest Api Jersey Library Demo ";
	}
	
	
	//@Path(value="/welcome/{eid}/{ename}")

	@Path(value="/welcome")
	@GET
	//public String welcomeWithParams(@PathParam("eid") int  id, @PathParam("ename") String ename )
	//public String welcomeWithParams(@QueryParam("eid") int id, @QueryParam("ename") String ename)
	public String welcomeWithParams(String details)
	{
		System.out.println("Welcome method invoked");
		return "Rest Api Jersey Library Demo "+details;
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
	@Consumes(value=MediaType.APPLICATION_JSON)
	@Produces(value = MediaType.APPLICATION_JSON)
	public Response createNewEmployee( Employee emp) // 201 Created
	{
		
		System.out.println(emp);
		return Response.status(201).entity(emp).build();
	}
	
	@Path("/emp/{id}")
	@DELETE
	public Response deleteEmployee(@PathParam("id") int id)
	{
		///
		
		return Response.ok().build();
	}
	
	
	
	
	
	@Path(value="/skills/{cat_id}")
	@GET
	@Produces(value=MediaType.APPLICATION_JSON)
	public List<String> getAllSkills(@PathParam("cat_id") String category)
	{
		Map<String, List<String>> catList = getCatogerywiseSkillSet();
		
		return catList.get(category);
		
		
	}
	
}
