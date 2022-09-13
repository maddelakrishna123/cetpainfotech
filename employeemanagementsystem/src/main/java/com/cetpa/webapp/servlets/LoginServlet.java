package com.cetpa.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/login"})
public class LoginServlet  extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String username = req.getParameter("username");
		
		String password = req.getParameter("password");
		
		PrintWriter out = resp.getWriter();
		
		if(username.equals("krishna") && password.equals("12345"))
		{
			out.println("Hello"+username);
		}
		else
		{
			out.println("Invalid Username or password");
		}
	}

}
