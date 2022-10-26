/**
*	@Developer : Sagar_Pokale
*	@Date		 	   : 26-Oct-2022 4:30:31 PM
*/

package DMC;

import java.util.List;
import java.util.Scanner;

public class UtilEmployee {

	public static int menu(Scanner sc) {
		System.out.println("1. Add Employee\n" 
				+ "2. Remove Employee\n" 
				+ "3. Modify Employee's dept\n"
				+ "4. Search Employee by dept\n" 
				+ "5. Sort Employee by salary\n"
				+ "6. Display All Employees\n"
				+ "0.Exit");
		return sc.nextInt();
	}
	
	public static Employee addEmp(List<Employee> list, Scanner sc) {
//		System.out.println("Enter Employee id :");
//		int id = sc.nextInt();
//		System.out.println("Enter Employee Name :");
//		String name = sc.next();
		System.out.println("Enter Gender :");
		String gen = "male";
//		System.out.println("Enter Age :");
//		int age = sc.nextInt();
//		System.out.println("Enter Email :");
//		String email = sc.next();
//		System.out.println("Enter sal :");
//		double sal = sc.nextDouble();
//		System.out.println("Enter dept :");
//		String dept = sc.next();

		Gender validate = utilValidation.validGender(gen);
		Employee emp = new Employee(101, "Sagar", validate, 23, "abc@gmail.com", 999, "Software");
		list.add(emp);
		emp = new Employee(102, "sushama", validate, 23, "abc@gmail.com", 999, "Software");
		System.out.println("Enter Rating : ");
		int rating = sc.nextInt();
		utilValidation.validRating(rating, sc);
		System.out.println("Suceess");
		
		return emp;
	}
	
	public static void removeEmp(List<Employee> list, Scanner sc) {
		System.out.println("Enter the Empno you want to delete : ");
		int find = sc.nextInt();
		Employee rmemp = new Employee(find);
		
		System.out.println("Index is = "+list.remove(list.indexOf(rmemp)));
	}
	
	public static void modifyDept(List<Employee> list, Scanner sc) {
		System.out.print("Enter Emp ID to Modified Dept : ");
		int empid = sc.nextInt();
		Employee e = list.get(list.indexOf(new Employee(empid)));
		System.out.println("Enter new name : ");
		e.setName(sc.next());
		System.out.println("Ok");
		
	}
	
	public static void searchByDept(List<Employee> list, Scanner sc) {
		System.out.println("Enter dept");
		String dept = sc.next();
		Employee e = list.get(list.indexOf(new Employee(dept)));
		System.out.println("Here \n "+e);
		
	}
		
	
}
