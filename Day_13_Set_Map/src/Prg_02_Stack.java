import java.util.Stack;

public class Prg_02_Stack {

	public static void main(String[] args) {

		Stack<Integer> itr = new Stack<>();
		itr.push(11);
		itr.push(22);
		itr.push(33);
		itr.push(44);
		itr.push(55);
		itr.push(66);
		itr.add(1, 99);
		System.out.println("Index = "+itr.get(1));
		
		System.out.println(itr.hashCode());
		
		System.out.println(itr.search(15));		// Search is count the given element from the top
		System.out.println(itr);
		
		while(!itr.isEmpty()) {
			System.out.println(itr.pop());
		}
	}

}
