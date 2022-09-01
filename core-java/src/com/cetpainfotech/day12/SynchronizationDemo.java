package com.cetpainfotech.day12;

import com.cetpainfotech.day11.MyRunnable;
import com.cetpainfotech.day11.SampleThread;
import com.cetpainfotech.day11.Table;

public class SynchronizationDemo {
	
	public static void main(String[] args) {
		
		Table table = new Table();
		SampleThread st = new SampleThread();
		
		st.setTable(table);
		st.setPriority(Thread.MAX_PRIORITY);
		MyRunnable mr = new MyRunnable();
		mr.setTable(table);
		Thread t = new Thread(mr);
		
		st.start();
		t.start();
		
		
	}

}

//  st , t -  run () -  //  print 6 , 9
