package cat.dbuenov.app.errors;

public class FeinaNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public FeinaNotFoundException(String feina) {
		super("No he trobat la feina: "+feina);
	}

}
