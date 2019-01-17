package no.hvl.dat109;

import java.util.Scanner;

public class Spill {
	private Brett board;
	private Terning dice;
	private Spiller player1;
	private Spiller player2;
	private boolean newGame = false; //di pa sure dito
	private Scanner scanner = new Scanner(System.in);
	
	public Spill() {
		board = new Brett();
		dice = new Terning();
		newGame = true;
	}
	
	public void startGame() {
		Spiller current;
		Brikke currentBrikke;
		if(newGame) { //not so necessary actually
			current = opprettSpiller();
			currentBrikke = current.getBrikke();
			while(currentBrikke.getPlassering() != 100) {
				dice.trill();
//				currentBrikke.setPlassering(dice.getVerdi());
				currentBrikke.move(dice.getVerdi());
				System.out.println(current.getBrikke().getPlassering());
			}
			System.out.println("outside");
			
			
		}
	}
	
	private boolean vinner() {
		int place = player1.getBrikke().getPlassering();
		return place == 100;
	}
	
	private Spiller opprettSpiller() {
		System.out.println("Oppgi navn");
		String name1 = scanner.nextLine();
		System.out.println("Oppgi brikke");
		String brikke1 = scanner.nextLine();
		System.out.println();
		player1 = new Spiller(name1, brikke1);
		return player1;
	}

}
