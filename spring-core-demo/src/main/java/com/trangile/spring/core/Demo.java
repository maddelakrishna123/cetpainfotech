package com.trangile.spring.core;

import com.trangile.spring.core.dao.EmployeeDao;
import com.trangile.spring.core.dao.EmployeeDaoJpaImpl;
import com.trangile.spring.core.models.Employee;
import com.trangile.spring.core.service.EmployeeServiceImpl;

public class Demo {

	public static void main(String[] args) {
		
		
		Employee e = new Employee();
		e.setId(101);
		
		EmployeeDao dao = new EmployeeDaoJpaImpl();
		EmployeeServiceImpl empservive = new EmployeeServiceImpl();
		
		
		empservive.setDao(dao);

	}

}
