package Bræt;
import java.util.Random;
public class ChanceFelt extends Felt{
	ChanceKort[] chanceKort = new ChanceKort[2];
	ChanceKort nuværendeKort = new ChanceKort("Nuværende Kort",10);
	
	public ChanceFelt(String navn, int feltNummer) {
		super(navn,feltNummer);
		chanceKort[0] = new ChanceKort("Du har spist for meget slik BETAL M2 til banken",0);
		chanceKort[1] = new ChanceKort("Du har lavet alle dine lektier modtag M2 fra banken.",1);
	}
	
	
	public ChanceKort trækChance() {
		Random rand = new Random();
		int randomNum = rand.nextInt((1 - 0) + 1) + 0;
		return chanceKort[randomNum];
	}
	
	public String getChanceNavn() {
		return nuværendeKort.getNavn();
	}
	
	public int getNummer() {
		return nuværendeKort.getNummer();
	}
	
}

