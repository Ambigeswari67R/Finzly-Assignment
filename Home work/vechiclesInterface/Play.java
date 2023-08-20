package vechiclesInterface;

public class Play {

	public static void main(String[] args) {
		
		Vehicle[] vehicle = new Vehicle[2];
        vehicle[0] = new Cars();
        vehicle[1] = new MoterCycles();

        for (Vehicle veh : vehicle) {
        	System.out.println("Vehicle: " + vehicle.getClass().getSimpleName());
        	veh.start();
        	veh.accelerate();
        	veh.brake();
            System.out.println();
        }
		

	}

}
