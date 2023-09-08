package com.EmployeeSystem;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.configuration.HibernateConfig;
import com.entity.Employee;


public class Create {

	public static void main(String[] args) {
		Session session = HibernateConfig.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();
        System.out.println("Add New Employee \n");
        System.out.println("Enter Employee ID");
        employee.setId(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Enter Employee First Name");
        employee.setFirstName(scanner.nextLine());
        System.out.println("Enter Employee Last Name");
        employee.setLastName(scanner.nextLine());
        System.out.println("Enter Employee Date OF Birth");
        employee.setDateOfBirth(scanner.nextLine());
        System.out.println("Enter Employee Email");
        employee.setEmail(scanner.nextLine());
        System.out.println("Enter Employee Department");
        employee.setDepartment(scanner.nextLine());
        System.out.println("Enter Employee Salary");
        employee.setSalary(scanner.nextInt());
        session.save(employee);
        transaction.commit();
        session.close();
	}
}