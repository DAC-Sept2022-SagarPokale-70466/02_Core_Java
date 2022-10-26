/**
*	@Developer : Sagar_Pokale
*	@Date		 	   : 26-Oct-2022 3:22:43 PM
*/

package vehicle;

import java.util.HashMap;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		int choice ;
		Vehicle v;
		HashMap<String, Vehicle> map = new HashMap<String, Vehicle>();
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Enter choice :\n0.Exit\n1.Add Car\n2.Sort by type\n3.Display list of Vehicle(Stream)\n4.Object stream\n5.Display car whose price less than 50000\n6.Delete car");
			choice=sc.nextInt();
			
			switch(choice) {
			case 0:
				System.out.println("Bye!!");
				break;
			case 1:
				v = add(sc);
				map.put(v.getModel(), v);
				break;
				
			case 2:
				map.values().stream()
													.sorted((s1 ,s2) -> s1.getType().compareTo(s2.getType()))
													.forEach(i -> System.out.println(i));
				break;
				
				default :
					System.out.println("Enter Valid Choice : ( ");
			}
		}while(choice != 0);
	}
	

	public static Vehicle add(Scanner sc) {
		Vehicle v;
		String company, model, color, type;
		double price;
		System.out.println("Enter Company");
		company = sc.nextLine();
		company = sc.nextLine();
		System.out.println("Enter model");
		model = sc.nextLine();
		System.out.println("Enter color");
		color = sc.nextLine();
		System.out.println("Enter type");
		type = sc.nextLine();
		System.out.println("Enter price");
		price = sc.nextDouble();
		v = new Vehicle(company, model, color, type, price);
		return v;
	}
}