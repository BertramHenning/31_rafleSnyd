package entity;

public class Ejendom extends Felt {

	protected int pris;
	protected Spiller ejer;

	public Ejendom(String navn, int pris) {
		super(navn);
		this.pris = pris;
		this.ejer = null;

	}

	public Spiller getEjer() {
		return ejer;
	}

	public void setEjer(Spiller ejer) {
		this.ejer = ejer;
	}
	
	public int getPris(){
		return pris;
	}
	
}
