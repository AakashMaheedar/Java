import java.io.*;
import java.util.*;
/*
To find all pairs in array of Integers Whose sum is Equal to a Given Number
[2,6,3,9,11] if sum=9 thn [6,3]
 */
class Program05_AllPairs_EqualstoSum
{
	public static void PrintPairs(int num[],int sum)
	{
		System.out.println("array list is :");
		for(int i=0;i<num.length;i++)
		{
			System.out.print(num[i]+" ");
		}
		System.out.println("\n The sum is"+sum);
		for(int i=0;i<num.length;i++)
		{
			int first=num[i];
			for(int j=1;j<num.length;j++)
			{
			int second=num[j];
			if((first+second)==sum)
				{
				System.out.println("The pair is :"+"["+first+","+second+"]");
				}
			}
		}
		
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the count");
		int count=scan.nextInt();
		System.out.println("Enter the number list");
		int number[]=new int[count];
		for(int i=0;i<number.length;i++)
		{
			number[i]=scan.nextInt();	
		}
		System.out.println("Enter the sum");
		int sum=scan.nextInt();
		 PrintPairs(number,sum);
		
	}
}
/*
OUTPUT:
D:\GitHub\Java\2Arrays>javac Program05_AllPairs_EqualstoSum.java

D:\GitHub\Java\2Arrays>java Program05_AllPairs_EqualstoSum
Enter the count
5
Enter the number list
1
2
3
4
5
Enter the sum
5
array list is :
1 2 3 4 5
 The sum is5
The pair is :[1,4]
The pair is :[2,3]
The pair is :[3,2]

*/