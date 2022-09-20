package com.kk.jpa.inheritancemapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritanceMappingDemo {

	public static void main(String[] args) {
		
		//Employee12 emp  = new Employee12(101, "krishna", "krishna@gmail.com", 30000);
		//RegularEmployee regemp = new RegularEmployee();
		ContractEmployee regemp = new ContractEmployee();
		regemp.setId(103);
		regemp.setName("Shubham");
		regemp.setEmail("subham@gmail.com");
		regemp.setHoursworked(20);
		regemp.setPayperhour(1000);
		regemp.setSalary(regemp.calculateSalary());
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpademo1");
		EntityManager manage = factory.createEntityManager();
		manage.getTransaction().begin();
		manage.persist(regemp);
		manage.getTransaction().commit();
		

	}

}
