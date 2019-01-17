package no.hvl.dat109;

import java.util.ArrayList;
import java.util.List;

public class Brett {
	private List<Rute> board;
	
	public Brett() {
		 board = new ArrayList<Rute>();
		 addRuter();
	}
	
	
	private void addRuter() {
		for(int i = 1; i <= 100; i++) {
			Rute ny = new Rute();
			ny.setNr(i);
			board.add(ny);
		}
	}
	
	public int sizeBrett() {
		return board.size();
	}
	
	

}
