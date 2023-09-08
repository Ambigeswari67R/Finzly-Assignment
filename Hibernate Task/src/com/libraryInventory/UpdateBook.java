package com.libraryInventory;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.configuration.HibernateConfig;
import com.entity.Book;

public class UpdateBook {
	public static void main(String[] args) {
		Session session = HibernateConfig.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        
        Book book = new Book();
        book.setId(1);
        book.setTitle("13 Reasons Why");
        book.setAuthor("Asher");
        book.setPublicationYear(2002);
        book.setIsbn(2);
        session.update(book);
        transaction.commit();
        session.close();
	}

}