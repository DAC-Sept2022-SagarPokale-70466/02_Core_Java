package Main;

import java.util.Scanner;

import entities.Rectangle;
import entities.Square;
import shape.Shape;

public class areaCalculation2 {

	public static int menu() {
		System.out.println("Enter Your Choice : ");
		System.out.println("0 .		EXIT	");
		System.out.println("1. 		Rectangle");
		System.out.println("2       Square");

		return new Scanner(System.in).nextInt();
	}

	public static void main(String[] args) {

//		Shape ss = new Rectangle(10,20);
//		ss.getDetails();
//		ss.area();
//		ss.getArea();
//		
//		ss = new Square(20);
//		ss.getDetails();
//		ss.area();
//		ss.getArea();

		int choice;
		Shape shape = null;
		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1:
				shape = new Rectangle(10, 20);
				break;

			case 2:
				shape = new Square(15);
				break;
			default:
				System.out.println("Wrong Choice : ( ");
				break;
			}
			doWork(shape);
		}
	}

	public static void doWork(Shape shape) {
		if (shape != null) {
			shape.getDetails();
			shape.area();
			shape.getArea();

		}
	}
}
