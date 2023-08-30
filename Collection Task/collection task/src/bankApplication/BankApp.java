package bankApplication;
import java.util.*;


public class BankApp {
	public static void main(String[] args) {
		Operation o=new Operation();
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("Bank Application");
			System.out.println("1. Create Accounts");
			System.out.println("2. Deposit");
			System.out.println("3. withdraw");
			System.out.println("4. check Balance");
			System.out.println("5. List All accounts");
			System.out.println("6: Exit");
			System.out.println("enter the choice: ");
			int choice=sc.nextInt();
			
			switch(choice) {
			
			case 1:
				o.createAccount();
				
				break;
			case 2:
				o.deposit();
				break;
			case 3:
				o.withdraw();
				break;
			case 4:
				o.balance();
				break;
			case 5:
				o.listAccount();
				break;
			case 6:
				System.out.println("Exiting...");
				System.exit(0);
			default:
				System.out.println("Invalid Choice. Please enter valid choice");
					
			}
		}

	}

}
