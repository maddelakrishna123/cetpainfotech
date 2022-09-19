package com.cetpa.webapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cetpa.webapp.beans.Employee;
import com.cetpa.webapp.db.DBConnection;

public class EmployeeDaoImpl implements EmployeeDao {

	
	

	@Override
	public boolean save(Employee employee) {
	
		Connection con = null;
		PreparedStatement ps = null;
		
		try
		{
			con = DBConnection.getConn();  // 
			ps = con.prepareStatement("insert into employee values(?,?,?,?,?,?,?)");
			
			ps.setInt(1, employee.getId());
			
			ps.setString(2, employee.getName());
			ps.setString(3, employee.getEmail());
			ps.setString(4, employee.getUsername());
			ps.setString(5, employee.getPassword());
			ps.setDouble(6, employee.getSalary());
			ps.setString(7, employee.getMobile());
			
		int res =	ps.executeUpdate();
		if(res>=1)
		{
			return true;
		}
			
		}catch (Exception e) {
			
			e.printStackTrace();
		}
		finally {
			if(con!=null)
			{
				try {
					con.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
		}
		// connection
		
		// Statement
		
		// exucute the query;
		
		
		return false;
	}

	@Override
	public boolean update(Employee employee) {
		
		
		Connection con = null;
		PreparedStatement ps = null;
		
		try
		{
			con = DBConnection.getConn();
			ps = con.prepareStatement("upadte employee set ename=? ,salary = ? , mobile =? where empid=?");
			
			
			
			ps.setString(1, employee.getName());
			
			ps.setDouble(2, employee.getSalary());
			ps.setString(3, employee.getMobile());
			ps.setInt(4, employee.getId());
			
		int res =	ps.executeUpdate();
		if(res>=1)
		{
			return true;
		}
			
		}catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
		return false;
	}

	@Override
	public boolean delete(int empid) {
		
		
		Connection con = null;
		PreparedStatement ps = null;
		
		try
		{
			con = DBConnection.getConn();
			ps = con.prepareStatement("delete from employee where empid=?");
			
			
			
			
			ps.setInt(2, empid);
			
		int res =	ps.executeUpdate();
		if(res>=1)
		{
			return true;
		}
			
		}catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		return false;
	}

	@Override
	public Employee find(int empid) {
		
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		Employee emp = null;
		
		try
		{
			con = DBConnection.getConn();
			ps = con.prepareStatement("select * from employee where empid=?");
			
			
			
		
			ps.setInt(4, empid);
			
			rs = ps.executeQuery();
			
			if(rs.next())
			{
				emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setEmail(rs.getString(3));
				emp.setUsername(rs.getString(4));
				emp.setPassword(rs.getString(5));
				emp.setSalary(rs.getDouble(6));
				emp.setMobile(rs.getString(7));
			}
			
		
			
		}catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
		return emp;
	}

	@Override
	public List<Employee> findAll() {
		
		List<Employee> empList = new ArrayList<Employee>();

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		Employee emp = null;
		
		try
		{
			con = DBConnection.getConn();
			ps = con.prepareStatement("select * from employee");
			
			
			
		
			
			
			rs = ps.executeQuery();
			
			while(rs.next())
			{
				emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setEmail(rs.getString(3));
				emp.setUsername(rs.getString(4));
				emp.setPassword(rs.getString(5));
				emp.setSalary(rs.getDouble(6));
				emp.setMobile(rs.getString(7));
				
				empList.add(emp);
			}
			
		
			
		}catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
		return empList;
	}

	@Override
	public Employee findByIdOrUsernameOrEmail(int eid, String username, String email) {
		
		

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		Employee emp = null;
		
		try
		{
			con = DBConnection.getConn();
			ps = con.prepareStatement("select * from employee where eid=? or username =? or email =?");
			
			
			
		
			ps.setInt(1, eid);
			ps.setString(2, username);
			ps.setString(3, email);
			
			rs = ps.executeQuery();
			
			if(rs.next())
			{
				emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setEmail(rs.getString(3));
				emp.setUsername(rs.getString(4));
				emp.setPassword(rs.getString(5));
				emp.setSalary(rs.getDouble(6));
				emp.setMobile(rs.getString(7));
			}
			
		
			
		}catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
		return emp;
	}

	@Override
	public Employee findByUserName(String username) {
		System.out.println(username);
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		Employee emp = null;
		
		try
		{
			con = DBConnection.getConn();
			ps = con.prepareStatement("select * from employee where username=?");
			
			
			
		
			ps.setString(1, username);
			
			rs = ps.executeQuery();
			
			if(rs.next())
			{
				System.out.println("********8****");
				emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setEmail(rs.getString(3));
				emp.setUsername(rs.getString(4));
				emp.setPassword(rs.getString(5));
				emp.setSalary(rs.getDouble(6));
				emp.setMobile(rs.getString(7));
			}
			
		
			
		}catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
		return emp;
	}

}
