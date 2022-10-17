
public class Prg_04_AbstactClass {

	public static void main(String[] args) {

//		Super ss = new Super();			// ERROR

		Super ss = new SubClass();
		ss.method1();
		ss.method2();

		SubClass sb = (SubClass) ss;
		sb.method3();
	}

}

abstract class Super {
	int num;

	public Super() {
		System.out.println("This is Super Class Constructor");
		this.num = 001;
	}

	public Super(int num) {
		this.num = num;
		System.out.println("This is Super class constructor");
	}

	public void method1() {
		System.out.println("Inside Method1 In super Class");
	}

	public abstract void method2();
}

class SubClass extends Super {
	public SubClass() {
		System.out.println("Inside SubClass Constructor");
	}

	@Override
	public void method2() {
		System.out.println("This is method 2 Inside the subClass");
	}

	public void method3() {
		System.out.println("This is method 3 Inside the subClass");
	}
}