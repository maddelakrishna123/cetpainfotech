package com.cetpainfotech.day4;

import java.util.Objects;

public  class Person {
	
	protected int id;
	protected String name;
	
	protected int age;
	
	protected int m = 50;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
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
	public Person(int id, String name, int age) {
		super(); // call to super class constructor
		this.id = id;
		this.name = name;
		this.age = age;
		System.out.println("In Person class All argument construcor");
	}
	
	  public Person() { 
		  super();
	  
	  System.out.println("In person class default constructor"); }
	 
	
	
	
	
	
	public  void printDetails()
	{
		System.out.println("ID = "+id+" Name ="+name+" Age ="+age);
		
		//return null;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	
	
	
	// p.equals(p1) current obj  = p  other obj = p1
	
	// obj should  not null
	
	//  curennt object and other objects should be same type
	
	// id and name

}
