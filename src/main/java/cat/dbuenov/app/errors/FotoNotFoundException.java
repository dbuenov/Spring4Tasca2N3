package cat.dbuenov.app.errors;

public class FotoNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public FotoNotFoundException(int id) {
		super(" L'empleat "+id+" no te foto");
	}

}
