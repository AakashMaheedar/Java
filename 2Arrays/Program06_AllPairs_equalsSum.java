import java.io.*;
import java.util.*;
/*
	To find pairs of int to form the given sum 
*/
class Program06_AllPairs_equalsSum
{
	public static int[] getRandom(int count)
	{
		int[] random=new int[count];
		for(int i=0;i<random.length;i++)
		{
			random[i]=(int)(Math.random()*10);
			System.out.print(random[i]+" ");
		}System.out.println(" ");
	return random;
	}
	public static void PrintPair(int random[],int count)
	{
		if(random.length < 2)
		return;
		Set set=new HashSet(random.length);
		for(int value : random)
		{
			int target=count-value;
			if(!set.contains(target))
			{
				set.add(value);
			}	
			else
			{
				System.out.printf("%d:%d %n",value,target);
			}
		}
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter count of elements in an array : ");
		int count=scan.nextInt();
		System.out.println("Enter the sum to be equated : ");
		int sum=scan.nextInt();
		PrintPair(getRandom(count),sum);
	}
}
/*
OUTpUT:
D:\GitHub\Java\2Arrays>java Program06_AllPairs_equalsSum
Enter count of elements in an array :
10
Enter the sum to be equated :
15
6 2 5 9 6 7 9 7 1 8
9:6
9:6
8:7

D:\GitHub\Java\2Arrays>java Program06_AllPairs_equalsSum
Enter count of elements in an array :
15
Enter the sum to be equated :
12
6 7 2 7 8 2 3 2 9 0 5 2 5 7 5
9:3
5:7
5:7
5:7
*/