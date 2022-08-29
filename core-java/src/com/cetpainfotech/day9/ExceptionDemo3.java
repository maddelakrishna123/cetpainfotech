package com.cetpainfotech.day9;

import java.util.Scanner;

import com.cetpainfotech.day6.Bank;

public class ExceptionDemo3 {
	
	
	
	public static Bank getBank(String bankname) throws ClassNotFoundException
	{
		
	Class.forName(bankname); // ClassNotFoundException
		
		return null;
	}
	
	

	public static void main(String[] args)   {
		
		Scanner sc = new Scanner(System.in);
		
		String className = sc.next();
		
		
		try
		{
		getBank(className);
		System.out.println("After Exection statement");
	
		}catch (ClassNotFoundException e) {
			System.out.println("BBB");
			
		}finally
		{
			System.out.println("aaaa");
			sc.close();	
		}

		
	
	}

}
