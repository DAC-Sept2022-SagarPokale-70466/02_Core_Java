
public class Prg_03_String {

	public static void main(String[] args) {

		String name1 = "Sun";
		String name2 = "beam";
		String name3 = new String("Sun");
		String name4 = new String("beam");

		String ref1 = name1 + name2;
		String ref2 = name1.concat(name2);
		String ref3 = "Sun" + "beam";

		String ref4 = name3 + name4;
		String ref5 = name1.concat(name4);

		String test = "Sunbeam";

		System.out.println("ref1 = " + ref1);
		System.out.println("ref2 = " + ref2);
		System.out.println("ref3 = " + ref3);
		System.out.println("ref4 = " + ref4);
		System.out.println("ref5 = " + ref5);
		System.out.println("ref1 equals ref4 " + ref1.equals(ref4));
		System.out.println("ref2 equals ref5 " + ref2.equals(ref5));
		System.out.println("Test = " + ref1.equals(test));
		System.out.println("Test = " + ref4.equals(test));
		System.out.println("(==) Method = " + (ref1 == ref4));
		System.out.println("(==) Method = " + (ref2 == ref5));

	}

}
