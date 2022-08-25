package com.cetpainfotech.day6;

public class HDFCBank extends Bank {
 
	public HDFCBank()
	{
		super();
	}
	
	public HDFCBank(int accountnumber, double balance)
	{
		super(accountnumber, balance);
	}
	@Override
	public int getROI()
	{
		return 12;
	}
}

// every sub class constructor should invoke super class constructor