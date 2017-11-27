package Bræt;
import Spil.Spiller;

public class Bræt {
	
	ChanceKort nuværendeChance = new ChanceKort("nuværende",100);
	Felt[] felter = new Felt[24];
	
	
	public Bræt() {
		felter[0] = new StartFelt("Start",1);
		felter[1] = new GrundFelt("Bugerbaren",2,1);
		felter[2] = new GrundFelt("Pizzahuset",3,1);
		felter[3] = new ChanceFelt("Chance",4);
		felter[4] = new GrundFelt("Slikbutikken",5,1);
		felter[5] = new GrundFelt("Iskiosken",6,1);
		felter[6] = new SpecialFelt("Gratis Parkering",7);
		felter[7] = new GrundFelt("Muséet",8,2);
		felter[8] = new GrundFelt("biblioteket",9,2);
		felter[9] = new ChanceFelt("Chance",10);
		felter[10] = new GrundFelt("Skaterparken",11,2);
		felter[11] = new GrundFelt("Swimmingpoolen",12,2);
		felter[12] = new SpecialFelt("Gratis Parkering",13);
		felter[13] = new GrundFelt("Spillehallen",14,3);
		felter[14] = new GrundFelt("Biografen",15,3);
		felter[15] = new ChanceFelt("Chance",16);
		felter[16] = new GrundFelt("Legetøjsbutikken",17,3);
		felter[17] = new GrundFelt("Dyrehallen",18,3);
		felter[18] = new SpecialFelt("Gratis Parkering",19);
		felter[19] = new GrundFelt("Bowlinghallen",20,4);
		felter[20] = new GrundFelt("Zoo",21,4);
		felter[21] = new ChanceFelt("Chance",22);
		felter[22] = new GrundFelt("Vandlandet",23,5);
		felter[23] = new GrundFelt("Strandpromenaden",24,5);
		
	}
	
	public String getFeltNavn(int f) {
		return felter[f].getNavn();
	}
	
	public int getVærdi(int f) {
		if (felter[f].getVærdi()>0) {
		return felter[f].getVærdi();
		}
		else return 0;
	}
	
	public int getFeltNummer(int f) {
		return felter[f].getFeltNummer();
	}
	
	
	public void setEjer(Spiller ejer, int n) {
		felter[n].setEjer(ejer);
	}
	
	public String getEjerNavn(int n) {
		return felter[n].getEjerNavn(n);
	}
	
	public Spiller getEjer(int n) {
		return felter[n].getEjer();
	}
	
	public void trækChance() {
		ChanceFelt c = new ChanceFelt("1",1);
		nuværendeChance = c.trækChance();
	}
	
	public String getChanceNavn() {
		return nuværendeChance.getNavn();
	}
	
	public int getChanceNummer() {
		return nuværendeChance.getNummer();
	}
	
}
