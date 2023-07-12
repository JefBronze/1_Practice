package pack1;

import java.util.Comparator;

public class NomComparator implements Comparator<Employe> {

	NomComparator() {

	}

	public int compare(Employe Emp1, Employe Emp2) {
		int x = Emp1.getNom().compareTo(Emp2.getNom());
		if (x == 0) {
			x = ((String) Emp1.getPrenom()).compareTo((String) Emp2.getPrenom());
		}

		if (x == 0) {
			x = Emp1.getId() - Emp2.getId();
		}
		return x;
	}

}
