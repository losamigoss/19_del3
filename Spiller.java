package Spil;
import Bræt.GrundFelt;


public class Spiller {
	private String navn;
	private String Grunde[];
	private int Aktiver[];
	
	private Konto k = new Konto("spillerKonto");
	
	public Spiller (String nytNavn) {
		navn=nytNavn;
	}
	
	public int getScore() {
		return k.getBeholdning();
	}
	
	public void setScore(int nyScore) {
		k.setBeholdning(nyScore);
	}
	
	public String toString() {
		return navn+" - "+k.toString();
	}
	
	public String getNavn() {
		return navn;
	}
	
	public void setNavn(String nytNavn) {
		navn=nytNavn;
	}
	
	public void setGrunde(GrundFelt felt) {
		this.Grunde[felt.getFeltNummer()-1]="Grund: "+felt.getNavn()+" - Feltnummer: "+felt.getFeltNummer()+" - Værdi: "+felt.getVærdi();
		this.Aktiver[felt.getFeltNummer()-1]=felt.getVærdi();
	}
	
	public int getGrundeVærdi() {
		int grundeVærdi=0;
		
		for (int n=0;n<=this.Grunde.length; n++) {
			grundeVærdi+=Aktiver[n];
		}
		
		return grundeVærdi;
	}
	
	public void fjernGrunde(GrundFelt felt) {
		this.Grunde[felt.getFeltNummer()-1]=null;
		this.Aktiver[felt.getFeltNummer()-1]=0;
	}
	
}