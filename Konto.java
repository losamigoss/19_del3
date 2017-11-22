package Spil;

public class Konto {
	
	String kontonavn;
	int beholdning;
	public Konto (String nyKontonavn) {
		kontonavn=nyKontonavn;
	}
	
	public int getBeholdning() {
		return beholdning;
	}
	
	public void setBeholdning(int nyBeholdning) {
		if (nyBeholdning<0) {
		beholdning=0;
		}
		else {
			beholdning = nyBeholdning;
		}
		
	}
	
	public void indsætPenge(int indsætning) {
		if (indsætning>0) {
		beholdning=beholdning+indsætning;
		}
	}
	
	public String hævPenge(int hævning) {
		
		if (beholdning-hævning>=0) {
		beholdning=beholdning-hævning;
		return "Transaktion gennemført.";
		}
		
		else {
			return "Transaktion ikke gennemført. Du har ikke råd.";
		}
	}
	
	public String toString() {
		return "Balance: "+beholdning;
	}
	
}