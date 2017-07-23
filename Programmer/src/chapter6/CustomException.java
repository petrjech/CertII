package chapter6;

@SuppressWarnings("serial")
public class CustomException extends Exception {

	// typical constructors
	public CustomException() {
		super();
	}

	public CustomException(Exception e) {
		super(e);
	}

	public CustomException(String message) {
		super(message);
	}

	public static void main(String[] args) {

	}

}
