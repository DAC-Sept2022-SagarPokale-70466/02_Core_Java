class complex
{
	int real;		//fields
	int img;
	
	void inint()
	{
		real = 10;
		img = 20;
	}
	void print()
	{
		System.out.println("IN the complex class where real = "+real+" and imginary = "+img);
	}
}
public class Practise_1 {

	public static void main(String[] args) {
		complex c1 = new complex();
		complex c2 = new complex();
		
		c1.print();
		
		c2.inint();
		c2.print();
		
		
	}

}
