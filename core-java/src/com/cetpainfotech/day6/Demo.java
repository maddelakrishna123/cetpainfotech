package com.cetpainfotech.day6;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		
		//   Take Bank name from the user 
		Scanner sc = new Scanner(System.in);
		// create the Object 
		System.out.println("Enter The Bank Name");
		
		String bankname = sc.nextLine();
		
	Class c =	Class.forName("com.cetpainfotech.day6."+bankname);
		
	
	                Bank bank =   (Bank) c.newInstance();
	                
	                System.out.println("ROI is"+bank.getROI());
		// call roi method
	}

}
