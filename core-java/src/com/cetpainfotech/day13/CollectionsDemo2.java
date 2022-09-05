package com.cetpainfotech.day13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CollectionsDemo2 {

	
	public static  List<Employee> loadEmployees(String filepath)
	{
		
		List<Employee> employeeList = new ArrayList<Employee>();
		
	BufferedReader br= null;
	
	try
	{
		br = new BufferedReader(new FileReader(new File(filepath)));
	
	
	     String line = br.readLine();
	     
	     while(line!=null)
	     {
	 String[] data =   	line.split(","); 
	 
	 
	 Employee emp = new Employee(Integer.parseInt(data[0]), data[1], data[2], Double.parseDouble(data[3]), data[4]);
	 
	 employeeList.add(emp);
	 line = br.readLine();
	 
	     }
	
	
	}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally
		{
			try {
				br.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		
		
		return employeeList;
	}
	
	
public static List<String> getEmailsOfEmployees(List<Employee> employees)	
{
	
	     List<String> emailsList = new ArrayList<String>();
	     
	     
	     for(Employee e:employees)
	     {
	    	 emailsList.add(e.getEmail());
	     }
	
	
	return emailsList;
}





public static Employee findEmployee(List<Employee> empList, int eid)
{
	
	
	
	return null;
}
	



public List<Employee> findEmployee(List<Employee> empList, double salaryFrom, double slaryTo)
{
	
	
	
	return null;
}




	
	
	
	public static void main(String[] args) {
		
String filepath = "D:\\emp.txt";


		
List<Employee> emps =		loadEmployees(filepath);


System.out.println(emps);


List<String> email =getEmailsOfEmployees(emps);

System.out.println(email);
		
		
	}

}
