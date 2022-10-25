/**
*	@Developer : Sagar_Pokale
*	@Date		 	   : 19-Oct-2022 11:31:34 PM
*/

package _07_Reflection_MiddleWare;

import java.util.Iterator;

public class Prg_07_MiddleWare {

	public static void main(String[] args) {
		Object res1 = Middleware.invokeByReflectioin("java.util.Date",
															"toString",
															null,
															null);
		System.out.println("java.util.Date -- toString() : " + res1);
		
		Class<?>[] argumentTypes = { Integer.class, Integer.class }; 
		Object[] arguments = {12, 5};
		
		Object res2 = Middleware.invokeByReflectioin("_07_Reflection_MiddleWare.Arithmatic",
															"subtract",
															argumentTypes,
															arguments);
		System.out.println("Arithmetic -- subtract() : " + res2);
		
		Object res3 = Middleware.invokeByReflectioin("_07_Reflection_MiddleWare.Arithmatic",
															"multiply",
															argumentTypes,
															arguments);
		System.out.println("Arithmetic -- multiply() : " + res3);
	}
}
