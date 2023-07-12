package employe2;

public class Employe {
	
	private int id;
	private String nom;
	private String prenom;
	private double salaire;
	
	public Employe(int id, String nom, String prenom, double salaire) {
		setId(id);
		setLastName(nom);
		setGivenName(prenom);
		setSalary(salaire);
	}

	public int getId() {
		return id;
	}
	
	public String getLastName() {
		return nom;
	}
	
	public String getGivenName() {
		return prenom;
	}
	
	public double getSalary() {
		return salaire;
	}


	protected void setId(int id)throws EmployeDataException {
		if(id<=0) {
			throw new EmployeDataException(1,id);
		}
		else {
			this.id=id;
		}
	}
	
	protected void setLastName(String nom)throws EmployeDataException {
		if(!isValidName(nom)) {
			throw new EmployeDataException(2,nom);
				
		}
		else {
			this.nom = nom;
		}
		
	}
	protected void setGivenName(String prenom) {
		if(!isValidName(prenom)) {
			throw new EmployeDataException(3,prenom);
		}
		else {
			this.prenom=prenom;
		}
		
		
	}
	public void setSalary(double salaire) {
		if (salaire<0) {
			throw new EmployeDataException(4,salaire);
		}
		else {
			this.salaire = salaire;
		}
			
		
	}
	

	private boolean isValidName(String n) {
		for (char c : n.toCharArray())
			if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c != ' ') && (c != '-'))
				return false;
		return true;
	}

	
	@Override
	public String toString() {
		return "Student [id = " + id + ", nom = " + nom + ", prénom = " + prenom + ", salaire = " + salaire+ "]"; 
	}
	
	

}
