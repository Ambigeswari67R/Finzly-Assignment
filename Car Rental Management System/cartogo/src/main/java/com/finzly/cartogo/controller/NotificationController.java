package com.finzly.cartogo.controller;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finzly.cartogo.constant.NotificationType;
import com.finzly.cartogo.entity.AccessKey;
import com.finzly.cartogo.entity.CarPackage;
import com.finzly.cartogo.entity.Notification;
import com.finzly.cartogo.service.NotificationService;

@RestController
@RequestMapping("notification")
public class NotificationController {
	@Autowired
	private NotificationService notificationService;

	// Ambika - description
	@RequestMapping("description")
	public String description() {
		return "Car Rental Management System \n" + "CAR2GO \n" + "Notification API";

	}

	// Ambika - get notification information
	@GetMapping("/getnotification")
	public List<Notification> getNotification() {
		return notificationService.getNotification();
	}

	// Ambika - insert notification into table
	@PostMapping("/insertnotification")
	public String saveNotification(@RequestBody Notification notification) {
		return notificationService.saveNotification(notification);
	}

	// Ambika -get notification by id
	@GetMapping("/getnotification/{id}")
	public List<Notification> getNotificationById(@PathVariable Long id) {
		return notificationService.getNotificationById(id);
	}

	// Ambika edit notification by id
	@PutMapping("/editnotification/{id}")
	public String editNotificationById(@PathVariable Long id, @RequestBody Notification notification) {
		return notificationService.editNotificationById(id, notification);
	}

	// Ambika - delete notification by id
	@DeleteMapping("/deletenotification/{id}")
	public String deleteNotificationById(@PathVariable Long id) {
		return notificationService.deleteNotificationById(id);
	}

	// Ambika - get notification by specific type
	@GetMapping("/getnotificationtype/{type}")
	public List<Notification> getNotificationByType(@PathVariable NotificationType type,
			@RequestBody Notification notification) {
		return notificationService.getNotificationByType(type, notification);
	}

	// Ambika - get notification information by recipient
	@GetMapping("/getnotificationbyrecipient/{recipient}")
	public List<Notification> getNotificationByRecipient(@PathVariable String recipient,
			@RequestBody Notification notification) {
		return notificationService.getNotificationByRecipient(recipient, notification);
	}
}
