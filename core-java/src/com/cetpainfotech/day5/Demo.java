package com.cetpainfotech.day5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) throws ParseException {
		
		Date d  = new Date();
		
		Address ad = new Address("", "", "", "");
				
		   Customer c = new Customer(101, "", "", d, ad);
		
		  c.getAddress().getCity();
		
		
		
		
		
		
		
		/*
		 * Scanner sc = new Scanner(System.in); int id; String name; String email;
		 * String dob;
		 * 
		 * System.out.println("Enter ID for Customer1"); id = sc.nextInt();
		 * System.out.println("Enter Name for Customer1"); sc.nextLine(); name =
		 * sc.nextLine(); System.out.println("Enter Email for Customer1");
		 * sc.nextLine(); email = sc.nextLine();
		 * System.out.println("Enter DoD for Customer1");
		 * 
		 * dob = sc.nextLine();
		 * 
		 * SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy"); Customer c1 = new
		 * Customer(id, name, email, sdf.parse(dob),new
		 * Address("Hyd","Telangana","India","500086"));
		 * 
		 * System.out.println("Enter ID for Customer2"); id = sc.nextInt();
		 * System.out.println("Enter Name for Customer2"); sc.nextLine(); name =
		 * sc.nextLine(); System.out.println("Enter Email for Customer2");
		 * sc.nextLine(); email = sc.nextLine();
		 * System.out.println("Enter DoD for Customer2");
		 * 
		 * dob = sc.nextLine(); Customer c2 = new Customer(id, name,email,
		 * sdf.parse(dob),new Address("Hyd","Telangana","India","500086"));
		 * 
		 * System.out.println(c1); System.out.println(c2);
		 * 
		 * if(c1.equals(c2)) { System.out.println("Customer are same"); } else {
		 * System.out.println("Customers are different"); }
		 */
	}

}
