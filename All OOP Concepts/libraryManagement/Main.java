package libraryManagement;

public class Main {

	public static void main(String[] args) {
		LibraryItem book=new Book("A song of india", 11, "Bond");
		LibraryItem dvd=new Dvd("let us dream",12,5);
		//book.displayInfo();
		//dvd.displayInfo();
		StudentMember student=new StudentMember(101,"ambika");
		student.borrowItem(book);
		FacultyMember faculty=new FacultyMember(201,"jaff");
		faculty.reserveItem(dvd);
		

		

	}

}
