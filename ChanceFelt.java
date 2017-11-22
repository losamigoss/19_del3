package Bræt;

public class ChanceFelt extends Felt{
	
	public ChanceFelt(String navn, int feltNummer) {
		super(navn,feltNummer);
	}
	
	ChanceKort chance1 = new ChanceKort("Ryk frem til start - modtag 2M",1);
	ChanceKort chance2 = new ChanceKort("Ryk OP TIL 5 felter frem",2);
	ChanceKort chance3 = new ChanceKort("Ryk 1 felt frem ELLER tage et chancekort mere",3);
	ChanceKort chance4 = new ChanceKort("Du har spist for meget slik BETAL M2 til banken",4);
	ChanceKort chance5 = new ChanceKort("Du løslades fra fængsel uden omkostninger Behold dette kort, indtil du får brug for det.",5);
	ChanceKort chance6 = new ChanceKort("Ryk frem til Strandpromenaden",6);
	ChanceKort chance7 = new ChanceKort("Det er din fødselsdag alle giver dig M1 tillykke med fødselsdagen",7);
	ChanceKort chance8 = new ChanceKort("Du har lavet alle dine lektier modtag M2 fra banken.",8);
	ChanceKort chance = new ChanceKort("",9);
	
}
