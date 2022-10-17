
public class Prg_02_Inheritnace {

	public static void main(String[] args) {
		
//		Parent p1 = new Parent();
//		p1.function1();
		
//		Child c1 = new Child(10);
//		c1.function1();
//		c1.function2();

		Parent p2 = new Child1(20);		// Upcasting
		p2.function1();
//		p2.function2();				NOT OK OBJECT SLICING
		
		Child1 c2 =  (Child1) p2;		// Downcasting
		
		c2.function1();
		c2.function2();
		
	}

}
class Parent1
{
	int num;
	Parent1()
	{
		System.out.println("In Parent class Constructor");
		System.out.println(num);
		
	}
	Parent1(int num)
	{
		this.num = num;
		System.out.println("In Parent class Constructor");
		System.out.println(num);
	}
	
	public void function1()
	{
		System.out.println("Inside Function Method Parent Class");
		
	}
}
class Child1 extends Parent
{
	int num1;
	public Child1(int num1)
	{
//		super(num1);
		this.num1 = num1;
		System.out.println("Inside Child Constructor");
		System.out.println("num1 = "+num1);
	}
	public void function2()
	{
		System.out.println("Inside function2 Method Child class");
	}
}
