import java.util.LinkedList;
import java.util.Queue;

public class Prg_03_Queue {

	public static void main(String[] args) {

		Queue<Integer>q = new LinkedList<>();
		q.offer(11);
		q.offer(22);
		q.offer(33);
		q.offer(44);
		q.offer(55);
		q.offer(66);
		
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
				
		System.out.println(q.peek());				// Just to see what is Present
				
		System.out.println(q.size());
		
		System.out.println(q.contains(44));		
	}

}
