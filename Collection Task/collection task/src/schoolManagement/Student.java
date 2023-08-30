package schoolManagement;

import java.util.HashSet;
import java.util.Scanner;

public class Student extends School implements Records{
	HashSet<Student> students=new HashSet<>();
	Scanner sc=new Scanner(System.in);
	private int marks;
	
	Student(String name,int id,int marks){
		super(name,id);
		this.marks=marks;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public void addDetails() {
		 System.out.print("Enter student name: ");
         String studentName = sc.nextLine();
         System.out.print("Enter student ID: ");
         int studentId = sc.nextInt();
         System.out.print("Enter student Mark: ");
         int marks = sc.nextInt();
         students.add(new Student(studentName, studentId,marks));
         System.out.println("Student added successfully");
		
	}

	@Override
	public void displayDetails() {
		System.out.println("Students Details:");
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", ID: " + student.getId()+" Marks: "+student.getMarks());
        }
		
	}
	

}
