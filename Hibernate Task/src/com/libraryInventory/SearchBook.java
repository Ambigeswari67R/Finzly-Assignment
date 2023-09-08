package com.libraryInventory;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.configuration.HibernateConfig;
import com.entity.Book;

public class SearchBook {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		searchByRange(2003, 2007);
		searchByAuthor();
		searchByTitle();
		searchByISBN();
		displayAllBooks();
	}

	private static void searchByISBN() {
		Session session = HibernateConfig.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Criteria criteria = session.createCriteria(Book.class);
		System.out.println("Enter ISBN Number");
		int isbn = scanner.nextInt();
		criteria.add(Restrictions.eq("isbn", isbn));
		List<Book> list = criteria.list();
		for (Book books : list) {
			System.out.println(books);
		}
		transaction.commit();
		session.close();

	}

	private static void displayAllBooks() {
		Session session = HibernateConfig.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Criteria criteria = session.createCriteria(Book.class);
		List<Book> list = criteria.list();
		for (Book books : list) {
			System.out.println(books);
		}
		transaction.commit();
		session.close();

	}

	private static void searchByTitle() {
		Session session = HibernateConfig.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Criteria criteria = session.createCriteria(Book.class);
		System.out.println("Enter Title Of Book");
		String title = scanner.nextLine();
		criteria.add(Restrictions.eq("title", title));
		List<Book> list = criteria.list();
		for (Book books : list) {
			System.out.println(books);
		}
		transaction.commit();
		session.close();

	}

	private static void searchByAuthor() {
		Session session = HibernateConfig.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Criteria criteria = session.createCriteria(Book.class);
		System.out.println("Enter Author Of Book");
		String author = scanner.nextLine();
		criteria.add(Restrictions.eq("author", author));
		List<Book> list = criteria.list();
		for (Book books : list) {
			System.out.println(books);
		}
		transaction.commit();
		session.close();

	}

	private static void searchByRange(int fromYear, int toYear) {
		Session session = HibernateConfig.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Criteria criteria = session.createCriteria(Book.class);
		criteria.add(Restrictions.between("publicationYear", fromYear, toYear));
		List<Book> list = criteria.list();
		for (Book Book : list) {
			System.out.println(Book);
		}
		transaction.commit();
		session.close();

	}

}


