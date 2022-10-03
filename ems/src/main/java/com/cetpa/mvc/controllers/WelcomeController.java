package com.cetpa.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cetpa.mvc.dao.EmployeeDao;
import com.cetpa.mvc.model.Employee;

@Controller
public class WelcomeController {
	@Autowired
	private EmployeeDao dao ;
	//@RequestMapping(value="/", method = RequestMethod.GET)
	@GetMapping("/")
	public String index()
	{
		dao.get();
		Employee e =new Employee();
	
		return "index";
	}
	
	@GetMapping("/login")
	public String login()
	{
		return "login";
	}

	@GetMapping("/register")
	public String register()
	{
		return "register";
	}
}
// localhost:8080/  GET