
public class Prg_01_Exception {

	public static void main(String[] args) {

		try {
			long[] num = new long [999999999];
		} 
		catch(OutOfMemoryError e)
		{
			System.out.println("Your are in the catch and you have error");
		}finally {
			System.out.println("your are in the final block");
		}

	}

}
