package com.kk.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="employee")

@NamedQuery(name="select_all_employees",query = "select e from Employee e")
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
	
	@ElementCollection
	private List<Address> addressList = new ArrayList<Address>();
	
	private int age;
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	public List<Address> getAddressList() {
		return addressList;
	}
	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}
	
	
	public Employee(int id, String name, String email, String mobile, String username, String password, double salary,
			List<Address> addressList, int age) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.username = username;
		this.password = password;
		this.salary = salary;
		this.addressList = addressList;
		this.age = age;
	}
	public Employee(int id, String name, String email, String mobile, String username, String password, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.username = username;
		this.password = password;
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", username="
				+ username + ", password=" + password + ", salary=" + salary + "]";
	}
	

}

// mapping 