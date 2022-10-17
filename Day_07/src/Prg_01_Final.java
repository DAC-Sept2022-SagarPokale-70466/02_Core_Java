
public class Prg_01_Final {

	public static void main(String[] args) {

		final int num = 10;
		
	}

}

// final class Complex 
class Complex
{
//	final int real = 10;
	int real = 10;
	int img;
	
	public Complex()
	{
		//	this.real = 20;					You cannot initialize here because this is final	
	}
//	final public  Complex(int real, int img)
	Complex(int real, int img)
	{
		this.real = real;
		this.img = img;
	}
	
}
