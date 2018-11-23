import java.io.*;
import java.util.*;
/*
	Java program to find the  top two maximum number from an integer array.
*/
class Program18_TopTwoMaximum
{
	public static void TopTwoMaximum(int num[])
	{
		int max1=0;
		int max2=0;
		for(int i=0;i<num.length;i++)
		{
			if(max1<num[i])
			{
				max2=max1;
				max1=num[i];
			}
			else if(max2<num[i])
				max2=num[i];
		}
		System.out.println("the 1st maximum elements is : "+max1);
		System.out.println("the 2nd maximum elements is : "+max2);
	}
	public static void main(String args[])
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter array count : ");
	int count=scan.nextInt();
	System.out.println("Array elements are randomly generated...");
	int num[]=new int[count];
	for(int i=0;i<count;i++)
	{
		num[i]=(int)(Math.random()*15);
		System.out.print(num[i]+" ");
	}
	System.out.println(" ");
	TopTwoMaximum(num);
	}
}
/*
OUTPUT:
D:\GitHub\Java\2Arrays>javac Program18_TopTwoMaximum.java

D:\GitHub\Java\2Arrays>java Program18_TopTwoMaximum
Enter array count :
4
Array elements are randomly generated...
5 8 2 1
the 1st maximum elements is : 8
the 2nd maximum elements is : 5

D:\GitHub\Java\2Arrays>javac Program18_TopTwoMaximum.java

D:\GitHub\Java\2Arrays>java Program18_TopTwoMaximum
Enter array count :
17
Array elements are randomly generated...
10 10 5 9 8 11 4 11 10 12 13 11 6 5 2 7 10
the 1st maximum elements is : 13
the 2nd maximum elements is : 12

*/