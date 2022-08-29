package com.cetpainfotech.day9;

import java.util.Scanner;

import com.cetpainfotech.day6.Bank;
import com.cetpainfotech.day6.HDFCBank;

public class CheckedDemo {

	public static void main(String[] args) throws ClassNotFoundException{
		
		


		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter class name :");

		String className = scanner.nextLine();
		
		//String s1 = "com.cetpainfotech.day6.HDFCBank";

		Class c =	Class.forName(className); // input string must be any classtype

	
	
	}

}
