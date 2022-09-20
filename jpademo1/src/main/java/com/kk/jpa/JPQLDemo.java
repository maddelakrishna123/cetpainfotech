package com.kk.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NamedQuery;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class JPQLDemo {

	public static void main(String[] args) {
		
		
		
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpademo1");
		
		EntityManager entityManager = factory.createEntityManager();
		
		// JPQL - Object Oriented 
		
		// Query  - Query , TypedQuery, NamedQuery , NativeQuery
		
		//Query query = entityManager.createQuery("select e from Employee e where e.id = 101");  // select single row from table

	
		//Employee e =(Employee)  query.getSingleResult();
		
		
		
		//TypedQuery<Employee> query = entityManager.createQuery("select e from Employee e where e.id =:employeeid", Employee.class);
		// =:eid - Named Parameter
		//query.setParameter("employeeid", 102);
		//TypedQuery<Employee> query = entityManager.createQuery("select e from Employee e where e.id =?1", Employee.class);
		
		//query.setParameter(1, 103);
		
		//Employee e =query.getSingleResult();
		//System.out.println(e);
	
	
		//TypedQuery<Employee> query = entityManager.createNamedQuery("select_all_employees", Employee.class);
		
		//List<Employee> empList = query.getResultList();
		
		//empList.stream().forEach(t->System.out.println(t));
		
		//query.getResultStream().forEach(t->System.out.println(t));
		
		
		// Native Query ->  select * from employee where eid = 101;
		
Query q = entityManager.createNativeQuery("select * from employee where eid = 101", Employee.class);

System.out.println(q.getSingleResult());
		
	}

}


// SQL - select * from employee where eid = 101;

// JPQL - select e from Employee e where e.id = 101