package com.trangile.spring.core.dao;

import java.util.List;

import com.trangile.spring.core.models.Employee;

public class EmployeeDaoHibernateImpl implements EmployeeDao {

	@Override
	public boolean save(Employee employee) {
	System.out.println("Hibernate Implementation");
		return false;
	}

	@Override
	public boolean update(Employee employee) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int empid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Employee find(int empid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee findByUserName(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee findByIdOrUsernameOrEmail(int eid, String username, String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
