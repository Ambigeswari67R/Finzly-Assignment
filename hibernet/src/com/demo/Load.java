package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.common.HibernateConfig;
import com.pojo.Login;


public class Load {

	public static void main(String[] args) {
		SessionFactory sf= HibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
	    Login e = session.load(Login.class, 1);
		System.out.println(e);
		tr.commit();
		session.close();

	}

}