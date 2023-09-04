package employeeCategories;

public class HousekeepingEmployee extends Employee {

	public HousekeepingEmployee(String name, int employeeId, String contactInfo, double salary) {
		super(name, employeeId, contactInfo, salary);
		
	}
	public void cleanRoom() {
        System.out.println(getName() + " is cleaning a room.");
    }
	public void performDuties() {
    	cleanRoom();
    }

}
