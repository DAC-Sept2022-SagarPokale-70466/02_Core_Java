import java.util.function.IntPredicate;

/**
*	@Author : Sagar_Pokale
*	@Date		 : 15-Oct-2022 6:50:48 PM
**/

public class Predicate {

	public static void main(String[] args) {
		IntPredicate predicate = i -> i < 19;
		
		IntPredicate predicate2 = i -> i > 15;
//		System.out.println(predicate.or(predicate2).test(11));

//		===========================================
				
		predicateFunction(10, i -> i > 15);
		System.out.println("End");
	}

	public static void predicateFunction(int a, IntPredicate ip) {
		if(ip.test(16)) {
			System.out.println("Suceess");
		}
	}
	
	
//	============================================
	
	
	
	
	
	
}
