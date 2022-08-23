package com.cetpainfotech.day5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Customer {
	
	private int id;
	private String name;
	private String email;
	private Date dob;
	private Address address;
	// address : city , state , country , pincode
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
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	
	
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Customer() {
		super();
	}
	
	
	public Customer(int id, String name, String email, Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.dob = dob;
	}
	
	
	
	// override the tostring method
	
	
	public Customer(int id, String name, String email, Date dob, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.address = address;
	}
	public String toString()
	{
		 SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		return "( id = "+id+" name = "+name+" Enail ="+email+" dob= "+sdf.format(dob)+")";
	}
	@Override
	public int hashCode() {
		return Objects.hash(dob, email);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(dob, other.dob) && Objects.equals(email, other.email);
	}
	
	

}
