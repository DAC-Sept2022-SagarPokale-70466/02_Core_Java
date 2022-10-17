import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Prg_09_Map {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Map<Integer, String> map = new LinkedHashMap<>();
		//Map<Integer, String> map = new TreeMap<>();
//		Map<Integer, String> map = new Hashtable<>();
		
		map.put(411037, "Marketyard Pune"); // return null
		map.put(411052, "Hinjewadi Pune"); // return null
		map.put(411046, "Katraj Pune"); // return null
		map.put(400027, "Byculla Mumbai"); // return null
		map.put(411002, "Xyz Pune"); // return null
		map.put(411002, "Pqr Pune"); // return "Xyz, Pune" 
		System.out.println("Number of entries: " + map.size());
		
//		System.out.print("Enter pin: ");
//		Integer pin = sc.nextInt();
//		String area = map.get(pin);
//		String area = map.getOrDefault(pin, "Unknown");
//		System.out.print("Found Area: \n" + area);
		
		Set<Integer> keys = map.keySet();
		System.out.println("Keys : "+keys);
		
		Collection<String> values = map.values();
		System.out.println("Values: " + values);
		
		Set<Entry<Integer, String>> entries = map.entrySet();
		System.out.println("Entries: " + entries);
		
		for(Entry<Integer, String> entry:entries)
			System.out.println(entry.getKey() + " -- " + entry.getValue());

		map.forEach((k,v) -> System.out.println(k + " -> " + v));
		
		System.out.print("Enter pin to be deleted: ");
		Integer pincode = sc.nextInt();
		map.remove(pincode);
		
		sc.close();
	}
}
