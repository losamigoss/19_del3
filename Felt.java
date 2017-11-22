package Bræt;

public class Felt {
	protected String navn;
	protected int feltNummer;
	protected String beskrivelse;
	
		public Felt(String navn, int feltNummer) {
		this.navn=navn;
		this.feltNummer=feltNummer;
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
}
