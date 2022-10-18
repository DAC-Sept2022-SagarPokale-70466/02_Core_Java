package com.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

// HERE WE ARE USING REFLECTION TO USE THE PRIVATE METHOD, VARIABLES
public class relection_Tutorial {

	public static void main(String[] args) throws Exception
	{
		dog mydog = new dog("Tiger",6);
		Field[] dogfiled = mydog.getClass().getDeclaredFields();	// Reflection declaration
		
		for(Field field : dogfiled)
		{
			 if(field.getName().equals("name"))
			 {
				 field.setAccessible(true);
				 field.set(mydog, "sheru");
			 }
		}
		System.out.println(mydog.getName());
		
		////////////////////////////////////////
		
		Method[] dogmethod = mydog.getClass().getDeclaredMethods();
		for(Method method : dogmethod)
		{
			if(method.getName().equals("thisisprivate"))
			{
				method.setAccessible(true);
				method.invoke(mydog);
			}
		}
	}

}
