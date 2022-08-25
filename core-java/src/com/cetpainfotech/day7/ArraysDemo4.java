package com.cetpainfotech.day7;

import java.util.Scanner;

public class ArraysDemo4 {
	
	
	
	
	public static int sumOfDigits(String str)
	{
		
		int sum =0;
		
		int num = Integer.parseInt(str);
		
		    while(num!=0)
		    {
		    int rem = num%10;
		    
		    sum+=rem;
		    num/=10;
		    }
		return sum;
		
		
	}

	public static void main(String[] args) {
		
		
		// Read 5 strings - each string should contains only digits
		
		// "123"  , "234"; "456" ,"876" 
		
		// out : 6 , 9 , 15 ,21 
		
		
		String numbers [] = new String[5];
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the inputs ");
		for(int i = 0; i<numbers.length; i++)
		{
			numbers[i] = sc.next();
		}
		
		
		
		for(String s:numbers)
		{
		int n =	sumOfDigits(s);
		
		System.out.println(n);
		}
		
		

	}

}
