package employeeRecords;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeRecord {

	public static void main(String[] args) {
		ArrayList<Employee> employeeRecords=new ArrayList<>();
		
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Employee Records System");
			System.out.println("1. Add Employee");
			System.out.println("2. View Employee details");
			System.out.println("3. Searching Employee by id");
			System.out.println("4. Exit");
			System.out.println("Enter your choice: ");
			int choice=sc.nextInt();
			
			switch(choice) {
			
			case 1:
				System.out.println("Enter employee name: ");
				String name=sc.next();
				//sc.nextLine();
				System.out.println("Enter employee Id: ");
				int employeeId=sc.nextInt();
				System.out.println("Enter employee salary: ");
				double salary=sc.nextDouble();
				Employee employee=new Employee(name,employeeId,salary);
						employeeRecords.add(employee);
				System.out.println("Employee added successfully");
				break;
			case 2:
				System.out.println("Employee Details:");
				for (Employee employeeList:employeeRecords) {
					System.out.println(employeeList);
				}
				break;
			case 3:
				System.out.println("Enter employee id to search:");
				int searchId=sc.nextInt();
				for (Employee employeelist : employeeRecords) {
					if(employeelist.getEmployeeId()==searchId) {
						System.out.println("Employee found");
						System.out.println(employeelist);
						break;
					}
					else {
						System.out.println("Employee not found with Id: "+searchId);
					}
				}
				break;
			case 4:
				System.out.println("Exit");
				System.exit(0);
			default:
				System.out.println("Invalid choice.Please enter a valid option.");
				
			
			}
			
			
			
		}
		

	}

}
