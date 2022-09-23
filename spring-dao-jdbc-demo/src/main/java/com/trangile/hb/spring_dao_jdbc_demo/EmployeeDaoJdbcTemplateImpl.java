package com.trangile.hb.spring_dao_jdbc_demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDaoJdbcTemplateImpl implements EmployeeDao {
   @Autowired
	private JdbcTemplate template;
	
	
	@Override
	public boolean save(Employee employee) {
		
		
		int res =   template.update("insert into employee(eid,ename,email,username,password,salary,mobile,age) values (?,?,?,?,?,?,?,?)",
				   employee.getEid(),
				   employee.getEname(),
				   
				   employee.getEmail(),
				   employee.getUsername(),
				   employee.getPassword(),
				   employee.getSalary(),
				   employee.getMobile(),
				   employee.getAge());
		
		
		if(res>=1)
			return true;
		return false;
	}

	@Override
	public boolean update(Employee employee) {
	
		return false;
	}

	@Override
	public boolean delete(int empid) {
		
		return false;
	}

	@Override
	public Employee find(int empid) {
	
	return	template.query("select * from employee where eid="+empid, new EmployeeResultSetExtractor());
	
	}

	@Override
	public Employee findByUserName(String username) {
	
		return null;
	}

	@Override
	public List<Employee> findAll() {
	
		return template.query("select * from employee", new EmployeeRowMapper());
	}

	@Override
	public Employee findByIdOrUsernameOrEmail(int eid, String username, String email) {
	
		return null;
	}

}
