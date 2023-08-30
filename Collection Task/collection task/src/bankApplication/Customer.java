package bankApplication;

public class Customer {
	
	private String name;
	private int accountNo;
	private  double balance;
	
	
	public Customer(String name, int accountNo, double balance) {
		super();
		this.name = name;
		this.accountNo = accountNo;
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", accountNo=" + accountNo + ", balance=" + balance + "]";
	}
	
	

}
