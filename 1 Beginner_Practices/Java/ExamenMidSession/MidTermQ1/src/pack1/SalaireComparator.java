package pack1;

import java.util.Comparator;

public class SalaireComparator implements Comparator<Employe> {
	
	SalaireComparator() {

	}

	public int compare(Employe Emp1, Employe Emp2) {
		int x;
		if (Emp1.getSalaire() > Emp2.getSalaire()) {
			x = 1;
		} else if (Emp1.getSalaire() == Emp2.getSalaire()) {
			x = 0;
		} else {
			x = -1;
		}
		if (x == 0) {
			x = Emp1.getId() - Emp2.getId();
		}
		return x;
	}

}
