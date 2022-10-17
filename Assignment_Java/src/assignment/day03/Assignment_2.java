package assignment.day03;

class Complex
{
	int real;
	int img;
	
	void init(int real, int img)
	{
		this.real = real;
		this.img = img;
	}
	void print()
	{
		System.out.println("REAL = "+this.real+" IMAGINARY = "+this.img);
	}
}

public class Assignment_2 {

	public static void main(String[] arr) {
	
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		
		Complex c1 = new Complex();
		c1.init(a, b);
		c1.print();

	}

}
