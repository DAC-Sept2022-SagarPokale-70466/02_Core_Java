import java.util.Set;
import java.util.TreeSet;

public class Prg_06_TreeSet {

	public static void main(String[] args) {

		TreeSet<String> set = new TreeSet<>();				// Treeset -> Sorted order
		set.add("S");
		set.add("U");
		set.add("N");
		set.add("B");
		set.add("E");
		set.add("A");
		set.add("M");
		System.out.println(set); // [A, B, E, M, N, S, U]

		// SortedSet<> interface methods
		System.out.println("First Element: " + set.first()); // A
		System.out.println("Last Element: " + set.last()); // U
		System.out.println("Head Set: " + set.headSet("E")); // [A, B] (excluding E)
		System.out.println("Tail Set: " + set.tailSet("N")); // [N, S, U] (including N)

		// NavigableSet<> interface methods
		System.out.println("Higher Than B = " + set.higher("B")); // E
		System.out.println("Lower Than N = " + set.lower("N")); // M

		Set<String> descSet = set.descendingSet();
		System.out.println(descSet); // [U, S, N, M, E, B, A]
	
	
	
	
	
	
	
	
	}

}
