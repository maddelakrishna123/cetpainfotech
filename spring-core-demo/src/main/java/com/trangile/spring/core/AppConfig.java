package com.trangile.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.trangile.spring.core.service.EmployeeService;
import com.trangile.spring.core.service.EmployeeServiceImpl;

@Configuration
@ComponentScan(basePackages = "com.trangile.spring.core")
public class AppConfig {
	
	
	
	/*
	 * @Bean(name="empServivce") public EmployeeService employeeService() {
	 * System.out.println("Employee Service method in configuaration file");
	 * 
	 * return new EmployeeServiceImpl(); }
	 */

}
