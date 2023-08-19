package bankAbstraction;

public class CheckingAccount extends BankAccount {
	double overDraftLimit;

	CheckingAccount(String accountNumber, String accountHolderName, double balance, double overDraftLimit) {
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
		this.balance=balance;

		this.overDraftLimit = overDraftLimit;
	}

	public String getAccountNumber() {

		return accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.print("Deposit successful ");
			System.out.println("Balance: " + balance);
		}
	}

	public void withdraw(double amount) {
		if (balance > amount && balance - amount >= overDraftLimit) {
			balance -= amount;
			System.out.println("Withdraw Successful Balance: " + balance);
		} else {
			System.out.println("Overdraft limit reached");
		}
	}

}
