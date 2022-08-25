package com.cetpainfotech.day6;

public abstract class Bank {
	private int accountnumber;
	private double balance;
	
	private  static final int x=90;
	
	public Bank()
	{
		
	}
	public Bank(int accountnumber,double balance)
	{
		this.accountnumber = accountnumber;
		this.balance = balance;
		
		
		
	}
	// concrete methods
	public void withdraw()
	{
		
	}
	
	public void deposit()
	{
		
	}
	
	public abstract int getROI(); // ABSTRACT METHOD
	

}

// abstract class can have 0 or more concrete methods

// abstract class can have 0 or more abstract methods

// abstract class can not be instantiated

// 0-100 of abstraction  is possible

// if you want to acheive 100% abstraction , we will go to Interfaces


// interface is a special class contains abstract methods , static and final variables ,, 1.8 default and static methods
// keyword interface 
