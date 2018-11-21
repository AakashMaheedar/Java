import java.io.*;
import java.util.*;
/*
	Removing a given character from the string
	
*/
class Program20_toEliminate_aChar_fromString
{
	public static String RemUnwantedChar(String word,char c)
	{
		char ch[]=word.toCharArray();
		StringBuffer sb=new StringBuffer();
		for(Character l:ch)
		{
			if(l != c)
				sb.append(l);
		}
	return sb.toString();
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a sentence : ");
		String word=scan.nextLine();
		System.out.println("Enter a char to eliminate : ");
		char c=scan.next().charAt(0);
		System.out.println("The orginal string is :"+word);
		if(word.indexOf(c)>0)
		{System.out.println("The Modified String is "+RemUnwantedChar(word,c));
		}
		else
		{	
		System.out.println("The char doesnt contain in the  string  :"+word);
		}
	}
}
/*
Output:
D:\GitHub\Java\1Strings>javac Program20_toEliminate_aChar_fromString.java

D:\GitHub\Java\1Strings>java Program20_toEliminate_aChar_fromString
Enter a sentence :
hello world
Enter a char to eliminate :
l
The orginal string is :hello world
The Modified String is heo word

*/