package com.libraryInventory;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.configuration.HibernateConfig;
import com.entity.Book;

public class DeleteBook {
	public static void main(String[] args) {
		Session session = HibernateConfig.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();

		Book book = new Book();
		book.setIsbn(7);
		session.delete(book);
		transaction.commit();
		session.close();
	}

}
