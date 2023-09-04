package employeeCategories;

public class FrontDeskEmployee extends Employee {

	public FrontDeskEmployee(String name, int employeeId, String contactInfo, double salary) {
		super(name, employeeId, contactInfo, salary);
		
	}
	public void checkInGuests() {
        System.out.println(super.getName() + " is checking in guests.");
    }
	public void performDuties() {
    	checkInGuests();
    }

}
