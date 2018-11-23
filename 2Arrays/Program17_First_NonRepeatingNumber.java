import java.io.*;
import java.util.*;
/*
	to print the first non repeating elements in array of the elements

*/
class Program17_First_NonRepeatingNumber
{
	public static int FirstUnRepeatedCharacter(int num[])
	{
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(Integer i : num)
		{
			if(hm.containsKey(i))
			{
				hm.put(i,hm.get(i)+1);
			}
			else
			{
				hm.put(i,1);
			}
		}
		for(int i=0;i<num.length;i++)
		{
			int no=num[i];
			if(hm.get(no)==1)
			{
				return no;
			}
		}
	return 0;
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array count : ");
		int count=scan.nextInt();
		System.out.println("Array element are generated randomnly...");
		int num[]=new int[count];
		for(int i=0;i<count;i++)
		{
			num[i]=(int)(Math.random()*15);
			System.out.print(num[i]+" ");
		}
		System.out.println(" ");
		System.out.println("The first un repeated character in the array : "+FirstUnRepeatedCharacter(num));
	}
}
/*
OUTPUT:
D:\GitHub\Java\2Arrays>javac Program17_First_NonRepeatingNumber.java

D:\GitHub\Java\2Arrays>java Program17_First_NonRepeatingNumber
Enter the array count :
19
Array element are generated randomnly...
2 14 7 0 14 3 0 8 7 1 2 0 1 1 12 12 9 4 4
The first un repeated character in the array : 3

D:\GitHub\Java\2Arrays>java Program17_First_NonRepeatingNumber
Enter the array count :
7
Array element are generated randomnly...
3 4 3 10 13 6 4
The first un repeated character in the array : 10

*/