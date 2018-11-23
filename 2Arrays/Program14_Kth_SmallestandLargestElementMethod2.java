import java.io.*;
import java.util.*;
/*
	Find the Kth smallest number.
	method2->QuickSort the elements and 1st smallest element is at k-1 index.
		->complexity is o(n)
*/
class Program14_Kth_SmallestandLargestElementMethod2
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
	
	
	public static String KthSmallest(int num[],int k)
	{
		
		if(k<=num.length)
		{
		int val=num[k-1];
		return "The "+k+" th smallest element in the array is :"+val;	
		}
	return "entered K value exceeds array limit";
	}
	public static String KthLargest(int num[],int k)
	{
		
		if(k<=num.length)
		{
		int val=num[num.length-k];
		return "The "+k+" th largest element in the array is :"+val;	
		}
	return "entered K value exceeds array limit";
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array count");
		int count=scan.nextInt();
		int num[]=new int[count];
		System.out.println("Enter the array elements");
		for(int i=0;i<count;i++)
		{
			num[i]=scan.nextInt();
		}	
	num=Quick_Sort(num,0,num.length-1);
	System.out.println("Enter ur choice:(s:smallest)and(l:largest)");
	char c=scan.next().charAt(0);
	if(c=='s')
	{
		System.out.println("Enter the k value : ");
		int k=scan.nextInt();
		System.out.println(KthSmallest(num,k));
	}
	if(c=='l')
	{
		System.out.println("Enter the k value : ");
		int k=scan.nextInt();
		System.out.println(KthLargest(num,k));
	}
	}
}
/*
OUTPUT:
D:\GitHub\Java\2Arrays>java Program14_Kth_SmallestandLargestElementMethod2
Enter the array count
5
Enter the array elements
11
55
66
33
99
Enter ur choice:(s:smallest)and(l:largest)
l
Enter the k value :
2
The 2 th largest element in the array is :66

*/