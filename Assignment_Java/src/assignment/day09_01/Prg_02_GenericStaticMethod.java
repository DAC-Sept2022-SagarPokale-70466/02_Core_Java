package assignment.day09_01;

public class Prg_02_GenericStaticMethod {

	public static <TYPE> void findMin(TYPE[] arr) {
		TYPE min = null;
		TYPE small = arr[0];
//		if(arr.)
		for(int i = 0; i < arr.length; i++)
		{
//			if(small < arr[i])
			System.out.println(arr[i]);
		}
		
		System.out.println("Min Value is : "+min);
		
	}

	public static void main(String[] args) {

		Integer[] arr = {11,22,33,44,55,66};
		findMin(arr);
	}

}
