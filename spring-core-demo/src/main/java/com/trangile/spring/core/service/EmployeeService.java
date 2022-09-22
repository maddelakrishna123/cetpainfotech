package com.trangile.spring.core.service;

import java.util.List;

import com.trangile.spring.core.models.Employee;



public interface EmployeeService {
	
	public boolean createNewEmployee(Employee employee);  // insert 
	
	public boolean updateEmployee(Employee employee);  // update
	public boolean deleteEmployee(int empid);  // delete
	public Employee getEmployeeById(int eid);  // select
	
	public Employee getEmployeeByUsername(String username); 
	public List<Employee> getAllEmployees(); // select

}
