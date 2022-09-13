package com.cetpa.webapp.db;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBConnection {
	
private static Connection con = null;
	
	static 
	{
		
		try
		{
			
			Properties props = new Properties();
			props.load(new FileInputStream(new File("dbconfig.properties")));
			
			//Class.forName("com.mysql.cj.jdbc.Driver");  // different from oracle
			Class.forName(props.getProperty("driver")); 
			//String url="jdbc:mysql://localhost:3306/trangile";  
			
			//String dbusername ="root";
			//String dbpassword = "root";
			
			 con = DriverManager.getConnection(props.getProperty("url"),props.getProperty("dbusername") , props.getProperty("dbpassword"));
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static Connection getConn()
	{
		
		
	return con;
	}


}
