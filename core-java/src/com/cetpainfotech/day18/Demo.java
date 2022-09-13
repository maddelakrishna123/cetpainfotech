package com.cetpainfotech.day18;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.cetpainfotech.day17.DBConnection;
import com.cetpainfotech.day17.Employee;

public class Demo {
	public static void main(String[] args) throws SQLException {
		
		
		// fetch all records from employee
		
		String query = "select * from employee";  // DRL - ResultSet
		
		// String query1 = "update employee set salary = 10000 where eid = 101";  // No of rows updated
		
		// String query2 = "create table dept(depotno int primary key, deptname varchar(200))";  // 0 
		
		// 
		
		
		
		 // Establish Connection
		
		Connection con = DBConnection.getConn();
		
		
		// Create Statement : 
		
		Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		
		
		
		
		
		
		// call the methods to execute the queries
		
		
		// DML 
		
	ResultSet rs =	st.executeQuery(query);
		
	rs.absolute(4);
	
	
	
	rs.updateDouble(6, 200000);
	rs.updateRow();
	
	System.out.println(rs.getDouble(6));
	
	/*while(rs.next())
	{
		
		Employee e = new Employee();
		
		// fetch values from current row
		
		e.setId(rs.getInt(1));
		e.setEmail(rs.getString(3));
		
		
		System.out.println(e);
	}
		*/
		//st.execute
	}

}
