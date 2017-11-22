package Spil;

import java.util.Random;
	public class Terning {
		
		int[] terning;
		
		public Terning (int[] a){
		terning=a;
		}
		
		Random dice = new Random(); //Opretter tilfældighedsvariabel
		int terningslag;
		
		
		public int slag() {
			terningslag = dice.nextInt(terning.length);
			
			return terning[terningslag];
		}
		
		public int getVærdi() {
			return terningslag;
		}
		
	}
	