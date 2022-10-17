
public class Prg_01_Basic {

	public static void main(String[] args) {

		Container c1 = new Container();
		c1.set("Holla");
		c1.set(155);										
		c1.set(new Integer(15));					// Up-Casting is Done Here 
//		c1.set(new String("Sagar"));
		
//		String s = (String) c1.get();					// ClassCastException
		Integer i = (Integer) c1.get();			// Down-Casting Is Done here 
		System.out.println(c1.get());
	}

}
class Container
{
	Object obj;					// Here in Object reference You can store all types of data
	
	public void set(Object obj)
	{
		this.obj = obj;
	}
	public Object get()
	{
		return this.obj;
	}
}