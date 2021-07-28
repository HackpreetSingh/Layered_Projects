package assignment2_Student;

import java.util.*;

public class Database_Student {
	private static List<Student> l=new ArrayList<Student>();;
	
	static {
		l.add(new Student(1,"ABC",90,91,92));
		l.add(new Student(2,"BCD",91,92,93));
		l.add(new Student(3,"CDE",93,94,95));
		l.add(new Student(4,"DEF",95,96,97));
		l.add(new Student(5,"EFG",96,97,98));
		
	}
//	public Database_Student( int e, int m, int s, String name) {
//	l.add(new Student( l.size()+1,name,  e,  m,  s));
//	}

	public static List<Student> getL() {
		return l;
	}

	public static void setL(List<Student> l) {
		Database_Student.l = l;
	}
	
	
}
