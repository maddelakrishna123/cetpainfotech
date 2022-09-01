package com.cetpainfotech.day10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		try
		{
		System.out.println("Enter String");	
		
		String str = sc.next();
		int n = NumberUtils.convertToIntFromHexString(str);
		
		System.out.println(n);
		
		//int number  = sc.nextInt();
		
//String hexString =		NumberUtils.convertToHexaDecimal(number);
		
	//	System.out.println(hexString);
		
		}catch (Exception e) {
			
			
			System.out.println("Error  "+e.getMessage());
		}
		finally
		{
			sc.close();
		}
		
		
	}
}
