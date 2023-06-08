package exception;

public class InsufficientBalanceException extends Exception {
	private String message;
	   public InsufficientBalanceException(String msg) {
		   this.message=msg;
	   }
	   public String getMessage() {
		   return message;
	   }

}
