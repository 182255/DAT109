package no.hvl.dat109;

public class Brikke {

	private String fasong;
	private int plassering;
	
	public Brikke() {
		plassering = 0;
	}

	
	public void move(int antallRuter) {
		plassering += antallRuter;
	}
	
	//getters and setters
	public String getFasong() {
		return fasong;
	}

	public void setFasong(String fasong) {
		this.fasong = fasong;
	}

	public int getPlassering() {
		return plassering;
	}

	public void setPlassering(int plassering) {
		this.plassering = plassering;
	}
	
	public String place() {
		return fasong + " er i Rute nr " + plassering;
	}
	
}
