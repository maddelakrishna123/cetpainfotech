package com.cetpainfotech.day9;

import java.util.Scanner;

import com.cetpainfotech.day4.Employee;

public class ExceptionDemo5 {
	public static void main(String[] args) throws InvalidSalaryException{
		
		Scanner sc = new Scanner(System.in);
		String emp = sc.nextLine();
		
		String[] detatils = emp.split(",");
		
		int sal= Integer.parseInt(detatils[2]);
		
		 if(sal==0)
		 {
			InvalidSalaryException iae = new InvalidSalaryException("Invalid age"); 
		
		  throw iae;
		 
		 }
		
		Employee e = new Employee(0, null, 0, 0);
	}

}
