/**
*	@Developer : Sagar_Pokale
*	@Date		 	   : 19-Oct-2022 6:07:02 PM
*/

package P_08_Synchronization.copy;

public class Util {
	public static void delay(int milli) {
		try {
			Thread.sleep(milli);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}