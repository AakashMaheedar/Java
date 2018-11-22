import java.io.*;
import java.util.*;
/*
	JAVA program to remove duplicate elements from array
		->removing involves in  deleting elements from array requires us to create a new array and shift elements.
		->hence replace its occurence by 0 or null or default value.
*/
class Program02_Remove_Duplicates_fromArray
{
	public static int[] RemoveDup(int num[])
	{
		//sort the elemnts first..
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{	
				if(num[i]>num[j])
				{
					int temp=num[j];
					num[j]=num[i];
					num[i]=temp;
				}
			}
		}
		//elements sorted
		num=num;
		//replace repeated elements by default value.
		int prev=num[0];
		int result[]=new int[num.length];
		result[0]=prev;
		for(int i=1;i<num.length;i++)
		{
			int check=num[i];
			if(prev!=check)
				{
					result[i]=check;
				}
			prev=check;
		}
	return result;
	
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter  a count of array elemnts : ");
		int count=scan.nextInt();
		System.out.println("Enter the array elements ");
		int arr[]=new int[count];
		for(int i=0;i<count;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("The array after removing duplicates : "+ Arrays.toString(RemoveDup(arr)));
		
	}
}
/*Output
D:\GitHub\Java\2Arrays>java Program02_Remove_Duplicates_fromArray
Enter  a count of array elemnts :
10
Enter the array elements
1
2
3
4
5
6
7
5
6
7
The array after removing duplicates : [1, 2, 3, 4, 5, 0, 6, 0, 7, 0]

*/