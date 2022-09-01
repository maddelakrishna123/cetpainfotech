package com.cetpainfotech.day12;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class FileWritingDemo {

	public static void main(String[] args) {
		
		
		// 1. create file to write
		
		File fileToWrite = new File("employeedetails.txt");
		
		// 2. create Stream 
		
		
		Writer writer = null;
		
		//char[] data = {'j','a','v','a'};
		try
		{
	writer = new FileWriter(fileToWrite,true);
		
		// 3. Write Data to file
		
		//writer.write("Krishna Kumar , The Top Ranked Java Full stack Corporate trainer");
	
	PrintWriter out = new PrintWriter(writer);
	
	out.println("Krishna Kumar , The Top Ranked Java Full stack Corporate trainer");
		
		}catch (IOException e) {
			
			
			System.out.println(e.getMessage());
		}
		finally
		{
			try {
				writer.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}

	}

}
