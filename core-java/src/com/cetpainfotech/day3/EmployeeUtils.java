package com.cetpainfotech.day3;

import com.cetpainfotech.day2.Employee;

public class EmployeeUtils {

	
	public static Employee createEmployee(int id, String name, double salary)
	{
		
		Employee e = new Employee(id,name,salary);
		
		return e;
	}
	
}
