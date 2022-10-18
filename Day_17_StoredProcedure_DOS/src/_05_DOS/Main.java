/**
*	@Author : Sagar_Pokale
*	@Date		 : 18-Oct-2022 6:23:56 PM
*/

package _05_DOS;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (DeptDao dao = new DeptDao()) {
			int choice;
			Scanner sc = new Scanner(System.in);
			do {
				System.out.println("\n\n0. EXIT\n1. Add Dept\n2. Display All\n3. Find Department by ID\n4. Update Dept From Deptno\n5. Delete From Dept\nEnter Choice : ");
				choice = sc.nextInt();
				switch (choice) {
				case 1: // Add Dept // input deptno,dname & loc from user (Scanner)
					Dept d = new Dept(60, "TIMEPASS", "KRISHNA");
					int cnt = dao.save(d);
					System.out.println("Rows Inserted: " + cnt);
					break;

				case 2: // Display All
					List<Dept> list = dao.findAll();
					list.forEach(i -> System.out.println(i));
					break;

				case 3:		// Find by Id
					System.out.println("Find Department By ID : ");
					d = dao.findById();
					System.out.println(d);
					break;
						
				case 4:		// Update Dept 
					System.out.println("For Update Put new Values");
					int count = dao.updateDept();
					System.out.println(count+" Rows Affected : ");
					break;
					
				case 5:
					System.out.println("Deleting From dept : ");
					count = dao.deleteDept();
					System.out.println(count +" Rows Affected : ");
				}
			} while (choice != 0);
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
