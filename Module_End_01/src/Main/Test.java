/**
*	@Developer : Sagar_Pokale
*	@Date		 	   : 30-Oct-2022 7:54:58 PM
*/

package Main;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Scanner;

import javax.security.auth.login.AccountNotFoundException;

import Account.Account;
import DB.AccountDao;
import User_Exception.invalidAccountException;

public class Test {

	public static void main(String[] args) throws invalidAccountException, AccountNotFoundException {
		int choice, count;
		Scanner sc = new Scanner(System.in);
		HashMap<String, Account> map = new HashMap<>();
		Account ac  = null;
			try(AccountDao dao = new AccountDao()){
				do {
					choice = menu(sc);
					switch (choice ) {
					case 1:
//						ac = new Account();
						dao.addAcc(map,sc);
//						map.put(ac.getAccountNumber(), ac);
						break;

					case 2:
						System.out.print("Enter Account Number to Display Account : ");
						String acno=sc.next();
						dao.disAccId(acno,sc);
						break;

						
					case 11:
						dao.createTable();
						System.out.println("Table Create ");
						break;
					}
			
					
					
				}while(choice != 0);
						
			
				System.out.println("Success");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static int menu(Scanner sc) {
		System.out.print( "\n0. exit\n"
				+ "1. Add Account\n"
				+ "2. Display an Account by Account Number\n"
				+ "3. Display All Accounts\n"
				+ "4. Remove an Account by Account Number\n"
				+ "5. Withdraw[Withdraw amount should be greater than 0]\n"
				+ "6. Deposit[Deposit amount should be greater than 0]\n"
				+ "7. search Account using AccountName\n"
				+ "8. search Account using Email\n"
				+ "9. sort Account details in descending order [Account Number]\n"
				+ "11. Create Table EBank\n"
				+ "12. Drop Table EBank\n"
				+ "Enter Choice : ");
		return sc.nextInt();
	}
}
