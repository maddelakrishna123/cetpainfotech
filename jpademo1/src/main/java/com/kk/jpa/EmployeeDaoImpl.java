package com.kk.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class EmployeeDaoImpl implements EmployeeDao{

	 private EntityManager entityManager;
	 
	 
	
	
	
	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	
	
	
	
	
	public EmployeeDaoImpl() {
		super();
	}

	public EmployeeDaoImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	@Override
	public boolean save(Employee employee) {
	
		
		entityManager.getTransaction().begin();
		    entityManager.persist(employee);
		entityManager.getTransaction().commit();
		// insert
		return true;
	}

	@Override
	public boolean update(Employee employee) {
		
		
		Employee e = entityManager.find(Employee.class, employee.getId());
		entityManager.getTransaction().begin();
		//entityManager.remove(e);;
		
		    e.setEmail(employee.getEmail());
		entityManager.getTransaction().commit();
		return false;
	}

	@Override
	public boolean delete(int empid) {
		
		Employee e = entityManager.find(Employee.class, empid);
		entityManager.getTransaction().begin();
		entityManager.remove(e);;
		entityManager.getTransaction().commit();
		return true;
	}

	@Override
	public Employee find(int empid) {
		
		
		
		return entityManager.find(Employee.class,empid);
	}

	@Override
	public Employee findByUserName(String username) {
		// select * from employee where username =
		// JPQL - Object Oriented 
		
		
		Query query = entityManager.createQuery("from Employee e where e.username=:userid");
		
		query.setParameter("userid", username);
		return (Employee)query.getSingleResult();
	}

	@Override
	public List<Employee> findAll() {
		
		 List<Employee> empList = new ArrayList<Employee>();
		 
		 Query query = entityManager.createQuery("from Employee e");
		
	List list =	 query.getResultList();
	
	for(Object o:list)
	{
		Employee e  = (Employee) o;
		
		empList.add(e);
	}
		
		return empList;
	}

}
