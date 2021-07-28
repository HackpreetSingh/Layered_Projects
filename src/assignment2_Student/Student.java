package assignment2_Student;

public class Student {
	private int rollno, e, m, s;
	private String name;
	public int getRollno() {
		return rollno;
	}
	public Student() {
		super();
	}
	public Student(int rollno, String name, int e, int m, int s) {
		super();
		this.rollno = rollno;
		this.e = e;
		this.m = m;
		this.s = s;
		this.name = name;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getE() {
		return e;
	}
	public void setE(int e) {
		this.e = e;
	}
	public int getM() {
		return m;
	}
	public void setM(int m) {
		this.m = m;
	}
	public int getS() {
		return s;
	}
	public void setS(int s) {
		this.s = s;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
