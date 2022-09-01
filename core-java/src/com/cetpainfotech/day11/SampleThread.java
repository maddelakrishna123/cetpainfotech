package com.cetpainfotech.day11;

public class SampleThread extends Thread {
	
	private Table table;
	
	
	
	
	public SampleThread() {
		super();
	}




	public Table getTable() {
		return table;
	}




	public void setTable(Table table) {
		this.table = table;
	}




	public SampleThread(Table table) {
		super();
		this.table = table;
	}




	@Override
	public void run()
	{
		
		table.printTable(6);
		
	}

}
