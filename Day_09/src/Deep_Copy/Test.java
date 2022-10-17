package Deep_Copy;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Our System");
		System.out.println("You have enter below Details");
		System.out.println("Enter Name");
		String name = sc.nextLine();
		System.out.println("Enter DOB");
		int day = sc.nextInt();
		int month = sc.nextInt();
		int year = sc.nextInt();

		Person p1 = new Person(name, day, month, year);
		System.out.println(p1);

		Person p2 = null;
		System.out.println("\n To Crete a new Copy  Enter 1");
		int enter = sc.nextInt();
		if (enter == 1) {
			try {
				p2 = (Person) p1.clone();
			} catch (CloneNotSupportedException e) {

				e.printStackTrace();

			}
		}
		System.out.println(p1);
		System.out.println();
		System.out.println("Success");
		System.out.println("To change Name Enter NewOne : ");
		sc.nextLine();
		name = sc.nextLine();
		p2.chageName(name);
		p2.changeDate();

		System.out.println(p1);
		System.out.println(p2);
		sc.close();
	}

}
