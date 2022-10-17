package assignment.day05;

public class Assignmnet_01 {

	public static void main(String[] args) {
		
		Point2D a = new Point2D(4,5);
		System.out.println(a.getDetails());
		
		Point2D b = new Point2D(2,5);
		System.out.println(b.getDetails());
		
		if(Point2D.isEqual(a, b))
		{
			System.out.println("Both Are Same Co-Ordinates");
		}
		else
		{
			System.out.println("Both Are NOT Same Co-Ordinates");
		}
		
		System.out.println(a.calculateDistance(b));
		
		
	}

}

class Point2D
{
	private int x;
	private int y;
	
	Point2D()
	{
		this(0,0);
	}
	Point2D(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public String getDetails()
	{
		return "( X = " +this.x+ ", Y = "+this.y + ") " ;
	}
	
	public static boolean isEqual(Point2D x , Point2D y)
	{
		if((x.x == y.x) && (x.y == y.y))
			return true;
		else
			return false;
	}
	public double calculateDistance(Point2D e)
	{
		int c = this.x - e.x;
		int d = this.y - e.y;
		return Math.sqrt(Math.pow(c, 2) + Math.pow( d , 2));
	}
	
}
