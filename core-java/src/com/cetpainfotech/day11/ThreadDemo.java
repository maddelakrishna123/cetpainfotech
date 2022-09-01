package com.cetpainfotech.day11;

public class ThreadDemo {

	public static void main(String[] args) {
		
	Thread t =	Thread.currentThread();
		
		System.out.println(t.getName());
		
		System.out.println(t.getId());
		
		System.out.println(t.getPriority());
		SampleThread st = new SampleThread(); //  id, name , priority
		st.setName("First Thread");
		st.setPriority(Thread.MAX_PRIORITY);
		System.out.println("Name :"+st.getName()); // Tread - 0
		                                            // Thread -1
		
		System.out.println(" Id  :"+st.getId()); //
		System.out.println("Priority :"+st.getPriority());  // 1 MIN- 5 NORM- 10 MAX
		st.start();   
	
		
		
		
	}
}



// currentThread() -  Thread