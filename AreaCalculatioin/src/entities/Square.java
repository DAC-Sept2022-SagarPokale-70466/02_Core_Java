package entities;

import java.util.Scanner;

import shape.Shape;

public class Square extends Shape{	
	
	private int side;
	
	public Square()
	{
		this.side = 0;
	}
	public Square(int side)
	{
		this.side = side;
	}
	public void area()
	{
		this.area = this.side * this.side; 
	}
	public void getDetails()
	{
		System.out.println("Enter Square Side : ");
		Scanner sc = new Scanner(System.in);
		this.side = sc.nextInt();
	}
}
