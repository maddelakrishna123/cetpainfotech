package com.cetpa.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cetpa.mvc.services.ProductClientService;

@Controller
public class ProductClientController {
	@Autowired
	private ProductClientService service;
	@GetMapping("/")
	public String index()
	{
		return "index";
	}
	

	@GetMapping("/login")
	public String login()
	{
		return "login";
	}
	
	@PostMapping("/login")
	public String login(@RequestParam("username") String username, @RequestParam("password") String password,Model model)
	{
		
		
		      if(username.equals("krishna") && password.equals("12345"))
		      {
		    	  model.addAttribute("username", username);
		    	  return "adminhome";
		      }
		
		return "login";
	}
	
	
	@GetMapping("/viewproduct")
	public String products(Model model)
	{
		model.addAttribute("products", service.getProductsFromServer());
		return "viewproducts";
	}
}
