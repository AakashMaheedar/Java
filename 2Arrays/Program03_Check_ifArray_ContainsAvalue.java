import java.io.*;
import java.util.*;
/*
	Program to check if array contains a value 
*/
class Program03_Check_ifArray_ContainsAvalue
{
	public static <T> boolean contains(final T array[],final T v)
	{
		for(final T e : array )
		{
			if(e==v || v!=null && v.equals(e))
			{
			return true;
			}
		}
	return false;
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a array type(String/Integer):"+"(s/i)");
		char choice=scan.next().charAt(0);
		//s-for-string handling....
		if(choice=='s')
		{
		
		System.out.println("Enter count to your String array:");
		int count=scan.nextInt();
		String[] str=new String[count];
		System.out.println("Enter inputs to your String array:");
		for(int i=0;i<str.length;i++)
		{
			str[i]=scan.next();
			
		}
		System.out.println("Enter a word to be checked if present in an array");
		String v=scan.next();
		System.out.println("The word is present in array is said to be:"+contains(str,v));	
		}	
		if(choice=='i')
		{
		
		System.out.println("Enter count to your integer array:");
		int count=scan.nextInt();
		Integer[] num=new Integer[count];
		System.out.println("Enter inputs to your integer array:");
		for(int i=0;i<num.length-1;i++)
		{
			num[i]=scan.nextInt();
		}
		System.out.println("Enter a number to be checked if present in an array");
		int v=scan.nextInt();
		System.out.println("The word is present in array is said to be:"+contains(num,v));	
		
		}
	}
} 
/*
output:
D:\GitHub\Java\2Arrays>java Program03_Check_ifArray_ContainsAvalue
Enter a array type(String/Integer):(s/i)
s
Enter count to your String array:
3
Enter inputs to your String array:
hello
hi
there
Enter a word to be checked if present in an array
there
The word is present in array is said to be:true

D:\GitHub\Java\2Arrays>java Program03_Check_ifArray_ContainsAvalue
Enter a array type(String/Integer):(s/i)
i
Enter count to your integer array:
5
Enter inputs to your integer array:
1
7
9
0
Enter a number to be checked if present in an array
7
The word is present in array is said to be:true

*/
