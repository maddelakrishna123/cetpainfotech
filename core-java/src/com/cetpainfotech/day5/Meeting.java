package com.cetpainfotech.day5;

public class Meeting {
	
	private int id;
	private String agenda;
	
	// address  city, state, country, pincode
	private Address address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAgenda() {
		return agenda;
	}

	public void setAgenda(String agenda) {
		this.agenda = agenda;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Meeting(int id, String agenda, Address address) {
		super();
		this.id = id;
		this.agenda = agenda;
		this.address = address;
	}

	public Meeting() {
		super();
	}
	

	
	
}


// HAS A relation (aggrigation)