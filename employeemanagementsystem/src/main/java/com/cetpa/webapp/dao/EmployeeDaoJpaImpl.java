package com.cetpa.webapp.dao;

import java.util.List;

import com.cetpa.webapp.beans.Employee;

public class EmployeeDaoJpaImpl implements EmployeeDao{

	@Override
	public boolean save(Employee employee) {
		
		return false;
	}

	@Override
	public boolean update(Employee employee) {
		
		return false;
	}

	@Override
	public boolean delete(int empid) {
		
		return false;
	}

	@Override
	public Employee find(int empid) {
		
		return null;
	}

	@Override
	public Employee findByUserName(String username) {
		
		return null;
	}

	@Override
	public List<Employee> findAll() {
		
		return null;
	}

	@Override
	public Employee findByIdOrUsernameOrEmail(int eid, String username, String email) {
		
		return null;
	}

}
