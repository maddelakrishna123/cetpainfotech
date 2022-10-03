package com.cetpa.mvc.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cetpa.mvc.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	// QueryMethods
	public Optional<Employee> findByUsernameAndPassword(String username,String password);
	
	public Employee findByIdOrEmailOrUsername(int id,String email,String username);
}
