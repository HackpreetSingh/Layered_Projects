package assignment2_Student;

import java.util.*;

public interface Persistance_Interface {
	List<Student> getRecords();
	void insertRecords(Student e);
}
