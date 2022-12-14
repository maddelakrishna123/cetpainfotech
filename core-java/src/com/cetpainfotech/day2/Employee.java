package com.cetpainfotech.day2;

import java.util.Date;

/**
 * 
 * @author madde
 *
 */
public class Employee  {
	
	
	private int id;
	private String name;
	private double salary;
	
	private Date joinDate;
	
	private static  String company="Abc Infotech";  // class level members
	
	
	// accessor or  getter
	
	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public static String getCompany() {
		return company;
	}


	public static void setCompany(String company) {
		Employee.company = company;
	}


	public int getId()
	{
		return id;
	}
	
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getName()
	{
		return name;
	}
	
	
	public void setName(String name)
	{
		this.name = name;
	}
	// mutator or setter
	
	// default or No arg
	public Employee()
	{
		
		  id = 20;
		  name="krishna";
		  salary = 30000.00;
		System.out.println("Default Constructor");
	}
	
	public Employee(int id)
	{
		this.id = id;
		
		System.out.println("One Arg");
	}
	
	
	public Employee(int id , String name)
	{
		this(id);
		this.name = name;
		
		System.out.println("Two arg");
	}
	// parameterized
	public Employee(int id, String name, double salary)
	{
		this(id,name);
		//this.id = id;
		//this.name  = name;
		this.salary = salary;
		
		System.out.println("Three Arg");
	}
	
	
	
	
	// operations 
	
	
	public Employee(int id, String name, double salary, Date joinDate) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.joinDate = joinDate;
	}


	// instance 
	/**
	 * 
	 */
	public  void  displayEmployeeDetails()
	{
		
		System.out.println("ID = "+id+" Name = "+name+" Salary = "+salary+" Company ="+company);
	}


	
	
	
	
	

}
