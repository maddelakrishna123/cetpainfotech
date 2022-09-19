package com.kk.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Demo {

	public static void main(String[] args) {
		
		
	//	Employee e = new Employee(108, "ram","ram@gmail.com" , "ram122", "123345", "9777777", 400000);
		
		//e.setAge(29);
		// EntityFactory
		
		EntityManagerFactory  factory = Persistence.createEntityManagerFactory("jpademo1");
		EntityManager entityManager = factory.createEntityManager();
		
		//entityManager.getTransaction().begin();
		//entityManager.persist(e);
		//entityManager.getTransaction().commit();
		
	//Employee emp =	entityManager.find(Employee.class, 108);

	//System.out.println(emp);
		// select * from employee where username=?
		Query query = entityManager.createQuery("from Employee e where e.username=?1");
		//query.setParameter("userid", "123345");
		query.setParameter(1, "123345");
	  query.setMaxResults(1);
	
	System.out.println(query.getSingleResult());
	}

}

// Transaction 
