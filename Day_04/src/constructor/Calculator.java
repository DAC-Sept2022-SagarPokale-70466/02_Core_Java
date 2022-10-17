package constructor;

import java.util.Scanner;

class Cal
{
	int one;
	int two;
	Scanner ss = new Scanner(System.in);
	void add()
	{
		System.out.println("Enter Two no : ");
		one = ss.nextInt();
		two = ss.nextInt();
		System.out.println("Addition = "+(one + two));
		System.out.println();
		System.out.println();
	}
	void sub()
	{
		System.out.println("Enter two no :");
		one = ss.nextInt();
		two = ss.nextInt();
		System.out.println("Substraction : "+(one - two));
		System.out.println();
		System.out.println();
	}
	void mul()
	{
		System.out.println("Enter two no :");
		one = ss.nextInt();
		two = ss.nextInt();
		System.out.println("Multiplication : "+(one * two));
		System.out.println();
		System.out.println();
	}
	void div()
	{
		System.out.println("Enter two no :");
		one = ss.nextInt();
		two = ss.nextInt();
		System.out.println("Division: "+(one / two));
		System.out.println();
		System.out.println();
	}
	
}
public class Calculator {

	static int menu()
	{
		System.out.println("WELCOME");
		System.out.println("CHOICE 1 Below :");
		System.out.println("Addition : 1");
		System.out.println("Subtraction: 2");
		System.out.println("Multiplication : 3");
		System.out.println("Division : 4");
		System.out.println("EXIT: 0");
		return new Scanner(System.in).nextInt();
	}
	public static void main(String[] args) {
		
		Cal c1 = new Cal();
		
		int choice;
		while((choice = menu()) != 0)
		{
		switch(choice)
		{
			case 0 :
				break;
		
			case 1 :
				c1.add();
				break;
			
			case 2 : 
				c1.sub();
				break;
				
			case 3 : 
				c1.mul();
				break;
				
			case 4 : 
				c1.div();
				break;
		}
	}

}
}
