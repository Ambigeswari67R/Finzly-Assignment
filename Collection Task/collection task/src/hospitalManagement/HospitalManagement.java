package hospitalManagement;

import java.util.Scanner;

public class HospitalManagement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Record hospital=new Hospital();
		
		while(true) {
			System.out.println("1. Add Patient");
	        System.out.println("2. View Patient by ID");
	        System.out.println("3. List All Patients");
	        System.out.println("4. Exit");
	        System.out.print("Enter your choice: ");
	        int choice = sc.nextInt();
	        sc.nextLine();
	            
	        switch(choice) {
	        case 1:
	        	 System.out.print("Enter patient ID: ");
                 int id = sc.nextInt();
                 sc.nextLine();  
                 System.out.print("Enter patient name: ");
                 String name = sc.nextLine();
                 System.out.print("Enter patient age: ");
                 int age = sc.nextInt();
                 hospital.addPatients(id,name,age);
                 break;
	        case 2:
	        	System.out.print("Enter patient ID: ");
                int searchId = sc.nextInt();
                Patient foundPatient = hospital.searchById(searchId);s
                if (foundPatient != null) {
                    System.out.println("Patient found: " + foundPatient);
                } else {
                    System.out.println("Patient not found.");
                }
                break;
	        case 3:
	        	hospital.listAllPatients();
	        	break;
	        case 4:
	        	System.out.println("exit...");
	        	System.exit(0);
	        default:
	        	System.out.println("Invalid choice");	
	            
	        }
		}
				
	

	}

}
