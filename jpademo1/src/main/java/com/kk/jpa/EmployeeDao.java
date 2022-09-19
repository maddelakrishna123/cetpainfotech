package com.kk.jpa;

import java.util.List;



public interface EmployeeDao {
	
	public boolean save(Employee employee);
	public boolean update(Employee employee);
	public boolean delete(int empid);
	public Employee find(int empid);
	public Employee findByUserName(String username);
	public List<Employee> findAll();

}
