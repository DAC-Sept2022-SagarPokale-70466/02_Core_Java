package assignment.day08;

import java.util.Scanner;

public class Test {

	public static int menu() {
		System.out.println("\n\nHiiii There...............");
		System.out.println("Want to add Stock.");
		System.out.println("1. Mobile");
		System.out.println("2. TV.");
		System.out.println("3. Washing Machine");
		System.out.println("4.Display all the products");
		System.out.println("5. Purchase Products in list");
		System.out.println("0. EXIT");
		return new Scanner(System.in).nextInt();
	}

	public static void main(String[] args) {
		Electronics[] electronic = new Electronics[10];
		ElectronicStock[] eStock = new ElectronicStock[3];
		int choice;
		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1:
				try {
					electronic[0] = new Mobile(4, 32);
					electronic[0].accept("RedMi", "Note 5 Pro", 12000);
					electronic[0].checkDetails();
					eStock[0] = new ElectronicStock(electronic[0], 1);
					System.out.println("Enter Mobile Qty : ");
					eStock[0].addStock(new Scanner(System.in).nextInt());
					System.out.println("Added Mobile");
				} catch (MobileException e) {
					System.out.println("Mobile Details Fault");
				}
				break;
			case 2:
				try {
					electronic[1] = new Tv(10, 1080);
					electronic[1].acceptData("Samsung", "Smart TV", 50000);
					electronic[1].checkDetails1();
				} catch (TvException e) {
					System.out.println("Tv Details Fault");
				}
				eStock[1] = new ElectronicStock(electronic[1], 1);
				System.out.println("Enter TV Qty : ");
				eStock[1].addStock(new Scanner(System.in).nextInt());
				System.out.println("Added TV");
				break;
			case 3:
				electronic[2] = new WashingMachine(5, "Fully");
				electronic[2].accept("Howels", "Fullly Automatic", 20000);
				eStock[2] = new ElectronicStock(electronic[2], 1);
				System.out.println("Enter Washing machine Qty : ");
				eStock[2].addStock(new Scanner(System.in).nextInt());
				System.out.println("Added Washing Machine");
				break;
			case 4:
//				for (ElectronicStock e : eStock) {
//					e.displayStock();
//					break;
//				}
				for (int i = 0; i < eStock.length; i++) {
					eStock[i].displayStock();

				}
				break;
			case 5:
				for (ElectronicStock e : eStock) {
					e.purchaseProduct();
				}
				break;
			default:
				System.out.println("Wrong Choice : ( ");
				break;
			}
		}
		System.out.println("Visit Again ");
	}
}