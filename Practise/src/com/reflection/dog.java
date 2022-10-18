package com.reflection;

public class dog {
	private final String name;
	private int age;
	
	public dog(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public void bark()
	{
		System.out.println("DOG BARKING");
	}
	@SuppressWarnings("unused")
	private void thisisprivate()
	{
		System.out.println("THIS IS PRIVATE METHOD");
	}
	public static void thisIsPublicStatic()
	{
		System.out.println("This is public static method");
	}
	@SuppressWarnings("unused")
	private static void thisIsPrivateStatic()
	{
		System.out.println("This is private static method");
	}
}
