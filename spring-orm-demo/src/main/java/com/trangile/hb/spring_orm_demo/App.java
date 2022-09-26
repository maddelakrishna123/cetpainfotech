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
      
    /*  Employee e = new Employee();
      e.setEid(101);
      e.setEname("krishna kumar");
      e.setEmail("krishna@gmail.com");
      e.setAge(34);
      e.setMobile("8500493754");
      e.setUsername("krishna1234");
      e.setPassword("123456");
      */
      EmployeeDao dao = context.getBean(EmployeeDao.class);
      
      Employee emp = dao.find(101);
      System.out.println(emp);
    /*if(dao.save(e))
    {
    	System.out.println("Employee Created ");
    }else
    {
    	System.out.println("Employee Not Created");
    }*/
      
    }
}
