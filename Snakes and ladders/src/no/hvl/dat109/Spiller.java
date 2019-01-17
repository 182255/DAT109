package no.hvl.dat109;

public class Spiller {
	private String navn;
	private Brikke brikke;
	
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
	

}
