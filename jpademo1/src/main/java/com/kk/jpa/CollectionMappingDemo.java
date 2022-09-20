package com.kk.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CollectionMappingDemo {
	
	public static void main(String[] args) {
		
		
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpademo1");
		
		EntityManager entityManager = factory.createEntityManager();
		
		Employee e = new Employee();
		e.setId(110);
		e.setName("Srilikitha");
		e.setEmail("srilikitha@gmail.com");
		e.setUsername("srilikita123");
		e.setPassword("123456");
		e.setMobile("12344555");
		e.setSalary(30000);
		
		Address ad1 = new Address();
		ad1.setPincode(500086);
		ad1.setCity("Hyderabad");
		ad1.setCountry("INDIA");
		ad1.setState("Telangana");
		Address ad2 = new Address();
		ad2.setPincode(500086);
		ad2.setCity("Hyderabad");
		ad2.setCountry("INDIA");
		ad2.setState("Telangana");
		
		List<Address> address = e.getAddressList();
		
		address.add(ad1);
		address.add(ad2);
		e.setAddressList(address);
		
		entityManager.getTransaction().begin();
		
		entityManager.persist(e);
		
		entityManager.getTransaction().commit();
		
		
	}

}
