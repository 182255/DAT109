package no.hvl.dat109;

public class Spill {
	private Brett board;
	private Terning dice;
	private Spiller player1;
	
	public Spill() {
		board = new Brett();
		dice = new Terning();
		player1 = new Spiller("Enah", "Square");
	}
	
	public void startGame() {
		while(!vinner(player1)) {
			
		}
		
	}
	
	private boolean vinner(Spiller s) {
		int last = 100;
		int place = s.getBrikke().getPlassering();
		
		return last == place;
	}

}
