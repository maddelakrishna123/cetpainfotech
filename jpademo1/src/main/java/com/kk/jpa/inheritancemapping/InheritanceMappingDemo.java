package com.kk.jpa.inheritancemapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritanceMappingDemo {

	public static void main(String[] args) {
		
		//Employee12 emp  = new Employee12(101, "krishna", "krishna@gmail.com", 30000);
		//RegularEmployee regemp = new RegularEmployee();
		/*ContractEmployee regemp = new ContractEmployee();
		regemp.setId(104);
		regemp.setName("nithin");
		regemp.setEmail("nithin@gmail.com");
		regemp.setHoursworked(20);
		regemp.setPayperhour(1000);
		regemp.setSalary(regemp.calculateSalary());
		*/
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpademo1");
		EntityManager manage = factory.createEntityManager();
		
	ContractEmployee ce =	manage.find(ContractEmployee.class, 104);
	
	System.out.println(ce.getId() +" "+ce.getName()+" "+ce.getHoursworked()+" "+ce.getPayperhour());

	}

}
