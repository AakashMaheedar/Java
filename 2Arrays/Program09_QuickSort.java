import java.io.*;
import java.util.*;
/*
Quick sort most efficient algorithm in case of time and space(inplace)
	=>Arrays.sort()-interally uses quick sort to sort primitive data type
		         -merge sort for objects.
*/
class Program09_QuickSort
{
	public static int Partition_alogrithm(int num[],int low,int high)
	{	
		int i=(low-1),j;
		int pivot=num[high];
		for( j=low;j<high;j++)
		{
			if(num[j]<=pivot)
			{
				i++;
				int temp=num[i];
				num[i]=num[j];
				num[j]=temp;
			}
			else
			{
				//no action
			}
		}
	
		int temp=num[i+1];
		num[i+1]=num[j];
		num[j]=temp;
	return i+1;
	}
	public static int[] Quick_Sort(int num[],int low,int high)
	{
		if(low>high)
		{
			return null;
		}
		int m=Partition_alogrithm(num,low,high);
		Quick_Sort(num,low,m-1);
		Quick_Sort(num,m+1,high);		
	return num;
	}
	public static void main(String args[])
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the count of element :");
	int count=scan.nextInt();
	int number[]=new int[count];
	//Numbers are generated randomly
	for(int i=0;i<count;i++)
	{
		number[i]=(int)(Math.random()*50);	
	}
	System.out.println("The randomly generated elements are : ");
	for(int i=0;i<count;i++)
	{
		System.out.print(number[i]+" ");
			
	}
		System.out.println(" ");
	
	
	number=Quick_Sort(number,0,count-1);
	System.out.println("Elements after Quick sort ");
	for(int i=0;i<count;i++)
	{
		System.out.print(number[i]+" ");
	}
	}
}