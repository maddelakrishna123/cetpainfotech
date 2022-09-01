package com.cetpainfotech.day12;

public class Customer {

	
	int amount=10000;    
    
	synchronized void withdraw(int amount){    
	System.out.println("going to withdraw...");    
	    
	if(this.amount<amount){    
	System.out.println("Less balance; waiting for deposit...");    
	
	
	try{wait();}catch(Exception e){}    
	}    
	this.amount-=amount;    
	System.out.println("withdraw completed...");    
	}    
	    
	synchronized void deposit(int amount){ 
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	System.out.println("going to deposit...");    
	this.amount+=amount;    
	System.out.println("deposit completed... ");    
	notify();    
	}    
}
