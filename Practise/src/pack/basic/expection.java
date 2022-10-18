package pack.basic;

public class expection {

	public static void main(String[] args) 
	{
		try {		
			int i = 9/4;
		}
		catch(Exception e)		// General exception
		{
			System.out.println("Error");
		}
		finally		// This will definately execute		Exception or not (Should be at the last) 
		{
			System.out.println("Have a nice day");
		}
		
		
	}

}
