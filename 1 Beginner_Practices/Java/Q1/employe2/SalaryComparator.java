package employe2;

import java.util.*;

public class SalaryComparator implements Comparator<Employe>{ 

	SalaryComparator(){
		
	}
	
	public int compare(Employe e1, Employe e2) {
		int r;
		if(e1.getSalary()> e2.getSalary()) {
			r=1;
		}
		else if(e1.getSalary()==e2.getSalary()) {
			r=0;
		}
		else  {
			r=-1;
		}
		if(r==0) {
			r=e1.getId()-e2.getId();
		}
		return r;
	}
	
}
