import java.util.IntSummaryStatistics;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Prg_03_Random_Generate {

		public static void main(String[] args) {

//			Stream<Double> str = Stream.generate( () -> Math.random()   );
//			
//			str.
//			limit(10)
//			.map(i -> i * 100)
//			.forEach(i -> System.out.println(i) );
			
			
//			Random r = new Random();								//Supplier
//			Stream<Integer> str2 = Stream.generate(   ()   -> r.nextInt(100));			
//			str2
//				.limit(50)
//				.forEach( i -> System.out.println(i)   );
			
			
			
			
//			Stream<Integer> strm3 = Stream.iterate(1, i -> i + 1);
//			strm3
//				.skip(50)
//				.limit(10)
//				.forEach(System.out::println);
//			
//			
//			IntStream strm4 = IntStream.rangeClosed(51, 60);
//			System.out.println("Total: " + strm4.sum());
//			
//			IntStream strm5 = IntStream.rangeClosed(51, 60);
//			IntSummaryStatistics stats = strm5.summaryStatistics();
//			System.out.println(stats);
//			
			Stream<Double> ds = Stream.generate(() -> Math.random());
			ds
				.map(i -> i * 100)
				.limit(10)
				.forEach(i -> System.out.println(i)    ) ;
		}
}
