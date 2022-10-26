/**
*	@Developer : Sagar_Pokale
*	@Date		 	   : 26-Oct-2022 4:06:18 PM
*/

package DMC;
public class InvalidRatingException extends Exception {
	
	public InvalidRatingException() {
		System.out.println("Enter the Correct Value");
	}
	
	public InvalidRatingException(String msg) {
		super(msg);
	}

}
