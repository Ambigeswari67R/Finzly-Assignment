package schoolManagement;
import java.util.*;
public class Teacher extends School implements Records{
	private double salary;
	HashSet<Teacher> teachers=new HashSet<>();
	Scanner sc=new Scanner(System.in);

	Teacher(String name,int id,double salary) {
		super(name,id);
		this.setSalary(salary);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void addDetails() {
		System.out.print("Enter teacher name: ");
        String teacherName = sc.nextLine();
        System.out.print("Enter Teacher id: ");
        int teacherId=sc.nextInt();
        System.out.println("Enter the Salary: ");
        double salary=sc.nextDouble();
        teachers.add(new Teacher(teacherName,teacherId,salary));
        System.out.println("Teacher added successfully");
		
	}

	@Override
	public void displayDetails() {
		System.out.println("Teacher Detials:");
       for (Teacher teacher : teachers) {
           System.out.println("Name: " + teacher.getName() + ", ID: " + teacher.getId()+" Salary: "+teacher.getSalary());
       }
		
	}
	

}
