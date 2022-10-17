
public class Array_01 {

	public static void main(String[] args) {
	
			int arr[] = new int [5];
			
			int arr2[] = new int[] {10,20,300};
			
			int arr3[] = {10, 20, 30, 40, 50, 60 ,70 ,80 ,90, 100};
			
//			for(int i = 0; i < arr3.length; i++)
//			{
//				System.out.println(arr3[i]);
//			}
			
			for(int values : arr3)
			{
				System.out.println(values);
			}

	}

}