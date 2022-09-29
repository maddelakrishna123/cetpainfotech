package com.mvc.controllers;

import javax.validation.Valid;

//import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mvc.models.Employee;
import com.mvc.services.EmployeeService;

@Controller
@RequestMapping("/admin")
public class WelcomeController {
	@Autowired
	private EmployeeService service;

	 @RequestMapping(value="/home",method = RequestMethod.GET)
		public String home(Model model)
		{
	    	System.out.println("In home method");
	    	model.addAttribute("AppTitle", "Employee Management System");
	   
			return "home"; // view name
		}

	    @RequestMapping(value="/login",method = RequestMethod.GET)
		public ModelAndView login()
		{
	    	System.out.println("In login method");
	    	
	    	ModelAndView mav = new ModelAndView("login");
	    	mav.addObject("title", "AdminLogin");
			return mav;
		}
	    
	    
	    @RequestMapping(value="/login",method = RequestMethod.POST)
		public ModelAndView login(@RequestParam("username") String uname,@RequestParam("password") String password)
		{
	    	Employee e = service.getEmployee(uname);
	    	if(e!=null && e.getPassword().equals(password))
	    	{
	    	
	    	ModelAndView mav = new ModelAndView("emphome");
	    	
			return mav;
	    	}
	    	else
	    	{
	    		ModelAndView mav = new ModelAndView("login");
		    	mav.addObject("title", "AdminLogin");
		    	mav.addObject("message", "Employee Not Registered or Incorrect password");
				return mav;
	    	}
		}
	    
	    @RequestMapping(value="/register",method = RequestMethod.GET)
		public String register(Model model)
		{
	    	
	    	Employee e  = new Employee();
	    	e.setUsername("krishna12233");
	    	
	    	model.addAttribute("emp",e);
	    	System.out.println("In register method");
			return "register";
		}
	    
	    @RequestMapping(value="/register",method = RequestMethod.POST)
		public String register(@Valid @ModelAttribute Employee emp, Model model, BindingResult br)
		{
	    	System.out.println("e "+emp);
	    	
	    	if(br.hasErrors())
		{
			return "register";
		}
	    	
	    	int empid =service.createNewEmployee(emp);
	    	
	    	if(empid>=1)
	    	{
	    		emp.setEid(empid);
	    		model.addAttribute("emp",emp);
	    		model.addAttribute("message", "Employee Created with Id "+empid);
	    	}
			return "register";
		}   
	    
	    
	    @RequestMapping(value="/employee/{eid}/{ename}",method = RequestMethod.GET)
	    public String employee(@PathVariable("eid") int id, @PathVariable("ename") String name)
	    {
	    	System.out.println(id+name);
	    	return "employee";
	    }
}

// selection, checkboxes , radio button
