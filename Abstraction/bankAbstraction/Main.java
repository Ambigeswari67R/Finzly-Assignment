package bankAbstraction;

public class Main {

	public static void main(String[] args) {
		SavingsAccount savingsaccount=new SavingsAccount("378651","Ambika",1000);
		CheckingAccount checkingaccount=new CheckingAccount("398902","Amutha",5000,5000);
		System.out.println("Savings Account Number: "+savingsaccount.getAccountNumber());
		System.out.println("Savings Account Name: "+savingsaccount.getAccountHolderName());
		savingsaccount.deposit(500);
		savingsaccount.withdraw(1000);
		System.out.println("Checking Account Number: "+checkingaccount.getAccountNumber());
		System.out.println("Checking Account Name: "+checkingaccount.getAccountHolderName());
		checkingaccount.deposit(5000);
		checkingaccount.withdraw(6000);
		

	}

}
