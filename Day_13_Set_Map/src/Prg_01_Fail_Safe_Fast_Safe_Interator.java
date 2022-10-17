import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Prg_01_Fail_Safe_Fast_Safe_Interator {

	public static void main(String[] args) {

		System.out.println("Fail Safe Iterator");
		List<String> list2  = new CopyOnWriteArrayList<>();		 // This will create a copy of the list 		
		Collections.addAll(list2, "A", "B","C","D","E", "F", "G");
		Iterator<String> itr2 = list2.iterator();
		while(itr2.hasNext()) {
			String str2 = itr2.next();
			System.out.println(str2);
			if(str2.equals("C")) {
				list2.remove("F");
			}
		}
		
		
		
		
		// Fail Fast Iterator
		
		System.out.println("Fail Fast iterator : ");
		List<String> list  = new ArrayList<>();		
		Collections.addAll(list, "A", "B","C","D","E", "F", "G");
		Iterator <String> itr1 = list.iterator();
		while(itr1.hasNext()) {
			String str = itr1.next();
			System.out.println(str);
			if(str.equals("C")) {
				list.remove("F");					// Here Error Because we try to manupulate the structure of string Other than iterator method				
			}
		}
	}

}
