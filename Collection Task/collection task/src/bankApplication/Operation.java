package bankApplication;

import java.util.ArrayList;
import java.util.*;


public class Operation {
	ArrayList<Customer> accounts=new ArrayList<>();
	
	Scanner sc=new Scanner(System.in);
	
	public void createAccount() {
		System.out.print("Enter account holder name: ");
        String name = sc.next();
        //sc.nextLine();
		System.out.print("Enter account number: ");
        int accountNo = sc.nextInt();
        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();
        Customer customer=new Customer(name,accountNo,balance);
        accounts.add(customer);
        System.out.println("Account created successfully.");   
        
	}
	
	public void deposit(){
		System.out.print("Enter account number: ");
        double accountNo = sc.nextInt();
        System.out.print("Enter deposit amount: ");
        double depositAmount = sc.nextDouble();
        for (Customer acc : accounts) {
            if (acc.getAccountNo() == accountNo) {
                if(depositAmount>0) {
                	double balance=acc.getBalance();
                			balance+=depositAmount;
                			acc.setBalance(balance);
                	System.out.println("Amount deposited successfully. Balance: "+acc.getBalance());
                }
                else {
                	System.out.println("Amount is less than zero");
                }
                //return;
            }else {
            	System.out.println(" Account Not found");
            }   
        }
	}
	
	public void withdraw() {
		System.out.print("Enter account number: ");
        int accountNo = sc.nextInt();
        System.out.print("Enter withdrawal amount: ");
        double withdrawalAmount = sc.nextDouble();
        for (Customer acc : accounts) {
            if (acc.getAccountNo() == accountNo) {
            	if ( withdrawalAmount>0 && withdrawalAmount<=acc.getBalance()) {
                   double balance=acc.getBalance();
                   balance -= withdrawalAmount;
                    acc.setBalance(balance);
                    System.out.println("Amount withdrawn successfully. Balance: "+acc.getBalance());
                } else {
                    System.out.println("Insufficient balance or Invalid withdraw amount");
                }
            	
            }else {
                  System.out.println("Account Not Found");
            }
        }
	}

	public void balance() {
		System.out.print("Enter account number: ");
        int accountNo = sc.nextInt();
        for (Customer acc : accounts) {
            if (acc.getAccountNo() == accountNo) {
            	System.out.println("Balance: "+acc.getBalance());
            	//return;
            }
            else {
            	System.out.println("Account Not Match");
            }
        }
	}
	
	public void listAccount() {
		
		for (Customer customer : accounts) {
			System.out.println(customer);
		}
	}
}

	