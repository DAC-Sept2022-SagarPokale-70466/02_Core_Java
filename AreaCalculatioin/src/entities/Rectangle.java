package entities;

import java.util.Scanner;

import shape.Shape;

public class Rectangle extends Shape {

	private int length;
	private int breadth;

	public Rectangle() {
		this.length = 0;
		this.breadth = 0;
	}

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void area() {
		this.area = (this.length * this.breadth);
	}

	public void getDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length : ");
		this.length = sc.nextInt();
		System.out.println("Enter Breath : ");
		this.breadth = sc.nextInt();
	}
}
