package hotelManagementSystem.room;

public class StandardRoom extends Room{

	public StandardRoom(int roomNumber, double price) {
		super(roomNumber, price);
	}
	public String getDescription() {
		return "Room Number: " + super.getRoomNumber() + "\nPrice: $" + super.getPrice() ;
	}

}
