import java.io.*;
import java.util.*;
/*
	print that number that occurs only once in a set of repeated numbers..
		logic is simple
			and number Xor-ed with itself gives 0
*/
class Program12_FindThat_UnrepeatedNumber
{
	//function to find the unrepeated number..
	public static int UnrepeatedNumber(int num[])
	{
		int ans=num[0];
		for(int i=1;i<num.length;i++)
		{
			//System.out.println(ans+":"+num[i]);
			ans=ans^num[i];
			//System.out.println("......................................................"+ans);
		
		}
	return ans;
	}
	public static void main(String args[])
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the count of the array : ");
	int count=scan.nextInt();
	System.out.println("Enter the array elements : ");
	int num[]=new int[count];
	for(int i=0;i<count;i++)
	{
		num[i]=scan.nextInt();	
	}
	System.out.println("The unrepeated number is: "+UnrepeatedNumber(num));
	}
}
/*
OUTPUT:
D:\GitHub\Java\2Arrays>java Program12_FindThat_UnrepeatedNumber
Enter the count of the array :
7
Enter the array elements :
1
1
2
2
3
3
4
The unrepeated number is: 4

D:\GitHub\Java\2Arrays>java Program12_FindThat_UnrepeatedNumber
Enter the count of the array :
7
Enter the array elements :
1
1
2
2
3
4
4
The unrepeated number is: 3
*/