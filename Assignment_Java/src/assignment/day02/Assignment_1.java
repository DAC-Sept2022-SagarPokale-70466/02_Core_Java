package assignment.day02;
public class Assignment_1 {
		public static void main(String[] arr)
		{
			int lower = Integer.parseInt(arr[0]);
			int higher = Integer.parseInt(arr[1]);
			System.out.println(lower);
			for(int i = lower; i <= higher; i++)
			{
				if(find_prime(i))
				{
					System.out.println(i);				
				}
			}
			System.out.println();
			System.out.println(higher);
			}
			static boolean find_prime(int n)
			{
				if( n < 2 )
		  		{
					return false;
				}
				for(int i = 2; i < n; i++)
				{
					if(n % i == 0)
					{
						return false;
					}	
				}
				return true;
			}
		}
