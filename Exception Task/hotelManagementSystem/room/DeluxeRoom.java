package hotelManagementSystem.room;

public class DeluxeRoom extends Room{

	public DeluxeRoom(int roomNumber, double price) {
		super(roomNumber, price);
		
	}
	public String getDescription() {
		return "Room Number: " + super.getRoomNumber() + "\nPrice: $" + super.getPrice() ;
	}

}
