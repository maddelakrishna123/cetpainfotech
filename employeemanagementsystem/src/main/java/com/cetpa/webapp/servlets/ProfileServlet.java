package com.cetpa.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cetpa.webapp.beans.Employee;
import com.cetpa.webapp.dao.EmployeeDao;
import com.cetpa.webapp.dao.EmployeeDaoImpl;
import com.cetpa.webapp.db.DBConnection;
import com.cetpa.webapp.services.EmployeeService;
import com.cetpa.webapp.services.EmployeeServiceImpl;

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
	
	//String username =	request.getParameter("username");
	HttpSession session = request.getSession();
	String username =	(String)session.getAttribute("username");
	System.out.println(username);
 PrintWriter pw =	  response.getWriter();
 
 
 
 
 try
 {
	 
	 
	 EmployeeDao dao = new EmployeeDaoImpl();
		EmployeeService service = new EmployeeServiceImpl(dao);
		
		Employee emp = service.getEmployeeByUsername(username);
	System.out.println(emp);
		request.setAttribute("emp", emp);
		 RequestDispatcher rd = request.getRequestDispatcher("emplopyeeprofile.jsp");
		 rd.forward(request, response);
	 /*
	 Connection con = DBConnection.getConn(getServletContext());
	 //Class.forName("com.mysql.cj.jdbc.Driver");
	 //Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/trangile","root","root");
 PreparedStatement ps = con.prepareStatement("select * from employee where usermame =?");
 //ps.setInt(1, Integer.parseInt(id));
 ps.setString(1, username);
 ResultSet rs = ps.executeQuery();
 
  if(rs.next())
  {
	 String data = rs.getInt(1)+"-"+rs.getString(2)+"-"+rs.getString(3);
	 
	   request.setAttribute("data", data);
	 
	 RequestDispatcher rd = request.getRequestDispatcher("emplopyeeprofile.jsp");
	 rd.forward(request, response);
	  
  }
  else
  {
	  pw.println("Employee details not Found");
  }
  
  
  */
  
 }
catch (Exception e) {
	e.printStackTrace();
}
 
	
	
	}

}
