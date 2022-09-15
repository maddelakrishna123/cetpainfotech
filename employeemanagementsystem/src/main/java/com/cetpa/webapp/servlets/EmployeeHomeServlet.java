package com.cetpa.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/employee-home")
public class EmployeeHomeServlet extends HttpServlet {
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		PrintWriter out = resp.getWriter();
		String email =(String) req.getAttribute("email");
		
		out.println("<html><head><title>Employee Home Page </title></head>");
		
		out.println("<body><div style='text-align:right'> Welcome "+req.getParameter("username")+" Email "+email);
		out.println("<a href='logout'>logout</a>");
		
		out.println("</div><div>");
		out.println("<a href='profile'>View Profile</a>");
		out.println("</div></body></html>");
		
	}

}
