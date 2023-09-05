package hotelManagementSystem.room;

public class SuiteRoom extends Room {

	public SuiteRoom(int roomNumber, double price) {
		super(roomNumber, price);
		
	}
	public String getDescription() {
		return "Room Number: " + super.getRoomNumber() + "\nPrice: $" + super.getPrice() ;
	}

}
