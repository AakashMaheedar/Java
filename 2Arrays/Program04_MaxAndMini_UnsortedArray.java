import java.io.*;
import java.util.*;
/*
	to find the maximum and minimum value of an unsorted arra
		keep the smallest number the maximum and largest number the minimum and loop
*/
class Program04_MaxAndMini_UnsortedArray
{
	public static void MaxAndMini(int number[])
	{
		int larger=0;
		int smallest=99999;
		for(int i=0;i<number.length;i++ )
		{
			int ch=number[i];
			if( ch >larger)
				{larger=ch;}
			if ( ch <smallest)
				{smallest=ch;}
		}
		System.out.println("tme maximum number :"+ larger);
		System.out.println("tme minimum number :"+ smallest);
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a count : ");
		int count=scan.nextInt();
		int num[]=new int[count];
		System.out.println("Enter inputs to integer array : ");
		System.out.println("COunt"+count+"length"+num.length);
		for(int i=0;i<num.length;i++)
		{
			num[i]=scan.nextInt();
		}
	MaxAndMini(num);
	}
}
/*
OUTPUT:

D:\GitHub\Java\2Arrays>javac Program04_MaxAndMini_UnsortedArray.java

D:\GitHub\Java\2Arrays>java Program04_MaxAndMini_UnsortedArray
Enter a count :
5
Enter inputs to integer array :
COunt5length5
1
2
3
4
5
tme maximum number :5
tme minimum number :1

D:\GitHub\Java\2Arrays>java Program04_MaxAndMini_UnsortedArray
Enter a count :
7
Enter inputs to integer array :
COunt7length7
1
9
2
6
3
0
5
tme maximum number :9
tme minimum number :0

*/
