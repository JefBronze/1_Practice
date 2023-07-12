package pack1;

public class EmployeException extends RuntimeException {

	private int logic;
	private Object object;
	private String message;

	EmployeException(int logic, Object object) {
		this.logic = logic;
		this.object = object;
		if (logic == 1) {
			this.message = "Id non valide (id inféerieur ou égal à zéro): " + (int) object;
		} else if (logic == 2) {
			this.message = "Nom non valide: " + (String) object;
		} else if (logic == 3) {
			this.message = "Prenom non valide: " + (String) object;
		} else if (logic == 4) {
			this.message = "Salaire invalide (salaire infèrieur à zéero): " + (double) object;
		} else {
			this.message = "Erreur non spécifiée";
		}
	}

	public int getLogic() {
		return this.logic;
	}

	public Object getObject() {
		return this.object;
	}

	@Override
	public String getMessage() {
		return this.message;
	}

}
