package cat.dbuenov.app.errors;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class ManipuladorErrors {
	
	@ExceptionHandler(EmpleatNotFoundException.class)
	public ResponseEntity<RespostaExcepcio> manipuladorEmpleatNoTrobat(EmpleatNotFoundException ex, WebRequest peticio) {
		RespostaExcepcio resposta = new RespostaExcepcio(new Date(), ex.getMessage(), peticio.getDescription(false), HttpStatus.NOT_FOUND.getReasonPhrase());
		return new ResponseEntity<RespostaExcepcio> (resposta, HttpStatus.NOT_FOUND);
	}
	
	
	@ExceptionHandler(FeinaNotFoundException.class)
	public ResponseEntity<RespostaExcepcio>  manipuladorFeinaNoTrobada(FeinaNotFoundException ex, WebRequest peticio) {
		RespostaExcepcio resposta = new RespostaExcepcio(new Date(), ex.getMessage(), peticio.getDescription(false), HttpStatus.NOT_FOUND.getReasonPhrase());
		return new ResponseEntity<RespostaExcepcio> (resposta, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(FotoNotFoundException.class)
	public ResponseEntity<RespostaExcepcio>  manipuladorFotoNoTrobada(FotoNotFoundException ex, WebRequest peticio) {
		RespostaExcepcio resposta = new RespostaExcepcio(new Date(), ex.getMessage(), peticio.getDescription(false), HttpStatus.NOT_FOUND.getReasonPhrase());
		return new ResponseEntity<RespostaExcepcio> (resposta, HttpStatus.NOT_FOUND);
	}
	

}

