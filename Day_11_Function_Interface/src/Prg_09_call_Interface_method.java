interface printable
{
	default public void show()
	{
		System.out.println("Inside Printable");
	}
}
interface showable
{
	default public void show()
	{
		System.out.println("Inside Showable");
	}
}
class small implements printable, showable{
	@Override			// Override method from printable and showable			
	public void show() {
		System.out.println("Inside the small class");
		printable.super.show();				//  we can call interface default method 
		showable.super.show();
	}
	
}
public class Prg_09_call_Interface_method {

	public static void main(String[] args) {
		
		small s = new small();
		s.show();
		
	}

}
