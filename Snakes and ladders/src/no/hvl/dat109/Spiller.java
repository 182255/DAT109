package no.hvl.dat109;

/**
 * Definerer en spiller
 * @author 
 */
public class Spiller {
	private String navn;
	private Brikke brikke;
	Brett brett;
	
	public Spiller(String navn, String brikkeNavn) {
		navn = this.navn;
		brikke = new Brikke();
		brikke.setFasong(brikkeNavn);
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public Brikke getBrikke() {
		return brikke;
	}

	public void setBrikke(Brikke brikke) {
		this.brikke = brikke;
	}
	
	public String toString() {
		return "Spiller 1 " + navn;
	}

	/**
	 * Spiller et trekk.
	 * @param terning terning
	 */
	public void spillTrekk(Terning dice) {
		dice.trill();
		int verdi = dice.getVerdi();
		int nummer = brikke.getRute();
		Rute nyRute = brett.finnNyRute(verdi, nummer);
		brikke.setRute(nyRute.getNr());
		
	}
	

}
