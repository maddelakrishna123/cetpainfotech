package com.cetpainfotech.day10;

public class Demo1 {
	
	public static void main(String[] args) {
		
		String a = "90";
		int x = 90;
		int x1 = 90;
		// p - Object
		
		// boxing
		
		Integer i = new Integer(x);
		
		
		
		Integer i1 = new Integer(a);
		System.out.println("x = "+x +" x1 = "+x1);
		System.out.println("i = "+i +" i1 = "+i1);
		
		System.out.println(x==x1);
		System.out.println(i.intValue()==i1.intValue());
	
		
		
		
	}

}
