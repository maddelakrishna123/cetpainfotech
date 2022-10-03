package com.cetpa.mvc.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Component;

import com.cetpa.mvc.models.Employee;


@Component
public class EmployeeDaoJDBCImpl implements EmployeeDao{

	 @Autowired
		private JdbcTemplate template;
		
		
		@Override
		public boolean save(Employee employee) {
			
			
			int res =   template.update("insert into employee(eid,ename,email,username,password,salary,mobile,age) values (?,?,?,?,?,?,?,?)",
					   employee.getId(),
					   employee.getName(),
					   
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
		
			return template.query("select * from employee where username ='"+username+",", new EmployeeResultSetExtractor());
		}

		@Override
		public List<Employee> findAll() {
		
			return template.query("select * from employee", new EmployeeRowMapper());
		}

		@Override
		public Employee findByIdOrUsernameOrEmail(int eid, String username, String email) {
		
			 PreparedStatementSetter psSetter = new PreparedStatementSetter() {
				
				@Override
				public void setValues(PreparedStatement ps) throws SQLException {
					
					ps.setInt(1, eid);
					ps.setString(2, email);
					ps.setString(3, username);
					
				}
			};
			return template.query("select * from employee where eid=? or email =? or username = ?", psSetter, new EmployeeResultSetExtractor());
		}
}
