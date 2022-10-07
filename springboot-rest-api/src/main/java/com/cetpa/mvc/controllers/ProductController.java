package com.cetpa.mvc.controllers;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Min;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cetpa.mvc.models.Product;
import com.cetpa.mvc.services.ProductService;

@RestController
@RequestMapping("/pms")
@Validated
public class ProductController {
	@Autowired
	private ProductService service;
	@Autowired
	private PasswordEncoder encoder;
	@GetMapping("/")
	
	public String index()
	{
		return "HelloWorld to Rest API";
	}
	@PostMapping("/product")
	//@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Product> product(@Valid @RequestBody Product product)
	{
		return new ResponseEntity<Product>(service.createNewProduct(product), HttpStatus.CREATED);
	}

	@GetMapping("/product/{id}")
	public Product product( @Min(value = 1,message = "should greater then 1") @PathVariable("id") int id)
	{
		
		return service.getProduct(id);
	}
	

	@DeleteMapping("/product")
	public String product1( @RequestParam("pid") int id)
	{
		service.deleteProduct(id);
		return "Product Deleted";
	}
	
	@GetMapping("/product")
	public List<Product> product()
	{
		return service.getProducts();
	}
}
