package com.cetpainfotech.day8.assesment;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter How many Employees do you want to create ");
		
		int size = sc.nextInt();
		
		Employee[] employees = new Employee[size];
		sc.nextLine();
		
		for(int  i=0; i<employees.length;i++)
		{
			System.out.println("Enter Next Employees ");
			
			
			String emps = sc.nextLine();
			
			String[] empDetails = emps.split(",");
			
			
			Address address  = new Address();
			address.setCity(empDetails[6]);
			address.setState(empDetails[7]);
			address.setCountry(empDetails[8]);
			address.setPincode(empDetails[9]);
			address.setType(empDetails[10]);
			
			Employee e = new Employee();
			e.setId(Integer.parseInt(empDetails[0]));
			e.setName(empDetails[1]);
			e.setSalary(Double.parseDouble(empDetails[2]));
			e.setEmail(empDetails[4]);
			e.setMobile(empDetails[5]);
			e.setAddress(address);
			
			employees[i] = e;
		}
		
		
		
		
		while(true)
		{
			System.out.println("Enter Option\n1.Select By Email\n2.Select By Mobile\n3.Find Least And Highest Salaries\n4.Find Address\n5.Exit");
			
			int option = sc.nextInt();
			
			sc.nextLine();
			
			if(option == 1)
			{
				System.out.println("Enter Email ");
				String email = sc.nextLine();
			
			if(	EmployeeBo.findEmployeeByEmail(employees, email))
			{
				System.out.println("Employee found with "+email);
			}
			else
			{
				System.out.println("Employee not found with "+email);
			}
				
			}
			
			
			if(option==2)
			{
				System.out.println("Enter mobile ");
				String mobile = sc.nextLine();
				
				Employee e1 =EmployeeBo.findEmployeeByMobile(employees, mobile);
				
				System.out.println(e1);
			}
			// end of 2 
			
			
			if(option==3)
			{
				Employee[] leastandheightemps = EmployeeBo.findEmployees(employees);
				
				
				for(Employee e:leastandheightemps)
				{
					System.out.println(e);
				}
			}
			// end of 3
			
			if(option==4)
			{
				System.out.println("Enter Employee id");
				int eid =sc.nextInt();
				
				Address add = EmployeeBo.findAddress(employees, eid);
				
				System.out.println(add);
			}
			
			// end of 4
			
			if(option <1 || option> 4)
			{
				sc.close();
				System.exit(0);
			}
		}

	}

}
