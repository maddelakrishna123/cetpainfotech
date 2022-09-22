package com.trangile.spring.core;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.trangile.spring.core.dao.EmployeeDao;
import com.trangile.spring.core.dao.EmployeeDaoHibernateImpl;
import com.trangile.spring.core.dao.EmployeeDaoJDBCImpl;
import com.trangile.spring.core.dao.EmployeeDaoJpaImpl;
import com.trangile.spring.core.models.Employee;
import com.trangile.spring.core.service.EmployeeService;
import com.trangile.spring.core.service.EmployeeServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	//ApplicationContext container = new ClassPathXmlApplicationContext("spring.xml");
    	
    	ApplicationContext container = new FileSystemXmlApplicationContext("D:\\Cetpa\\spring1.xml");
		/*
		 * String[] beanNames = container.getBeanDefinitionNames(); for(String bn
		 * :beanNames) { System.out.println(bn); }
		 */
 
         
         Employee emp = (Employee) container.getBean("emp");
         
         System.out.println(emp);
         
         Employee emp1 = (Employee) container.getBean("emp");
         
         System.out.println(emp1);
         
         EmployeeService service = container.getBean(EmployeeService.class);
    }
}
