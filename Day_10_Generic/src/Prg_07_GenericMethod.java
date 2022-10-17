
public class Prg_07_GenericMethod {

//	public static void print(String[] arr)					// Non Type-Safe
//	{
//		for(String s : arr)
//		{
//			System.out.println(s);
//		}
//	}

	public static <t> void printData(t[] arr) // Type-Safe				Generic Method 
	{
		for (t array : arr) {
			System.out.println(array);
		}
	}

	public static void main(String[] args) {

		String[] str = { "Holla","Hiiii","Hii There"};
		//print(str);
		
		printData(str);

		Double [] d = {1.1, 2.2, 3.3, 4.4, 5.5};
		printData(d);
		}
}