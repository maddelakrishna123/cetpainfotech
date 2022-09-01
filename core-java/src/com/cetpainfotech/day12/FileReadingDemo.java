package com.cetpainfotech.day12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.cetpainfotech.day8.assesment.Address;
import com.cetpainfotech.day8.assesment.Employee;

public class FileReadingDemo {

	public static void main(String[] args) throws IOException {
		// 1 . Create File Object 
		
		File file = new File("D:\\personal\\11am-sessions\\employeedetails.txt");
		
		
		 Reader reader = null;
		 
		 BufferedReader br= null;
		// InputStream - a) Character Stream(Reader - FileReader)  , b) ByteStream (InpustStrean - FileInputStream)
		
		// OutputStream - a) Character Stream (Writer - FileWriter)   b) byte stream(OutPutStrean - FileOutPutStream)
		
		// 2. Create The stream - > inputStream
		
		 Employee[] employees = new Employee[6];
	try
	{
		 reader = new FileReader(file);  // BufferedReader 
		 
		 
		 
		 
		 // 3. Read characters from steam
		 
	/*int i =	 reader.read();
		while(i!=-1)
		{
	System.out.print((char)i);
	
	 i = reader.read();
		}*/
		/* 
		 char[] buffer = new char[10];
		 
		 reader.read(buffer, 4, 5);
		 
		 for(char c:buffer)
		 {
			 System.out.print(c);
		 }
		 
		 */
		 
		 
		 br = new BufferedReader(reader);
		 
		 
		 
String line =		 br.readLine();

int index = 0;

while(line!=null)
{
String[] empDetails =	line.split(",");
	
	
Address add = new Address(empDetails[6],empDetails[7],empDetails[8], empDetails[9], empDetails[10]);

	Employee emp = new Employee(Integer.parseInt(empDetails[0]), empDetails[1], empDetails[4], empDetails[5], Double.parseDouble(empDetails[2]),add);
	
	employees[index] = emp;
	
	//System.out.println(emp);
	index++;
	
	//System.out.println(line);
	
	line = br.readLine();
}
		

System.out.println("******************************************************************************************************");

for(Employee emp :employees)
{
	System.out.println(emp.getEmail()+" "+emp.getSalary());
}

	}
	catch (IOException e) {
	System.out.println(e.getMessage());	
	}
	finally
	{
		
	br.close();
	
	reader.close();
	
	}
	}
	
	// 4 close all streams 

}
