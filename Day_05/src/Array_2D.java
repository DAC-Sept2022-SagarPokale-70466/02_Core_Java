import java.util.Scanner;

public class Array_2D {

	public static void main(String[] args) {
		int [][] arr = new int[3][];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your values for 2D array");
		for(int row = 0; row < arr.length; row++)
		{
			System.out.println("Enter the values for Row : "+row);
			for(int col = 0; col < arr[row].length; col++)
			{
				System.out.println("Your Column Values for  : "+col);
				arr[row][col] = sc.nextInt();
			}
		}
		System.out.println("\n");
		System.out.println("Your values are :");
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j<arr[i].length; j++)
			{
				System.out.println(arr[i][j]);
			}
		}
	}

}
