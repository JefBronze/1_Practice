package aaa;

import java.util.*;

public abstract class AConique {
	
	protected double sah;
	protected double sav;
	
	public double getCoteH() {
		return this.sah;
	}
	public double getCoteV() {
		return this.sav;
	}
	
	public final double Aire() {
		return 3.41*sah*sav;
	}
	
	public List<Double> getAttributs(){
		List<Double> attributs = new ArrayList<Double>();
		attributs.add(getCoteH());
		attributs.add(getCoteV());
		
		
		
		return attributs;
		
		
		
	}
	
	@Override 
	public String toString() {
		return getAttributs().toString();
	}
	
	

}
