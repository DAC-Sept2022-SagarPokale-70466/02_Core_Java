/**
*	@Developer : Sagar_Pokale
*	@Date		 	   : 19-Oct-2022 6:58:11 PM
*/

package Stream;

import java.util.Arrays;
import java.util.List;

public class Stream {

	public static void main(String[] args) {

		List<String> people = Arrays.asList("Al", "Ankit", "Brent", "Sarika", "amanda", "Hans", "Shivi");
		people.stream()
								.map(i -> i.toLowerCase())
								.filter(i -> i.startsWith("s"))
								.forEach(i -> System.out.println(i));
		System.out.println("Done");
	}
}
