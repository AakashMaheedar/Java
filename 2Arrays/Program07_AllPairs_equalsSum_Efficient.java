import java.io.*;
import java.util.*;
/*
	efficient method to find the pairs of array equating the sum
*/
class Program07_AllPairs_equalsSum_Efficient
{
	public static void PrintPair(int rand[],int Rsum)
	{
		if(rand.length<2)
		return;
		Arrays.sort(rand);
		int left=0;
		int right=rand.length-1;
		while(left<right)
		{
			int sum=rand[left]+rand[right];
			if(sum==Rsum)	
			{
				System.out.printf("%d:%d%n",rand[left],rand[right]);
				left++;
				right--;
			}
			else if(sum<Rsum)
			{
			left=left+1;	
			}
			else if(sum>Rsum)
			{
			right=right-1;
			}
	
		}	
	}
	public static void main(String args[])
	{
	 Scanner scan=new Scanner(System.in);
	System.out.println("Enter the sum : ");
	int sum=scan.nextInt();
	System.out.println("Enter the array count");
	int count=scan.nextInt();
	int num[]=new int[count];
	for(int i=0;i<count;i++)
	{
		num[i]=(int)(Math.random()*10);
	}
	System.out.println("The generating random number :");
	for(int i=0;i<count;i++)
	{
		System.out.print(num[i]+" ");
	}
	System.out.println();
	PrintPair(num,sum);
	}
}
/*
D:\GitHub\Java\2Arrays>javac Program07_AllPairs_equalsSum_Efficient.java

D:\GitHub\Java\2Arrays>java Program07_AllPairs_equalsSum_Efficient
Enter the sum :
10
Enter the array count
20
The generating random number :
3 2 8 6 8 0 8 7 0 4 0 9 5 3 5 9 1 5 1 2
1:9
1:9
2:8
2:8
3:7
4:6
5:5
*/
