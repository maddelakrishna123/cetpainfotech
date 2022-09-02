package com.cetpainfotech.day13;

import java.util.ArrayList;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		
		List<Employee> emps  = new ArrayList<Employee>();
		
		Employee e1 = new Employee(101, "krishna", "krishna@g,ail.com", 30000, "12345");
		

		Employee e2 = new Employee(102, "kumar", "kumar@g,ail.com", 30000, "12345");
	
	
	
	     emps.add(e1);
	     emps.add(e2);
	     
	     System.out.println(emps);
	
	
	}

}
