package com.cetpa.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cetpa.webapp.beans.Employee;
import com.cetpa.webapp.dao.EmployeeDao;
import com.cetpa.webapp.dao.EmployeeDaoImpl;
import com.cetpa.webapp.db.DBConnection;
import com.cetpa.webapp.services.EmployeeService;
import com.cetpa.webapp.services.EmployeeServiceImpl;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet(
		urlPatterns = { "/register" }, 
		initParams = { 
				@WebInitParam(name = "driver", value = "com.mysql.cj.jdbc.Driver"), 
				@WebInitParam(name = "url", value = "jdbc:mysql://localhost:3306/trangile"), 
				@WebInitParam(name = "username", value = "root"), 
				@WebInitParam(name = "password", value = "root")
		})
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		// Read data 
		
		String eid = request.getParameter("eid");
		String fullname = request.getParameter("fullname");
		String username = request.getParameter("username");
		String password= request.getParameter("password");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		String salary = request.getParameter("salary");
		
		
		// connect To Data Base
		PrintWriter out = response.getWriter();
		
		try
		{
			
			EmployeeDao dao = new EmployeeDaoImpl();
			EmployeeService service = new EmployeeServiceImpl(dao);
			
			Employee emp = new Employee();
			emp.setId(Integer.parseInt(eid));

			emp.setName(fullname);
			emp.setEmail(email);
			emp.setUsername(username);
			emp.setPassword(password);
			emp.setSalary(Double.parseDouble(salary));
			emp.setMobile(mobile);
			 if(service.createNewEmployee(emp))
			 {
				 
				 request.setAttribute("status", "yes");
				 RequestDispatcher rd = request.getRequestDispatcher("message.jsp");
				 rd.forward(request, response);
				 
			 }
			 else
			 {
				 request.setAttribute("status", "no");
				 RequestDispatcher rd = request.getRequestDispatcher("message.jsp");
				 rd.forward(request, response);
			 }
			
			
			
			/*
			//Class.forName(getInitParameter("driver"));
			
			//Connection con = DriverManager.getConnection(getInitParameter("url"), getInitParameter("username"), getInitParameter("password"));
			
			Connection con = DBConnection.getConn(getServletContext());
			
			PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?,?,?,?,?)");
			
			ps.setInt(1, Integer.parseInt(eid));
			ps.setString(2, fullname);
			ps.setString(3, email);
			ps.setString(4, username);
			ps.setString(5, password);
			ps.setDouble(6, Double.parseDouble(salary));
			ps.setString(7, mobile);
			
			
			int res = ps.executeUpdate();
			
			if(res >=1)
			{
			
				out.print("Registered sucessfully");
			}
			
			*/
			
		}catch (Exception e) {
			//e.printStackTrace();
			
			response.sendRedirect("error.html");
		}
		
		// store in db
		
		
		// give the respone
	}

}
