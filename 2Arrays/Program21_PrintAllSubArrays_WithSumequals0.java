import java.io.*;
import java.util.*;
/*
	Program to print all sub arrays with sum 0
*/
class Program21_PrintAllSubArrays_WithSumequals0
{
	public static void PrintAllSunArray(int arr1[],int count)
	{
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		Integer sum=0;
		for(int i=0;i<count;i++)
		{
			sum+=arr1[i];
		if(sum==0)
		{
			printSubArray(arr1,0,i);
		}
		if(hm.get(sum)!=null)
		{
			printSubArray(arr1,hm.get(sum)+1,i);
		}
		else
			hm.put(sum,i);
		}
	}
	public static void printSubArray(int arr1[],int SI,int EI)  //SI-start Index  EI- End Index
	{
		for(int i=SI;i<=EI;i++)
		{
			System.out.print(arr1[i]+" ");
		}
	System.out.println(" ");	
	}
	public static void main(String args[])
	{	
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array count:");
		int count=scan.nextInt();
		System.out.println("Entet the array elements: ");
		int arr1[]=new int[count];
		for(int i=0;i<count;i++)
		{
			arr1[i]=scan.nextInt();
		}
		PrintAllSunArray(arr1,count);
	}
}
/*
OUTPUT:
D:\GitHub\Java\2Arrays>java Program21_PrintAllSubArrays_WithSumequals0
Enter the array count:
10
Entet the array elements:
9 2 -1 -3 4 -2 2 4 6 0
-1 -3 4
2 -1 -3 4 -2
-1 -3 4 -2 2
0

D:\GitHub\Java\2Arrays>java Program21_PrintAllSubArrays_WithSumequals0
Enter the array count:
4
Entet the array elements:
6 3 -3 6
3 -3
*/
