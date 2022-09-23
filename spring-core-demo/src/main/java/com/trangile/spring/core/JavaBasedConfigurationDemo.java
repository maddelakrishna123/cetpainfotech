package com.trangile.spring.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.trangile.spring.core.service.EmployeeService;

public class JavaBasedConfigurationDemo {
	
	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		EmployeeService service = context.getBean(EmployeeService.class);
		service.createNewEmployee(null);
		
	
	}

}
