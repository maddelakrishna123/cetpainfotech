package com.cetpainfotech.day8.assesment;

public class Address {
	
	private String city;
	private String state;
	private String country;
	private String pincode;
	private String type;
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
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Address(String city, String state, String country, String pincode, String type) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
		this.type = type;
	}
	public Address() {
		super();
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + ", pincode=" + pincode
				+ ", type=" + type + "]";
	}
	
	

}
