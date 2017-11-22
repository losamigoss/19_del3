package Bræt;

public class Bræt {
	
	public Bræt() {
		StartFelt start= new StartFelt("Start",1);
		GrundFelt burgerbaren = new GrundFelt("Bugerbaren",2,1);
		GrundFelt pizzahuset = new GrundFelt("Pizzahuset",3,1);
		ChanceFelt chance1 = new ChanceFelt("Chance",4);
		GrundFelt slikbutikken = new GrundFelt("Slikbutikken",5,1);
		GrundFelt iskiosken = new GrundFelt("Iskiosken",6,1);
		SpecialFelt fængsel1 = new SpecialFelt("Fængsel",7);
		GrundFelt museet = new GrundFelt("Muséet",8,2);
		GrundFelt biblioteket = new GrundFelt("biblioteket",9,2);
		ChanceFelt chance2 = new ChanceFelt("Chance",10);
		GrundFelt skaterparken = new GrundFelt("Skaterparken",11,2);
		GrundFelt swimmingpoolen = new GrundFelt("Swimmingpoolen",12,2);
		SpecialFelt parkering = new SpecialFelt("Gratis Parkering",13);
		GrundFelt spillehallen = new GrundFelt("Spillehallen",14,3);
		GrundFelt biografen = new GrundFelt("Biografen",15,3);
		ChanceFelt chance3 = new ChanceFelt("Chance",16);
		GrundFelt legetøjsbutikken = new GrundFelt("Legetøjsbutikken",17,3);
		GrundFelt dyrehallen = new GrundFelt("Dyrehallen",18,3);
		SpecialFelt fængsel2 = new SpecialFelt("Gå i fængsel",19);
		GrundFelt bowlinghallen = new GrundFelt("Bowlinghallen",20,4);
		GrundFelt zoo = new GrundFelt("Zoo",21,4);
		ChanceFelt chance4 = new ChanceFelt("Chance",22);
		GrundFelt vandlandet = new GrundFelt("Vandlandet",23,5);
		GrundFelt strandpromenaden = new GrundFelt("Strandpromenaden",24,5);
		
	}
	
}
