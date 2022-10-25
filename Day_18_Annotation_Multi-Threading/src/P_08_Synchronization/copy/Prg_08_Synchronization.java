/**
*	@Developer : Sagar_Pokale
*	@Date		 	   : 19-Oct-2022 6:06:22 PM
*/

package P_08_Synchronization.copy;

public class Prg_08_Synchronization {

	public static void main(String[] args) {
		Thread st = new Thread(() -> sunbeam());
		Thread it = new Thread(() -> infotech());
		st.start();
		it.start();
	}

	static Object lock = new Object();

	public static void sunbeam() {
		synchronized (lock) {
			String str = "SUNBEAM\n";
			while (true) {
				for (int i = 0; i < str.length(); i++) {
					System.out.print(str.charAt(i));
					Util.delay(100);
				}
				try {
					lock.wait();
					lock.notify();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void infotech() {
		synchronized (lock) {
			String str = "InfoTech\n";
			while (true) {
				for (int i = 0; i < str.length(); i++) {
					System.out.print(str.charAt(i));
					Util.delay(100);
				}
				try {
					lock.notify();
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
