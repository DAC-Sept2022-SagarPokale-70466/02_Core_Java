/**
*	@Developer : Sagar_Pokale
*	@Date		 	   : 12-Feb-2023 2:36:09 PM
*/

package P_05_Multi_Threading;
public class Test implements Runnable{
	
	public static void main(String[] args) {

		Thread t = new Thread(new Test());
//		t.start();
		System.out.println(t.getState()); 
		t.start();
		t.start();
		System.out.println(t.getState());
	}

	@Override
	public void run() {
		System.out.println("Welcome");
	}

}
