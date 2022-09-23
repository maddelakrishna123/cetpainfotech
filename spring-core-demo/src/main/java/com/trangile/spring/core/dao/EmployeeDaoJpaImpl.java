package com.trangile.spring.core.dao;

import java.sql.Connection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.trangile.spring.core.models.Employee;
@Component
public class EmployeeDaoJpaImpl implements EmployeeDao{

	@Autowired
	private DBConnection dbCon;
	
	
	
	
	
	
	
	
	public DBConnection getDbCon() {
		return dbCon;
	}

	public void setDbCon(DBConnection dbCon) {
		this.dbCon = dbCon;
	}

	public EmployeeDaoJpaImpl(DBConnection dbCon) {
		super();
		this.dbCon = dbCon;
	}

	public EmployeeDaoJpaImpl()
	{
		System.out.println("Jpa Dao Impl");
	}
	
	@Override
	public boolean save(Employee employee) {
		
		dbCon.getConnection();
		System.out.println("JPA Implementation save method");
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
		DBConnection db = new DBConnection();
		Connection con = db.getConnection();
		
		
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
