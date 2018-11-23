import java.util.*;
import java.io.*;
/*
Java Program to find  the intersection of two sorted arrays
	eg arr1[4]={2,3,5,11} arr[5]={4,5,7,9,11}
	intersection is 5,11
*/
class Program11_Union_ofTwoArray
{
	public static void Union(int arr1[],int arr2[])
	{
		int i=0,j=0;
		System.out.println("\nThe union points : ");
		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i]<arr2[j])
				{
				System.out.print(arr1[i]+" ");
				i++;
				}
			else if(arr1[i]>arr2[j])
				{
				System.out.print(arr2[j]+" ");
				j++;
				}
			else
				{
					System.out.print(arr1[i]+" ");
					i++;
					j++;
				}
		}
		if(i<arr1.length)
		{
			while(i<arr1.length)
				{System.out.print(arr1[i]+" ");
			i++;}
		}
		if(j<arr2.length)
		{
			while(j<arr2.length)
				{System.out.print(arr2[j]+" ");
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
		Union(arr1,arr2);
	}
}
/*
output
D:\GitHub\Java\2Arrays>java Program11_Union_ofTwoArray
Enter the count of first array
4
Displaying the content of array1:
7  13  10  23
Enter the count of second array
6
Displaying the content of array2:
6 33 25 23 37 31
The union points :
6 7 10 13 23 25 31 33 37

*/