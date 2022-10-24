package Sorting;

import java.util.Arrays;

public class Alternate_sorting {

	static void alternateSort(int arr[], int n)
	{
		Arrays.sort(arr);
		
		int i = 0, j = n - 1;
		while (i < j)
		{
			System.out.print(arr[j--] + " ");
			System.out.print(arr[i++] + " ");
		}
		if(n % 2 != 0)
		{
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		
		int arr[] = {110,16,55,80,57,88,46,77,44};
		int n = arr.length;
		alternateSort(arr, n);

	}

	

}
