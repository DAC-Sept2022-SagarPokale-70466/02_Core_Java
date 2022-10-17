/**
*	@Author : Sagar_Pokale
*	@Date		 : 16-Oct-2022 5:24:47 PM
**/

package assignment.day11_02;

import java.util.function.Predicate;

public class Prg_02_Count_No_Of_Word_String {

	public static void main(String[] args) {
		String[] arr = { "Nilesh", "Shubham", "Pratik", "Omkar", "Prashant" };

		// call countIf() to count number of strings have length more than 6 -- using
		// anonymous inner class
//		int cnt = countIf(arr, new Predicate<String>() {
//			public boolean test(String s) {
//				return s.length() > 6;
//			}
//		});
//		System.out.println("Result: " + cnt); // 2


//		===============================================
		
		
		int cnt = countIf(arr, i -> i.length() > 6);
		System.out.println("Result: " + cnt); // 2

		// call countIf() to count number of strings have length more than 6 -- using
		// lambda expressions
	}

	public static int countIf(String[] arr, Predicate<String> cond) {
		int count = 0;
		for (String str : arr) {
			if (cond.test(str))
				count++;
		}
		return count;
	}
}
