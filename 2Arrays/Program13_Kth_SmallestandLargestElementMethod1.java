import java.io.*;
import java.util.*;
/*
	Find the Kth smallest number.
	method1->Sort the elements and 1st smallest element is at k-1 index.
*/
class Program13_Kth_SmallestandLargestElementMethod1
{
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
	Arrays.sort(num);
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
Enter the array count
5
Enter the array elements
1
4
7
3
5
Enter ur choice:(s:smallest)and(l:largest)
s
Enter the k value :
2
The 2 th smallest element in the array is :3

D:\GitHub\Java\2Arrays>java Program13_Kth_SmallestandLargestElementMethod1
Enter the array count
5
Enter the array elements
1
4
7
3
5
Enter ur choice:(s:smallest)and(l:largest)
l
Enter the k value :
2
The 2 th largest element in the array is :5


*/