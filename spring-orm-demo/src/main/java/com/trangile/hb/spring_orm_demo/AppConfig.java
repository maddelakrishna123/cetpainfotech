package com.trangile.hb.spring_orm_demo;

import java.io.IOException;
import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = "com.trangile.hb.spring_orm_demo")
@PropertySource(value = "dbconfig.properties")
@EnableTransactionManagement
public class AppConfig {
	@Autowired
	private Environment env;
	
	
	@Bean
	
	public SessionFactory sessionfactory()
	{
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(datasource());
		sessionFactory.setPackagesToScan("com.trangile.hb.spring_orm_demo");
		
		sessionFactory.setHibernateProperties(hibernateProperties());
		try {
			sessionFactory.afterPropertiesSet();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return sessionFactory.getObject();
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
	
	private Properties hibernateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.dialect", env.getProperty("hibernate.dialect"));
		properties.put("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
		properties.put("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
		return properties;
	  }
	
	@Bean
	public HibernateTemplate hibernatetemplate()
	{
		HibernateTemplate template = new HibernateTemplate(sessionfactory());
		
		 return template;
	}
	
	
	@Bean
	  public HibernateTransactionManager hibTransMan() {
		return new HibernateTransactionManager(sessionfactory());
	  }
	
	
	
	@Bean
public EmployeeDao employeeDao()
{
	return new EmployeeDaoHibernateTemplateImpl();
}
	

}
