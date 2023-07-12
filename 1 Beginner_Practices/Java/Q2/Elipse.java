package aaa;

public class Elipse extends AConique{
	
	private double sah;
	private double sav;
	
	public Elipse(double sah, double sav) {
		setRayon(sah, sav);
			
	}
	
	@Override
	public double getCoteH() {
		return sah;
	}
	@Override
	public double getCoteV() {
		return sav;
	}
	
	public void setRayon(double sah, double sav) {
		if(sah>0 ) {
			this.sah = sah;
		}
		
		
		if(sav>0){
			this.sav=sav;
		}
		
		
		
	}

}
