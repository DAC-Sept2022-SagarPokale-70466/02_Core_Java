/**
*	@Developer : Sagar_Pokale
*	@Date		 	   : 19-Oct-2022 11:23:10 PM
*/

package _06_Reflection;

import java.lang.reflect.Constructor;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

import _05_DOS.DbUtil;

public class Prg_06_Reflection {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter class name: ");
		String className = sc.next();
		
		try {
			Class<?> c = Class.forName(className);
			System.out.println("Class Name: " + c.getName());
			
			Class<?> supcls = c.getSuperclass();
			if(supcls != null)
				System.out.println("Super Class Name: " + supcls.getName());
			
			Class<?>[] supintfs = c.getInterfaces();
			for (Class<?> supintf : supintfs)
				System.out.println("Super Interface : " + supintf.getName());
			
			Field[] fields = c.getDeclaredFields();
			for (Field field : fields)
				System.out.println("  - Field: " + field);

			Method[] methods = c.getDeclaredMethods();
			for (Method method : methods)
				System.out.println("  + Method: " + method);
		
			Constructor<?>[] ctors = c.getDeclaredConstructors();
			for (Constructor<?> ctor : ctors)
				System.out.println("  + Ctor: " + ctor);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

	DbUtil nn = new DbUtil();
}