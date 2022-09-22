package com.cetpa.webapp.services;

import java.util.List;

import com.cetpa.webapp.beans.Employee;
import com.cetpa.webapp.dao.EmployeeDao;
import com.cetpa.webapp.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService{

	
	private EmployeeDao dao; // dependency
	
	
	
	
	
	
	
	
	
	public EmployeeServiceImpl() {
		super();
	}

	public EmployeeServiceImpl(EmployeeDao dao) {
		super();
		this.dao = dao;
	}

	public EmployeeDao getDao() {
		return dao;
	}

	public void setDao(EmployeeDao dao) {
		this.dao = dao;
	}

	@Override
	public boolean createNewEmployee(Employee employee) {
		
		
		
		Employee existingEmployee = dao.findByIdOrUsernameOrEmail(employee.getId(), employee.getUsername(), employee.getEmail());
		 
		
		 if(existingEmployee !=null)
			 return false;
		return dao.save(employee);
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		
		
		
		return dao.update(employee);
	}

	@Override
	public boolean deleteEmployee(int empid) {
		
	
		return dao.delete(empid);
	}

	@Override
	public Employee getEmployeeById(int eid) {
	
		return dao.find(eid);
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return dao.findAll();
	}

	@Override
	public Employee getEmployeeByUsername(String username) {
		
		return dao.findByUserName(username);
	}

}
//EmployeeDao dao = new EmployeeDaoImpl();
// EmployeeService service = new EmployeeServiceImpl(dao);


// servlce.setDao(dao);
// service.createNewEmployee();


