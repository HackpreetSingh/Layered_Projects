package assignment2_Student;

import java.util.List;

public interface Service_Interface {
void insertData(String nm,int e,int m,int s);
List<Student> return_roll_Name();
Student highestAll();
Student highestMaths();
List<Student> highestMaths_Science();
List<Student> ReportCards();
}
