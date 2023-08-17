package studentManagement;

import java.util.Scanner;

public class Student {
	private int stuid;
	private String name;
	private static int total;
	
	Student(int stuid, String name) {
		this.stuid = stuid;
		this.name = name;
	}

	public void enroll() {
		total += 1;
		System.out.println(stuid+" "+name +" is enrolled ");
	}

	public void drop() {
		total -= 1;
		System.out.println(stuid+" "+name +" is dropped ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the total students: ");
		total = sc.nextInt();
		Student stu = new Student(101, "xyz");
		stu.enroll();
		System.out.println("Total Students: "+Student.total);
		Student stu1 = new Student(102, "abc");
		stu1.enroll();
		stu1.drop();
		System.out.println("Total students: "+Student.total);
	}

}
