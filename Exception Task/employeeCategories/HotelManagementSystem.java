package employeeCategories;

public class HotelManagementSystem {
	public static void main(String[] args) {
        
        EmployeeManager employeeManager = new EmployeeManager();
        try {
        
        FrontDeskEmployee frontDeskEmployee = new FrontDeskEmployee("Ambika", 101, "998987867", 30000.0);
        employeeManager.hireEmployee("Front Desk", frontDeskEmployee);

        
        employeeManager.assignTask("kitchen task", 101, "Check-in guests");

        
        employeeManager.updateEmployeeDetails("Front Desk", 101, "shremail@example.com");

       
        employeeManager.fireEmployee("Front Desk", 101);
        }
        catch (DuplicateEmployeeException | InvalidTaskAssignmentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}





