/**
*	@Developer : Sagar_Pokale
*	@Date		 	   : 30-Oct-2022 9:08:11 PM
*/

package User_Exception;
public class invalidAccountException extends Exception {

	public invalidAccountException(){
		System.out.println("Invalid Account Type");
	}
}

class AccountNotFoundException extends Exception{
	
}
