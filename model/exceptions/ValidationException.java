package model.exceptions;

import java.util.HashMap;
import java.util.Map;


public class ValidationException extends RuntimeException{
	
	private static final long serialVersionUID=1L;
	
	private Map<String,String> errors = new HashMap<>();
	
	public ValidationException(String msg) {
		super(msg);
		///Alerts.showAlert("Validation Error",null , msg, AlertType.ERROR);
	}
	
	public Map<String,String> getErrors(){
		return errors;
	}
	public void addError(String fieldname, String errorMessage) {
		errors.put(fieldname, errorMessage);
	}
	
}
