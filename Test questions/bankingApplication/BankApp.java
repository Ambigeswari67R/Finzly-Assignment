package bankingApplication;
import java.util.Scanner;

public class BankApp {

	private long accno;
	private int balance;
	Scanner sc=new Scanner(System.in);
	BankApp(){
		this.accno=accno;
		this.balance=balance;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public long getAccno() {
		return accno;
	}
	public void setAccno(long accno) {
		this.accno = accno;
	}
	public void deposit() {
		System.out.println("enter the amt: ");
		int amt=sc.nextInt();
		balance+=amt;
		System.out.println(" after deposit -balance: "+balance);
	}
	public void withdraw() {
		System.out.println("enter the amt: ");
		int amt=sc.nextInt();
		if(balance>=amt) {
			balance-=amt;
		System.out.println("after withdraw- balance: "+balance);
		}
		else {
			System.out.println("less balance "+balance);
			
		}
	}

}
