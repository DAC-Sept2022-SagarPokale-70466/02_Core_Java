// Type of interface
// 1. Normal interface 	(More than 1 interface method)
// 2. Single abstract method - Functional interface - Lambda expression (Only one interface method)	 	@function 
// 3. Marker interface

interface abc1
{
	void hello();
	
}
public class Type_of_interface {

	public static void main(String[] args) {
		
		abc1 obj = () -> System.out.println("HELLO Im Sagar Pokale");		// Lambda Expression
							// Implemetation for hello					(Only for function interface)
		obj.hello();
	}

}
