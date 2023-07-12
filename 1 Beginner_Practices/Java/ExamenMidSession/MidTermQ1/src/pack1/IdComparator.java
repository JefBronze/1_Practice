package pack1;

import java.util.Comparator;

public class IdComparator implements Comparator<Employe> {

	public IdComparator() {

	}

	public int compare(Employe Emp1, Employe Emp2) {
		int x;
		x = Emp1.getId() - Emp2.getId();
		return x;
	}

}
