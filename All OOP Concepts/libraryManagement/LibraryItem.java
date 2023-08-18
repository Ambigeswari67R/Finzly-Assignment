package libraryManagement;

public class LibraryItem {
	private String title;
	private int itemId;
	public LibraryItem(String title, int itemId) {
		this.title=title;
		this.itemId=itemId;
	}
	public String getTitle() {
		return title;
	}
	public void settitle(String title) {
		this.title = title;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public void displayInfo() {
		System.out.println("title: "+title+"item id : "+itemId);
	}
	

}
