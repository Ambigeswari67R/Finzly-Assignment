package com.EmployeeSystem;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.configuration.HibernateConfig;
import com.entity.Employee;

public class CriteriaFunction {
	public static void main(String[] args) {
		salaryGT();
		deptDevAndTester();
		deptNotEqualTester();
		sortBySalary();
	}

	private static void sortBySalary() {
		Session session = HibernateConfig.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Criteria criteria = session.createCriteria(Employee.class);
        criteria.addOrder(Order.desc("salary"));
		List<Employee> list = criteria.list();
		for (Employee employee : list) {
			System.out.println(employee);
		}
		transaction.commit();
		session.close();
		
	}

	private static void deptNotEqualTester() {
		Session session = HibernateConfig.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Criteria criteria = session.createCriteria(Employee.class);
        criteria.add(Restrictions.ne("department", "Tester"));
		List<Employee> list = criteria.list();
		for (Employee employee : list) {
			System.out.println(employee);
		}
		transaction.commit();
		session.close();
		
	}

	private static void deptDevAndTester() {
		Session session = HibernateConfig.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Criteria criteria = session.createCriteria(Employee.class);
        criteria.add(Restrictions.and(
                Restrictions.eq("department", "Developer"),
                Restrictions.eq("department", "Tester")
            ));
		List<Employee> list = criteria.list();
		for (Employee employee : list) {
			System.out.println(employee);
		}
		transaction.commit();
		session.close();
		
	}

	private static void salaryGT() {
		Session session = HibernateConfig.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Criteria criteria = session.createCriteria(Employee.class);
        criteria.add(Restrictions.gt("salary", 30000));
		List<Employee> list = criteria.list();
		for (Employee employee : list) {
			System.out.println(employee);
		}
		transaction.commit();
		session.close();
		
	}


}
	