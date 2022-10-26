/**
*	@Developer : Sagar_Pokale
*	@Date		 	   : 26-Oct-2022 4:53:04 PM
*/

package DMC;
public class UnderratedException extends Exception {
	
	public UnderratedException() {
		System.out.println("Give Some Positive Rating");
	}
	
	

}

class OverratedException extends Exception{
	public OverratedException() {
		System.out.println("Max Rating is 5 : ");
	}
}
