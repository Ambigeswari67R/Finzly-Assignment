package employeeCategories;

public class Employee {
	private String name;
    private int employeeId;
    private String contactInfo;
    private double salary;

    public Employee(String name, int employeeId, String contactInfo, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.contactInfo = contactInfo;
        this.salary = salary;
    }
    public void performDuties() {
        
    }

    
    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}


