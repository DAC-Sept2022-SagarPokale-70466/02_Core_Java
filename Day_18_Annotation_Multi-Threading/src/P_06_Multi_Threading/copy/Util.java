/**
*	@Developer : Sagar_Pokale
*	@Date		 	   : 19-Oct-2022 4:46:35 PM
*/

package P_06_Multi_Threading.copy;
public class Util {
	public static void delay(int milli) {
		try {
			Thread.sleep(milli);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
