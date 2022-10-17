package assignment.day04;

import java.util.Scanner;

public class Assignment_02 {

	public static int menu() {
		System.out.println("\n\n---------Welcome---------");
		System.out.println("1.     Idli         10");
		System.out.println("2     Dosa       20");
		System.out.println("3.    Poha       30");
		System.out.println("4.    Sambar   40");
		System.out.println("5.    Vada       50");
		System.out.println("0      EXIT");
		System.out.println("10.  Generate Bill ");
		System.out.println("Enter Your Choice ");
		return new Scanner(System.in).nextInt();
	}

	public static void main(String[] args) { 
		Food[] food = new Food[5];
		int choice;
		int index = 0;
		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1:
				food[index++] = new Food(1, "Idli", 10.00);
				System.out.println("Idli Added");
				break;
			case 2:
				food[index++] = new Food(2, "Dosa", 20.00);
				System.out.println("Dosa Added");
				break;
			case 3:
				food[index++] = new Food(3, "Poha", 30.00);
				System.out.println("Poha Added");
				break;
			case 4:
				food[index++] = new Food(4, "Sambar", 40.00);
				System.out.println("Sambar Added");
				break;
			case 5:
				food[index++] = new Food(5, "Vada", 50.00);
				System.out.println("Vada Added");
				break;
			case 10:
				double total = 0;
				for (Food f : food) {
					System.out.println("You have selected : " + f.getName()+" Prize : "+f.getPrize());
				}
				for (Food f : food) {
					total = total + f.getPrize();
				}
				System.out.println("\n Total Bill : " + total);
				break;
			default:
				System.out.println("Enter Correct Choice");
				break;
			}
		}
		System.out.println("\n Thank You ................Visit Again");
	}
}

class Food {
	int item;
	String name;
	double prize;

	public Food(int item, String name, double prize) {
		this.item = item;
		this.name = name;
		this.prize = prize;
	}

	public double getPrize() {
		return this.prize;
	}
	public String getName()
	{
		return this.name;
	}

	@Override
	public String toString() {
		return "Food [item=" + item + ", name=" + name + ", prize=" + prize + "]";
	}

}