package com.kk.jpa;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo12 {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpademo1");
		
		
		EmployeeDao dao  = new EmployeeDaoImpl(factory.createEntityManager());
	//Employee e =	dao.find(108);
	
	//System.out.println(e);
		
	//	List<Employee> emps = dao.findAll();
		
  // emps.stream().forEach(t->System.out.println(t.getUsername()+" : "+t.getPassword()));
		Employee e = new Employee();
		e.setId(108);
		e.setName("Kumar");
		e.setEmail("abcde@gmail.com");
		e.setUsername("kumar1212");
		e.setPassword("12345");
		e.setAge(27);
		e.setMobile("897271626");
		
		//dao.save(e);
		
		
		//dao.delete(109);
		
		dao.update(e);

	}

}
