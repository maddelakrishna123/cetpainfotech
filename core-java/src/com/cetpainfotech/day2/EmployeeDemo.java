package com.cetpainfotech.day2;

import java.util.Scanner;

public class EmployeeDemo {
	static int x = 90;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter id");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter name");
		String name = sc.nextLine();
		System.out.println("Enter Salary");
		double salary =  sc.nextDouble();
		
		Employee emp;
		
		
		emp = new Employee(id,name,salary); // default constructor
		
		emp.displayEmployeeDetails();
		
		

	}

}
