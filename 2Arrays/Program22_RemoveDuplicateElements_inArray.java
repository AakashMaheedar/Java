import java.io.*;
import java.util.*;
/*
	remove duplicate elements in the array
	
*/
class Program22_RemoveDuplicateElements_inArray
{
	public static int RemoveDuplicates(int arr[],int count)
	{
		int i,j=0;
		for(i=0;i<count-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				arr[j]=arr[i];
				j++;
			}
		}
	arr[j++]=arr[count-1];
	return j;
	}
	public static void main(String args[])
	{
	Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array count:");
		int count=scan.nextInt();
		System.out.println("Enter the array elements: ");
		int arr[]=new int[count];
		for(int i=0;i<count;i++)
		{
			arr[i]=scan.nextInt();
		}
	int n=RemoveDuplicates(arr,count);
	for(int i=0;i<n;i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println(" ");
	}
}
/*OUTPUT:
D:\GitHub\Java\2Arrays>javac Program22_RemoveDuplicateElements_inArray.java

D:\GitHub\Java\2Arrays>java Program22_RemoveDuplicateElements_inArray
Enter the array count:
5
Enter the array elements:
1 1 2 2 3
1 2 3

D:\GitHub\Java\2Arrays>java Program22_RemoveDuplicateElements_inArray
Enter the array count:
10
Enter the array elements:
1 1 1 1 1 2 2 2 2 2
1 2
*/