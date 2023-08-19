package bankAbstraction;

public class SavingsAccount extends BankAccount{
	double interestRate;
	SavingsAccount(String accountNumber,String accountHolderName,double balance){
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
		this.balance=balance;
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
		if(amount>0) {
			balance+=amount;
			System.out.print("Deposit successful ");
			System.out.println("Balance: "+balance);
		}
	}

	
	public void withdraw(double amount) {
		if(balance>amount && balance-amount>=1000) {
			balance-=amount;
			System.out.println("Withdraw Successful Balance: "+balance);
		}
		else {
			System.out.println("Insufficient balance");
		}
	}
	

}
