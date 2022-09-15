package com.cetpa.webapp.servlets;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
//@WebFilter(urlPatterns = "/login")
public class AuthenticationFilter implements Filter {

	@Override
	public void destroy() {
		
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		//
		String username =request.getParameter("username");
		System.out.println("Before Filter"+username);
		
		if(username.contains("_"))
		{
			throw new ServletException("Invalid Username");
		}
		else
		{
		chain.doFilter(request, response);
		}
		
		System.out.println("After Filter");
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
		
	}

}
