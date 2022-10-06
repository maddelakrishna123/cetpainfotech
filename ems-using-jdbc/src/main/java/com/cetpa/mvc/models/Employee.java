package com.cetpa.mvc.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

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
@Table(name="emp_data_jpa")
public class Employee {
	@Id
	@Column(name="eid")
	private int id;
	@Column(name="ename")
	@Pattern(regexp = "^[a-zA-Z0-9 ]{8,15}$" ,message = "Invalid Username")
	private String name;
	private String email;
	private String mobile;
	@Size(min = 1, message = "Required")
	private String username;
	private String password;

	private double salary;
	@Min(value = 20, message = "Age should be greater then 20 years")
	@Max(value=40, message = "Age should be less the 40")
	private int age;
	
}
