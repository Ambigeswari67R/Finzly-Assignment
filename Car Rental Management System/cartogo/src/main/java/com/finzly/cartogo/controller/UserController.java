package com.finzly.cartogo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.finzly.cartogo.entity.*;
import com.finzly.cartogo.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	// 1. Ambika - Get users information
	@GetMapping("users")
	public List<User> getUserInfo() {
		return userService.getUserInfo();
	}

	// 2. Ambika - Insert users information
	@PostMapping("users")
	public String insertUser(@RequestBody User user) {
		return userService.insertUser(user);
	}

	// 3. Ambika - Get users information by email
	@GetMapping("byemail/{email}")
	public List<User> getUserByEmail(@PathVariable String email) {
		return userService.getUserByEmail(email);
	}

	// 4.Ambika Get users by role
	@GetMapping("byrole/{username}")
	public List<User> userByRole(@PathVariable String username) {
		return userService.userByRole(username);
	}

	// 5.Ambika Get users by NameStartWithS
	@GetMapping("namestartwiths")
	public List<User> getRecordByNameStartWithS() {
		return userService.getRecordByNameStartWithS();
	}

	// 6.Ambika Get users by specific record
	@GetMapping("specific")
	public List<User> getSpecificRecord() {
		return userService.getSpecificRecord();

	}

	// 7. Ambika Get users by Name and Role based
	@GetMapping("conditional")
	public List<User> getConditionalUser() {
		return userService.getConditionalUser();
	}

	// 8. Ambika Get users by Specific Name
	@GetMapping("byambika")
	public List<User> getByUserNameAmbika() {
		return userService.getByUserNameAmbika();
	}

	// 9. Ambika Delete user by Id
	@DeleteMapping("/users/{id}")
	public String deleteUser(@PathVariable Long id) {
		return userService.deleteUser(id);
	}

	// 10. Ambika insert roles into role table
	@PostMapping("/roles")
	public String saveRole(@RequestBody Role role) {
		return userService.saveRole(role);
	}

	// 11. Ambika update users by user Name and credit card
	@PutMapping("/users/{username}/creditcards")
	public String addCreditCardToUser(@PathVariable String username, @RequestBody CreditCard creditCard) {
		return userService.addCreditCardToUser(username, creditCard);
	}

	// 12. Ambika delete users by Name and Role based
	@DeleteMapping("/users/{username}/creditCards")
	public String deleteUserCreditCard(@PathVariable String username) {
		return userService.deleteUserCreditCard(username);
	}

	// 13. Ambika - Get users by phone number
	@GetMapping("getusersbyphone/{phone}")
	public List<User> getUserByPhone(@PathVariable Integer phone) {
		return userService.getUserByPhone(phone);
	}

	// 14. Ambika - Get users by first name
	@GetMapping("getusersbyfirstname/{firstName}")
	public List<User> getUserByFirstName(@PathVariable String firstName) {
		return userService.getUserByFirstName(firstName);
	}

	// 15. Ambika - Get users by last name
	@GetMapping("getusersbylastname/{lastName}")
	public List<User> getUserByLastName(@PathVariable String lastName) {
		return userService.getUserByLastName(lastName);
	}

	// 16. Ambika - update users by id
	@PutMapping("/users/{id}")
	public String editUser(@PathVariable Long id, @RequestBody User user) {
		return userService.editUser(id, user);
	}

}
