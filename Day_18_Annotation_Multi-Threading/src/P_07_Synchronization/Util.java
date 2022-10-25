/**
*	@Developer : Sagar_Pokale
*	@Date		 	   : 19-Oct-2022 6:07:02 PM
*/

package P_07_Synchronization;

public class Util {
	public static void delay(int milli) {
		try {
			Thread.sleep(milli);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}


class Account {
	private int id;
	private String type;
	private double balance;
	public Account() {
	}
	public Account(int id, String type, double balance) {
		this.id = id;
		this.type = type;
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public synchronized void deposit(double amount) {		// Deposit
		double newbal = balance + amount;
		balance = newbal;
	}
	public synchronized void withdraw(double amount) {// Withdraw
		double newbal = balance - amount;
		balance = newbal;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", type=" + type + ", balance=" + balance + "]";
	}
}
