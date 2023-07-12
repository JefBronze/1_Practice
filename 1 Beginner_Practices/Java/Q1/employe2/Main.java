package employe2;

import java.util.*;

public class Main {
	private static void treatException(EmployeDataException e) {
	
		e.printStackTrace();
		if(e.getCode()==1) {
			System.err.print("L'id "+ (int)e.getObj()+ " zero ou négatif.");
		}
		else if(e.getCode()==2) {
			System.err.print("Le nom " + (String)e.getObj() + "invalide");
		}
		else if(e.getCode()==3) {
			System.err.print("Le prenom " + (String)e.getObj() + " invalide.");
		}
		else if(e.getCode()==4) {
			System.err.print("Le salaire " + (double)e.getObj() + " est négatif.");
		}
		else {
			System.err.print("Erreur inconnu");
		}
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Employe e1 = new Employe(100, "Barros", "Antonio", 1000.00);
		Employe e2 = new Employe(101, "Silva", "Carlos", 2000.00);
		Employe e3 = new Employe(104, "Peres", "Carla", 3000.00);
		
		List <Employe> list = new ArrayList<Employe>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		for(Employe a: list)
			System.out.println(a);
		System.out.println();
		
		System.out.println("ArrayList is by id (student default order");
		Collections.sort(list, new NameComparator());
		for(Employe a : list)
			System.out.println(a);
		System.out.println();
		
		System.out.println("ArrayList is by id (student default order");
		Collections.sort(list, new IdComparator());
		for(Employe a : list)
			System.out.println(a);
		System.out.println();
		
		try {
			System.out.println(new Employe(-100,"Picard", "Jean-Luc", 0));
		} 
		catch (EmployeDataException e){
			treatException(e);
	

	}

}
}

