package assignment.day07;

import java.util.Scanner;

public class FruitBasket {

	public static int choice() {
		System.out.println("\n\n0.	EXIT");
		System.out.println("1.  	Mango");
		System.out.println("2.   Orange");
		System.out.println("3.   Apple");
		System.out.println("4.   Display names of all fruits in basket");
		System.out.println("5.   Display all fruits details in basket");
		System.out.println("6.   Display tastes of all stale(not fresh) fruits in the basket.");
		System.out.println("7.   Mark a fruit as stale");
		System.out.println("8.   Mark all sour fruits stale");
		System.out.println("9.   Generate Bill ");
		return new Scanner(System.in).nextInt();
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size for the basket");
		int counter = sc.nextInt();
		int choice;
		Fruit[] basket = new Fruit[counter];
		counter = 0;
		while (((choice = choice()) != 0)) {

			switch (choice) {
			case 1:
				if (counter < basket.length)
					basket[counter++] = new Mango("Mango", "Light Orange", 5, true);
				System.out.println("Mango Added");
				break;

			case 2:
				if (counter < basket.length)
					basket[counter++] = new Orange("Orange", "Orange", 5, true);
				System.out.println("Orange Added");
				break;

			case 3:
				if (counter < basket.length)
					basket[counter++] = new Apple("Apple", "Red", 5, false);
				System.out.println("Apple Added");
				break;

			case 4:
				System.out.println("Name of Fruit in our Basket : ");
				for (Fruit f : basket)
					if (f != null)
						System.out.println(f.getName());
					else
						System.out.println("Basket is still empty");
				break;
			case 5:
				System.out.println("All Fruit Details : ");
//				for (int i = 0; i < basket.length; i++) {
//					if (basket[i] != null)
//						System.out.println(basket[i]);
//					System.out.println(basket[i].taste());
//					if (basket[i].isFresh() == true)
//						System.out.println("-----> Fresh");
//					else
//						System.out.println("_____Not Fresh");
//				}
				for(Fruit f : basket)
				{
					System.out.println(f.getName());
					
				}
				break;
			case 6:
//				for(Fruit f : basket)
//				{
//					if(f.isFresh != true)
//					{
//						System.out.println(f.taste());
//					}
//				}
				for (int i = 0; i < basket.length; i++) {
					if (basket[i].isFresh == false)
						System.out.println(basket[i].name + " Fresh " + basket[i].isFresh);
				}
				break;
			case 7:
				System.out.println("Enter the index which is you want to stale : ");
				Scanner index = new Scanner(System.in);
				int ind = index.nextInt() - 1;
				basket[ind].setStale();
				System.out.println("Marked stale");
				break;

			case 8:
				for(Fruit f : basket)
				{
					f.setStale();
				}
				System.out.println("Marked all the Fruit in basket as stale");
				break;
			case 9 :
				int mango = 50;
				int apple = 100;
				int orange = 200;
				int total = 0;
				for(Fruit f : basket)
				{
					if(f.getName().equalsIgnoreCase("mango"))
						total = total + mango;
					if(f.getName().equalsIgnoreCase("apple"))
						total = total + apple;
					if(f.getName().equalsIgnoreCase("orange"))
						total = total + orange;
				}
				System.out.println("Total is : "+total);
				break;
			default:
				System.out.println("Wrong Choice : ( ");
				break;
			}
		}
		sc.close();
	}
}