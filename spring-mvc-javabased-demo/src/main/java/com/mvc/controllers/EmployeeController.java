package com.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mvc.models.Employee;
import com.mvc.services.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
@Autowired
	private EmployeeService service;
	
	@RequestMapping(value="/login",method = RequestMethod.GET)
	public String emp()
	{
		return "employee";
	}
	@RequestMapping(value="/{username}",method = RequestMethod.GET)
	@ResponseBody
	public Employee getEmployee(@PathVariable("username") String username)
	{
		Employee e = service.getEmployee(username);
		
		System.out.println(e);
		return e;
	}
}

// http://lo......../employee/101