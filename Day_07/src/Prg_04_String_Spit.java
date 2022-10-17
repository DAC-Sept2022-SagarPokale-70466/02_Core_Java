import java.util.StringTokenizer;

public class Prg_04_String_Spit {

	public static void main(String[] args) {

		String num = String.valueOf(10);
//		System.out.println(num);
		
		// String Split
		
//		String name = "Sunbeam is a institute";
//		String[] arr = name.split(" ", 3);
//		for(String str : arr)
//			System.out.println(str);
//		
//		String name1 = "Sunbeam.is/a/institute";
//		String[] arr1 = name1.split("[./]",3);
//		for(String str1 : arr1)
//		System.out.println(str1);
//		
		// String Tokenizer
		
		String name2 = "Sunbeam is a institute";
		StringTokenizer stk = new StringTokenizer(name2);
		while(stk.hasMoreElements())
		{
			System.out.println(stk.nextToken());
		}
	}

}
