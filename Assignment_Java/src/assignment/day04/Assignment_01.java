package assignment.day04;

import java.util.Scanner;

public class Assignment_01 {

	public static void main(String[] args) {

		Cost cs = new Cost();
		cs.menu();
		cs.totalCost();
		System.out.println("Have a Great Day");

	}

}

class Cost
{
	Scanner sc =new Scanner(System.in);
	int km;
	int cost_liter;
	int avg;
	int parking;
	int tolls;
	int total_car;
	
	public void menu()
	{
		System.out.println("WELCOME");
		System.out.println("To Find the Saving per week Please Enter the Details");
		System.out.println();
		System.out.print("Total KM Per Day : ");
		km = sc.nextInt();
		System.out.print("Cost per Liter Petrol : ");
		cost_liter = sc.nextInt();
		System.out.print("Average Km per liter : ");
		avg = sc.nextInt();
		System.out.print("Parking fees per day : ");
		parking = sc.nextInt();
		System.out.print("Total Tolls Per day : ");
		tolls = sc.nextInt();
	}
	
	public void totalCost()
	{
		total_car = (cost_liter / avg) * km;
		
		total_car = total_car + parking + tolls;
		
		System.out.println("Per day price : "+total_car);
	}	
}
