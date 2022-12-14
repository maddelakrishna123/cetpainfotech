package com.cetpainfotech.day8.assesment;

public class EmployeeBo {
	
	public static boolean findEmployeeByEmail(Employee[] employees, String email)
	{
		
		  for(Employee emp:employees)
		  {
			  if(emp.getEmail().equals(email))
			  {
				  return true;
			  }
		  }
		
		
		return false;
	}

	public static Employee findEmployeeByMobile(Employee[] employees, String mobile)
	{
		
		  for(int i= 0; i<employees.length;i++)
		  {
			  if(employees[i].getMobile().equals(mobile))
			  {
				  return employees[i];
			  }
		  }
		
		
		return null;
	}
	
	
	
	public static Address findAddress(Employee[] employees , int empid)
	
	{
		
		
		for(Employee emp : employees)
		{
			if(emp.getId() == empid)
			{
				return emp.getAddress();
			}
		}
		
		
		    return  null;
		
	}
	
	
	
	
	public static Employee[] findEmployees(Employee[] employees)
	{
		
		
		Employee[] emps = new Employee[2];
		
		
		double max_salary = Double.MAX_VALUE;   // 30000
		Employee emp =null;
		
		 for(Employee e:employees)
		 {
			 if(e.getSalary() < max_salary)
			 {
				 max_salary = e.getSalary();
				 
				 emp= e;
			 }
		 }
		
		 emps[0] = emp;
		 
		 double min_salary = Double.MIN_VALUE;
			
			
			 for(Employee e:employees)
			 {
				 if(e.getSalary() > min_salary)
				 {
					 max_salary = e.getSalary();
					 
					 emp= e;
				 }
			 }
			
			 emps[1] = emp;
		
		return emps;
	}
	
}
