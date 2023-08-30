package schoolManagement;
import java.util.*;
public class SchoolManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Records student=new Student(null, 0, 0);
		Records teacher=new Teacher(null, 0, 0);
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1. Add Student");
            System.out.println("2. Add Teacher");
            System.out.println("3. Display Students");
            System.out.println("4. Display Teachers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 
            
            switch(choice) {
            case 1:
            	student.addDetails();
            	break;
            case 2:
            	teacher.addDetails();
            	break;
            case 3:
            	student.displayDetails();
            	break;
            case 4:
            	teacher.displayDetails();
            	break;
            case 5:
                System.out.println("Exiting program...");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice.");
            	
            }
		}
		
		
		

	}

}
