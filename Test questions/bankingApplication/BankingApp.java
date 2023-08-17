package bankingApplication;



public class BankingApp {

	public static void main(String[] args) {
		
		BankApp bank = new BankApp();
		bank.setAccno(123);
		bank.setBalance(1000);
		bank.deposit();
		bank.withdraw();
		// System.out.println("balance:"+bank.getBalance());

	}

}
