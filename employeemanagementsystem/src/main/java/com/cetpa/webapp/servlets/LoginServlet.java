package com.cetpa.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/login"},
initParams = { 
		@WebInitParam(name = "driver", value = "com.mysql.cj.jdbc.Driver"), 
		@WebInitParam(name = "url", value = "jdbc:mysql://localhost:3306/trangile"), 
		@WebInitParam(name = "username", value = "root"), 
		@WebInitParam(name = "password", value = "root")
})
public class LoginServlet  extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String username = req.getParameter("username");
		
		String password = req.getParameter("password");
		
		PrintWriter out = resp.getWriter();
		
		try
		{
Class.forName(getInitParameter("driver"));
			
			Connection con = DriverManager.getConnection(getInitParameter("url"), getInitParameter("username"), getInitParameter("password"));
			PreparedStatement ps = con.prepareStatement("select * from employee where usermame=? and password=?");
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				out.println("Hello "+username);
			}
			else
			{
				out.println("Invalid Username or password");
			
			}
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
			
	}

}
