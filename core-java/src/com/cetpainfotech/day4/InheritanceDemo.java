package com.cetpainfotech.day4;

import java.util.Scanner;

public class InheritanceDemo {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		
		
		
		
		
		
		Person  p = new Person(1,"krishna",35);
		Person  p1 = new Person(1,"krishna",35);
	    System.out.println(p.equals(p1));
	    System.out.println(p1.hashCode());
	    System.out.println(p.hashCode());
	   
			}

}

// com.cetpainfotech.day4.Person@5e265ba4 hashstring

// Objects always created while run time
// When ever you invoke any sub class constructor then its super class class will be invoked automatically(Constructor chaining)

// using sub class reference you can access all its members and all public members of its super class not vice versa


// Super class refenence can hold Sub class Object 

// sup class reference can not hold the super class objects