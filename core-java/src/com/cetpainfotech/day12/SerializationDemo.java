package com.cetpainfotech.day12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class SerializationDemo {

	public static void main(String[] args) throws IOException {
	
		

		Employee emp = new Employee(101, "Krishna", "krishna@gmail.com", 20000);
		
		
		
		
		  OutputStream os = new FileOutputStream("emp.txt");
		  
		  
		  
		   ObjectOutputStream oos = new ObjectOutputStream(os);
		   
		   
		  
		 // os.write(emp.toString().getBytes());
		  
		  
		  
		//  InputStream is = new FileInputStream(new File("emp.txt"));
		  
		  

	}

}
