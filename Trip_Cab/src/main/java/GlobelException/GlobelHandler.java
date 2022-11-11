package GlobelException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class GlobelHandler {
	
	
	public ResponseEntity<String> otherException(Exception ex){
		
		return null;
		
	}
	

}
