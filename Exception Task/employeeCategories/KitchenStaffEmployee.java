package employeeCategories;

public class KitchenStaffEmployee extends Employee{

	public KitchenStaffEmployee(String name, int employeeId, String contactInfo, double salary) {
		super(name, employeeId, contactInfo, salary);
		}
	public void prepareFood() {
        
        System.out.println(getName() + " is preparing food in the kitchen.");
    }
	public void performDuties() {
    	prepareFood();
    }

}
