import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.function.Predicate;

public class Lambda_Expression {

	public static void predicate(int num, Predicate<Integer> predi) {
		if (predi.test(num)) {
			System.out.println("Num : " + num);

		}
	}

	public static void main(String[] args) {
//		predicate(10, i -> i < 15);
		
//		Collection<String> c = new ArrayList<>();
//		Collection<String> c = new LinkedList<>();
//		Collection<String> c = new HashSet<>();
//		Collection<String> c = new Stack<>();
		Collection<String> c = new PriorityQueue<>();
//		Collection<String> c = new <>();
//		Collection<String> c = new ArrayDeque<>();
//		Collection<String> c = new TreeSet<>();
//		Collection<String> c = new HashSet<>();
		c.add("A");
		c.add("B");
		c.add("C");
		c.add(null);
		c.add(null);
		c.add(null);
		c.forEach(System.out::println);

		
		
		
		
		
		
		
	}

}
