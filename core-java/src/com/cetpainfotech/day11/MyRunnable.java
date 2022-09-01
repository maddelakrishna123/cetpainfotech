package com.cetpainfotech.day11;

public class MyRunnable  implements Runnable{

	
	private Table table;
	
	
	
	public MyRunnable() {
		super();
	}


	public MyRunnable(Table table) {
		super();
		this.table = table;
	}


	public Table getTable() {
		return table;
	}


	public void setTable(Table table) {
		this.table = table;
	}


	@Override
	public void run() {
	
	table.printTable(9);
		
	}

}
