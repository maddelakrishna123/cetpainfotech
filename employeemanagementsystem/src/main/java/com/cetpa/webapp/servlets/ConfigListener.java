package com.cetpa.webapp.servlets;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
@WebListener
public class ConfigListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		
		
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("In Linstener");
		ServletContext context = sce.getServletContext();
		context.setAttribute("driver", "com.mysql.cj.jdbc.Driver");
		context.setAttribute("url", "jdbc:mysql://localhost:3306/trangile");
		context.setAttribute("username", "root");
		context.setAttribute("password", "root");
		
	}

}
