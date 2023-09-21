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
import org.springframework.web.bind.annotation.RestController;

import com.finzly.cartogo.entity.CreditCard;
import com.finzly.cartogo.service.CreditCardService;

@RestController
@RequestMapping("creditcard")
public class CreditCardController {
	@Autowired
	private CreditCardService creditCardService;

	// Ambika Description
	@RequestMapping("description")
	public String display() {
		return "Car Rental Management System \n" + "CAR2GO \n" + "Credit Card Information";
	}

	// Ambika get creditcards list
	@GetMapping("/getcreditcards")
	public List<CreditCard> getCreditCard() {
		return creditCardService.getCreditCard();
	}

	// Ambika insert creditcard
	@PostMapping("/postcreditcards")
	public String saveCreditCard(@RequestBody CreditCard creditCard) {
		return creditCardService.saveCreditCard(creditCard);
	}

	// Ambika delete creditcard
	@DeleteMapping("/deletecreditcard/{id}")
	public String deleteCreditCard(@PathVariable Long id) {
		return creditCardService.deleteCreditCard(id);
	}

	// Ambika update creditcard details
	@PutMapping("/editcreditcard/{id}")
	public String editCreditCard(@PathVariable Long id, @RequestBody CreditCard creditCard) {
		return creditCardService.editCreditCard(id, creditCard);
	}

	// Ambika Get user credit card balance less than 1000
	@GetMapping("balancelessthan1000")
	public List<CreditCard> getUserBalanceLessThan1000() {
		return creditCardService.getUserBalanceLessThan1000();
	}

	// Ambika Get user credit card balance less than 1000
	@GetMapping("expiredcreditcard")
	public List<CreditCard> getExpiredCreditCard() {
		return creditCardService.getExpiredCreditCard();
	}

	// Ambika get creditcards list by id
	@GetMapping("/getcreditcardsbyid/{id}")
	public List<CreditCard> getCreditCardById(@PathVariable Long id) {
		return creditCardService.getCreditCardById(id);
	}

	// Ambika get creditcards list by id
	@GetMapping("/getcreditcardsbycvv/{CVV}")
	public List<CreditCard> getCreditCardByCVV(@PathVariable Integer CVV) {
		return creditCardService.getCreditCardByCVV(CVV);
	}

	// Ambika get creditcards list by account balance
	@GetMapping("/getcreditcardsbybalance/{accountBalance}")
	public List<CreditCard> getCreditCardByAccountBalance(@PathVariable Long accountBalance) {
		return creditCardService.getCreditCardByAccountBalance(accountBalance);
	}

	// Ambika get creditcards list by card number
	@GetMapping("/getcreditcardsbycardnumber/{accountBalance}")
	public List<CreditCard> getCreditCardByCardNumber(@PathVariable Long cardNumber) {
		return creditCardService.getCreditCardByCardNumber(cardNumber);
	}

	// Ambika get creditcards list by month
	@GetMapping("/getcreditcardsbymonth/{month}")
	public List<CreditCard> getCreditCardByMonth(@PathVariable Integer month) {
		return creditCardService.getCreditCardByMonth(month);
	}

	// Ambika get creditcards list by year
	@GetMapping("/getcreditcardsbyyear/{year}")
	public List<CreditCard> getCreditCardByYear(@PathVariable Integer year) {
		return creditCardService.getCreditCardByYear(year);
	}

}
