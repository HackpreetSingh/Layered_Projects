package assignment2_Student;

import java.util.*;

public class Presentation_Layer {

	private Service_Implement ser;

	public Presentation_Layer() {
		super();
		ser = new Service_Implement();
	}

	public void menuDisp() {
		System.out.println(
				"1.	To display the entire roll no and the name of the students in the class in the ascending order of roll no.\r\n"
						+ "2.	To display the roll no and the name of the student who has got the highest percentage.\r\n"
						+ "3.	To display the roll no and the name of the student who scored highest mark In mathematics.\r\n"
						+ "4.	To display the roll no and the name of the student in the ascending order of the total marks in mathematics and science alone.\r\n"
						+ "5.	To display the roll no, name, total marks, percentage and rank of all the students in the descending order of rank.\r\n"
						+ "6.	To Insert the Record\r\n" + "7.	To Exit.\r\n");
	
	}
	
	public void choice1() {
		List<Student> l = ser.return_roll_Name();
		for (int i = 0; i < l.size(); i++)
			System.out.println(l.get(i).getRollno() + " " + l.get(i).getName());
	}
	
	public void choice4() {
		List<Student> list = ser.highestMaths_Science();
		for (Student i : list)
			System.out.println(i.getRollno() + " " + i.getName());
		
	}
	
	public void choice() {
		Scanner s = new Scanner(System.in);
		int ch;
		while (true) {
			menuDisp();
			ch = s.nextInt();
			switch (ch) {
			case 1:
				choice1();
				break;

			case 2:
				Student x = ser.highestAll();
				System.out.println(x.getRollno() + " " + x.getName());
				break;
			case 3:
				Student z = ser.highestMaths();
				System.out.println(z.getRollno() + " " + z.getName());
				break;
			case 4:
				choice4();
				break;
			case 5:
				choice5();
				break;
			case 6:
				choice6(s);
				break;
			case 7:
				s.close();
				System.exit(0);

			default:
				System.out.println("Wrong input!");
			}
		}

	}

	private void choice6(Scanner s) {
		s.nextLine();
		System.out.println("Enter name: ");
		String nm = s.nextLine();
		System.out.println("Enter marks in english: ");
		int e = s.nextInt();
		System.out.println("Enter marks in maths: ");
		int m = s.nextInt();
		System.out.println("Enter Science: ");
		int sc = s.nextInt();
		ser.insertData(nm, e, m, sc);
		
	}

	private void choice5() {
		List<Student> full = ser.ReportCards();
		int total;
		double percentage;
		Student temp;
		for (int i = 0; i < full.size(); i++) {
			temp = full.get(i);
			total = temp.getE() + temp.getM() + temp.getS();
			percentage = total / 3.0;
			System.out.printf("Rank: %d Roll Number: %d Name: %s Total Marks: %d Percentage: %f", i + 1,
					temp.getRollno(), temp.getName(),total, Float.parseFloat(String.format("%.2f",percentage)));
			System.out.println();
		}
	}

}
