package com.finzly.cartogo.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finzly.cartogo.entity.CarParameters;
import com.finzly.cartogo.entity.CreditCard;

@Repository
public class CreditCardDao {
	@Autowired
	SessionFactory factory;

	public List<CreditCard> getCreditCard() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(CreditCard.class);
		return criteria.list();
	}

	public String saveCreditCard(CreditCard creditCard) {
		Session session = factory.openSession();
		session.save(creditCard);
		session.beginTransaction().commit();
		return "creditCard Inserted in to table";
	}

	public String deleteCreditCard(Long id) {
		Session session = factory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();

			CreditCard creditCardToDelete = session.get(CreditCard.class, id);

			if (creditCardToDelete != null) {
				session.delete(creditCardToDelete);
				tx.commit();
				return "CreditCard deleted successfully";
			} else {
				return "CreditCard with ID " + id + " not found";
			}
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
			return "Error deleting CreditCard: " + e.getMessage();
		} finally {
			session.close();
		}
	}

	public String editCreditCard(Long id, CreditCard creditCard) {
		Session session = factory.openSession();
		Transaction tx = null;
		String resultMessage = "";

		try {
			tx = session.beginTransaction();

			CreditCard existingCreditCard = session.get(CreditCard.class, id);

			if (existingCreditCard != null) {

				existingCreditCard.setCardNumber(creditCard.getCardNumber());
				existingCreditCard.setMonth(creditCard.getMonth());
				existingCreditCard.setYear(creditCard.getYear());
				existingCreditCard.setCVV(creditCard.getCVV());
				existingCreditCard.setAccountBalance(creditCard.getAccountBalance());
				existingCreditCard.setUser(creditCard.getUser());
				

				session.update(existingCreditCard);

				tx.commit();
				resultMessage = "CreditCard updated successfully!";
			} else {
				resultMessage = "CreditCard not found with ID: " + id;
			}
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
			resultMessage = "Error updating CreditCard: " + e.getMessage();
		} finally {
			session.close();
		}

		return resultMessage;
	}

	public List<CreditCard> getUserBalanceLessThan1000() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(CreditCard.class);
		int intValue = 1000; // Your integer value
		long longValue = intValue; // Convert int to long

		criteria.add(Restrictions.lt("accountBalance",longValue));
		return criteria.list();
	}

	public List<CreditCard> getExpiredCreditCard() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(CreditCard.class);
		criteria.add(Restrictions.or(
	                Restrictions.lt("year",2023),
	                Restrictions.lt("month", 10)
	            ));
		return criteria.list();
		
	}

	public List<CreditCard> getCreditCardById(Long id) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(CreditCard.class);
		criteria.add(Restrictions.eq("id", id));
		return criteria.list();
	}

	public List<CreditCard> getCreditCardByCVV(Integer CVV) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(CreditCard.class);
		criteria.add(Restrictions.eq("CVV", CVV));
		return criteria.list();
	}

	public List<CreditCard> getCreditCardByAccountBalance(Long accountBalance) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(CreditCard.class);
		criteria.add(Restrictions.eq("accountBalance", accountBalance));
		return criteria.list();
	}

	public List<CreditCard> getCreditCardByCardNumber(Long cardNumber) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(CreditCard.class);
		criteria.add(Restrictions.eq("cardNumber", cardNumber));
		return criteria.list();
	}

	public List<CreditCard> getCreditCardByMonth(Integer month) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(CreditCard.class);
		criteria.add(Restrictions.eq("month", month));
		return criteria.list();
	}

	public List<CreditCard> getCreditCardByYear(Integer year) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(CreditCard.class);
		criteria.add(Restrictions.eq("year", year));
		return criteria.list();
	}

	

}
