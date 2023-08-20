package hotelReservation;



public class Main {

	public static void main(String[] args) {
		Room room1=new Room(11,2,500);
		Room room2=new Room(12,2,700);
		
		room1.checkAvailabilty("21-08-2023", "22-08-2023");
		System.out.println();
		
		room1.reservation();
		System.out.println();
		
		room2.reservation("21-08-2023", "22-08-2023");
		
		

	}

}
