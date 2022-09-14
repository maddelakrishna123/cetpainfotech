package com.cetpa.webapp.db;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import javax.servlet.ServletContext;

public class DBConnection {
	
private static Connection con = null;
	
	
	
	public static Connection getConn(ServletContext context)
	{
		
		
		
		//System.out.println(context.getAttribute("driver"));
	/*	
		String driver = context.getInitParameter("driver");
		String url = context.getInitParameter("url");
		String dbusername = context.getInitParameter("username");
		String dbpassword = context.getInitParameter("password");
		*/
		String driver =(String) context.getAttribute("driver");
		String url = (String) context.getAttribute("url");
		String dbusername = (String) context.getAttribute("username");
		String dbpassword = (String) context.getAttribute("password");
		try
		{
			
			Class.forName(driver);
			con = DriverManager.getConnection(url, dbusername, dbpassword);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	return con;
	}


}
