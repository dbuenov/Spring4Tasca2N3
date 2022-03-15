package cat.dbuenov.app.errors;

public class EmpleatNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	public EmpleatNotFoundException(int id) {
		super(" No he trobat l'empleat: "+id);
	}

}
