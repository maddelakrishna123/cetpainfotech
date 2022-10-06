package com.cetpa.mvc.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Product {
	private int pid;
   private String name;
	private String description;
	
	private double price;
	private int quantity;
}
