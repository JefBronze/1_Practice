package pack1;

public class Employe {

	private int id;
	private String nom;
	private String prenom;
	private double salaire;

	public Employe(int id, String nom, String prenom, double salaire) {
		setId(id);
		setNom(nom);
		setPrenom(prenom);
		setSalaire(salaire);

	}

	public int getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public double getSalaire() {
		return salaire;
	}

	private boolean isValidName(String n) {
		for (char c : n.toCharArray())
			if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c != ' ') && (c != '-'))
				return false;
		return true;
	}

	protected void setId(int id) throws EmployeException {
		if (id <= 0) {
			throw new EmployeException(1, id);
		} else {
			this.id = id;
		}
	}

	protected void setNom(String nom) throws EmployeException {
		if (!isValidName(nom)) {
			throw new EmployeException(2, nom);
		} else {
			this.nom = nom;
		}
	}

	protected void setPrenom(String prenom) {
		if (!isValidName(prenom)) {
			throw new EmployeException(3, prenom);
		} else {
			this.prenom = prenom;
		}
	}

	public void setSalaire(double salaire) {
		if (salaire < 0) {
			throw new EmployeException(4, salaire);
		} else {
			this.salaire = salaire;
		}
	}

	@Override
	public String toString() {
		return "Etudiant [id = " + id + ", nom = " + nom + ", prenom = " + prenom + ", salaire = " + salaire + "]";
	}

}
