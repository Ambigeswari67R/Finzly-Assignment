package com.finzly.cartogo.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.finzly.cartogo.dao.UserDao;
import com.finzly.cartogo.entity.CreditCard;
import com.finzly.cartogo.entity.Role;
import com.finzly.cartogo.entity.User;

@Service
public class UserService {
	@Autowired
	UserDao userDao;

	public List<User> getUserInfo() {
		return userDao.getUserInfo();
	}

	public List<User> getByUserNameAmbika() {
		return userDao.getByUserNameAmbika();
	}

	public String insertUser(User user) {
		return userDao.insertUser(user);
	}

	public List<User> getUserByEmail(String email) {
		return userDao.getUserByEmail(email);
	}

	public String editUser(Long id, User user) {
		return userDao.editUser(id, user);
	}

	public String deleteUser(Long id) {
		return userDao.deleteUser(id);
	}

	public String saveRole(Role role) {
		return userDao.saveRole(role);
	}

	public String addCreditCardToUser(String username, CreditCard creditCard) {

		return userDao.addCreditCardToUser(username, creditCard);
	}

	public String deleteUserCreditCard(String username) {
		return userDao.deleteUserCreditCard(username);

	}

	public List<User> userByRole(String username) {
		return userDao.userByRole(username);
	}

	public List<User> getRecordByNameStartWithS() {

		return userDao.getRecordByNameStartWithS();
	}

	public List<User> getSpecificRecord() {
		List<User> list = userDao.getSpecificRecord();
		List<User> specificRecord = new ArrayList<>();
		for (User user : list) {
			String firstName = user.getFirstName();
			String lastName = user.getLastName();
			User users = new User();
			users.setFirstName(firstName);
			users.setLastName(lastName);

			specificRecord.add(users);
		}
		return specificRecord;

	}

	public List<User> getConditionalUser() {
		List<User> list = userDao.getConditionalUser();
		List<User> users = new ArrayList<>();
		for (User user : list) {
			if (user.getFirstName() != "Ambika") {
				users.add(user);
			}
		}
		return users;
	}

	public List<User> getUserByPhone(Integer phone) {
		return userDao.getUserByPhone(phone);
	}

	public List<User> getUserByFirstName(String firstName) {
		return userDao.getUserByFirstName(firstName);
	}

	public List<User> getUserByLastName(String lastName) {
		return userDao.getUserByLastName(lastName);
	}

//	public List<Book> bookbycatagory(String catagory) {
//		return bookDao.bookbycatagory(catagory);
//
//	}
//
//	public List<Book> getBookMorreThat1000() {
//		return bookDao.getBookMorreThat1000();
//
//	}

}
