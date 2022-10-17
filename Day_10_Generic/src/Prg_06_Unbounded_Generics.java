import java.util.Date;

public class Prg_06_Unbounded_Generics {

//	public static void print(Box2<?> b)
//	public static void print(Box2<? extends Number> b)		Upper Bond 
	public static void print(Box2<? super Integer> b)		// Lower Bond
	{
		Object obj = b.getBox();
		System.out.println("Box Contains : "+obj);
	}
	
	public static void main(String[] args) {

		Box2<Integer> i = new Box2<>(123);
		print(i);
		
		Box2<String>	s =new Box2<>("Dac");
//		print(s);				// For Extend Number it will show error
		
	}
}
class Box2<PlaceHolder> {
	PlaceHolder obj;

	public Box2(PlaceHolder obj) {
		 this.obj = obj;
		 }

	public void setBox(PlaceHolder obj)
	{
		this.obj = obj;
	}
	public Object getBox()
	{
		return  this.obj;
	}
}

