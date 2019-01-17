package no.hvl.dat109;

import java.util.Random;

public class Terning {
	private Random terningverdi = new Random();;
	private int dots, roll;

	public Terning() {
		dots = terningverdi.nextInt(6) + 1;

	}

	public void trill() {
		roll = terningverdi.nextInt(dots) + 1;
	}
	
	public int getVerdi() {
		return roll;
	}
	
	

}
