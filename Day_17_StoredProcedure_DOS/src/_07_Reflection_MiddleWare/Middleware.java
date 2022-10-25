/**
*	@Developer : Sagar_Pokale
*	@Date		 	   : 19-Oct-2022 11:32:56 PM
*/

package _07_Reflection_MiddleWare;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//create object dynamically and invoke the method
public class Middleware {
	public static Object invokeByReflectioin(String className, String methodName, Class<?>[] argTypes, Object[] args) {

		try {
			// load the class and get its metadata
			Class<?> c = Class.forName(className);
			// create the object of that class
			Object obj = c.newInstance();
			// find the method in the class with given arg types
			Method m = c.getDeclaredMethod(methodName, argTypes);
			// make the method accessible (though it is private)
			m.setAccessible(true);
			// invoke the method on the object and collect the result
			Object result = m.invoke(obj, args);
			// return the result
			return result;

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		}
		return null;
	}
}
