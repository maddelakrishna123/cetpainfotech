package com.cetpainfotech.day6;

public interface Speaker {
	
	public static final int x=90;
	public abstract void speak(); // abstract
	
	
	public  default void display()
	{
		System.out.println("Default methods in interfaces");
	}
	
	public static void printName(String name)
	{
		System.out.println("My Name is "+name);
	}
	

}

// interfaces can not be instantiated

/*
 *  Ways to implement interfaces 
 *  
 *  
 *  1) using seperate sub class
 *  
 *   class Teacher implements Speaker
 *   {
 *   // override the methods
 *   }
 *  
 *  
 *  2) using anonymous inner class - class defined inside the other class
 *  
 *  className/InterfaceName refvariable = new ClassName/InterfaceName(){
 *  
 *  // override the methods
 *  };
 *  
 *  
 *  
 *  // from 1.8 :
 *  
 *  
 *  
 *  
 *  lambda expression - functional
 *  
 *  
 *  method references
 *  
 *  */
