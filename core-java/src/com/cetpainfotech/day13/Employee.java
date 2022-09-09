package com.cetpainfotech.day13;

import java.io.Serializable;
// comparable ,
public class Employee  implements Serializable, Comparable<Employee>{
	
	private int id;
	private String name;
	private String email;
	private double salary;
	
	private String username;
	
	private transient String password;
	
	private  static String companyName ="Abc Company";

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static String getCompanyName() {
		return companyName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public static void setCompanyName(String companyName) {
		Employee.companyName = companyName;
	}

	public Employee(int id, String name, String email, double salary, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.password = password;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee o){  // 101 , 102
		
		 if(this.id > o.id)
		 {
			return 1; 
		 }
		 else
			  if (this.id < o.id)
			  {
				  return -1;
			  }else
			  {
		return 0;
			  }
	}
	
	

	
}


// Natural Sorting of Numbers - Ascending
//Natural Sorting of String - alphabetical Order

// // Natural Sorting of Employee - ascending order of their id