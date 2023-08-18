package libraryManagement;

public class StudentMember extends LibraryMember {
	
	StudentMember(int memberId, String name) {
		super(memberId, name);
		
	}

	@Override
	public void borrowItem(LibraryItem item) {
		System.out.println("borrowed item: "+item.getTitle()+" "+item.getClass().getSimpleName());
		System.out.println("borrowed by student "+getName());
		
	}
	
	public void reserveItem(LibraryItem item) {
		System.out.println("Reserved item: "+item.getTitle()+" "+item.getClass().getSimpleName());
	    System.out.println("reserved by student "+getName());
		
	}
	

}
