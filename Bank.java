package Spil;

public class Bank {
private String navn;

private Konto k = new Konto("Bankens Konto");


	public Bank(String navn) {
		this.navn=navn;
	}
	
	public int getBank() {
		return k.getBeholdning();
	}
	
	public void setBank(int nyScore) {
		k.setBeholdning(nyScore);
	}
	
	public void indsætPenge(int n) {
		k.setBeholdning(k.getBeholdning()+n);
	}
	
	public void hævPenge(int n) {
		k.setBeholdning(k.getBeholdning()-n);
	}
	
	
}
