package com.cetpainfotech.day7;

import com.cetpainfotech.day4.Employee;

public class StringDemo2 {

	public static void main(String[] args) {
	
		
		 String str= "101-krishna-20000-35";
		 
		 
String[] details=		 str.split("-");
int id = Integer.parseInt(details[0]);

String name = details[1];
int salary = Integer.parseInt(details[2]);
int age  = Integer.parseInt(details[3]);
		 Employee emp = new Employee(id, name, age, salary);
		 
		 System.out.println(emp);
		 

	}

}
