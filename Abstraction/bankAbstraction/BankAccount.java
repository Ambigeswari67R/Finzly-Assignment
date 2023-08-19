package bankAbstraction;

public abstract class BankAccount {
	String accountNumber;
	String accountHolderName;
	double balance;
	
	public abstract String getAccountNumber();
	public abstract String getAccountHolderName();
	public abstract double getBalance();

	public abstract void withdraw(double amount);
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		
	}
	

}
