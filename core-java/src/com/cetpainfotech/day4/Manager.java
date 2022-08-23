package com.cetpainfotech.day4;

public class Manager  extends Employee{
	
	

	private double bonus;

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public Manager(int id, String name, int age, int salary, double bonus) {
		super(id, name, age, salary);
		this.bonus = bonus;
		
		System.out.println("All argument constructor of Manager");
	}

	public Manager()
	{
		//super();
		
		
	}
	
	public void printDetails()
	{// body can  be changed
		
		System.out.println("ID = "+id+" Name ="+name+" Age ="+age+" Salary ="+salary+"Bonus ="+bonus);
	}
	
	
	
	
	
	
	
}
