package com.cetpainfotech.day7;

import java.util.Scanner;

public class StringDemo1 {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Mobile Number"); // 0- 9
	
	String mobile = sc.next();
	
	MobileNumberValidator validator = (m)->{
		
		 if(m.length() !=10)
			 return false;
		   for(int i =0; i <m.length();i++)
		   {
			   if(m.codePointAt(i)<48 || m.codePointAt(i)>57)
			   {
				   return false;
			   }
		   }
		
		return  true;
	};
		
		
	
 if(validator.isValidMobile(mobile))
 {
	 System.out.println(mobile+" is valid");
 }
 else 
 {
	 System.out.println(mobile+" is not valid");
 }
	
	}

}
