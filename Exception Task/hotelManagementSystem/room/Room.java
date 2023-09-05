package hotelManagementSystem.room;

public class Room {
	private int roomNumber;
	private double price;
	private boolean isOccupied;
	public Room(int roomNumber, double price) {
		super();
		this.roomNumber = roomNumber;
		this.price = price;
		this.isOccupied = true;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isOccupied() {
		return isOccupied;
	}
	public void setOccupied(boolean isOccupied) {
		this.isOccupied = isOccupied;
	}
	public void occupy() {
		 isOccupied=true;
		
	}
	public void vacate() {
		isOccupied=false;
	}
	@Override
	public String toString() {
		return "Room [roomNumber=" + roomNumber + ", price=" + price + ", isOccupied=" + isOccupied + "]";
	}
	

}
