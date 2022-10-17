package assignment.day10_01;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class New_Test {

	public static void main(String[] args) {

//		HashSet<Book> hset = new HashSet<Book>();
		LinkedHashSet<Book> hset = new LinkedHashSet<Book>();
		
		
		
//		TreeSet<Book> hset = new TreeSet<Book>( new Comparator <Book> ) {
//			@Override
//			public int compareTo (Book b1, Book b2) {
//				return Double.compare(b1.getPrize(), b2.getPrize());
//			}
//		};
		
		hset.add(new Book("Sagar", 45.55, "Pokale", 3));
		hset.add(new Book("Sush", 55.55, "Pokale", 7));
		hset.add(new Book("Saurbh", 75.55, "Sapte", 3));
		hset.add(new Book("Shubham", 85.55, "Rahatal", 7));
		hset.add(new Book("Sagar", 45.55, "Pokale", 5));
	
		hset.forEach(i -> System.out.println(i));
		
		
	}

}
