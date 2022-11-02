/**
*	@Developer : Sagar_Pokale
*	@Date		 	   : 30-Oct-2022 8:34:25 PM
*/

package Validation;

import java.util.Scanner;

import User_Exception.Validate;

public class ValidateAccount {
	
	public static String getValidAcc(String accType, Scanner sc) {
		String accountType = accType;
		Enum s = null;
		try {
			s = Validate.valueOf(accountType);
		}catch(Exception e) {
			if(s != null)
				return accountType;
			else {
				System.out.println("Please enter valid Account Type (Saving/Current) ");
				String acc1 = sc.next();
				return acc1;
			}
		}
		return accountType;
		
	}

	public static Enum getValidAccE(String accountType, Scanner sc) {
		Enum s = Validate.valueOf(accountType);
		return s;
	}

}
