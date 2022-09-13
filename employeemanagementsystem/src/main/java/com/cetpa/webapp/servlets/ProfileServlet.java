package com.cetpa.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProfileServlet
 */
@WebServlet(description = "This servlet creates profile of Employee", urlPatterns = { "/profile" })
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
	
		// read the input from request
		
	String id =	request.getParameter("empid");
		
		// fetch data from db
		
	
	
		//create response 
	
	
 PrintWriter pw =	  response.getWriter();
 
 
 
 
 try
 {
	
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/trangile","root","root");
 PreparedStatement ps = con.prepareStatement("select * from employee where eid =?");
 ps.setInt(1, Integer.parseInt(id));
 
 ResultSet rs = ps.executeQuery();
 
  if(rs.next())
  {
	  pw.println("Id ="+rs.getInt(1));
	  
	  pw.println("Name ="+rs.getString(2));
  }
  else
  {
	  pw.println("Employee details not Found");
  }
 }
catch (Exception e) {
	e.printStackTrace();
}
 
	
	
	}

}
