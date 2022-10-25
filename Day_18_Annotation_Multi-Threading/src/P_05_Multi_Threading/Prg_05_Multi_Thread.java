/**
*	@Developer : Sagar_Pokale
*	@Date		 	   : 19-Oct-2022 4:42:36 PM
*/

package P_05_Multi_Threading;

public class Prg_05_Multi_Thread {

	public static void main(String[] args) {
		// Main thread -- created by JVM

		MyThread mt = new MyThread();
		mt.setName("First Thread"); // mt.setName("MyThread"); // default name was Thread-0
		mt.start(); // ask JVM to start execution of MyThread (mt) -- run()

		YourRunnable yr = new YourRunnable();
		Thread yt = new Thread(yr);
		yt.setName("Thread Second");
		yt.start(); // ask JVM to start execution of Thread (yt) -- run()
		// yt.setName("YourThread"); // default name was Thread-1
		Thread ct = Thread.currentThread();
		for (int i = 1; i <= 10; i++) {
			System.out.println("Main: " + i + ", Thread Id: " + ct.getId() + ", Name: " + ct.getName());
			Util.delay(1000);
		}
	}
}

class MyThread extends Thread {
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		for (int i = 1; i <= 10; i++) {
			System.out.println("MyThread: " + i + ", Thread Id: " + t.getId() + ", Name: " + t.getName());
			Util.delay(1000);
		}
	}
}

class YourRunnable implements Runnable {
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		for (int i = 1; i <= 10; i++) {
			System.out.println("MyThread: " + i + ", Thread Id: " + t.getId() + ", Name: " + t.getName());
			Util.delay(1000);
		}
	}
}