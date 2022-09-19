package com.cetpa.webapp.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.CellEditor;

import com.cetpa.webapp.beans.Employee;
import com.cetpa.webapp.db.DBConnection;

/**
 * Servlet implementation class FetchEmployeesServlet
 */
@WebServlet("/employees")
public class FetchEmployeesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Employee> empList = new ArrayList<Employee>();
		
		try
		{
			
			Connection con = DBConnection.getConn(getServletContext());
			Statement st = con.createStatement();
			ResultSet rs  = st.executeQuery("select * from Employee");
			
			while(rs.next())
			{
				Employee e = new Employee();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setEmail(rs.getString(3));
				e.setUsername(rs.getString(4));
				e.setPassword(rs.getString(5));
				e.setSalary(rs.getDouble(6));
				e.setMobile(rs.getString(7));
				
				empList.add(e);
			}
			
			request.setAttribute("empList", empList);
			
			RequestDispatcher rd=request.getRequestDispatcher("employeelist.jsp");
			
			rd.forward(request, response);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
