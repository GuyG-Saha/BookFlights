package exceptions;

public class InsufficientCreditException extends RuntimeException {
	
	public InsufficientCreditException(String message) {
		super(message);
	}
}
