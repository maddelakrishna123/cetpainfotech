package com.trangile.hb.spring_dao_jdbc_demo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class EmployeeResultSetExtractor implements ResultSetExtractor<Employee>{

	@Override
	public Employee extractData(ResultSet rs) throws SQLException, DataAccessException {
		
		
		Employee emp = null;
		
		if(rs.next())
		{
			emp  = new Employee();
			emp.setEid(rs.getInt(1));
			emp.setEname(rs.getString(2));
			emp.setEmail(rs.getString(3));
			emp.setUsername(rs.getString(4));
			emp.setPassword(rs.getString(5));
			emp.setSalary(rs.getDouble(6));

			emp.setMobile(rs.getString(7));
			emp.setAge(rs.getInt(8));
		}
		return emp;
	}

}
