package assignment.day08;

public class TvException extends RuntimeException {

	public TvException() {
		System.out.println("You have Enter wrong Values");
	}

	public TvException(String message) {
		super(message);
	}

}
