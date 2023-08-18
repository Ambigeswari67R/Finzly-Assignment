package libraryManagement;

public class Dvd extends LibraryItem {
	private int duration;
	public Dvd(String title, int itemId, int duration) {
		super(title, itemId);
		this.duration=duration;
		
	}
	
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}

	public void displayInfo() {
		System.out.println("DVD "+getTitle()+"duration "+duration);
	}
	
	

}


