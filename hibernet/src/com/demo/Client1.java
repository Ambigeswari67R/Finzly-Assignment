package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.common.HibernateConfig;
import com.pojo.Login;


public class Client1 {

	public static void main(String[] args) {
		SessionFactory sf= HibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
	    
	    
	    //read
	    Login login1 = session.get(Login.class,1);
        System.out.println(login1);
        transaction.commit();
        
        //create
        Login login = new Login();
	    login.setId(6);
		login.setName("Ambika Rajaram");
		login.setPassword("ambi21");
		session.save(login);
		transaction.commit();
		
		//update
        Login login2 = new Login();
	    login2.setId(6);
		login2.setName("Ambika Rajaram");
		login2.setPassword("2002");
		session.update(login2);
		transaction.commit();
		
		
		// Delete
        Login login3 = new Login();
        login3.setId(6);
        session.delete(login3);
        transaction.commit();
		session.close();

	}

}