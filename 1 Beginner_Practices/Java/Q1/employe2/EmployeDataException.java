package employe2;

public class EmployeDataException extends RuntimeException {

	private int code;
	private Object obj;
	private String msg;
	
	EmployeDataException(int code, Object obj){
		this.code = code;
		this.obj=obj;
		if(code==1) {
			this.msg = "Id invalide: " + (int)obj;
		}
		else if (code==2) {
			this.msg = "Nom invalide: " + (String)obj;
		}
		else if (code==3) {
			this.msg = "Prenom invalide: " + (String)obj;
		}
		else if (code==4) {
			this.msg = "Salaire invalide: " + (String)obj;
		}
		else {
			this.msg = "Error Inconnu";
		}
		
		
	}
	
	public int getCode() {
		return this.code;
	}
	public Object getObj() {
		return this.obj;
	}
	
	@Override
	public String getMessage() {
		return this.msg;
	}
	
}
