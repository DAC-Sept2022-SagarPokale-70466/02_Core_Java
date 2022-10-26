/**
*	@Developer : Sagar_Pokale
*	@Date		 	   : 26-Oct-2022 3:49:03 PM
*/

package DMC;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();
		Employee e = new Employee();

		int choice;
		do {
			choice = UtilEmployee.menu(sc);
			switch (choice) {
			case 0:
				System.out.println("Hope you recived all Details & you will provide full marks");
				break;
				
			case 1:
				e = UtilEmployee.addEmp(list, sc);
				list.add(e);
				System.out.println("List is here : ");
				list.forEach(i -> System.out.println(i));
				break;

			case 2:
				UtilEmployee.removeEmp(list, sc);
				break;
			case 3:
				UtilEmployee.modifyDept(list, sc);
				break;				
			
			case 4:
				UtilEmployee.searchByDept(list, sc);
				break;
			case 6 :
				list.forEach(i ->System.out.println(i));
				
				default :
					System.out.println("Enter Valid Choice  : ( ");
			}
		}while(choice != 0);
		
	}
}
