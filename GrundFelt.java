package Bræt;

import Spil.Spiller;

public class GrundFelt extends Felt {
	private Spiller ejer;
	
	public GrundFelt(String navn, int feltNummer, int værdi) {
		super(navn,feltNummer,værdi);
	}
	
//	---Disse metoder er overstreget, da de overskriver den ønskede metode i deres moderklasse. Manglende erfaring er skyld i dette
//	public int getVærdi() { 
//		return værdi;
//	}
//	
//	public void setVærdi(int værdi) {
//		this.værdi=værdi;
//	}
//	
//	public void setEjer(Spiller ejer) {
//		this.ejer=ejer;
//		ejerskab=true;
//	}
//	
//	public void fjernEjer() {
//		ejerskab=false;
//		this.ejer=null;
//	}
	
	public String getEjerNavn(Spiller n) {
		return n.getNavn();
	}
	
	public String toString() {
		String print;
		if (ejer==null) {
			print= " - Værdi: "+værdi+" - Ejer: Ingen";
		}
		else {
			print =" - Værdi: "+værdi+" - Ejer: "+ejer;
		}
		return super.toString()+print;
	}
}
