package pack;

import java.util.*;

public abstract class Conique {

	protected double sah;
	protected double sav;

	public double getSAH() {
		return this.sah;
	}

	public double getSAV() {
		return this.sav;
	}

	public final double Aire() {
		return Math.PI * sah * sav;
	}

	public List<Double> getAttributs() {
		List<Double> attributs = new ArrayList<Double>();
		attributs.add(getSAH());
		attributs.add(getSAV());

		return attributs;

	}

	@Override
	public String toString() {
		return getAttributs().toString();
	}

}
