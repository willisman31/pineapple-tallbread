
public class IllegalMoveException extends Exception{

	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	IllegalMoveException() {
		System.out.print("Illegal Move Exception");
	}
	
	/**
	 * 1-arg constructor; displays message under exception declaration.
	 * 
	 * @param message to be displayed with Illegal Move Exception.
	 */
	IllegalMoveException(String message) {
		this();
		System.out.println(": " + message);
	}
	
}
