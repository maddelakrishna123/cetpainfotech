package com.trangile.spring.core.dao;

import java.sql.Connection;

import org.springframework.stereotype.Component;
@Component
public class DBConnection {
	
	
	public Connection getConnection()
	{
		System.out.println("Connection method is called");
		return null;
	}

}
