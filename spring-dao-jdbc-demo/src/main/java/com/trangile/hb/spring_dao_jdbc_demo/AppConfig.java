package com.trangile.hb.spring_dao_jdbc_demo;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.trangile.hb.spring_dao_jdbc_demo")
@PropertySource(value = "dbconfig.properties")
public class AppConfig {
	@Autowired
	private Environment env;
	
	@Bean
	public JdbcTemplate template()
	{
		JdbcTemplate template = new JdbcTemplate(datasource());
		
		return template;
	}
	
	@Bean
	public DataSource datasource()
	{
		
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName(env.getProperty("driver"));
		ds.setUrl(env.getProperty("url"));
		ds.setUsername(env.getProperty("dbusername"));
		ds.setPassword(env.getProperty("dbpassword"));
		
		return ds;
	}
	
	
	@Bean(name = "dao")
	public EmployeeDao employeedao()
	{
		
		return new EmployeeDaoJdbcTemplateImpl();
	}

}
