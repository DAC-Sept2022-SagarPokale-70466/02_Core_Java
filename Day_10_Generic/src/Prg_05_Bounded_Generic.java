
public class Prg_05_Bounded_Generic {

	public static void main(String[] args) {

		Box1<Integer> i1 = new Box1();		// Ok because Integer is subclass of Number
		i1.setObj(523);
		Integer i = i1.getObj();
//		System.out.println(i);
		
		//Box1<String> i2 = new Box1();		// Error
		
		
	}
	

}

class Box1<TYPE extends Number> {		// TYPE should be subclass of Number
	TYPE obj;

	public void setObj(TYPE obj) {
		this.obj = obj;
	}

	public TYPE getObj() {
		return this.obj;
	}
}