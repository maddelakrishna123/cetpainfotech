package com.cetpainfotech.day3;

public class ArithmeticOperations {
	
	public int add(int a, int b)
	{
		System.out.println("int");
		return a + b;
	}

	public double add(double a, double b)
	{
		System.out.println("double");
		return a + b;
	}
	
	
	public int add(String s1, String s2)
	{
		return Integer.parseInt(s1)+Integer.parseInt(s2);
	}
}
