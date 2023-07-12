package aaa;

public class Cercle extends AConique{
	
	private double r;
	
		
	public Cercle(double r) {
		setRayon(r);
	}
	
	@Override
	public double getCoteV() {
		return r;
	}
	@Override
	public double getCoteH() {
		return r;
	}
	
	
	public void setRayon(double r) {
		if(r>0) {
			this.r = r;
		}
		
		
	}

}
