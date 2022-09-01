package com.cetpainfotech.day11;

public class Table {
	
	
	public  synchronized void printTable(int n)
	{
		
		
		for(int i =1; i<=10;i++)
			{
				System.out.println(n +" * "+i+" = "+(n*i));
			}
		

		
		// 200 lines
	}

}
