package com.trangile.spring.core.service;

import java.util.List;

import com.trangile.spring.core.dao.EmployeeDao;
import com.trangile.spring.core.models.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao dao;  // dependency
	
	
	
	public EmployeeDao getDao() {
		return dao;
	}

	public void setDao(EmployeeDao dao) {
		System.out.println("Setter Method is called");
		this.dao = dao;
	}
	
	
	
	

	public EmployeeServiceImpl() {
	
		super();
		System.out.println("Default Constructor in employee service");
	}

	public EmployeeServiceImpl(EmployeeDao dao) {
		super();
		
		this.dao = dao;
		System.out.println("One arg constructor");
	}

	@Override
	public boolean createNewEmployee(Employee employee) {
		
		
		System.out.println(employee);
		return dao.save(employee);
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		
		return false;
	}

	@Override
	public boolean deleteEmployee(int empid) {
		
		return false;
	}

	@Override
	public Employee getEmployeeById(int eid) {
		
		return null;
	}

	@Override
	public Employee getEmployeeByUsername(String username) {
		
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return null;
	}

}
