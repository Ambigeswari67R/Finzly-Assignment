package projectManagement;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        ProjectManagementSystem system = new ProjectManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Project");
            System.out.println("2. Assign Team Member");
            System.out.println("3. View Project Details");
            System.out.println("4. List All Projects");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter project name: ");
                    String projectName = scanner.nextLine();
                    System.out.print("Enter project description: ");
                    String projectDescription = scanner.nextLine();
                    system.addProject(projectName, projectDescription);
                    break;
                case 2:
                    System.out.print("Enter project name: ");
                    String projName = scanner.nextLine();
                    System.out.print("Enter team member name: ");
                    String teamMember = scanner.nextLine();
                    system.assignTeamMember(projName, teamMember);
                    break;
                case 3:
                    System.out.print("Enter project name: ");
                    String name = scanner.nextLine();
                    system.viewProjectDetails(name);
                    break;
                case 4:
                    system.listAllProjects();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

}
