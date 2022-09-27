package com.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@RequestMapping(value="/login",method = RequestMethod.GET)
	public String emp()
	{
		return "employee";
	}
}
