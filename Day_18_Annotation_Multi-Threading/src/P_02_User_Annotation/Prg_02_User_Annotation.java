/**
*	@Author : Sagar_Pokale
*	@Date		 : 19-Oct-2022 2:46:51 PM
*/

package P_02_User_Annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Prg_02_User_Annotation {

	public static void main(String[] args) {
		System.out.println("Annotations on MyClass -- using its toString() : ");
		Annotation[] anns = MyClass.class.getAnnotations();
		for (Annotation ann : anns) {
			System.out.println(ann.toString());
			
		
		Readme[] readmeass = MyClass.class.getAnnotationsByType(Readme.class);
		System.out.println("Developer: " + readmeass[0].Developer() );
		System.out.println("Company: " + readmeass[0].Company() );
		
		try {
			System.out.println("\nAnnotations on MyClass.myMethod() -- using its toString() : ");
			Method m = MyClass.class.getDeclaredMethod("myMethod");
			anns = m.getDeclaredAnnotations();
			for (Annotation anna : anns)
				System.out.println(anna.toString());
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		
		
		}

	}
}
