package com.cetpainfotech.day4;

public class Employee  extends Person{

	protected int salary;
	
	 
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	public Employee()   // sub class constructor should invoke the super class constructor
	{
		super(); // call to super class constructor // Person(101,"abc",20);
	}
	
	
	
	
	public Employee(int id, String name,int age, int salary)
	{
		
		super(id,name, age);  // call to super class constructor
		this.salary = salary;
		
		System.out.println("In Employee All Argument Constructor");
	}
	
// overriding - run time polyporphysm	
	
	//public void printDetails()
	@Override
	public void printDetails()
	{// body can  be changed
		
		//System.out.println("ID = "+id+" Name ="+name+" Age ="+age+" Salary ="+salary);
		super.printDetails();
		System.out.println("Salary = "+salary+" M = "+m);
		//return null;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", id=" + id + ", name=" + name + ", age=" + age + ", m=" + m + "]";
	}
	

	
}

// id, name , age

//  static - variables , static , static blocks , static inner classes

// final - variables , methods , classes
