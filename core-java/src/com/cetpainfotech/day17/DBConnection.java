package com.cetpainfotech.day17;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	private static Connection con = null;
	
	static 
	{
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/trangile";  
			
			String dbusername ="root";
			String dbpassword = "root";
			
			 con = DriverManager.getConnection(url, dbusername, dbpassword);
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static Connection getConn()
	{
		
		
	return con;
	}

}
