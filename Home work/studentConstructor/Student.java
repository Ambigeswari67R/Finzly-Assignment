package studentConstructor;

public class Student {

	private String name;
	private int age;
	private static int studentId=100;
	
	
	public Student() {
		this.name = "Unknown";
		this.age = 0;
		studentId++;
	}
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
		studentId++;
	}

	public Student(String name, int age, int studentId) {
		this.name = name;
		this.age = age;
		studentId++;
	}
	
	public void display()
	{
		System.out.println("Student Details");
		System.out.println("Student Name: "+name);
		System.out.println("Student age: "+age);
		System.out.println("Student ID: "+studentId);
	}
	public static void main(String[] args)
	{
		Student s=new Student();
		s.display();
		System.out.println();
		
		Student s1=new Student("Ambika",21);
		s1.display();
		System.out.println();
		
		Student s2=new Student("Amutha",22);
		s2.display();
		
	}

}
