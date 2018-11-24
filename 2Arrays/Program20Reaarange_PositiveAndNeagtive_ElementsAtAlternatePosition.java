import java.io.*;
import java.util.*;
/*
	Rearranging an array such that positive and negative elements are at alternate positions.
*/
class Program20Reaarange_PositiveAndNeagtive_ElementsAtAlternatePosition
{
	public static int[] RearrangeArray(int arr[],int count)
	{
		int pivot=0,i=-1,temp=0;
		for(int j=0;j<count;j++)
		{
		/*using Quick sort paritioning method to seperate negative elements towards left and positive towards right.*/
			if(arr[j]<pivot)     
			{
				i++;
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		}
		/*till index i all elements are negative while from index i to count-1 all are positive*/
		temp=0;
		int Pi=i+1; //positiveIndex
		int Ni=0;//NegativeIndex
		while(Pi<count&&Ni<Pi&&arr[Ni]<0)
		{
			temp=arr[Ni];
			arr[Ni]=arr[Pi];
			arr[Pi]=temp;		
			Pi++;
			Ni+=2;
		}		

			
	return arr;
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array element count : ");
		int count=scan.nextInt();
		int arr[]=new int[count];
		System.out.println("Enter array inputs:");
		for(int i=0;i<count;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Array before rearrangement is: ");
		for(int i=0;i<count;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
		arr=RearrangeArray(arr,count);
		System.out.println("Array after rearrangement is: ");
		for(int i=0;i<count;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
	}
}
/*
OUTPUT:
Enter the array element count :
5
Enter array inputs:
1 2 3 -1 -3
Array before rearrangement is:
1 2 3 -1 -3
Array after rearrangement is:
3 -3 1 -1 2
*/
