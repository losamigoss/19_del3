package Spil;
import Bræt.*;
import gui_codebehind.GUI_FieldFactory;
import gui_fields.GUI_Car;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_main.GUI;


public class Monopoly {
	public static void main(String[] args) {
	
		
		int startBalance=3; //til spillerne
		Bræt b = new Bræt();
		Bank bank = new Bank("Banken");
		bank.indsætPenge(90);
		GUI_Field[] makeFields = GUI_FieldFactory.makeFields();
		GUI_Field[] fields = new GUI_Field[24];
		
		for (int i = 0; i < fields.length; i++) {
		fields[i] = makeFields[i];
		fields[i].setTitle(b.getFeltNavn(i));
		fields[i].setSubText("Værdi: "+b.getVærdi(i));
		fields[i].setDescription("Felt nr: "+b.getFeltNummer(i));
		
		}
		GUI gui = new GUI(fields);
		int antalSpillere=0;
		for (int o=1; o<2;) {
		antalSpillere=gui.getUserInteger("Indtast antal spillere fra 2-4");
		if (antalSpillere>1 && antalSpillere<5) {
			o=2;
		}
		else {
			gui.showMessage("Det indtastede tal var ikke mellem 2 og 4. Prøv igen.");
		}
		}
		
		
		
		GUI_Player[] players = new GUI_Player[antalSpillere];
		Spiller[] spillere = new Spiller[antalSpillere];
		
		for (int n=1;n<=antalSpillere;n++) {
		GUI_Car car = new GUI_Car();
		GUI_Player p = new GUI_Player(gui.getUserString("Indtast navn på spiller "+n+":"),startBalance,car);
		
		
		
		bank.hævPenge(startBalance);
		players[n-1]=p;
		spillere[n-1]=new Spiller(p.getName());
		spillere[n-1].setNummer(n-1); //Denne del bruges når det skal vides hvem der ejer grunden man er landet på,
		gui.addPlayer(p);
			}
		
		
		Terning t = new Terning(new int[] {1,2,3,4,5,6});
		
		
		
		for (int h=1;h<1000;h++) {
			
			
			gui.showMessage("Det er din tur "+players[h-1].getName()+", slå nu med terningen.");
			t.slag();
			gui.setDie(t.getVærdi());
			int posFør = spillere[h-1].getPosition();
			fields[spillere[h-1].getPosition()].removeAllCars();
			spillere[h-1].rykPosition(t.getVærdi());
			gui.showMessage("Du slog "+t.getVærdi()+" og landede på "+b.getFeltNavn(spillere[h-1].getPosition()));
			fields[spillere[h-1].getPosition()].setCar(players[h-1], true);
			
			
			
			int posEfter = spillere[h-1].getPosition();
			
			if (posFør>posEfter) {
				if (posEfter!=0) {
					gui.showMessage("Du har også passeret start. Modtag 3M.");
					players[h-1].setBalance(players[h-1].getBalance()+3);
					bank.hævPenge(3);
				}
			}
			
			
			
			if (posEfter==1 || posEfter==2 || posEfter==4 || posEfter==5 || posEfter==7 || posEfter==8 || posEfter==10 || posEfter== 11 || posEfter==13 || posEfter==14 || posEfter==16|| posEfter==17 || posEfter==19 || posEfter==20 || posEfter==22 || posEfter==23) {
				
				if (b.getEjerNavn(posEfter).equals(spillere[h-1].getNavn())) {
					gui.showMessage("Du ejer denne grund.");
				}
				
				if (players[h-1].getBalance()<b.getVærdi(posEfter) && !b.getEjer(posEfter).equals(spillere[h-1].getNavn())){
					gui.showMessage("Du har ikke råd til at købe denne grund.");
					int y=0;
					GUI_Player vinderen = players[0];
					String vinder=players[0].getName();
					for (y=0; y<players.length-1;y++) {
						if(vinderen.getBalance()==players[y+1].getBalance()) {
							vinder+=" og "+players[y+1].getName();
						}
						if(vinderen.getBalance()<players[y+1].getBalance()) {
							vinder=players[y+1].getName();
							vinderen = players[y+1];
						}
						
					}
					
					gui.showMessage(players[h-1].getName()+" er gået konkurs. Tillykke til "+vinder+" - du/I har vundet!");
					break;
				}
				
				
				
				
				if (b.getEjerNavn(posEfter)!="" && b.getEjerNavn(posEfter)!=spillere[h-1].getNavn()) {
					gui.showMessage("Denne grund ejes af "+b.getEjerNavn(posEfter)+" - Du betaler "+b.getVærdi(posEfter)+"M i leje.");
					players[h-1].setBalance(players[h-1].getBalance()-b.getVærdi(posEfter));
					Spiller ejer = spillere[b.getEjer(posEfter).getNummer()];
					players[ejer.getNummer()].setBalance(players[ejer.getNummer()].getBalance()+b.getVærdi(posEfter));
					
				}
				
				
				
				if (players[h-1].getBalance()>=b.getVærdi(posEfter) && b.getEjerNavn(posEfter)=="") {
					
					gui.showMessage("Denne grund ejes ikke af nogen. Du skal købe den.");
					
						players[h-1].setBalance(players[h-1].getBalance()-b.getVærdi(posEfter));
						b.setEjer(spillere[h-1], posEfter);
						gui.showMessage("Du købt "+b.getFeltNavn(spillere[h-1].getPosition())+" og brugte "+b.getVærdi(posEfter)+"M.");
						bank.indsætPenge(b.getVærdi(spillere[h-1].getPosition()));
			}
				
				
				
				
			}
			
			if (posEfter==3 || posEfter==9 || posEfter==15 || posEfter==21) {
				gui.showMessage("Du landede på chancefeltet. Gå videre for at prøve lykken!");
				b.trækChance();
				gui.showMessage(b.getChanceNavn());
				
					switch (b.getChanceNummer()) {
					case 0: players[h-1].setBalance(players[h-1].getBalance()-2); bank.indsætPenge(2); break;
					case 1: players[h-1].setBalance(players[h-1].getBalance()+2); bank.hævPenge(2); break;
				}
				
			}
			
			if (posEfter==6 || posEfter==12 || posEfter==18) {
				gui.showMessage("Du landede på gratis parkering. Turen går videre mens du holder.");
			}
			
			if (posEfter==0) {
				gui.showMessage("Du får 3M");
				players[h-1].setBalance(players[h-1].getBalance()+3);
			}
			
			
			
			
			if (players[h-1].getBalance()<0) {
				int y=0;
				GUI_Player vinderen = players[0];
				String vinder=players[0].getName();
				for (y=0; y<players.length-1;y++) {
					if(vinderen.getBalance()==players[y+1].getBalance()) {
						vinder+=" og "+players[y+1].getName();
					}
					if(vinderen.getBalance()<players[y+1].getBalance()) {
						vinder=players[y+1].getName();
						vinderen = players[y+1];
					}
					
				}
				
				gui.showMessage(players[h-1].getName()+" er gået konkurs. Tillykke til "+vinder+" - du/I har vundet!");
				break;
			}
			if (h==antalSpillere) {
				h=0; //Koden virker ikke hvis denne siger h=1, idet h forøges efter hver løkke
			}
		}
		
		
	}

}
