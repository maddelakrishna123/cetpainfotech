package com.trangile.hb.spring_orm_demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

public class EmployeeDaoHibernateTemplateImpl implements EmployeeDao{

	@Autowired
	private HibernateTemplate template;
	
	@Override
	@Transactional
	public boolean save(Employee employee) {
		
		int res =   (int) template.save(employee);
		
		if(res==employee.getEid())
			return true;
		
		return false;
	}

	@Override
	@Transactional
	public boolean update(Employee employee) {
		
		
		template.update(employee);
		return false;
	}

	@Override
	@Transactional
	public boolean delete(int empid) {
		
		Employee e = template.get(Employee.class, empid);
		
		if(e!=null)
		{
			template.delete(e);
		}
		return false;
	}

	@Override
	public Employee find(int empid) {
		
		return template.get(Employee.class, empid);
	}

	@Override
	public Employee findByUserName(String username) {
		
		
		
		return null;
	}

	@Override
	public List<Employee> findAll() {
		
		
	List list =	template.find("from Employee", null);
	List<Employee> employeeList = new ArrayList<Employee>();
	for(Object o:list)
	{
		Employee e = (Employee) o;
		employeeList.add(e);
	}
		return employeeList;
	}

	@Override
	public Employee findByIdOrUsernameOrEmail(int eid, String username, String email) {
		
		return null;
	}

	
	
}
