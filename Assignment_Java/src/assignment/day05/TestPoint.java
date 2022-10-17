package assignment.day05;

import java.util.Scanner;

public class TestPoint {

	public static void main(String[] args) {

		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Point Co-Ordinates : ");
		a = sc.nextInt();
		b = sc.nextInt();
		Point p1 = new Point(a, b);
		System.out.println("Enter First Point Co-Ordinates : ");
		a = sc.nextInt();
		b = sc.nextInt();
		Point p2 = new Point(a, b);
		
		if(p1.equals(p2))
		{
			System.out.println("MESSAGE : BOTH ARE AT SAME POINT");
		}
		System.out.println(p1.getDetails());
		System.out.println(p2.getDetails());
	}
}

class Point {
	private int a;
	private int b;

	Point(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public String getDetails()
	{
		return "( X = "+this.a+" Y = "+this.b+" ) ";
	}
	
}
