package libraryManagement;

public class FacultyMember extends LibraryMember {
	
		FacultyMember(int memberId, String name) {
		super(memberId, name);
		// TODO Auto-generated constructor stub
	}

		@Override
		public void borrowItem(LibraryItem item) {
			System.out.println("borrowed item: "+item.getTitle()+" "+item.getClass().getSimpleName());
			System.out.println("borrowed by student "+getName());
			
		}
		
		public void reserveItem(LibraryItem item) {
			System.out.println("Reserved item: "+item.getTitle()+" "+item.getClass().getSimpleName());
			System.out.println("Reserved by student "+getName());
			
		}
	

}
