/**
*	@Developer : Sagar_Pokale
*	@Date		 	   : 19-Oct-2022 4:42:36 PM
*/

package P_06_Multi_Threading.copy;

import java.util.Scanner;

public class Prg_06_Multi_Thread {

	public static void threadFunc1() {
		for (int i = 1; i <= 6; i++) {
			System.out.println("Thread1: " + i);
			Util.delay(1000);
		}
	}

	public static void threadFunc2() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Thread2: " + i);
			Util.delay(1000);
		}
	}

	public static void main(String[] args) {

		// Daemon threads
		// main thread is always non-daemon thread

//		Thread t1 = new Thread(() -> threadFunc1());
//		t1.start(); // t1 is non-daemon thread
//		
//		Thread t2 = new Thread(() -> threadFunc2());
//		t2.setDaemon(true);
//		t2.start(); // t2 is non-daemon thread
//		
//		for (int i = 1; i <= 3; i++) {
//			System.out.println("Main: " + i);
//			Util.delay(1000);
//		}
//		System.out.println("Done");
//		
//====================================================
		// Thread joining

//		Thread t1 = new Thread(() -> threadFunc1());
//		t1.start();
//
//		for (int i = 1; i <= 3; i++) {
//			System.out.println("Main: " + i);
//			Util.delay(1000);
//		}
//		// calling thread i.e. thread calling join() method -- main thread
//		// wait for completion of given thread -- t1 thread
//		
//		try {
//			t1.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println("Done");
//		

//=======================================================		
		// Thread priorities
		// JVM maps Java thread priority levels to OS thread priority levels.

//		Thread t1 = new Thread(() -> threadFunc1());
//		t1.setPriority(Thread.MIN_PRIORITY); // Thread.MIN_PRIORITY=1
//		t1.start();
//		Thread t2 = new Thread(() -> threadFunc2());
//		t2.setPriority(Thread.MAX_PRIORITY); // Thread.MAX_PRIORITY=10 
//		t2.start();
//		Thread ct = Thread.currentThread();
//		System.out.println("Main Thread Priority : " + ct.getPriority()); // Thread.NORM_PRIORITY=5
//		

//=========================================================

		// Thread state and stop

//		Thread t1 = new Thread(() -> threadFunc1());
//		System.out.println("Before Thread Staring = t1.state = " + t1.getState());
//
//		t1.start();
//		System.out.println("After Thread Staring = t1.state = " + t1.getState());
//
//		Thread ct = Thread.currentThread();
//		System.out.println("Just After Declaring the Main Thread = " + ct.getState());
//		for (int i = 1; i <= 3; i++) {
//			System.out.println("Main: " + i + " | State: " + ct.getState());
//			System.out.println("t1.state: " + t1.getState());
//			Util.delay(1000);
//		}
//		t1.stop(); // forcibly stop/terminate a thread
//		Util.delay(1000);
//		System.out.println("(After Stop) t1.state: " + t1.getState());

//=====================================================?

		// Interrupt

		Scanner sc = new Scanner(System.in);
		Thread t3 = new Thread(() -> threadFunc3());
		t3.start();
		System.out.println("Main: Press enter to terminate/interrupt the thread ...");
		sc.nextLine(); // Just the enter something
		t3.interrupt(); // raise exception in t3 thread
		sc.close();
		System.out.println("Done");

	}

	public static void threadFunc3() {
		Thread ct = Thread.currentThread();
		int i = 1;
		try {
			while (true) {
				System.out.println("Thread3 : " + i);
				i++;
				Thread.sleep(100);
			}
		} catch (Exception e) {
			System.out.println("Thread3 Is Interrupted: " + ct.isInterrupted());
			System.out.println("Exception in Thread3: " + e.getMessage());
		}
		System.out.println("Thread3: Bye!");
	}
}
