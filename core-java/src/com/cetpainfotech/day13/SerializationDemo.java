package com.cetpainfotech.day13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.cetpainfotech.day12.Employee;

public class SerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	/*
	
		Employee emp = new Employee(101, "Krishna", "krishna@gmail.com", 20000,"12345");

		
		
		FileOutputStream fos = new FileOutputStream(new File("emp.txt"));
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		
		oos.writeObject(emp); // serialization
		oos.close();
		*/
		
		
		FileInputStream fis = new FileInputStream(new File("emp.txt"));
		
		 ObjectInputStream ois = new ObjectInputStream(fis);
		 
	Employee emp =	 (Employee) ois.readObject();  // De Serialization
	
	System.out.println(emp);

		
		
		
	}

}
