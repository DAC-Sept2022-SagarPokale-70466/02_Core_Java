package constructor;


class complex 
{
	int real;
	int img;
	
	complex()
	{
		this(5, 10);			// Constructor chaining 
//		this.real = 1;
//		this.img = 2;
	}
	complex(int real, int img)
	{
		this.real = real;
		this.img = img;
	}
	void print()
	{
		System.out.println("Addition is = "+(this.real + this.img));
	}
}
public class Practise_1 {

	public static void main(String[] args) {
		
		complex c1 = new complex();
		complex c2 = new complex(10, 20);
		
		c1.print();
		c2.print();
		

	}

}
