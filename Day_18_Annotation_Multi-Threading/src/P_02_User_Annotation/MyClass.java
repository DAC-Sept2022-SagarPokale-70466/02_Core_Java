/**
*	@Author : Sagar_Pokale
*	@Date		 : 19-Oct-2022 2:58:27 PM
*/

package P_02_User_Annotation;

@Readme(Developer = "Sagar")
public class MyClass {
	//@Readme(developer = "...") // ERROR: The annotation @Readme is disallowed for this location
	
	@Importance(value=5)
	private int myField;
	
	@Readme(Developer = "Sagar", Company = "Sunbeam")
	public MyClass() {
		//@Readme(developer = "...") // ERROR: The annotation @Readme is disallowed for this location
				String myVar = "";
	}
	
	@Importance // default value=0
	@Readme(Developer = "Rahul", Company = "Sunbeam, Karad")
	public void myMethod() {
		System.out.println("MyClass.myMethod() called.");
	}
}
