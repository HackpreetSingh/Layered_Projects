package assignment2_Student;

import java.util.*;

public class Service_Implement implements Service_Interface {

	List<Student> x;
	Persistance_implement p;
	
	public Service_Implement() {
		super();
		x = new ArrayList<Student>();
		p = new Persistance_implement();
		x = p.getRecords();
	}

	@Override
	public void insertData(String nm, int e, int m, int s) {
		p.insertRecords(new Student(x.size() + 1, nm, e, m, s));
	}

	@Override
	public List<Student> return_roll_Name() {
		
		return x;
	}

	@Override
	public Student highestAll() {
		double avg = Integer.MIN_VALUE;
		Student z = null;
		for (Student s : x)
			if ((s.getE() + s.getM() + s.getS()) / 3.0 > avg) {
				avg = (s.getE() + s.getM() + s.getS()) / 3.0;
				z=s;
			}

		return z;
	}

	@Override
	public Student highestMaths() {
		int maths=Integer.MIN_VALUE;
		Student z=null;
		for(Student s:x)
			if(s.getM()>maths) {
				maths=s.getM();
				z=s;
			}
		return z;
	}

	@Override
	public List<Student> highestMaths_Science() {
		List<Student> l=new ArrayList<Student>();
		for(Student s:x) l.add(s);
		double avg,avg1;
		Student temp;
		for(int i=0;i<x.size()-1;i++) {
			for (int j = 0; j < x.size()-1-i; j++) {
				temp=l.get(j);
				avg=(temp.getM()+temp.getS())/2;
				temp=l.get(j+1);
				avg1=(temp.getM()+temp.getS())/2;
				
				if(avg>avg1) {
					temp=l.get(j);
					l.set(j, l.get(j+1));
					l.set(j+1, temp);
				}
			}
		}
		return l;
	}

	@Override
	public List<Student> ReportCards() {
		List<Student> l=new ArrayList<Student>();
		for(Student s:x) l.add(s);
		double avg,avg1;
		Student temp;
		for(int i=0;i<x.size()-1;i++) {
			for (int j = 0; j < x.size()-1-i; j++) {
				temp=l.get(j);
				avg=(temp.getE()+temp.getM()+temp.getS())/3;
				temp=l.get(j+1);
				avg1=(temp.getE()+temp.getM()+temp.getS())/3;
				
				if(avg<avg1) {
					temp=l.get(j);
					l.set(j, l.get(j+1));
					l.set(j+1, temp);
				}
			}
		}
	

		return l;
	}

}
