package com.cetpainfotech.day8;

import java.util.Scanner;

import com.cetpainfotech.day4.Employee;

public class SpringDemo {

	public static void main(String[] args) {
		
		// 101,krishna,30000,24
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter How many employee do you need to create");
		int size = sc.nextInt();
		
		
		Employee[] empployees= new Employee[size];
		
		sc.nextLine();
		
		for(int i=0; i<empployees.length;i++)
		{
		System.out.println("Enter Employee Details");
		
		String employee = sc.nextLine();
		
	String details[] =	employee.split(",");
		
		
		Employee emp = new Employee();
		emp.setId(Integer.parseInt(details[0]));
		emp.setName(details[1]);
		emp.setSalary(Integer.parseInt(details[2]));
		emp.setAge(Integer.parseInt(details[3]));
		
		
		empployees[i] = emp;
		
		}
		
		

	}

}
