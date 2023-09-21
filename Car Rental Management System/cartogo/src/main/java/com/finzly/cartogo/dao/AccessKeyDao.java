package com.finzly.cartogo.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finzly.cartogo.entity.AccessKey;
import com.finzly.cartogo.entity.Role;

@Repository
public class AccessKeyDao {
	@Autowired
	SessionFactory factory;

	public List<AccessKey> getAccessKey() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(AccessKey.class);
		return criteria.list();
	}

	public String saveAccessKey(AccessKey accessKey) {
		Session session = factory.openSession();
		session.save(accessKey);
		session.beginTransaction().commit();
		return "accessKey Inserted in to table";
	}

	public List<AccessKey> getAccessKeyById(Long id) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(AccessKey.class);
		criteria.add(Restrictions.eq("id", id));
		return criteria.list();
	}

	public String editAccessKeyById(Long id, AccessKey accessKey) {
		Session session = factory.openSession();
		Transaction tx = null;
		String resultMessage = "";

		try {
			tx = session.beginTransaction();

			AccessKey existingAccessKey = session.get(AccessKey.class, id);

			if (existingAccessKey != null) {

				existingAccessKey.setCarPackage(accessKey.getCarPackage());
				existingAccessKey.setHours(accessKey.getHours());
				existingAccessKey.setUser(accessKey.getUser());

				session.update(existingAccessKey);

				tx.commit();
				resultMessage = "AccessKey updated successfully!";
			} else {
				resultMessage = "AccessKey not found with ID: " + id;
			}
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
			resultMessage = "Error updating AccessKey: " + e.getMessage();
		} finally {
			session.close();
		}

		return resultMessage;
	}

	public String deleteAccessKeyById(Long id) {
		Session session = factory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();

			AccessKey accessKeyToDelete = session.get(AccessKey.class, id);

			if (accessKeyToDelete != null) {
				session.delete(accessKeyToDelete);
				tx.commit();
				return "AccessKey deleted successfully";
			} else {
				return "AccessKey with ID " + id + " not found";
			}
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
			return "Error deleting AccessKey: " + e.getMessage();
		} finally {
			session.close();
		}
	}

	public List<AccessKey> getAccessKeyByCarPackage(String carPackage) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(AccessKey.class);
		criteria.add(Restrictions.eq("carPackage", carPackage));
		return criteria.list();
	}

	public List<AccessKey> getAccessKeyByHours(Integer hours) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(AccessKey.class);
		criteria.add(Restrictions.eq("hours", hours));
		return criteria.list();
	}

}
