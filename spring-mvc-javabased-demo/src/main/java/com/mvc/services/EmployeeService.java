package com.mvc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.dao.EmployeeDao;
import com.mvc.exception.DuplicateEmployeeFoundException;
import com.mvc.models.Employee;

@Service
public class EmployeeService {
   @Autowired
	private EmployeeDao dao;
	
	public int createNewEmployee(Employee employee)
	{
	Employee emp =	dao.findByIdOrUsernameOrEmail(0,employee.getUsername(), employee.getEmail());
	
	System.out.println(emp);
	if(emp!=null)
	{
		throw new DuplicateEmployeeFoundException("Employee details already exsited");
	}else
	{
		return dao.save(employee);
	}
		
	}
	
	public Employee getEmployee(String username)
	{
	Employee e =	dao.findByUserName(username);
	
	
		
		return e;
	}
	
	
	
}
