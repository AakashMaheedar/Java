import java.io.*;
import java.util.*;
/*
	Smallest number that cannot be formed from sum of numbers from array
*/
class Program19_SmallestNumber_thatCantBegeneratedbySumOfSubArray
{
	public static int SmallestNumberCantBeSummed(int arr[])
	{
		int small=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>small)
				return small;
			else
				small=small+arr[i];
		}
	return small;
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the count of array element");
		int count=scan.nextInt();
		int arr[]=new int[count];
		System.out.println("Enter array elements...");
		for(int i=0;i<count;i++)
		{
			arr[i]=scan.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(SmallestNumberCantBeSummed(arr));
	}
}
/*OUTPUT
D:\GitHub\Java\2Arrays>java Program19_SmallestNumber_thatCantBegeneratedbySumOfSubArray
Enter the count of array element
6
Enter array elements...
1 3 6 10 11 15
2

D:\GitHub\Java\2Arrays>java Program19_SmallestNumber_thatCantBegeneratedbySumOfSubArray
Enter the count of array element
4
Enter array elements...
1 1 1 1
5

D:\GitHub\Java\2Arrays>java Program19_SmallestNumber_thatCantBegeneratedbySumOfSubArray
Enter the count of array element
6
Enter array elements...
1 2 5 10 20 40
4


*/