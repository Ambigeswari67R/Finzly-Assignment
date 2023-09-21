package com.finzly.cartogo.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import com.finzly.cartogo.entity.Car;
import com.finzly.cartogo.entity.CreditCard;
import com.finzly.cartogo.entity.Role;
import com.finzly.cartogo.entity.User;

@Repository
public class UserDao {
	@Autowired
	SessionFactory factory;

	public List<User> getUserInfo() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(User.class);
		return criteria.list();
	}

	public List<User> getByUserNameAmbika() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(User.class);
		criteria.add(Restrictions.eq("username", "Ambika"));
		return criteria.list();
	}

	public String insertUser(User user) {
		Session session = factory.openSession();
		session.save(user);
		session.beginTransaction().commit();
		return "User Inserted in to table";
	}

	public List<User> getUserByEmail(String email) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(User.class);
		criteria.add(Restrictions.eq("email", email));
		return criteria.list();
	}

	public String deleteUser(Long id) {
		Session session = factory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();

			User userToDelete = session.get(User.class, id);

			if (userToDelete != null) {
				session.delete(userToDelete);
				tx.commit();
				return "User deleted successfully";
			} else {
				return "User with ID " + id + " not found";
			}
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
			return "Error deleting User: " + e.getMessage();
		} finally {
			session.close();
		}
	}

	public String saveRole(Role role) {
		Session session = factory.openSession();
		session.save(role);
		session.beginTransaction().commit();
		return "Role Inserted in to table";

	}

	public String addCreditCardToUser(String username, CreditCard creditCard) {
		Session session = factory.openSession();
		try {
			session.beginTransaction();
			User userToUpdate = session.get(User.class, username);

			if (userToUpdate != null) {
				creditCard.setUser(userToUpdate);

				// Save the credit card to the user's profile
				session.save(creditCard);

				session.getTransaction().commit(); // Commit the transaction
				return "Credit card added successfully.";
			} else {
				return "User not found.";
			}
		} catch (Exception e) {
			// Handle any exceptions that might occur during the transaction
			session.getTransaction().rollback();
			return "Error adding credit card: " + e.getMessage();
		} finally {
			session.close();
		}
	}

	public String deleteUserCreditCard(String username) {
		Session session = factory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();

			User userCreditCardToDelete = session.get(User.class, username);

			if (userCreditCardToDelete != null) {
				session.delete(userCreditCardToDelete);
				tx.commit();
				return "User CreditCard deleted successfully";
			} else {
				return "User with username " + username + " not found";
			}
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
			return "Error deleting User CreditCard: " + e.getMessage();
		} finally {
			session.close();
		}
	}

	public List<User> userByRole(String username) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(User.class);
		criteria.add(Restrictions.eq("username", username));
		return criteria.list();

	}

	public List<User> getRecordByNameStartWithS() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(User.class);
		criteria.add(Restrictions.like("firstName", "s%"));
		return criteria.list();
	}

	public List<User> getSpecificRecord() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(User.class);
		return criteria.list();

	}

	public List<User> getConditionalUser() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(User.class);
		criteria.add(Restrictions.eq("username", "user"));
		return criteria.list();
	}

	public List<User> getUserByPhone(Integer phone) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(User.class);
		criteria.add(Restrictions.eq("phone", phone));
		return criteria.list();
	}

	public List<User> getUserByFirstName(String firstName) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(User.class);
		criteria.add(Restrictions.eq("firstName", firstName));
		return criteria.list();
	}

	public List<User> getUserByLastName(String lastName) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(User.class);
		criteria.add(Restrictions.eq("lastName", lastName));
		return criteria.list();
	}

	public String editUser(Long id, User user) {
		Session session = factory.openSession();
		Transaction tx = null;
		String resultMessage = "";

		try {
			tx = session.beginTransaction();
			User existingUser = session.get(User.class, id);

			if (existingUser != null) {

				existingUser.setFirstName(user.getFirstName());
				existingUser.setLastName(user.getLastName());
				existingUser.setUserName(user.getUsername());
				existingUser.setPassword(user.getPassword());
				existingUser.setEmail(user.getEmail());
				existingUser.setPhone(user.getPhone());

				session.update(existingUser);
				tx.commit();

				resultMessage = "User updated successfully!";
			} else {
				resultMessage = "User not found with ID: " + id;
			}
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
			resultMessage = "Error updating car: " + e.getMessage();

		} finally {
			session.close();
		}
		return resultMessage;
	}

}
