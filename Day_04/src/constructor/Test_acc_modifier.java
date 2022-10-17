package constructor;
import com.sunbeam.*;
public class Test_acc_modifier {
	
	void testVisibility() {
		Testing_2 c1 = new Testing_2();
		//System.out.println(c1.num1);
		//System.out.println(c1.num2);
		System.out.println(c1.num3);				// Only this is available and other NOT available 
		//System.out.println(c1.num4);

}
}
