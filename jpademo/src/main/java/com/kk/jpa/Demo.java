package com.kk.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

public class Demo {

	public static void main(String[] args) {
	
		 EntityManagerFactory factory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
		 EntityManager manager = factory.createEntityManager();
		
		 
		// Query q = manager.createQuery("select e from Employee e where e.eid=1");
	//Employee e =(Employee)	 q.getSingleResult();
	//System.out.println(e);
		 //TypedQuery<Employee> tq = manager.createQuery("select e from Employee e where e.eid = 1", Employee.class);
		 
		 
		/// TypedQuery<Employee> tq = manager.createNamedQuery("select_employees", Employee.class);
		// Employee e = tq.getSingleResult();
		 //System.out.println(e);
		// List<Employee> empList = tq.getResultList();
		//empList.stream().forEach(t->System.out.println(t));
		// tq.getResultStream()
		 
		 CriteriaBuilder cb = manager.getCriteriaBuilder();
		 
		 CriteriaQuery<Employee> empQ = cb.createQuery(Employee.class);
		 empQ.from(Employee.class);
		 
		 
	}

}

// jpa is specification(interfaces and abstract methods) - Hibernate ()ORM, EclipseLink
