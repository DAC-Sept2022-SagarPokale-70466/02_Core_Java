/**
* Sagar_Pokale 9:56:40 PM 14-Oct-2022
**/

package assignment.day14;

import java.util.HashMap;
import java.util.Scanner;

public class Count_words {

	public static void main(String[] args) {

		String sc = "Sagar is my name hello i am Sagar";

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		String[] str = sc.split(" ");

		for (String ss : str) {

			Integer i = map.get(ss);
			if (i == null) {
				map.put(ss, 1);
			} else {
				map.put(ss, i + 1);
			}
		}
		System.out.println(map);
	}

}
