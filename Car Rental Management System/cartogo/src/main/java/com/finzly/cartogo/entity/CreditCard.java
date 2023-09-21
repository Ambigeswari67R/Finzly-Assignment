package com.finzly.cartogo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "credit_card")
public class CreditCard {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id", unique = true, nullable = false)
        private Long id;

        @Column(name = "card_number", unique = true, nullable = false, length = 16)
        private Long cardNumber;

        @Column(name = "month", nullable = false, length = 2)
        private Integer month;

        @Column(name = "year", nullable = false, length = 4)
        private Integer year;

        @Column(name = "cvv", nullable = false, length = 3)
        private Integer CVV;

        @Column(name = "account_balance", nullable = false)
        private Long accountBalance;

        @OneToOne
        private User user;
        
        private CreditCard() {}
        
		public CreditCard(Long id, Long cardNumber, Integer month, Integer year, Integer cVV, Long accountBalance,
				User user) {
			super();
			this.id = id;
			this.cardNumber = cardNumber;
			this.month = month;
			this.year = year;
			CVV = cVV;
			this.accountBalance = accountBalance;
			this.user = user;
		}



		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getCardNumber() {
			return cardNumber;
		}

		public void setCardNumber(Long cardNumber) {
			this.cardNumber = cardNumber;
		}

		public Integer getMonth() {
			return month;
		}

		public void setMonth(Integer month) {
			this.month = month;
		}

		public Integer getYear() {
			return year;
		}

		public void setYear(Integer year) {
			this.year = year;
		}

		public Integer getCVV() {
			return CVV;
		}

		public void setCVV(Integer cVV) {
			CVV = cVV;
		}

		public Long getAccountBalance() {
			return accountBalance;
		}

		public void setAccountBalance(Long accountBalance) {
			this.accountBalance = accountBalance;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}
        

}
