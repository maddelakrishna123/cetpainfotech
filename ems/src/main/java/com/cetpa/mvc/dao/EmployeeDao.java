package com.cetpa.mvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component
public class EmployeeDao {
@Autowired
	private JdbcTemplate template ;


public void get()
{
String ename =	template.queryForObject("select ename from employee where eid=101", String.class);
 
System.out.println(ename);

}
}
