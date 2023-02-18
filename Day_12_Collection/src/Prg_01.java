import java.util.function.Predicate;

public class Prg_01 {

	public static int countTotal(String[] arr, Predicate<String> cond) // Predicate Interface
	{
		int count = 0;
		for (String str : arr) {
			if (cond.test(str))
				count++;
		}
		return count;
	}

	public static void main(String[] args) {

		String[] arr = { "Nilesh", "Shubham", "Pratik", "Omkar", "Prashant" };
		int total = countTotal(arr, (s) -> s.length() > 2);
		System.out.println(total);
	}

}
