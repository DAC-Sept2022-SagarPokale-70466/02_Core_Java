package assignment.day02;

import java.util.Scanner;

public class Assignment_02 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Proper double value");
//		
//		boolean flag= sc.hasNextDouble();
//		double first;
////		System.out.println(first);
//		if(flag) {
//			first = sc.nextDouble();
//			System.out.println("OK");
//		}
//		else{
//			System.out.println("NOT OK");
//			System.exit(0);
		
		
		
		
		
		
//		double user = 0;
//		while(true)
//		{
//			System.out.println("Enter valid Double no");
//			try {
//				user = Double.parseDouble(sc.nextLine());
//				break;
//			}
//			catch(NumberFormatException e)
//			{
//				System.out.println("Enter Properly");
//			}
//		}
//		System.out.println(user);
//	
	
		
		
		
		System.out.println("Enter Double Value");
		while(!sc.hasNextDouble())
		{
			System.out.println("Invalid Input");
			sc.next();
		}
		double user = sc.nextDouble();
		System.out.println(user);
		
		
	}
}
