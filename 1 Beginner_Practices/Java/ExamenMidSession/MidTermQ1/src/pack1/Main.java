package pack1;

import java.util.*;

public class Main {
	private static void treatException(EmployeException e) {

		e.printStackTrace();
		if (e.getLogic() == 1) {
			System.err.print("L'id " + (int) e.getObject() + " zero ou négatif.");
		} else if (e.getLogic() == 2) {
			System.err.print("Le nom " + (String) e.getObject() + "invalide");
		} else if (e.getLogic() == 3) {
			System.err.print("Le prenom " + (String) e.getObject() + " invalide.");
		} else if (e.getLogic() == 4) {
			System.err.print("Le salaire " + (double) e.getObject() + " est négatif.");
		} else {
			System.err.print("Erreur inconnu");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employe Emp1 = new Employe(1, "Bronze", "Jeferson", 10000.00);
		Employe Emp2 = new Employe(2, "Inacio", "Luiz", 200.00);
		Employe Emp3 = new Employe(3, "Pimentel", "Nathalia", 3000.00);
		Employe Emp4 = new Employe(4, "Alves", "Izabela", 2500.00);
		Employe Emp5 = new Employe(6, "Izabel", "Maria", 1000.00);
		Employe Emp6 = new Employe(5, "Moreira", "Fabio", 1200.00);
		//Employe Emp7 = new Employe(-5, "I*", "Fabio", -1200.00);

		List<Employe> list = new ArrayList<Employe>();
		list.add(Emp1);
		list.add(Emp2);
		list.add(Emp3);
		list.add(Emp4);
		list.add(Emp5);
		list.add(Emp6);
		System.out.println("Personnel ArrayList - Pas de Ordre");
		for (Employe a : list)
			System.out.println(a);
		System.out.println();

		System.out.println("Personnel ArrayList - Ordre: Nom");
		Collections.sort(list, new NomComparator());
		for (Employe a : list)
			System.out.println(a);
		System.out.println();

		System.out.println("Personnel ArrayList - Ordre: Id");
		Collections.sort(list, new IdComparator());
		for (Employe a : list)
			System.out.println(a);
		System.out.println();

		try {
			System.out.println(new Employe(-100, "Picard", "Jean-Luc", 0));
		} catch (EmployeException e) {
			treatException(e);

		}

	}
}
