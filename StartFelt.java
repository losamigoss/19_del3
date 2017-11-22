package Bræt;

public class StartFelt extends Felt{
	private int startVærdi;
	
	public StartFelt(String navn, int feltNummer) {
		super(navn, feltNummer);
		this.startVærdi=3;
	}
	
	public int getStartVærdi() {
		return startVærdi;
	}
	
	public void setStartVærdi(int startVærdi) {
		this.startVærdi=startVærdi;
	}

}
