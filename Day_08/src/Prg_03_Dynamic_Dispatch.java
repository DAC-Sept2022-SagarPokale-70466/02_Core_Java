
public class Prg_03_Dynamic_Dispatch {

	public static void main(String[] args) {

		ParentClass pp = new ChildClass(); // Upcasting
		pp.function1();
		pp.function2(); // Dynamic Memory Dispatch
		// Here Child class will execute because it is overridden

//		pp.function5();			// Error

		ChildClass c5 = (ChildClass) pp;

		c5.function5(); // wil Run Because we already downcast in c5 and function5 is method of
						// ChildClass

	}

}

class ParentClass {
	int num;

	void function1() {
		System.out.println("Inside Function Method Parent Class");

	}

	public void function2() {
		System.out.println("Inside function2 Method Parent class");
	}

}

class ChildClass extends ParentClass {
	int num1;

	public void function3() {
		System.out.println("Inside function3 Method Child class");
	}

	public void function2() {
		System.out.println("Inside Function2 Method Child Class");
	}

	public void function5() {
		System.out.println("Inside Function3 Method Child Class");
	}
}
