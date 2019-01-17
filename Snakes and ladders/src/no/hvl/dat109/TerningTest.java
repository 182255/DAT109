package no.hvl.dat109;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TerningTest {
	Terning dice;
	 @Before
	 public void setup() {
		 dice = new Terning();
	 }
	 
	 @Test
	 public void kunTilSeks() {
		 for(int i = 0; i < 1000000000; i++) {
			 dice.trill();
			assertTrue(dice.getVerdi() < 7);
			assertTrue(dice.getVerdi() > 0);
			
		 }
	 }

}
