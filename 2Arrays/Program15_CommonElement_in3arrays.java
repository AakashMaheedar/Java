import java.io.*;
import java.util.*;
/*
	common element in 3 arrays
*/
class Program15_CommonElement_in3arrays
{
	public static void CommonElement_in3Array(int arr1[],int arr2[],int arr3[])
	{
		System.out.println("The point of intersection");
		int i,j,k;
		i=j=k=0;
		while(i<arr1.length&&j<arr2.length&&k<arr3.length)
		{
			if(arr1[i]==arr2[j]&&arr2[j]==arr3[k])
			{
				System.out.print(arr1[i]+" ");
				i++;
				j++;
				k++;
			}
			else if(arr1[i]<arr2[j])
			{
				i++;
			}
			else if(arr2[j]<arr3[k])
			{
				j++;
			}
			else
				k++;
		}
		
	}

	public static void main(String args[])
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the count of 1st array");
	int count1=scan.nextInt();
	int arr1[]=new int[count1];
	System.out.println("Enter the count of 2nd array");
	int count2=scan.nextInt();
	int arr2[]=new int[count2];
	System.out.println("Enter the count of 3rd array");
	int count3=scan.nextInt();
	int arr3[]=new int[count3];
	System.out.println("Array elements are randomnly generated...");
	for(int i=0;i<count1;i++)
	{
		arr1[i]=(int)(Math.random()*50);
		System.out.print(arr1[i]+" ");
	}
	System.out.println("");
	for(int i=0;i<count2;i++)
	{
		arr2[i]=(int)(Math.random()*50);
			System.out.print(arr2[i]+" ");
	}System.out.println("");
	for(int i=0;i<count3;i++)
	{
		arr3[i]=(int)(Math.random()*50);
			System.out.print(arr3[i]+" ");
	}System.out.println("");
	Arrays.sort(arr1);Arrays.sort(arr2);Arrays.sort(arr3);
	CommonElement_in3Array(arr1,arr2,arr3);
	}
}
/*
OUTPUT:
D:\GitHub\Java\2Arrays>java Program15_CommonElement_in3arrays
Enter the count of 1st array
15
Enter the count of 2nd array
18
Enter the count of 3rd array
20
Array elements are randomnly generated...
27 33 35 37 3 40 7 37 47 34 9 17 4 33 27
24 41 13 9 31 9 23 36 1 12 47 19 31 32 30 21 4 35
28 37 31 29 23 4 26 10 22 40 34 21 47 8 48 15 15 49 33 44
The point of intersection
4 47
*/