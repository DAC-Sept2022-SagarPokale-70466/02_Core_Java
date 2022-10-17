import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Sagar_Pokale 5:39:52 PM 14-Oct-2022
 **/

public class Prg_07_Stream {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>(); // Stream of Collections
		Stream<Integer> stm = list.stream();

		Integer[] arr = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
		Stream<Integer> stm2 = Stream.of(arr); // Stream of Arrays

//		stm2.forEach(i -> System.out.println(i));

//		Stream<Double> stm3 = Stream.generate(  ()  -> Math.random());

		Random r = new Random();

		Stream<Float> stm4 = Stream.generate(() -> r.nextFloat());

//		stm4.limit(15)
//							.map(i -> i * 100)
//							.filter(i -> i < 50)
//							.forEach(i -> System.out.println(i));

		String[] names = { "Smita", "Rahul", "Rachana", "Amit", "Shraddha", "Nilesh", "Rohan", "Pradnya", "Rohan",
				"Pooja", "Lalita" };

//		Stream.of(names)
//									.skip(1)
//									.limit(1)
//									.sorted()
//									.sorted((x,y) -> y.compareTo(x))
//									.filter( f -> f.endsWith("a"))							// Filter Our
//									.map(f -> f.toUpperCase())
//									.distinct()
//									.forEach(	p  -> System.out.println(p)	);
//		
//		System.out.println(Stream.of(names).count())	;

//=================================================================

//		List<String> list2 = Stream.of(names).collect(Collectors.toList());

//		===========================================================

		Stream<String> sstream = Stream.of(names);
		Optional<String> res = sstream.reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2);
		System.out.println(res);

//		Scanner sc = new Scanner(System.in);
		Stream<Integer> sum = Stream.iterate(1, i -> i + 1).limit(5);
		int total = sum.reduce(1, (a, i) -> a * i);
		System.out.println(total);

//		Optional<String> result = Stream.of(names).max((x,y)   -> x.compareTo(y));
//		if(result.isPresent()) {
//			System.out.println("MAX : "+result.get());
//		}
//		else {
//			System.out.println("Nothing");
//		}

//=============================================================

//		Finding the sum of all the elements in the arrays

		System.out.println("Sum of Elements in array : ");

		List<Integer> numlist = Arrays.asList(2, 3, 5, 5);

		float sumarr = numlist.stream().reduce(0, (Integer a, Integer b) -> { return a + b;		});

		System.out.println(sumarr);

	}
}
