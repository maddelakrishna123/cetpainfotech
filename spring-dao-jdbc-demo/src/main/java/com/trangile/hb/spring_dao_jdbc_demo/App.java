package com.trangile.hb.spring_dao_jdbc_demo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	
    	Employee employee = new Employee();
    	employee.setEid(111);
    	employee.setEname("Anukruthi");
    	employee.setEmail("anukruthi@gmail.com");
    	employee.setUsername("anukruthi123");
    	employee.setPassword("123456");
    	employee.setMobile("7766552718");
    	employee.setAge(27);
    	employee.setSalary(50000);
    	
    	EmployeeDao dao = context.getBean(EmployeeDao.class);
    	
    	
    	
   //Employee e = 	dao.find(111);
   List<Employee> e = dao.findAll();
  
   e.stream().forEach(t->System.out.println(t));
		/*
		 * if(dao.save(employee)) { System.out.println("Inserted"); } else {
		 * System.out.println("Not Inserted"); }
		 */
    	
    }
}
