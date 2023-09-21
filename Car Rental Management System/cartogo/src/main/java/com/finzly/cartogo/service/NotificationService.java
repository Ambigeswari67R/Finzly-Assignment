package com.finzly.cartogo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.finzly.cartogo.constant.NotificationType;
import com.finzly.cartogo.dao.CreditCardDao;
import com.finzly.cartogo.dao.NotificationDao;
import com.finzly.cartogo.entity.Notification;

@Service
public class NotificationService {
	@Autowired
	NotificationDao notificationDao;

	public List<Notification> getNotification() {
		return notificationDao.getNotification();
	}

	public String saveNotification(Notification notification) {
		return notificationDao.saveNotification(notification);
	}

	public List<Notification> getNotificationById(Long id) {
		return notificationDao.getNotificationById(id);
	}

	public String editNotificationById(Long id, Notification notification) {
		return notificationDao.editNotificationById(id, notification);
	}

	public String deleteNotificationById(Long id) {
		return notificationDao.deleteNotificationById(id);
	}

	public List<Notification> getNotificationByType(NotificationType type,Notification notification) {
		return notificationDao.getNotificationByType(type,notification);
	}

	public List<Notification> getNotificationByRecipient(String recipient,Notification notification) {
		return notificationDao.getNotificationByRecipient(recipient,notification);
	}


}
