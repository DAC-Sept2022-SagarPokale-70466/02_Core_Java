package assignment.day09_01;

public class Prg_01 {
	public static void main(String[] args) {
		Box<Rectangle> b1 = new Box<>();
		Box<Circle> b2 = new Box<>();

		b1.setBox(new Rectangle());
		b2.setBox(new Circle());

		System.out.println(b1.getBox().getDetails());
		System.out.println(b2.getBox().getDetails());
	}
}

class Box<Shape> {
	Shape obj;

	public void setBox(Shape obj) {
		this.obj = obj;
	}

	public Shape getBox() {
		return this.obj;
	}
}

class Rectangle {
	public String getDetails() {
		return "You are in Rectangle";
	}
}

class Circle {
	public String getDetails() {
		return "You are in Circle";
	}
}