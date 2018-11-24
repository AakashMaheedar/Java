import java.io.*;
import java.util.*;
/*
	Maximum Subarray  using divide and conquer.
*/
class Program25_maximumSubArray
{
	public static int MaxMidCrossingSubArray(int arr1[],int low,int m,int high)
	{
		int sum=0;
		int leftsum=Integer.MIN_VALUE;
		for(int i=m;i>=low;i--)
		{
			sum=sum+arr1[i];
			if(sum>leftsum)
				leftsum=sum;
		}
		sum=0;
		int rightsum=Integer.MIN_VALUE;
		for(int i=m+1;i<=high;i++)
		{
			sum=sum+arr1[i];
			if(sum>rightsum)
				rightsum=sum;
		}
	return leftsum+rightsum;
	}
	public static int MaximumSubArray(int arr1[],int low,int high)
	{
		int m;
		if(low==high)
			return arr1[low];
		
		 m=(low+high)/2;
		return Math.max(Math.max(MaximumSubArray(arr1,low,m),MaximumSubArray(arr1,m+1,high)),MaxMidCrossingSubArray(arr1,low,m,high));
	}
	public static void main(String args[])
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the array count : ");
	int count1=scan.nextInt();
	System.out.println("Enter the arra entries..");
	int arr1[]=new int[count1];
	for(int i=0;i<count1;i++)
	{
		arr1[i]=scan.nextInt();	
	}
	System.out.println("The array elements..");
	for(int i=0;i<count1;i++)
	{
		System.out.print(arr1[i]+" " );	
	}
	System.out.println(" ");
	int max=MaximumSubArray(arr1,0,count1-1);
	System.out.println("Maximum sum is : "+max);
	}
}
/*
OUTPUT:
:\GitHub\Java\2Arrays>javac Program25_maximumSubArray.java

D:\GitHub\Java\2Arrays>java Program25_maximumSubArray
Enter the array count :
5
Enter the arra entries..
2 3 4 5 7
The array elements..
2 3 4 5 7
Maximum sum is : 21

D:\GitHub\Java\2Arrays>java Program25_maximumSubArray
Enter the array count :
7
Enter the arra entries..
2 -4 1 9 -6 7 -3
The array elements..
2 -4 1 9 -6 7 -3
Maximum sum is : 11
*/