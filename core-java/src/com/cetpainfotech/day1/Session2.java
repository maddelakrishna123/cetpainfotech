package com.cetpainfotech.day1;


import java.util.Scanner;

public class Session2 {

	
	 public static boolean isEven(int number)
	 {
		 if(number % 2 == 0)
		 {
			return true; 
			
		 }
		 else
		 {
			 return false;
		 }
		 
	 }
	
	
	public static void main(String[] args) {
		
		
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("Enter Three Number ");  // .... -3 -2 -1 0 1 2 3 ...
	int number1 = sc.nextInt(); 
	int number2 = sc.nextInt();
	System.out.println("Option");  // 1 2 3 4  
	String op  = sc.next();
	
	
	switch (op) {
	case "+":
		System.out.printf("%d + %d = %d", number1,number2,(number1+number2));	
		break;
	case "-" :
		System.out.printf("%d - %d = %d", number1,number2,(number1-number2));
break;
	case "*":
	
		System.out.printf("%d * %d = %d", number1,number2,(number1*number2));
break;
	case "/": 
		System.out.printf("%d / %d = %d", number1,number2,(number1/number2));
	break;
	default:
		System.out.println("Invalid Option");
		break;
	}
	
	
	/*
	if(op ==1)
	{
		System.out.printf("%d + %d = %d", number1,number2,(number1+number2));
	}
	else if(op==2)
	{
		System.out.printf("%d - %d = %d", number1,number2,(number1-number2));
	}
	else if(op==3)
	{
		System.out.printf("%d * %d = %d", number1,number2,(number1*number2));
	}
	else if(op==4)
	{
		System.out.printf("%d / %d = %d", number1,number2,(number1/number2));
	}
	else
	{
		System.out.println("Invalid Option");
	}
	*/
	// 
	
	}

}

// if , if -else , if else if , switch
