package libraryManagement;

public abstract class LibraryMember implements Reservable {
	private int memberId;
	private String name;
	LibraryMember(int memberId, String name){
		this.setMemberId(memberId);
		this.setName(name);
	}
	public abstract void borrowItem(LibraryItem item);
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
