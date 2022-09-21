package com.cetpa.hb.hibernate_demo_maven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Product p = new Product(1, "Pen", "Celtro", 6);
        //System.out.println( "Hello World!" );
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
