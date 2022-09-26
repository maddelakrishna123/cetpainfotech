package com.trangile.hb.spring_orm_demo;

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
      
   Employee e = new Employee();
      e.setEid(102);
      e.setEname("kumar");
      e.setEmail("kumar@gmail.com");
      e.setAge(34);
      e.setSalary(90000);
      e.setMobile("8500493754");
      e.setUsername("kumar1234");
      e.setPassword("123456");
      
      EmployeeDao dao = context.getBean(EmployeeDao.class);
      
      dao.delete(102);
      //System.out.println(dao.findAll());
		
		/*
		 * if(dao.update(e)) { System.out.println("Employee Created "); }else {
		 * System.out.println("Employee Not Created"); }
		 */
		 
      
    }
}
