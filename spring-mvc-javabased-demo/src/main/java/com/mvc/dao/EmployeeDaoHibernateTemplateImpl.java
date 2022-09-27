package com.mvc.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.mvc.models.Employee;

public class EmployeeDaoHibernateTemplateImpl implements EmployeeDao{

	@Autowired
	private HibernateTemplate template;
	
	@Override
	@Transactional
	public int save(Employee employee) {
		
		
		return (int)template.save(employee);
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
		
List list =		template.find("from Employee e where e.username=?0", username);
		
if(list.size()==1)
{
	return(Employee) list.get(0);
}
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
		
	List list =	template.find("from Employee e where e.username=?0 or e.email=?1",username,email);
		
	if(list.size()==1)
		return (Employee)list.get(0);
		
		return null;
	}

	
	
}
