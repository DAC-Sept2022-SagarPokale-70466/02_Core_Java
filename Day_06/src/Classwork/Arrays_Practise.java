		package Classwork;

import java.util.Arrays;

public class Arrays_Practise {
		
			public static void main(String[] args) {
				
					int[] arr = {50, 40, 10, 80, 40, 70, 20, 60 };
					
//					System.out.println("Before Sorting");
//					
//					for(int a : arr)
//					{
//						System.out.println(a);
//					}
//					
//					System.out.println("After Sorting");
//					
//					Arrays.sort(arr);
//					
//					for(int i : arr)
//					{
//						System.out.println(i);
//					}x
					
					System.out.println("Before Sorting");
					 
					System.out.println(Arrays.toString(arr));
					
					Arrays.parallelSort(arr);
					
					System.out.println(Arrays.hashCode(arr));
					
					System.out.println(Arrays.toString(arr));
		
			}
		
		}
