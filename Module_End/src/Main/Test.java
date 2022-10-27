/**
*	@Developer : 220944220183
*	@Date		 	   : 27-Oct-2022 11:06:10 AM
*/

package Main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import DB.VendorDao;
import Methods.Vendor;

public class Test {

	public static void main(String[] args) throws SQLException, Exception {
		Scanner sc = new Scanner(System.in);
		try (VendorDao dao = new VendorDao()) {
			List<Vendor> list2 = new ArrayList<Vendor>();
			int choice, count;
			do {
				System.out.println("1. Add vendor\r\n" + "2. Display vendor \r\n" + "3. Display All vendors\r\n"
						+ "4. Remove an vendor \r\n" + "5. search vendor using name\r\n"
						+ "6. search vendor using email\r\n" + "7. sort vendors by city\r\n"
						+ "8. list out the vendors belongs to same city\r\n" + "9. search vendor using reg date\r\n"
						+ "10. exit.");
				choice = sc.nextInt();

				switch (choice) {
				case 1: // 1. Add vendor
					Vendor vendor = new Vendor();
					vendor = vendor.add();
					count = dao.add(vendor);
					list2.add(vendor);
					System.out.println(count + " Rows Affected ");
					break;

				case 2: // Display vendor
					list2 = dao.findById();
					list2.forEach(i -> System.out.println(i));
					break;
					
				case 3:
					list2 = dao.findAll();
					list2.forEach(i -> System.out.println(i));
					break;
					
				case 4: // 4. Remove an vendor
					System.out.println("Deleting From dept : ");
					count = dao.delete();
					System.out.println(count +" Rows Affected : ");

					break;

				case 5:// 5. search vendor using name
					System.out.println("Find Department By Name : ");
					list2 = dao.findByName();
					list2.forEach(i ->System.out.println(i));
					break;

				case 6:// 6. search vendor using email
					System.out.println("Find Department By Email: ");
					list2 = dao.findByEmail();
					list2.forEach(i ->System.out.println(i));
					break;

				case 7: // sort vendors by city
					list2.sort((s1, s2) -> s1.getCity().compareTo(s2.getCity()));
					list2.forEach(i -> System.out.println(i));
					break;
					
				case 9 :
					
					
				default:
					System.out.println("Enter Valid Choice : ( ");
					break;

				}

			} while (choice != 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}