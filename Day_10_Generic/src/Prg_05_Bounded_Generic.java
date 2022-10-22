
public class Prg_05_Bounded_Generic {

	public static void main(String[] args) {

		Box1<Integer> i1 = new Box1();		// Ok because Integer is subclass of Number
		i1.setObj(523);
		Integer i = i1.getObj();
		System.out.println(i);
		
//		Box1<String> i2 = new Box1();		// Error
		
		
	}
}	

			// Extends = Upper Bond
class Box1<TYPE extends Number>{
	TYPE o;
	
	public void setObj(TYPE o) {
		this.o = o;
	}
	public TYPE getObj() {
		return this.o;
	}
}

