package com.springmvc.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
@Controller
public class HomeController {
    @RequestMapping(value="/home",method = RequestMethod.GET)
	public String home()
	{
    	System.out.println("In home method");
		return "home";
	}

    @RequestMapping(value="/login",method = RequestMethod.GET)
	public String login()
	{
    	System.out.println("In login method");
		return "login";
	}
    @RequestMapping(value="/register",method = RequestMethod.GET)
	public String register()
	{
    	System.out.println("In register method");
		return "register";
	}
}
