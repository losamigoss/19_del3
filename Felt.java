package Bræt;

import Spil.Spiller;

public class Felt {
	protected String navn;
	protected int feltNummer;
	protected String beskrivelse;
	protected int værdi;
	private Spiller ejer;
	
	
		
		public Felt(String navn, int feltNummer, int værdi) {
		this.navn=navn;
		this.feltNummer=feltNummer;
		this.værdi=værdi;
		Spiller s = new Spiller("");
		this.ejer=s;
		}
		
		public Felt (String navn, int feltNummer) {
			this.navn=navn;
			this.feltNummer=feltNummer;
			this.ejer=null;
		}
		
		public void setNavn(String navn) {
			this.navn=navn;
		}
		
		public String getNavn() {
			return navn;
		}
		
		public void setFeltNummer(int feltNummer) {
			this.feltNummer=feltNummer;
		}
		
		public int getFeltNummer() {
			return feltNummer;
		}
		
		public String getBeskrivelse() {
			return beskrivelse;
		}
		
		public void setBeskrivelse(String beskrivelse) {
			this.beskrivelse=beskrivelse;
		}
		
		public void setVærdi(int n) {
			værdi=n;
		}
		
		public int getVærdi() {
			return værdi;
		}
		
		public void setEjer(Spiller ejer) {
			 this.ejer=ejer;
		}
			 	
		public void fjernEjer() {
			 this.ejer=null;
		}
		
		public String getEjerNavn(int n) {
			return ejer.getNavn();
		}
		
		public Spiller getEjer() {
			return ejer;
		}
}

