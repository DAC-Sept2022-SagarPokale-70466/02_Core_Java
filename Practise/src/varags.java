
public class varags {

	public static void main(String[] args) {
		addition add = new addition();
		System.out.println(add.add(6,7));
		
	}

}
class addition
{
	public int add(int ... n)
	{
		int sum = 0;
		for(int l : n)
		{
			sum = sum + l;
			
		}
		return sum;
	}
}
