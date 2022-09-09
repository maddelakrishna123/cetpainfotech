package com.cetpainfotech.day17;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class JDBCDemo {
	
	public static void main(String[] args) throws IOException {
		
		
		
	//Employee emp =	JDBCUtils.getEmployee(104);
	//System.out.println(emp);
		
		List<Employee> empList = JDBCUtils.getAllEmplotyees();
		
		empList.stream().forEach(t->System.out.println(t));
		
		
		
		// 
		
		
		//BufferedReader br = new BufferedReader(new FileReader(new File("D:\\emp.txt")));
		
	/*	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 101,krishna@12344
		System.out.println("Enter Details");
		String line = br.readLine();
		
		String[] data = line.split(",");
		
		if(JDBCUtils.updateEmployeePassword(Integer.parseInt(data[0]), data[1]))
		{
			System.out.println("Updated");
		}else
		{
			System.out.println("Not Updated");
		}
		
		*/
		/*while(line!=null)
		{
			String[] details = line.split(",");
			
			
			Employee emp = new Employee(Integer.parseInt(details[0]), details[1],details[2], Double.parseDouble(details[3]), details[4], details[5]);
	
		
			if( JDBCUtils.createNewEmployee(emp)) {
				System.out.println("Employee details stored successfully");	
				}
				else
				{
					System.out.println("Not Stored");
				}
			
			
			line = br.readLine();
			
		
		}
		
		*/
		
	}

}
