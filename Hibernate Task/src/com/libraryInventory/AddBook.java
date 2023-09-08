package com.libraryInventory;

import java.util.Scanner;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.configuration.HibernateConfig;
import com.entity.Book;

public class AddBook {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		SessionFactory sf = HibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		System.out.print("Enter book id : ");
		int id = sc.nextInt();

		System.out.print("Enter book title : ");
		String title = sc.nextLine();
		sc.nextLine();

		System.out.print("Enter author's name: ");
		String author = sc.nextLine();

		System.out.print("Enter Publication Year: ");
		int publicationYear = sc.nextInt();

		sc.nextLine();

		System.out.print("Enter ISBN: ");
		int isbn = sc.nextInt();

		session.save(new Book(id, title, author, publicationYear, isbn));
		transaction.commit();

		session.close();

		System.out.println("Book added successfully");

	}

	
}
