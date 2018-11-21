
import java.io.*;
import java.util.*;
/*
	java code to reverse the string
	1)iterative-StringBuilder
		*convert sgring into char array	
		*print char array in reverse by using loop appending to a new string.
	2)recursive
		*base case-word length is less than 1 return word
		*recurrsive case place 
			*call recursiveFn - word.substring(1)	
			*charAt(0) at end 
*/

class Program05_Reverse_String
{
	public static String ReverseIterative(String word)
	{
		StringBuilder sb=new StringBuilder();
		char ch[]=word.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			sb.append(ch[i]);
		}
	return sb.toString();
	}
	public static String ReverseRecurrsive(String word)
	{
		if(word.length()<2)
			return word;
			
		return ReverseRecurrsive(word.substring(1))+word.charAt(0);
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		String word=scan.nextLine();
		System.out.println("Enter option a/b/c");
		char ch=scan.next().charAt(0);
		switch(ch)
		{
			case 'a':
				StringBuffer str=new StringBuffer(word);
				String rev=str.reverse().toString();
				System.out.println(rev);
				break;
			case 'b':
				System.out.println(ReverseIterative(word));
				break;
			case 'c':
				System.out.println(ReverseRecurrsive(word));
				break;
		
		}
	}
}
/*
OUTPUT:

D:\GitHub\Java\1Strings>javac Program5_Reverse_String.java

D:\GitHub\Java\1Strings>java Program5_Reverse_String
hello world!!
Enter option a/b/c
a
!!dlrow olleh

D:\GitHub\Java\1Strings>java Program5_Reverse_String
hello world
Enter option a/b/c
c
dlrow olleh
	
*/