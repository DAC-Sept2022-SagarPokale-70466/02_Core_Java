
public class Prg_01_Inheritance {

	public static void main(String[] args) {

//		Parent p1 = new Parent();
//		p1.function1();

		Child c1 = new Child(10);
		c1.function1();
		c1.function2();
	}
}

class Parent {
	int num;

	Parent() {
		System.out.println("In Parent class Constructor");
		System.out.println(num);

	}

	Parent(int num) {
		this.num = num;
		System.out.println("In Parent class Constructor");
		System.out.println(num);
	}

	public void function1() {
		System.out.println("Inside Function Method Parent Class");

	}
}

class Child extends ParentClass {
	int num1;

	public Child(int num1) {
//		super(num1);
		this.num1 = num1;
		System.out.println("Inside Child Constructor");
		System.out.println("num1 = " + num1);
	}

	public void function2() {
		System.out.println("Inside function2 Method Child class");
	}
}
