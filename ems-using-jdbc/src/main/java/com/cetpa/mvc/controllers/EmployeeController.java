package com.cetpa.mvc.controllers;

import javax.annotation.PostConstruct;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cetpa.mvc.models.Employee;
import com.cetpa.mvc.services.EmployeeServices;

@Controller


public class EmployeeController {
	@Autowired
	private EmployeeServices service;
	//@RequestMapping(value="/",method = RequestMethod.GET)
	@GetMapping("/")
	public String index()
	{
		return "index";
	}
	
	@GetMapping("/login")
	public String login()
	{
		
	Employee e =	service.verifyLogin("", null);
	e.getUsername();
		return "login";
	}
	
	@GetMapping("/register")
	public String register(Model model)
	{
		model.addAttribute("emp", new Employee());
		return "register";
	}
	@PostMapping("/register")
	public String register1(@Valid @ModelAttribute("emp") Employee emp, BindingResult result)
	{
		
		System.out.println(emp);
		
		
		 if(result.hasErrors())
		 {
			 return "register";
		 }
		
		/*
		     if(service.createNewEmployee(emp))
		     {
		    	 return "register";
		    	 
		     }*/
		return "login";
	}

}
