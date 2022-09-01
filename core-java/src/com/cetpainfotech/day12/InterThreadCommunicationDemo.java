package com.cetpainfotech.day12;

public class InterThreadCommunicationDemo {

	public static void main(String[] args) {
		
		Customer c = new Customer();
		
		
		// Create Two Thread
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				
		c.withdraw(15000);
				
			}
		});
		
		
		
		t1.start();
		
		
	Thread t2 = new Thread(()->c.deposit(60000));
	
	t2.start();
		

	}

}
