package Bræt;

public class ChanceKort {
private String navn;
private int nummer;

	public ChanceKort(String navn, int nummer) {
		this.navn=navn;
		this.nummer=nummer;
	}
	
	public String getNavn() {
		return navn;
	}
	
	public int getNummer() {
		return nummer;
	}
	
}
