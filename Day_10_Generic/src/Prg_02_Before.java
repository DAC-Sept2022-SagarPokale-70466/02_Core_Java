import java.util.LinkedList;

public class Prg_02_Before {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();
		ll.add(15);
		ll.add(35);
		ll.add(50);

		for (Object obj : ll) {
//			Integer f = (Integer) obj;
			double f = (double) obj;		// ClassCastException	RunTimeError
			
			System.out.println(f);
		}

	}

}
