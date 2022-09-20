package com.kk.jpa;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	private int pincode;
	private String city;
	private String state;
	private String country;
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Address(int pincode, String city, String state, String country) {
		super();
		this.pincode = pincode;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	public Address() {
		super();
	}
	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	

}
