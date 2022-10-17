
public class Prg_03_Generic {

	public static void main(String[] args) {

		Box<Integer> bx = new Box<>();
		bx.setBox(new Integer(555));
//		bx.setBox("Hello");						// Compile Time Error
//		Integer i = (Integer)bx.getBox();
//		System.out.println(i);
		
		Box<Double> bx1 = new Box<>();
		bx1.setBox(new Double(54.456));
//		Integer d = Integer.parseInt(bx1.getBox());			// RunTime Error
		Double d = (Double) bx1.getBox();
//		System.out.println(d);

		Box<String> b1 = new Box<>();
			
		
		Box b2 = new Box();				// Row Type it will store all type of data
		b2.setBox(new String("Sagar"));
		String s = (String)b2.getBox();		// Programmer should do appropriate casting other wise ClassCastException
		System.out.println(s);
		
	}
}

class Box<PlaceHolder> {
	PlaceHolder obj;

	public void setBox(PlaceHolder obj)
	{
		this.obj = obj;
	}
	public Object getBox()
	{
		return  this.obj;
	}
}
