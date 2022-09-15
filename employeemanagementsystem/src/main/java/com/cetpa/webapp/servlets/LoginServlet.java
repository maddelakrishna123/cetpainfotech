package com.cetpa.webapp.servlets;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cetpa.webapp.db.DBConnection;
/*
@WebServlet(urlPatterns = {"/login"},
initParams = { 
		@WebInitParam(name = "driver", value = "com.mysql.cj.jdbc.Driver"), 
		@WebInitParam(name = "url", value = "jdbc:mysql://localhost:3306/trangile"), 
		@WebInitParam(name = "username", value = "root"), 
		@WebInitParam(name = "password", value = "root")
})*/

@WebServlet(urlPatterns = {"/login"})
public class LoginServlet  extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		String username = req.getParameter("username");
		
		String password = req.getParameter("password");
		
		PrintWriter out = resp.getWriter();
	ServletContext context =	getServletContext();
	
	//System.out.println(context.getAttribute("driver"));
	
	//String driver = context.getInitParameter("driver");
//	String url = context.getInitParameter("url");
	//String dbusername = context.getInitParameter("username");
	//String dbpassword = context.getInitParameter("password");
	
	
		
		try
		{
//Class.forName(getInitParameter("driver"));
			//Class.forName(driver);		
			//Connection con = DriverManager.getConnection(getInitParameter("url"), getInitParameter("username"), getInitParameter("password"));
//Connection con = DriverManager.getConnection(url, dbusername, dbpassword);
	
			
			Connection con = DBConnection.getConn(context);
			
			PreparedStatement ps = con.prepareStatement("select * from employee where usermame=? and password=?");
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				//out.println("Hello "+username);
				
				//resp.sendRedirect("employee-home?username="+username);
				
				//
				
				HttpSession session = req.getSession();
				
				session.setAttribute("username", username);
				req.setAttribute("email", rs.getString(3));
				
				RequestDispatcher rd = req.getRequestDispatcher("employeehome.jsp");
				
				rd.forward(req, resp);
			}
			else
			{
				out.println("Invalid Username or password");
				RequestDispatcher rd = req.getRequestDispatcher("login.html");
			
			rd.include(req, resp);
			}
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
			
	}

}
