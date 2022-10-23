interface one {
	default public void print() {
		System.out.println("Hello");
	}
}

class Parent {
	public void print() {
		System.out.println("Hiii There");
	}
}

class child extends Parent implements one{
	// No one error as in multiple implementation 
	// Inside this the parent function will run 
	// Because SuperClass wins interface Clashes
	
}

public class Prg_08_Prg_07_Solution {

	public static void main(String[] args) {
		child c = new child();
		c.print();
	}
	

}
