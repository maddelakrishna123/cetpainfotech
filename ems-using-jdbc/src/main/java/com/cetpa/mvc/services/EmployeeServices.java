package com.cetpa.mvc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cetpa.mvc.dao.EmployeeDao;
import com.cetpa.mvc.exceptions.DuplicateEmployeeFoundException;
import com.cetpa.mvc.exceptions.EmployeeNotFoundException;
import com.cetpa.mvc.models.Employee;
import com.cetpa.mvc.repository.EmployeeRepository;
//@Component
@Service
public class EmployeeServices {
	//@Autowired
	//private EmployeeDao dao;
	@Autowired
	private EmployeeRepository repo;
	public boolean createNewEmployee(Employee employee)
	{
		
		/*
		 * Employee existingEmployee = dao.findByIdOrUsernameOrEmail(employee.getId(),
		 * employee.getUsername(), employee.getEmail());
		 * 
		 * System.out.println(existingEmployee);
		 * 
		 * if(existingEmployee ==null) { return dao.save(employee); } else { throw new
		 * DuplicateEmployeeFoundException("Employee Deatils Already in DB"); }
		 */
		
		
		
		
		Employee existingEmployee = repo.findByIdOrEmailOrUsername(employee.getId(), employee.getEmail(), employee.getPassword());
		
		if(existingEmployee==null)
		{
	Employee e =	repo.save(employee);
	if(e!=null)
		return true;
	else
		return false;
		}
		else
		{
			throw new  DuplicateEmployeeFoundException("Employee Deatils Already in DB");
		}
		
		    
	}
	
	
	
	public Employee verifyLogin(String username,String password)
	{
		
		Optional<Employee> empOpt = repo.findByUsernameAndPassword(username, password);
		
		if(empOpt.isPresent())
		{
			return empOpt.get();
		}
		else
		{
		throw new EmployeeNotFoundException("Employee not found exception");	
		}

	}

	
	
}


