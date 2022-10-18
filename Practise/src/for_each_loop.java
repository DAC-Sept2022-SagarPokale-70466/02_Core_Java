
public class for_each_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = {1,2,3,4,5,6};
//		for(int k : arr)
//		{
//			System.out.println(k);
//		}
		int arr[][] = {
					   {1,2,3,4},
						{5,6,7,8},
						 {9,10,11,12}
						};
		for(int a[] : arr)
		{
			for(int l : a)
			{
				System.out.println(l);
			}	
		}
	}

}
