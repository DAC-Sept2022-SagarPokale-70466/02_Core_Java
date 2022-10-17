import lombok.Data;

public class Lombak_E_G {

	public static void main(String[] args) {

			Something_new sm = new Something_new();
			System.out.println(sm.getClass());

			sm.getNum();
			sm.getHeight();
			sm.getWeight();
			
			sm.setName("Sagar");
			System.out.println(sm.getName());
	} 

}

@Data
class Something_new
{
	private int num;
	private String name;
	private double weight;
	private float height;
	
}