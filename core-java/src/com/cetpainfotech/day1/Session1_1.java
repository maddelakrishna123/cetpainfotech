package com.cetpainfotech.day1;

import java.util.Scanner;

public class Session1_1 {
	
	///
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any Number");
		
		int num = sc.nextInt();
		boolean status = Session2.isEven(num);
		
		if(status)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("ODD");
		}
		sc.close();
		
		
		
		
	}
// class
}
