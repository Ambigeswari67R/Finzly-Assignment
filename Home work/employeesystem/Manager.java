package employeesystem;

public class Manager extends Employee {
	private String department;
	Manager(int id,String name,String department){
		super(id,name);
		this.department=department;
		
	}
	public void displayDetails() {
		System.out.println("Manager id: "+getId()+" name: "+getName()+" Department: "+department);
	}

}
