import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Prg_04_Dequeue {

	public static void main(String[] args) {
		Deque<Integer> dq = new ArrayDeque<Integer>();
		dq.offer(11);
		dq.offer(22);
		dq.offer(33);
		dq.offer(44);
		dq.offer(55);
		
		dq.offerFirst(05);
//		dq.forEach(i -> System.out.println(i)); 		//Using lambda 
		Iterator<Integer> itr =dq.iterator();			// Using interator
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		// PriorityQueue
				Queue<Integer> pq = new PriorityQueue<>();
				pq.offer(33);
				pq.offer(55);
				pq.offer(11);
				pq.offer(44);
				pq.offer(22);
				System.out.println("Priority Queue: toString() -- " + pq);
				while(!pq.isEmpty()) {
					Integer i = pq.poll();
					System.out.println(i);
				}
	
	
				pq = new PriorityQueue<>((x,y)->y-x);
				pq.offer(30);
				pq.offer(50);
				pq.offer(10);
				pq.offer(40);
				pq.offer(20);
				System.out.println("Priority Queue: toString() -- " + pq);
				while(!pq.isEmpty()) {
					Integer i = pq.poll();
					System.out.println(i);
				}
	
	
	}

}
