package com.trangile.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.trangile.spring.core.dao.EmployeeDao;
import com.trangile.spring.core.dao.EmployeeDaoJpaImpl;
import com.trangile.spring.core.models.Employee;
import com.trangile.spring.core.service.EmployeeService;
import com.trangile.spring.core.service.EmployeeServiceImpl;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		

		
		
	   Employee emp = (Employee) context.getBean("emp");
	   
	   System.out.println(emp);
Employee emp1 = (Employee) context.getBean("emp1");
	   
	   System.out.println(emp1);
	   
	}

}
