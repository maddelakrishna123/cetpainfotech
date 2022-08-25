package com.cetpainfotech.day7;

import java.util.Scanner;

import com.cetpainfotech.day4.Employee;

public class ArraysDemo5 {
	
	
	public static double findAverageSalary(Employee employees[])
	
	{
		int totalSalary = 0;
		
		for(Employee e:employees)
		{
			totalSalary+=e.getSalary();
		}
		
		return totalSalary/employees.length;
	}

	public static void main(String[] args) {
		
		// construct 4 employees and the average salary of the employees
		int arr[] = new int[4];
		arr[0] = 23;
		
		Employee employee[] = new Employee[4];
		
		
		Scanner sc = new Scanner(System.in);
		
		for(int i =0; i<employee.length;i++)
		{
			
			
			System.out.println("Enter "+(i+1)+" employee details");
		System.out.println("Enter the id");
		int id = sc.nextInt();
		System.out.println("Enter  Name ");
		String name = sc.next();
		System.out.println("Enter Salary");
		int salary = sc.nextInt();
		System.out.println("Enter the age");
		int age = sc.nextInt();
		
		employee[i] = new Employee(id,name, salary, age);
		}
		
		
		
		
		System.out.println("The average salary = "+findAverageSalary(employee));
		
		
		

	}

}
