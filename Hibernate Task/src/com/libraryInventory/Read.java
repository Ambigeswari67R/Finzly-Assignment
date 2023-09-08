package com.libraryInventory;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.configuration.HibernateConfig;
import com.entity.Book;

public class Read {
	public static void main(String[] args) {
		Session session = HibernateConfig.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Book book = session.get(Book.class,2);
        System.out.println(book);

		transaction.commit();
		session.close();
	}

}
