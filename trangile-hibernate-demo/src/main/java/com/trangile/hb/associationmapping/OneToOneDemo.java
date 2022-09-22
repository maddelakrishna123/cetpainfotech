package com.trangile.hb.associationmapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneDemo {

	public static void main(String[] args) {
	
		
Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
    	
    	SessionFactory factory = cfg.buildSessionFactory();
    	
		/*
		 * AtmCard card = new AtmCard(); card.setCno(90902); card.setCtype("Master");
		 * card.setIssueddate("12-09-2022");
		 */
    	
    	/*Account account = new Account();
    	//account.setAccno(0)
    	account.setName("Krishna Kumar");
    	account.setBalance(20000);
    	*/
    
    	//account.setAtmcard(null);
    	
    	Session session = factory.openSession();
    	
    	Account account = session.get(Account.class, 6000);
    	
    	System.out.println(account.getAtmcard().getIssueddate());
    	//Transaction tx = session.beginTransaction();
    	
    	
    	
		/*
		 * AtmCard atmcard = session.get(AtmCard.class,90901);
		 * 
		 * account.setAtmcard(atmcard); int accountno =(int) session.save(account);
		 * 
		 * System.out.println("account is Created with Id"+accountno);
		 */
    	//tx.commit();
    	
    	factory.close();
    	
	}

}
