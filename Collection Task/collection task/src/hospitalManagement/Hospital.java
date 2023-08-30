package hospitalManagement;

import java.util.HashMap;

public class Hospital implements Record{
	HashMap<Integer,Patient> patients=new HashMap<>();
	
	public void addPatients(int id,String name,int age) {
		Patient patient=new Patient(id,name,age);
		patients.put(id,patient);
		System.out.println("Patient added successfully");
		
	}

	public Patient searchById(int id) {
		return patients.get(id);

	}

	public void listAllPatients() {
		System.out.println("List of all patients");
		for (Patient p : patients.values()) {
			System.out.println(p);
		}
		
	}


	

}
