/**
*	@Developer : Sagar_Pokale
*	@Date		 	   : 26-Oct-2022 4:44:25 PM
*/

package DMC;

import java.util.Scanner;

public class utilValidation {

	public static Gender validGender(String gender) {
		Gender g = null;

		try {
			g = Gender.valueOf(gender);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return g;
	}

	public static void validRating(int rating, Scanner sc) {
		boolean flag = true;
		while (flag == true) {
			try {
				System.out.println("Please enter rating between 0 to 5 :");
				if (rating < 0) {
					throw new UnderratedException();
				} else if (rating > 5) {
					throw new OverratedException();
				} else {
					Employee.setRating(rating);
					flag = false;
				}
			} catch (UnderratedException e) {
				e.printStackTrace();
			} catch (OverratedException e) {
				e.printStackTrace();
			}
		}
	}
}
