import java.util.LinkedList;

public class Prg_04_LinkedList {

	public static void main(String[] args) {

//		LinkedList<Integer> list = new LinkedList<>();
//		list.add(54);
//		list.add(34);
//		list.add(234);
//		list.add(53);
//		list.addFirst(11);
//		list.get(0);
////		list.add("aagag");				// CompileTimeError
//		
//		for(Integer i : list)
//		{
//			System.out.println(i);
//		}
		
		
		LinkedList<String> str = new LinkedList<String>()	;
		str.add("gddsf");
		str.add("Sagar");
//		str.clear();
		System.out.println(str.contains("Sagar"));
		
		for(String s : str)
		{
			System.out.println(s);
		}
		System.out.println("\nHello");
	}

}
