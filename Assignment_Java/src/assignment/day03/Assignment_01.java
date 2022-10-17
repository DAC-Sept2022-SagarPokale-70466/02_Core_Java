package assignment.day03;

import java.util.Scanner;

public class Assignment_01 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		int value = 0;
		int i = 1;
		do{
		System.out.print("Enter the no :");
		
		value = sc.nextInt();
		System.out.println("Given No is :"+value);
		
		System.out.println("Binary no is : "+Integer.toBinaryString(value));
		
		System.out.println("Octal no is : "+Integer.toOctalString(value));
		
		System.out.println("Hex no is : "+Integer.toHexString(value));
		
		System.out.println();
		
		System.out.println("For EXIT  : 0");
		
		i = sc.nextInt();
		}while(i != 0);
	}

}
