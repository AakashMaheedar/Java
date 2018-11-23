import java.io.*;
import java.util.*;
/*
	java program to  find first repeating element in the array
*/
class Program16_FirstRepeating_ElementinArray
{
	public static int FirstRepeatingElement(int num[])
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
			if(hm.get(no)>1)
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
	int num[]=new int[count];
	System.out.println("Array elements are generated randomly");
	for(int i=0;i<count;i++)
	{
		num[i]=(int)(Math.random()*15);
		System.out.print(num[i]+" ");
	}
	System.out.println(" " );
	System.out.println("The first repeating element in array :"+FirstRepeatingElement(num));
	
	}
}
/*
OUTPUT:
D:\GitHub\Java\2Arrays>java Program16_FirstRepeating_ElementinArray
Enter the array count :
25
Array elements are generated randomly
3 8 3 12 4 9 12 7 3 0 12 11 5 9 6 14 4 1 11 8 10 12 3 9 8
The first repeating element in array :3

D:\GitHub\Java\2Arrays>java Program16_FirstRepeating_ElementinArray
Enter the array count :
6
Array elements are generated randomly
5 13 14 13 2 0
The first repeating element in array :13

*/