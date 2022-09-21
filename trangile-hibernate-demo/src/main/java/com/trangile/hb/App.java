package com.trangile.hb;

import java.util.List;

import javax.persistence.Embeddable;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

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
    	
    	
    	Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
    	
    	SessionFactory factory = cfg.buildSessionFactory();
    	Session session = factory.openSession();
    	
    
    	
    	
   // Query q = session.createQuery(null, Product.class);
    	
    	//System.out.println(q.getSingleResult());
    	
    	// JPQL -// HQL
 
    	//Transaction tx = session.beginTransaction(); // save , update , delete
    	//Product p = new Product(6005, "Desktop", "Dell  4GB 512 SSD", 30000);
    	
    	//session.saveOrUpdate(p);
    	
		/*
		 * Product p = session.get(Product.class, 1); session.delete(p); tx.commit();
		 */
    	// session.close();
    	
    	
    }
}
// get , load  - single

// cache - fir