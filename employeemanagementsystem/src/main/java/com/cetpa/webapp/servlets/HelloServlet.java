package com.cetpa.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/hello"})
public class HelloServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		resp.setContentType("text/html");
		
		//System.out.println("HelloWorld");
	PrintWriter out =	resp.getWriter();
String username =	req.getParameter("username");
	out.println("<h1 style='color:red;'>Hello "+username+"<h1>");
	}
}
