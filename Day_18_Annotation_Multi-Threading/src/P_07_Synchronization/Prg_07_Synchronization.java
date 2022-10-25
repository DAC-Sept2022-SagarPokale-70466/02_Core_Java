/**
*	@Developer : Sagar_Pokale
*	@Date		 	   : 19-Oct-2022 6:06:22 PM
*/

package P_07_Synchronization;

/*
 * 
 * Demo 1 -- Race condition -- Without synchronized methods in Account class.
 * Demo 2 -- Synchronization -- With synchronized methods deposit() & withdraw() in Account class.
 * 
 * */

public class Prg_07_Synchronization {

	public static void main(String[] args) {

		Account acc = new Account(101, "Saving", 50000);
		double amount = 1000;

		Thread dt = new Thread(() -> {
			for (int i = 0; i <= 10; i++) {
				acc.deposit(amount);
				System.out.println("After Deposit: " + acc.getBalance());
				Util.delay(100);
			}
		});
		dt.start();
		
		Thread wt = new Thread( () ->{
			for(int i = 0; i <= 10; i++) {
				acc.withdraw(amount);
				System.out.println("After Withdraw "+acc.getBalance());
				Util.delay(100);
			}
		});
		wt.start();
		
		try {
			dt.join();
			wt.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("\nFinal Balance : "+acc.getBalance());
	}
}
