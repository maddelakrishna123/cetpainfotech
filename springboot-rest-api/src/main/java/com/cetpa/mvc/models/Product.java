package com.cetpa.mvc.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table
public class Product {
@Id
@GeneratedValue
	private int pid;
    @Pattern(regexp = "^[a-zA-Z0-9 ]{5,10}$",message = "Invalid Product Name")
	private String name;
	private String description;
	@Min(value = 1,message = "Invalid Price")
	private double price;
	private int quantity;
}


