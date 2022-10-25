/**
*	@Developer : Sagar_Pokale
*	@Date		 	   : 19-Oct-2022 4:04:44 PM
*/

package P_03_Singleton_Class;

public class Prg_03 {

	public static void main(String[] args) {

		// Singleton obj = new Singleton(); // The constructor Singleton() is not
		// visible
		// step 5: access Singleton instance as and when required
//		Singleton obj = new Singleton();		// Constructor is not Visible
		Singleton obj = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();

		System.out.println("Both Objects of Singleton are Same : " + (obj == obj2));

//		================================================
		
		// in Java, Runtime class is a singleton class -- it represents current runtime
		// env.
		Runtime rt = Runtime.getRuntime();
		System.out.println(rt);
		System.out.println(rt.availableProcessors());
		System.out.println("Total Memory MB = " + rt.totalMemory() / 1024 /1024);
		System.out.println("Total Free Memory MB = " + rt.freeMemory() / 1024 /1024);
		System.out.println("Max Memory MB = " + rt.maxMemory() / 1024 /1024);
	}
}
