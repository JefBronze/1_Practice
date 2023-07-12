package pack;

public class Elipse extends Conique {

	public Elipse(double sah, double sav) {
		setRayon(sah, sav);
	}

	public void setRayon(double newSah, double newSav) {
		if (newSah > 0) {
			this.sah = newSah;
		}
		if (newSav > 0) {
			this.sav = newSav;
		}
	}

	@Override
	public double getSAH() {
		return this.sah;
	}

	@Override
	public double getSAV() {
		return this.sav;
	}
}
