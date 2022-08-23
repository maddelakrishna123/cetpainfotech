package com.cetpainfotech.day4;

public class Student extends Person {

	private int marks ;

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public Student()
	{
		super();
		
	}
	
	
	public void printDetails()
	{// body can  be changed
		
		System.out.println("ID = "+id+" Name ="+name+" Age ="+age+" Marks ="+marks);
	}
}
