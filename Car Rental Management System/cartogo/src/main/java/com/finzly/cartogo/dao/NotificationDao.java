package com.finzly.cartogo.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.finzly.cartogo.constant.NotificationType;
import com.finzly.cartogo.entity.AccessKey;
import com.finzly.cartogo.entity.CarPackage;
import com.finzly.cartogo.entity.CreditCard;
import com.finzly.cartogo.entity.Notification;

@Repository
public class NotificationDao {
	@Autowired
	SessionFactory factory;

	public List<Notification> getNotification() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Notification.class);
		return criteria.list();
	}

	public String saveNotification(Notification notification) {
		Session session = factory.openSession();
		session.save(notification);
		session.beginTransaction().commit();
		return "notification Inserted in to table";
	}

	public List<Notification> getNotificationById(Long id) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Notification.class);
		criteria.add(Restrictions.eq("id", id));
		return criteria.list();
	}

	public String editNotificationById(Long id, Notification notification) {
		Session session = factory.openSession();
		Transaction tx = null;
		String resultMessage = "";

		try {
			tx = session.beginTransaction();

			Notification existingNotification = session.get(Notification.class, id);

			if (existingNotification != null) {

				existingNotification.setRecipient(existingNotification.getRecipient());
				existingNotification.setMessage(existingNotification.getMessage());
				existingNotification.setType(existingNotification.getType());

				session.update(existingNotification);

				tx.commit();
				resultMessage = "Notification updated successfully!";
			} else {
				resultMessage = "Notification not found with ID: " + id;
			}
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
			resultMessage = "Error updating Notification: " + e.getMessage();
		} finally {
			session.close();
		}

		return resultMessage;
	}

	public String deleteNotificationById(Long id) {
		Session session = factory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();

			Notification NotificationToDelete = session.get(Notification.class, id);

			if (NotificationToDelete != null) {
				session.delete(NotificationToDelete);
				tx.commit();
				return "Notification deleted successfully";
			} else {
				return "Notification with ID " + id + " not found";
			}
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
			return "Error deleting Notification: " + e.getMessage();
		} finally {
			session.close();
		}
	}

	public List<Notification> getNotificationByType(NotificationType type,Notification notification) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Notification.class);
		criteria.add(Restrictions.eq("type", type));
		return criteria.list();
	}

	public List<Notification> getNotificationByRecipient(String recipient,Notification notification) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Notification.class);
		criteria.add(Restrictions.eq("recipient", recipient));
		return criteria.list();
	}

}
