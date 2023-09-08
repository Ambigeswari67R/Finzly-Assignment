package com.EmployeeSystem;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.configuration.HibernateConfig;
import com.entity.Employee;

public class Delete {
	public static void main(String[] args) {
		Session session = HibernateConfig.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();
        System.out.println("Enter Employee ID");
        employee.setId(sc.nextInt());
        session.delete(employee);
        transaction.commit();
        session.close();
	}
}