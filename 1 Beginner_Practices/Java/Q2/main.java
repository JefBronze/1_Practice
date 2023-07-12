package aaa;



public class main {
	
	public static String myF(AConique r)
	{
		double aire = r.Aire();
		((Elipse) r).setRayon(r.getCoteH(), 2*r.getCoteV());
		if (r.Aire()==2*aire) {
			return "OK";
		}
		else {
			throw new RuntimeException();
		}
	}
	
	public static String myF2(AConique r)
	{
		double aire = r.Aire();
		//r.setCote(r.getc1(), 2*r.getc2());
//		if (r.surface()==2*aire) {
			return "OK";
//		}
//		else {
//			throw new RuntimeException();
//		}
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Elipse e1 = new Elipse(5,7);
		Elipse e2 = new Elipse (10,10);
		Cercle c1 = new Cercle (10);
		
		System.out.println("e1 = "+e1);
		System.out.println("e1 is "+ myF(e1));
		System.out.println("e1 = "+e1);
		
		System.out.println("e2 = "+e2);
		System.out.println("e2 is "+ myF(e2));
		System.out.println("e2 = "+e2);
		
		//System.out.println("c1 = "+c1);
		//System.out.println("c1 is "+ myF(c1));
		//System.out.println("e2 = "+c1);
		
		
		
			
		

	}

}
