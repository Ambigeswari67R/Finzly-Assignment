package com.finzly.cartogo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finzly.cartogo.dao.CreditCardDao;
import com.finzly.cartogo.entity.CreditCard;
import com.finzly.cartogo.entity.User;


@Service
public class CreditCardService {
	@Autowired
	CreditCardDao creditCardDao;

	public List<CreditCard> getCreditCard() {
		return creditCardDao.getCreditCard();
	}

	public String saveCreditCard(CreditCard creditCard) {
		return creditCardDao.saveCreditCard(creditCard);
	}

	public String deleteCreditCard(Long id) {
		return creditCardDao.deleteCreditCard(id);
	}

	public String editCreditCard(Long id, CreditCard creditCard) {
		return creditCardDao.editCreditCard(id,creditCard);
	}

	public List<CreditCard> getUserBalanceLessThan1000() {
		return creditCardDao.getUserBalanceLessThan1000();
	}

	public List<CreditCard> getExpiredCreditCard() {
		return creditCardDao.getExpiredCreditCard();
	}

	public List<CreditCard> getCreditCardById(Long id) {
		return creditCardDao.getCreditCardById(id);
	}

	public List<CreditCard> getCreditCardByCVV(Integer CVV) {
		return creditCardDao.getCreditCardByCVV(CVV);
	}

	public List<CreditCard> getCreditCardByAccountBalance(Long accountBalance) {
		return creditCardDao.getCreditCardByAccountBalance(accountBalance);
	}

	public List<CreditCard> getCreditCardByCardNumber(Long cardNumber) {
		return creditCardDao.getCreditCardByCardNumber(cardNumber);
	}

	public List<CreditCard> getCreditCardByMonth(Integer month) {
		return creditCardDao.getCreditCardByMonth(month);
	}

	public List<CreditCard> getCreditCardByYear(Integer year) {
		return creditCardDao.getCreditCardByYear(year);
	}

}
