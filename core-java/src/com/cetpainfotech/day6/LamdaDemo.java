package com.cetpainfotech.day6;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class LamdaDemo {
	public static void main(String[] args) {
		
		// public int add(int a, int b);
		
		
		Adder adder =(x,y)-> x + y;
		
		
		
	int res =	adder.add(3,9);
	
	System.out.println(res);
	
	Speaker s = ()->System.out.println("Lamda expression");
	s.speak();
	
	Consumer<Integer>  consumer= (Integer x)->System.out.println(x+10);
	
	consumer.accept(90);
	
	
	Predicate<String>   predicate = (String str)->{
		
		
		StringBuffer sb = new StringBuffer(str);
		
		sb.reverse();
		if(sb.toString().equals(str))
		{
			return true;
		}
		
		return false;
	};
	
	System.out.println(predicate.test("abax"));
	
	
	Predicate<Integer> intPredicate = (Integer x)-> x%2==0;
	
	
	}

	
	

	
	
	
	
}
