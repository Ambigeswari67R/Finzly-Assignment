package libraryManagement;

public class Book extends LibraryItem {
	private String author;
	Book(String title,int itemId,String author){
		super(title,itemId);
		this.author=author;
	}

	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void displayInfo() {
		System.out.println("Author "+author+"Book title "+getTitle());
	}
	

}
