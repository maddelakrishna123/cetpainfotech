package com.cetpa.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cetpa.mvc.dao.ProductRepository;
import com.cetpa.mvc.exceptions.ProductNotFoundException;
import com.cetpa.mvc.models.Product;

@Service
public class ProductService {
	@Autowired
	 private ProductRepository repo;
	
	public Product createNewProduct(Product product)
	{
		return repo.save(product);
	}

	
	public Product getProduct(int pid)
	{
	 Optional<Product> productOpt =	 repo.findById(pid);
	 
	 if(productOpt.isPresent())
	 {
		 return productOpt.get();
	 }
	 else
	 {
		 throw new ProductNotFoundException("Product not found");
	 }
	}
	
	public  void deleteProduct(int id)
	{
		Optional<Product> productOpt =	 repo.findById(id);
		 
		 if(productOpt.isPresent())
		 {
			repo.delete(productOpt.get()); 
		 }
		 else
		 {
			 throw new ProductNotFoundException("Product not found");
		 }
	}
	
	public List<Product> getProducts()
	{
		return repo.findAll();
	}
	
}
