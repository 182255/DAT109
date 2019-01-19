package no.hvl.dat109;

public class Brikke {

	private String fasong;
	private int rute;
	
	public Brikke() {
		rute = 0;
	}

	
	public void move(int antallRuter) {
		rute += antallRuter;
	}
	
	//getters and setters
	public String getFasong() {
		return fasong;
	}

	public void setFasong(String fasong) {
		this.fasong = fasong;
	}

	public int getRute() {
		return rute;
	}

	public void setRute(int plassering) {
		this.rute = plassering;
	}
	
	public String place() {
		return fasong + " er i Rute nr " + rute;
	}
	
}
