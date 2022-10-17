import java.util.Scanner;

public class Array_Ragged {

	public static void main(String[] args) {
		int arr[][] = new int[2][];
		arr[0] = new int [3];
		arr[1] = new int [2];
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter Your values for 2D array");
		System.out.println();
		
		for(int row = 0; row < arr.length; row++)
		{
			System.out.println("Enter the values for Row : "+row);
			for(int col = 0; col < arr[row].length; col++)
			{
				arr[row][col] = sc.nextInt();
				System.out.println();
			}
		}
		System.out.println("\n");
		System.out.println("Your values are :");
			
		for(int row = 0; row < arr.length; row++)
		{
			System.out.println("Row : "+row);
			for(int col = 0; col < arr[row].length; col++)
			{
				System.out.println("Your Column Values  : "+col);
				System.out.println(arr[row][col]);
			}
		}
		sc.close();
	}
	
}
