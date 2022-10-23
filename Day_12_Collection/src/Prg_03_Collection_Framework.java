import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Prg_03_Collection_Framework {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
//		List<Integer> vlist = new Vector<Integer>();						//	 We can make any type of list
//		List<Integer> lList = new LinkedList<Integer>();

		list.add(11);
		list.add(22);
		list.add(33);
		list.add(44);
		list.add(55);
		list.add(66);

		System.out.println(list);

		list.add(1, 15);
		System.out.println(list);

		System.out.println("List Size = " + list.size());

		System.out.println("Empty ? =" + list.isEmpty());

		list.clear();
		System.out.println("After : ");
		System.out.println("Empty ? =" + list.isEmpty());

		System.out.println(list);

		Collections.addAll(list, 99, 88, 77, 66, 55, 44, 33);

		System.out.println(list);

//		==================================================================

		List<Integer> newList = new LinkedList<Integer>();
		newList.add(111);
		newList.add(222);

		list.addAll(newList); // This will add newlist to -> list
		System.out.println(list);

		System.out.println("New Size : " + list.size());

		int first = list.get(1);
		System.out.println("At First Index = " + first);

		int setValue = 999;
		list.set(1, setValue);
		System.out.println("After Set Value : " + list);

		System.out.println("999 is Present or Not = " + list.contains(999));

		System.out.println(list.indexOf(999));

		boolean success = list.remove(new Integer(66)); // Collection.remove(obj) This will remove the specified value
		System.out.println("Removed Successfully: " + success);

		System.out.println("Before Remove : " + list);
		int index = list.remove(1); // Remove By index return gives value of removed object
		System.out.println("Removed The Value ; " + index);
		System.out.println("After Remove : " + list);

		list.removeIf(num -> num > 50); // RemoveIf from object class
										// removeif From Collection

		System.out.println(list);

//		===============================================

		List<Integer> remList = new ArrayList<Integer>();

		remList.add(33);
		remList.add(50);
		remList.add(60);

		success = list.containsAll(remList);
		System.out.println(list + " containsAll " + remList + " = " + success);

//		list.removeAll(remList); // delete all matching
		// OR
//		list.retainAll(remList); // retain all matching (If there is something like remlist then keep it other delete it 
//		System.out.println("List: " + list);

		System.out.println("At the end " + list);

		/////////////////////////////////////////////////////////////////////////////
		// TRAVERSING THE ARRAY

		System.out.println("Traversing using the for-each loop");
		for (Integer i : list) {
			System.out.println(i);
		}

		System.out.println("\nTraverse list using forEach() -- Consumer: ");

		list.forEach(num -> System.out.println(num));

//		=========================================================================

		System.out.println("\nTraverse list using Iterator: ");

		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			Integer num = itr.next();
			System.out.println(num);
		}

		System.out.println("\nAdding all elements in List using Iterator: ");
		int total = 0;
		itr = list.iterator();
		while (itr.hasNext()) {
			Integer ele = itr.next();
			total = total + ele;
		}
		System.out.println("Result: " + total);

//		=========================================================================

		System.out.println("Traverse Forward list using ListIterator: ");

		ListIterator<Integer> litr = list.listIterator(); // itr initially point to start of list
		while (litr.hasNext()) {
			Integer num = litr.next();
			System.out.println(num);
		}

		System.out.println("Traverse Backward list using ListIterator: ");
		litr = list.listIterator(list.size()); // itr initially point after end of list
		while (litr.hasPrevious()) {
			Integer num = litr.previous();
			System.out.println(num);
		}
	}
}