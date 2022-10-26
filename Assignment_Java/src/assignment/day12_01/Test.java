package assignment.day12_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		ArrayList<Book> list = new ArrayList<Book>();
		Book b = null;
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("\n\n\n0.   EXIT");
			System.out.println(
					"1.   Add New Book : \n2.   Display All book in Forward Direction.\n3.   Display all book in Reverse Direction");
			System.out.println(
					"4.   Search a book with given isbn (hint - indexOf())\n5.   Delete a book at given index\n6.   Sort all books by price in desc order");
			System.out.println(
					"7.   Replace book at given index with a new book (input from user\n8.   Remove all books with price < 200. (hint - removeIf())");
			choice = sc.nextInt();
			switch (choice) {
			case 0:
				System.out.println("\n\nEXITED !!!!!!!!!!!");
				break;
			case 1: // Add New Book
				b = new Book("Sagar", 150, "Sagar",50);
//				addBook(b, sc);
				list.add(b);
				b = new Book("Sushama", 250, "Sushama",150);
				list.add(b);
				b = new Book("Anukesh", 50, "Anukesh",250);
				list.add(b);
				b = new Book("Akshay", 450, "Akshay",50);
				list.add(b);
				b = new Book("Saurabh", 100, "Saurabh",50);
				list.add(b);
				
				break;
			case 2: // Display All book in Forward Direction
				System.out.println("Print all Details in Forward Direction ");
				list.forEach(i -> System.out.println(i));
				break;
			case 3:
				System.out.println("Print all Details in Reverse Direction");
				ListIterator<Book> revList = list.listIterator(list.size()); // For traversing from last specify the size
				while (revList.hasPrevious()) {
					Book num = revList.previous();
					System.out.println(num);
				}
				break;
			case 4:
				System.out.println("Enter the Index That you want to search : ");
				String ss = sc.next();
				Book b1 = new Book(ss, 0.0, "", 0);
				int value = list.indexOf(b1);
				if (value != 1) {
					b1 = list.get(value);
					System.out.println("Found !!  Here : " + b1);
				} else
					System.out.println();
				break;

			case 5:
				System.out.println("Enter the index You want to delete");
				int index = sc.nextInt();
				Book result = list.remove(index);
				System.out.println("Success ");
				break;

			case 6:
				System.out.println("Sorting By Name Here it is : ");
				Comparable<Book> cmp;
				Collections.sort(list);
				System.out.println(list);
				break;
				
			case 7:
				System.out.println("Replace book at given index with a new book (input from user");
				int find = sc.nextInt();
				int replace = list.indexOf(find);
				if(replace != 1) {
					b1 = list.get(find);
					System.out.println(b1);
					System.out.println("Enter replcae name : ");
					String name = sc.next();
					b1.setName(name);
					System.out.println("enter New Prize : ");
					double prize =sc.nextDouble();
					b1.setPrize(prize);
					System.out.println(b1);
				}
				else {
					System.out.println("Error");
				}				
				break;
			case 8:
				System.out.println("Removing All elemetns with prize < 200 ");
				boolean flag = list.removeIf(num -> num.getPrize() < 200);
				break;
			}
		} while (choice != 0);
	}

	public static void addBook(Book b, Scanner sc) {
		System.out.println("Enter Book Name :");
		b.setName(sc.next());
		System.out.println("Enter Prize : ");
		b.setPrize(sc.nextDouble());
		System.out.println("Enter Author Name : ");
		b.setAuthorName(sc.next());
		System.out.println("Enter Qty : ");
		b.setQty(sc.nextInt());
	}
}