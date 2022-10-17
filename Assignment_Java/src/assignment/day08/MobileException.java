package assignment.day08;

public class MobileException extends Exception {

	public MobileException() {
		System.out.println("You have Entered Wrong Values");
	}

	public MobileException(String message) {
		super(message);
	}

}
