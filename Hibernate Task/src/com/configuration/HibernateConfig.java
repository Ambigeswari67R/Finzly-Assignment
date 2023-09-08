package com.configuration;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Book;

public final class HibernateConfig {
	    public static SessionFactory getSessionFactory() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Book.class);
		SessionFactory sf = cfg.buildSessionFactory();
		return sf;

	}
}
