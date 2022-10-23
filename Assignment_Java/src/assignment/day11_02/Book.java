package assignment.day11_02;

import java.util.Objects;

public class Book implements Comparable<Book> {
	String name;
	double prize;
	String authorName;
	int qty;

	public Book() {
	};

	public Book(String name, double prize, String authorName, int qty) {
		this.name = name;
		this.prize = prize;
		this.authorName = authorName;
		this.qty = qty;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrize() {
		return prize;
	}

	public void setPrize(double prize) {
		this.prize = prize;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", prize=" + prize + ", authorName=" + authorName + ", qty=" + qty + "]";
	}

	
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Book b = (Book) obj;
		return Objects.equals(name, b.name);
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Book other = (Book) obj;
//		return Objects.equals(authorName, other.authorName) && Objects.equals(name, other.name)
//				&& Double.doubleToLongBits(prize) == Double.doubleToLongBits(other.prize) && qty == other.qty;
//	}

	@Override
	public int compareTo(Book other) {
		return (this.name.compareTo(other.name));
//		return Math.abs(prize - other.prize);
	}
}


















//ArrayList<Book> list = new ArrayList<Book>();
//Book b = null;
//int choice = 0;
//Scanner sc = new Scanner(System.in);
//do {
//	System.out.println("\n\n\n0.   EXIT");
//	System.out.println(
//			"1.   Add New Book : \n2.   Display All book in Forward Direction.\n3.   Display all book in Reverse Direction");
//	System.out.println(
//			"4.   Search a book with given isbn (hint - indexOf())\n5.   Delete a book at given index\n6.   Sort all books by price in desc order");
//	System.out.println(
//			"7.   Replace book at given index with a new book (input from user\n8.   Remove all books with price < 200. (hint - removeIf())");
//	choice = sc.nextInt();
//	switch (choice) {
//	case 0:
//		System.out.println("\n\nEXITED !!!!!!!!!!!");
//		break;
//	case 1: // Add New Book
//		b = new Book();
//		addBook(b, sc);
//		list.add(b);
//		break;
//	case 2: // Display All book in Forward Direction
//		System.out.println("Print all Details in Forward Direction ");
//		for (int i = 0; i < list.size(); i++)
//			b = list.get(i);
//		System.out.println(b);
//		break;
//	case 3:
//		System.out.println("Print all Details in Reverse Direction");
//		ListIterator<Book> revList = list.listIterator(list.size()); // For traversing from last specify the
//																		// size
//		while (revList.hasPrevious()) {
//			Book num = revList.previous();
//			System.out.println(num);
//		}
//		break;
//	case 4:
//		System.out.println("Enter the Index That you want to search : ");
//		String ss = sc.next();
//		Book b1 = new Book(ss, 0.0, "", 0);
//		int value = list.indexOf(b1);
//		if (value != 1) {
//			b1 = list.get(value);
//			System.out.println("Found !!  Here : " + b1);
//		} else
//			System.out.println();
//		break;
//
//	case 5:
//		System.out.println("Enter the index You want to delete");
//		int index = sc.nextInt();
//		Book result = list.remove(index);
//		System.out.println("Success ");
//
//	case 6:
//		System.out.println("Sorting By Name Here it is : ");
//		Comparable<Book> cmp;
//		Collections.sort(list);
//		System.out.println(list);
//	case 8:
//		System.out.println("Removing All elemetns with prize < 200 ");
////		list.removeIf(num -> num >
////		200);
//	}
//} while (choice != 0);
//
//
//
//
//
//
//public static void addBook(Book b, Scanner sc) {
//	System.out.println("Enter Book Name :");
//	b.setName(sc.next());
//	System.out.println("Enter Prize : ");
//	b.setPrize(sc.nextDouble());
//	System.out.println("Enter Author Name : ");
//	b.setAuthorName(sc.next());
//	System.out.println("Enter Qty : ");
//	b.setQty(sc.nextInt());
//}
