package assignment2_Student;

import java.util.List;

public class Persistance_implement implements Persistance_Interface {

	@Override
	public List<Student> getRecords() {
		
		return Database_Student.getL();
	}

	@Override
	public void insertRecords(Student e) {
		
		Database_Student.getL().add(e);
	}
	
}
