package com.cetpa.webapp.dao;

import java.util.List;

import com.cetpa.webapp.beans.Employee;

public interface EmployeeDao {
	
	public boolean save(Employee employee);
	public boolean update(Employee employee);
	public boolean delete(int empid);
	public Employee find(int empid);
	public Employee findByUserName(String username);
	public List<Employee> findAll();
	public Employee findByIdOrUsernameOrEmail(int eid,String username,String email);

}
