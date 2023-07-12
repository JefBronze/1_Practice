package employe2;

import java.util.*;

public class NameComparator implements Comparator<Employe>{

	
	NameComparator(){
		
	}
	public int compare(Employe e1, Employe e2) {
		
		//comparer les noms
		int r = e1.getLastName().compareTo(e2.getLastName());
		if(r==0) {
		//Si les noms sont égaux, on compare les prenoms
			r=e1.getFirstName().compareTo(e2.getFirstName());
		}
		//Si les prenoms sont égaux, on compare les ids
		if(r==0) {
			r = e1.getId()-e2.getId();
		}
		return r;
		
	}

}
