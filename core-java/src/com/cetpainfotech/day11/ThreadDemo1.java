package com.cetpainfotech.day11;

public class ThreadDemo1 {

	public static void main(String[] args) throws InterruptedException {
	
		SampleThread st = new SampleThread();
		
		MyRunnable mr = new MyRunnable();
		
		
		Thread t =  new Thread(mr);
		t.start();
		t.join();
		st.start();

	}

}
