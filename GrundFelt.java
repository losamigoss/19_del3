package Bræt;

import Spil.Spiller;

public class GrundFelt extends Felt {
	private int værdi;
	private boolean ejerskab;
	private Spiller ejer;
	
	public GrundFelt(String navn, int feltNummer, int værdi) {
		super(navn,feltNummer);
		this.værdi=værdi;
		this.ejerskab=false;
	}
	
	public int getVærdi() {
		return værdi;
	}
	
	public void setVærdi(int værdi) {
		this.værdi=værdi;
	}
	
	public void setEjer(Spiller ejer) {
		this.ejer=ejer;
		ejerskab=true;
	}
	
	public void fjernEjer() {
		ejerskab=false;
		this.ejer=null;
	}
	
	public Spiller getEjer() {
		return ejer;
	}
}
