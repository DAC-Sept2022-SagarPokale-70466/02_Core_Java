package assignment.day03;

import java.util.Scanner;

public class Assignment_03 {

	public static void main(String[] args) {
		// Food Menu
		int choice;
		int total = 0;
		int qty;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("WELCOME");
			System.out.println("1. Dosa 100$");
			System.out.println("2. Idali 200$");
			System.out.println("3. Poha	50$");
			System.out.println("4. Samosa	50$");
			System.out.println("5. Plane Rise	100$");

			System.out.println("0. Generate Bill.............");
			System.out.println("Enter Your Choice :");
			//sc.nextLine();
			choice  = sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter QTY : ");
			qty = sc.nextInt();
			System.out.println("You Ordered Dosa");
			total = total + (100 * qty);
			break;
		case 2 :
			System.out.println("Enter QTY : ");
			qty = sc.nextInt();
			System.out.println("You Ordered Idali");
			total = total + ( 200 * qty );
			break;
		case 3:
			System.out.println("Enter QTY : ");
			qty = sc.nextInt();
			System.out.println("You Ordered Poha");
			total = total + (50 * qty);
			break;
		case 4:
			System.out.println("Enter QTY : ");
			qty = sc.nextInt();
			System.out.println("You Ordered Samosa");
			total = total + (50 * qty);
			break;
		case 5:
			System.out.println("Enter QTY : ");
			qty = sc.nextInt();
			System.out.println("You Ordered Plane rise");
			total = total + (100 * qty);
			break;
		case 0:
			break;
		default :
			System.out.println("Wrong Order");
		}
		
		}while (choice != 0); 	
		
		System.out.println("Your Total Bill is : "+total);
		
	}
}
