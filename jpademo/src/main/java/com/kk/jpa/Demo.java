package com.kk.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Demo {

	public static void main(String[] args) {
	
		 EntityManagerFactory factory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
		 EntityManager manager = factory.createEntityManager();
		 Employee em =	 manager.find(Employee.class, 101);
		 
		 System.out.println(em);
	/*Employee em =	 manager.find(Employee.class, 101);
	manager.getTransaction().begin();
	em.setMobile("8500493754");
	System.out.println(em);
	manager.getTransaction().commit();*/
	/*	Query query = manager.createQuery("from Employee e");
		 
	List list =	 query.getResultList();
		// System.out.println(list);
		 
		 for(Object o :list)
		 {
			 Employee emp = (Employee) o;
			 
			 System.out.println(emp);
		 }
	*/	 
	}

}

// jpa is specification(interfaces and abstract methods) - Hibernate ()ORM, EclipseLink
