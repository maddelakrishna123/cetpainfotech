package com.cetpainfotech.day8.assesment;

import java.util.Objects;

public class Employee {
	
	private int id;
	private String name;
	private String email;
	private String mobile;
    private double salary;
    private Address address;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Employee(int id, String name, String email, String mobile, double salary, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.salary = salary;
		this.address = address;
	}
	public Employee() {
		super();
	}
	@Override
	public int hashCode() {
		return Objects.hash(email, id);
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
		return Objects.equals(email, other.email) && id == other.id;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", salary="
				+ salary + ", address=" + address + "]";
	}
    
    


}
