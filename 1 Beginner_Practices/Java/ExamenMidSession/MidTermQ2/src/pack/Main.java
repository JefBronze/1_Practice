package pack;

public class Main {

	public static String X(Conique r) {
		double aire = r.Aire();
		if (r instanceof Elipse) {
			((Elipse) r).setRayon(r.getSAH(), 2 * r.getSAV());
		} else if (r instanceof Cercle) {
			((Cercle) r).setRayon(r.getSAH());
		}
		if (r.Aire() == 2 * aire) {
			return "OK";
		} else {
			throw new RuntimeException();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conique Elipse1 = new Elipse(1, 3);
		Conique Cercle1 = new Cercle(5);

		System.out.println("Elipse1 = " + Elipse1);
		System.out.println("Elipse1 = " + X(Elipse1));
		System.out.println("L'Aire de ellipse et " + Elipse1.Aire());
		System.out.println();
		System.out.println("Cercle1 = " + Cercle1);
		System.out.println("Cercle1 = " + X(Cercle1));
		System.out.println("L'Aire du cercle et " + +Cercle1.Aire());

	}

}
