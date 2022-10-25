/**
*	@Developer : Sagar_Pokale
*	@Date		 	   : 19-Oct-2022 4:07:41 PM
*/

package P_03_Singleton_Class;

public class Singleton {

	// step 1: desired fields and desired methods
	// step 2: private constructors
	private Singleton() {
	}

	// step 3: static field to hold the single object of the class
	private static Singleton obj;
	// step 4: create the object -- one time
	static {
		obj = new Singleton();
	}

	// step 5: getter method to access obj outside the class
	public static Singleton getInstance() {
		return obj;
	}
}
