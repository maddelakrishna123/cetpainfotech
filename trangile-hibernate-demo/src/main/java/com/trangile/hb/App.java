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
    	
    
    	
       	
    }
}
// get , load  - single

// cache - fir