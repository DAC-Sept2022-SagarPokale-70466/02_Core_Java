/**
*	@Author : Sagar_Pokale
*	@Date		 : 19-Oct-2022 2:31:33 PM
*/

package P_01_Annotation;

import java.util.ArrayList;
import java.util.List;

public class Prg_01_Annotation {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		BusinessLogic b = new BusinessLogic();
		b.oldMethod(); // The method oldMethod() from the type BusinessLogic is deprecated
		b.newMethod();

		List list = new ArrayList<Integer>(); // raise warning of rawtypes -- supressed using @SuppressWarnings
	}
}

class BusinessLogic {
	private int field;

	@Deprecated
	public void oldMethod() {
		System.out.println("Old Method");
	}

	public void newMethod() {
		System.out.println("New Method");
	}
}