package com.demo;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.common.HibernateConfig;
import com.pojo.Login;


public class Client2 {

	public static void main(String[] args) {
		SessionFactory sf= HibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Login.class);
		//criteria.add(Restrictions.like("name", "ambika"));
		//criteria.add(Restrictions.ge("id", 4));
		
		List<Login> list = criteria.list();
		for (Login login : list) {
			System.out.println(login);
		}
		
	}

}