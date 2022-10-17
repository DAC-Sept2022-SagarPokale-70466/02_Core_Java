
public class Prg_02_String {

	public static void main(String[] args) {

//		way 01		Literal type 
		String str = "Sagar";
		String str2 = "Sagar";
		String str4 = "Baba";
		String str7 = "sagar"; 
		
		System.out.println(str.equals(str7));			// True
		System.out.println(str.equalsIgnoreCase(str7));
		System.out.println(str.charAt(2));
		System.out.println(str);
		System.out.println(str.substring(2,4));
		System.out.println(str4.compareTo(str));
		System.out.println(str.compareToIgnoreCase(str7));
		System.out.println(str.concat(str4));
		
		
		
		//		way 02		Reference type 
			
		String str3 = new String("Sagar");		
		
		String str5 = new String("Sagar");
		
//		System.out.println(str3 == str4);				//		False
//		System.out.println(str3.equals(str));			//		True
		
		
		
	}

}
