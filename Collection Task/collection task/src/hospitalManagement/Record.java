package hospitalManagement;

public interface Record {
	void addPatients(int id,String name,int age);
	Patient searchById(int id);
	void listAllPatients();

}
