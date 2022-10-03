package com.cetpa.mvc.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
	private String name;
	private String email;
	private String mobile;
	private String username;
	private String password;
	private double salary;
	private int age;
	
}
