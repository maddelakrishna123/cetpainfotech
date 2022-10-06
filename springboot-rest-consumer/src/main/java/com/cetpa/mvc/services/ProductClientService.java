package com.cetpa.mvc.services;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cetpa.mvc.models.Product;

@Service
public class ProductClientService {
	
	
	

	
	public List<Product> getProductsFromServer()
	{
		RestTemplate template = new RestTemplate();
	
		ResponseEntity<List<Product>> productResp = template.exchange("http://localhost:8081/pms/product", HttpMethod.GET, null, new ParameterizedTypeReference<List<Product>>() {
		});
		
		return productResp.getBody();
	}
}
