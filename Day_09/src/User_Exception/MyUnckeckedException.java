package User_Exception;
 
@SuppressWarnings("serial")
public class MyUnckeckedException extends RuntimeException { // By Extending this we can create user defined Exception
																// // class

	public MyUnckeckedException() {
		System.out.println("Error Defined By User Exception class");
	}

	public MyUnckeckedException(String message) {
		super(message);
	}

	public void printUserDefinedStackTrace()
	{
		System.out.println("You have a big Error in this code");
		System.out.println("Message : "+this.getMessage());		//getMessage From Message we you declare a new throw
	}
	

}
