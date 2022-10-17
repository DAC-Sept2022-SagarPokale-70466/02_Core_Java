import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Prg_01_Stream {

	/**
	 * @Sagar_Pokale
	 */
	public static void main(String[] args) {

//		Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
				
//		Stream<Integer> stm = Stream.of(arr);					// Declare the new Stream using of method
//		
//		Stream<Integer> stmm = stm.filter(i -> i % 2 == 0);
//		
//		Stream<String> stm1 = stmm.map(i -> "Dac"+i);
//		
//		Stream<String> stm2 = stm1.map(i -> i.toUpperCase());
//		
//		stm2.forEachOrdered(i -> System.out.println(i));
//		
//		Optional<Integer> itr = stm.findFirst();			//findAny();
		
//		System.out.println(itr.get());
		
//		System.out.println(stm.anyMatch(i -> i > 10));
		
		
		
		
		Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
		
		Stream.of(arr)
								.filter(i -> i % 2 == 0)
								.map(i -> "DAC"+i)
								.map(i -> i.toLowerCase())
								.sorted((x, y) -> y.compareTo(x))
								.forEach(i -> System.out.println("Here it is : "+i));
								
		
		//create stream from any collection (except maps)
		List<Double> list = new ArrayList<>();
		Collections.addAll(list, 1.1, 4.4, 3.3, 5.5, 2.2);
		list.stream()
							.map(d -> d * d)
							.forEach(d -> System.out.printf("%.2f\n", d));
		System.out.println("bye!");

	}

}
