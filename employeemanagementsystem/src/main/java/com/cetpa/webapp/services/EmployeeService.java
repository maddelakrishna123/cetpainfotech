package com.cetpa.webapp.services;

import java.util.List;

import com.cetpa.webapp.beans.Employee;

public interface EmployeeService {
	
	public boolean createNewEmployee(Employee employee);  // insert 
	
	public boolean updateEmployee(Employee employee);  // update
	public boolean deleteEmployee(int empid);  // delete
	public Employee getEmployeeById(int eid);  // select
	
	public Employee getEmployeeByUsername(String username); 
	public List<Employee> getAllEmployees(); // select

}
