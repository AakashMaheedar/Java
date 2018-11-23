import java.util.*;
import java.io.*;
/*
Java Program to find  the intersection of two sorted arrays
	eg arr1[4]={2,3,5,11} arr[5]={4,5,7,9,11}
	intersection is 5,11
*/
class Program10_Intersection_ofTwoArray
{
	public static void Intersection(int arr1[],int arr2[])
	{
		int i=0,j=0;
		System.out.println("\nThe interstion points : ");
		while(i<arr1.length &&  j<arr2.length)
		{
			if(arr1[i]<arr2[j])
				{i++;}
			else if(arr1[i]>arr2[j])
				{j++;}
			else 
				{System.out.print(arr1[i]+" ");
				i++;
				j++;}
			}
	} 
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the count of first array");
		int count1=scan.nextInt();
		int arr1[]=new int[count1];
		for(int i=0;i<count1;i++)
		{
			arr1[i]=(int)(Math.random()*50);
		}
		System.out.println("Displaying the content of array1: ");
		for(int i=0;i<count1;i++)
		{
			System.out.print(arr1[i]+"  ");
		}
		
		System.out.println("\nEnter the count of second array");
		int count2=scan.nextInt();
		int arr2[]=new int[count2];
		for(int i=0;i<count2;i++)
		{
			arr2[i]=(int)(Math.random()*50);
		}
		System.out.println("Displaying the content of array2: ");
		for(int i=0;i<count2;i++)
		{
			System.out.print(arr2[i]+" ");
		}
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		Intersection(arr1,arr2);
	}
}
/*
output
D:\GitHub\Java\2Arrays>java Program10_Intersection_ofTwoArray
Enter the count of first array
20
Displaying the content of array1:
2  42  4  17  34  13  25  17  31  0  41  10  23  25  18  7  19  48  45  12
Enter the count of second array
10
Displaying the content of array2:
28 0 31 47 3 0 23 41 7 13
The interstion points :
0 7 13 23 31 41
*/