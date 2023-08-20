package employeesystem;

public class Developer extends Employee {
	
	private String programmingLanguage;
	Developer(int id,String name,String programmingLanguage){
		super(id,name);
		this.programmingLanguage=programmingLanguage;
		
		
	}
	public void displayDetails() {
		System.out.println("Developer id: "+getId()+" name: "+getName()+" Programming Language: "+programmingLanguage);
	}

}
