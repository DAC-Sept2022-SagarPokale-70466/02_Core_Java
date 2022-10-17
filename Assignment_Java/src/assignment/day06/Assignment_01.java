package assignment.day06;

public class Assignment_01 {

	public static void main(String[] args) {

		String str = "SagarPokale";
		String st ="";
		char ch;
		for(int i = 0; i < str.length(); i++)
		{
			ch = str.charAt(i);
			st = ch + st	;
		}
		System.out.println(st);
	}

}
