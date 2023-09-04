package employeeCategories;

public class MaintenanceEmployee extends Employee {
	public MaintenanceEmployee(String name, int employeeId, String contactInfo, double salary) {
        super(name, employeeId, contactInfo, salary);
    }

    
    public void performMaintenance() {
        System.out.println(getName() + " is performing maintenance tasks.");
    }
    public void performDuties() {
    	performMaintenance();
    }

}
