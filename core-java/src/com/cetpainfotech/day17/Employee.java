package com.cetpainfotech.day17;

import java.io.Serializable;
import java.util.Objects;

public class Employee implements Comparable<Employee> , Serializable{
	private int id;
	private String name;
	private String email;
	private double salary;
	
	private String username;
	
	private  String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Employee(int id, String name, String email, double salary, String username, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.username = username;
		this.password = password;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", salary=" + salary + ", username="
				+ username + ", password=" + password + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(email, other.email) && Objects.equals(username, other.username);
	}

	@Override
	public int compareTo(Employee o) {
	         
		
		if(this.id > o.id)
			return 1;
		else if(this.id < o.id)
			return -1;
		else
		return 0;
	}
	
	// 
	
	
	
	
	
	// getter and setter
	
	// constructors 
	
	
	// toString 

}
