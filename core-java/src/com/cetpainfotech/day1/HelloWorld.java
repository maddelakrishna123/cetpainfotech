package com.cetpainfotech.day1;

import java.util.Scanner;

import com.cetpainfotech.day2.Factorial;

/**
 * 
 * @author madde krishna Kumar
 * 
 * This  class is basic java class  i am writing
 *
 */
public class HelloWorld {
	
	public static void main(String[] args) { // command line arguments
		
		
		//  1 : 
		// Declaration Statemenets 
		
 Scanner sc = new Scanner(System.in);
	int n = 12;
	Factorial.factorial(n);;
	
	Factorial f = new Factorial();
	f.isEven(n);
		
		System.out.println("Enter Age :");
		int age = sc.nextInt();  // 
		sc.nextLine();
		System.out.println("Enter Name");
		String name = sc.nextLine();  // krishna kumar
		
		System.out.println("Enter Salary");
		double salary  = sc.nextDouble();
		
		// assign the values
		
		System.out.printf("%-20s%-20s%-20s%n","Name","Age","Salary");
		System.out.printf("%-20s%-20d%-20f",name,age,salary);
		
		
		
		
	}
	

}

// 

/*   23 krishba 23
 *  Enter age : 
 *  32
 *  
 *  Enter Name :
 *  Krishna Kumar
 *  
 *  Enter salary
 *  
 *  300000
 *  
 *  
 *  
 *   Name            age             Salary 
 *   
 *   
 *   Krishna Kumar  43               30000
 *  
 *  
 *  
 *    Primary Data Types
 *    
 *    Numeric :
 *    
 *     1) Integer (byte -  1 byte or 8 bits, short (2 ), int(4 ) , long 8)
 *     
 *     
 *     2 ) Real (Double 8 , float - 4)
 *    
 *    
 *    Character 
 *    
 *     char  2
 *    
 *    
 *    
 *    Boolean 
 *    
 *     boolean  1 bit
 *    
 *    
 *    
 *    
 *    Secondary Data Type : 
 *    
 *    String 
 *    
 *    Any Class
 *  
 *  
 *  int a ;
 *  
 *  String name;
 *  
 *  
 *  byte    - nextByte()
 *  short  - nextShott()
 *  int   - nextInt()
 *  long - nextLong()
 *  float - nextFloat();
 *  double - nextDouble();
 *  char  -
 *  boolean - nextBoolean()
 *  
 *  String  - next() , nextLine()
 *  
 *  
 *  
 *  
 *  */

/** */
