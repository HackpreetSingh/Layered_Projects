package assignment1_eggs;

import java.util.Scanner;

public class Business_Logic {
	Egg e;
	public Business_Logic() {
		e=new Egg();
		
		e.setGross(0);
		e.setDozen(0);
		e.setRem(0);
		
	}
	public void eggCalc() {
		System.out.println("Enter the number of eggs: ");
		Scanner s= new Scanner(System.in);
		
		e.setEgg(s.nextInt());
		calc(e.getEgg());
		s.close();
	}
	public void calc(int egg) {
		e.setGross(egg/144);
		egg%=144;
		e.setDozen(egg/12);
		egg%=12;
		e.setRem(egg);		
	}
	public int getGross() {
		return e.getGross();
	}
	public int getDozen() {
		return e.getDozen();
		}
	public int getRem() {
		return e.getRem();
		
	}
	public void disp() {
		System.out.format("%-20s %-20s %-20s","Gross","Dozens","Remaining");
		System.out.println();
		System.out.format("%-20s %-20s %-20s",getGross(),getDozen(),getRem());
		
	}
}
