import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Prg_05_Set {

	public static void main(String[] args) {

//		Set<Integer> set = new HashSet<>(10);			// stored in order as per their hash code
//		Set<Integer> set = new LinkedHashSet<>(); 	// stored in order of the insertion
		Set<Integer> set = new TreeSet<>(); 			// stored in sorted order
		
		set.add(23);
		set.add(76);
		set.add(25);
		set.add(56);
		set.add(765);
		set.add(87);
		set.add(54);
		set.add(88);
		set.add(99);
		set.add(11);				// returns false when element is duplicate
		set.add(22);
		set.add(33);

		System.out.println("Set : ");
		for(Integer i : set)
			System.out.println(i);
		
		Iterator<Integer> itr = set.iterator();
		
		System.out.println("Using Iterator");
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
