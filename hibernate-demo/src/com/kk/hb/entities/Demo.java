package com.kk.hb.entities;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Demo {

	public static void main(String[] args) {
	Product p = new Product(1, "Pen", "Celtro", 6);

	 Configuration config = new Configuration();
	 config.configure("hibernate.cfg.xml");
	
	
	SessionFactory sesionFactory = config.buildSessionFactory();
	
	Session session = sesionFactory.openSession();
	
	Transaction tx = session.beginTransaction();
	
	session.save(p);
	tx.commit();
	sesionFactory.close();
	}

}
