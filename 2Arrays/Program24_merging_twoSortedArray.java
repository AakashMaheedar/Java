import java.io.*;
import java.util.*;
/*
	program to merge two sorted arrays.
*/
class Program24_merging_twoSortedArray
{
	public static void MergingTwoArrays(int arr1[],int arr2[],int arr3[])
	{
		int n=arr1.length;
		int m=arr2.length;
		int i,j,k;
		i=j=k=0;
		while(i<n&&j<m)
		{
			if(arr1[i]<arr2[j])
			{
			arr3[k++]=arr1[i++];
			}
			else
			arr3[k++]=arr2[j++];
		}
		while(i<n)
		{
			arr3[k++]=arr1[i++];
		}
		while(j<m)
		{
			arr3[k++]=arr2[j++];
		}
	}
	public static void main(String args[])
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the count of 1st array :   ");
	int count1=scan.nextInt();
	int arr1[]=new int[count1];
	System.out.println("Generating array elements randomly : ");
	for(int i=0;i<count1;i++)
	{
		arr1[i]=(int)(Math.random()*15);
		
	}System.out.println(" ");
	Arrays.sort(arr1);
	for(int i=0;i<count1;i++)
	{
		System.out.print(arr1[i]+" ");
	}
	System.out.println(" ");
	System.out.println("Enter the count of 2nd array :   ");
	int count2=scan.nextInt();
	int arr2[]=new int[count2];
	System.out.println("Generating array elements randomly : ");
	for(int i=0;i<count2;i++)
	{
		arr2[i]=(int)(Math.random()*15);
		
	}
	System.out.println(" ");
	Arrays.sort(arr2);
	for(int i=0;i<count2;i++)
	{
		System.out.print(arr2[i]+" ");
	}
	
	System.out.println(" ");
	int count3=count1+count2;
	int[] arr3=new int[count3];
	MergingTwoArrays(arr1,arr2,arr3);
	System.out.println(" Elements after merging....");
	for(int i=0;i<count3;i++)
	{
		System.out.print(arr3[i]+" ");
	}
	
	}
}
/*
OUTPUT:
D:\GitHub\Java\2Arrays>java Program24_merging_twoSortedArray
Enter the count of 1st array :
5
Generating array elements randomly :

4 7 10 11 11
Enter the count of 2nd array :
5
Generating array elements randomly :

0 4 5 6 11
 Elements after merging....
0 4 4 5 6 7 10 11 11 11
D:\GitHub\Java\2Arrays>java Program24_merging_twoSortedArray
Enter the count of 1st array :
4
Generating array elements randomly :

3 3 6 12
Enter the count of 2nd array :
2
Generating array elements randomly :

2 2
 Elements after merging....
2 2 3 3 6 12
*/
