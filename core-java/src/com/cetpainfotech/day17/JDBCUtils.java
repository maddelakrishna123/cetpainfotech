package com.cetpainfotech.day17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JDBCUtils {
	
	public static boolean createNewEmployee(Employee emp)
	{
		String query = "insert into employee values(?,?,?,?,?,?)";
		Connection conn = null;
		
		// 1. Register Driver 
		// 2. Establish Connection
		
				// 3. Statement - 
				 //  4.excute the queries
				
				
				// 5 process the results came from db
				
				// 6. Close the Connection
		try {
		//Class.forName("com.mysql.cj.jdbc.Driver");
		
		
	//	String url="jdbc:mysql://localhost:3306/trangile";  
		/*
		 *  1 What driver you are using 
		 *  
		 *  2 where is  db engine is runnig
		 *  
		 *  3 which data base you want to connect
		 *  
		 *  
		 *  
		 */
		
		//String dbusername ="root";
		//String dbpassword = "root";
		
		 conn = DBConnection.getConn();
		
		
		//Statement  st = conn.createStatement();
		
		//st.executeu
		 
		 PreparedStatement ps = conn.prepareStatement(query);
		
		// DDL (CReate , alter, drop), DML(insert , delete, update) , DRL (select), DTL 
		 
		 ps.setInt(1, emp.getId());
		 ps.setString(2, emp.getName());
		 ps.setString(3, emp.getEmail());
		 ps.setString(4, emp.getUsername());
		 ps.setString(5, emp.getPassword());
		 ps.setDouble(6, emp.getSalary());
		
		int res = ps.executeUpdate();  // >= 0
		
		if(res>=1)
		{
			
			
			 return true;
		}
		
		
		}
		catch (Exception e) {
			e.printStackTrace();
		  System.out.println(e.getMessage());
		}
		finally 
		{
			if(conn!=null)
			{
				try {
					conn.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
		}
		
		
		
		
		
		return false;
	}
	
	
// update : 
	
	
	public static boolean updateEmployeePassword(int eid, String newPassword)
	{
		
		
		
		  String query = "update employee set password=? where eid = ?";
		  
			Connection conn = null;
		  try {
				
				
				 conn = DBConnection.getConn();
				
				
				//Statement  st = conn.createStatement();
				 
				 PreparedStatement ps = conn.prepareStatement(query);
				
				// DDL (CReate , alter, drop), DML(insert , delete, update) , DRL (select), DTL 
				 
				ps.setString(1, newPassword);
				ps.setInt(2, eid);
				
				int res = ps.executeUpdate();  // >= 0
				
				if(res>=1)
				{
					
					
					 return true;
				}
				
				
				}
				catch (Exception e) {
					e.printStackTrace();
				  System.out.println(e.getMessage());
				}
				finally 
				{
					if(conn!=null)
					{
						try {
							conn.close();
						} catch (SQLException e) {
							
							e.printStackTrace();
						}
					}
				}
		  
		
		
		return false;
	}
	
	
	public static Employee getEmployee(int eid)
	{
		String query = "select * from employee where eid = ?";
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	try
	{
		
		
		con = DBConnection.getConn();
		
        ps = con.prepareStatement(query);
        
        ps.setInt(1, eid);
        
      rs =  ps.executeQuery();
      
      if(rs.next())
      {
    	Employee e = new Employee();
    	e.setId(rs.getInt(1));
    	e.setName(rs.getString(2));
    	e.setEmail(rs.getString(3));
    	e.setUsername(rs.getString(4));
    	e.setPassword(rs.getString(5));
    	e.setSalary(rs.getDouble(6));
    	
    	return e;
      }
	
	}catch (Exception e) {
	    e.printStackTrace();
	}finally
	{
		if(con!=null)
		{
			try {
				con.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
	}
		
		
		
		return null;
	}
	

	
	
	
	
	public static List<Employee> getAllEmplotyees()
	{
		List<Employee> emplist = new ArrayList<Employee>();
		

		String query = "select * from employee";
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	try
	{
		
		
		con = DBConnection.getConn();
		
        ps = con.prepareStatement(query);
        
        
      rs =  ps.executeQuery();
      
      while(rs.next())
      {
    	Employee e = new Employee();
    	e.setId(rs.getInt(1));
    	e.setName(rs.getString(2));
    	e.setEmail(rs.getString(3));
    	e.setUsername(rs.getString(4));
    	e.setPassword(rs.getString(5));
    	e.setSalary(rs.getDouble(6));
    	emplist.add(e);
      }
	
	}catch (Exception e) {
	    e.printStackTrace();
	}finally
	{
		if(con!=null)
		{
			try {
				con.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
	}
		
		
		
		return emplist;
	}
}
