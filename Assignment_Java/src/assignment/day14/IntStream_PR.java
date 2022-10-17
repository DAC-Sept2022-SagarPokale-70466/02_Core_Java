/**
* Sagar_Pokale 10:40:14 PM 14-Oct-2022
**/

package assignment.day14;

import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStream_PR {

	public static void main(String[] args) {

//		 IntStream stream = IntStream.range(5, 10);

//		 stream.forEach( i -> System.out.println(i));

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		IntStream istr = IntStream.of(1, 22, 3, 444, 566, 775, 34);

//		 istr.forEachOrdered(i -> System.out.println(i)); 				//forEachOrderded  will word for  everyone

//		System.out.println(istr.count());

//		Supplier<IntStream> istream = () -> IntStream.of(43, 432, 54, 656, 546, 345, 34, 545, 34);

//		System.out.println("Avg = " + istream.get().average());

//		System.out.println("Sum = " + istream.get().sum());

//		System.out.println(Arrays.stream(arr).sum() / arr.length);

		int arr_sample2[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 23, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		Arrays.stream(arr_sample2).asDoubleStream().forEach(o -> System.out.println(o));

		IntPredicate inpredi = e -> e % 23 == 0;
		
		System.out.println(Arrays.stream(arr_sample2).anyMatch(inpredi));
		
		System.out.println(Arrays.stream(arr_sample2).noneMatch( i -> i % 2 == 0));
		
		System.out.println("Avg : "+Arrays.stream(arr_sample2).average().getAsDouble());
		
		System.out.println("Max : "+Arrays.stream(arr_sample2).max().getAsInt());
		
		
		
		
	}

}
