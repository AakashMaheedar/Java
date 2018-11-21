import java.util.*;
import java.io.*;
/*
	Remove duplicate char in a string
*/
class Program16_Remove_duplicate_char
{
	public static String RemoveDuplicate(String word)
	{
		char ch[]=word.toCharArray();
		int i,j,index=0;
		StringBuffer str=new StringBuffer();
		for(i=0;i<ch.length;i++)
		{
			for(j=0;j<i;j++)
			{
				if(ch[i]==ch[j])
				break;
			}	if(j==i)
				str.append(ch[i]);
			
	
		}
	return str.toString();
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String word=scan.nextLine();
		System.out.println(RemoveDuplicate(word));
	}
}
/*
OUTPUT:
D:\GitHub\Java\1Strings>javac Program16_Remove_duplicate_char.java

D:\GitHub\Java\1Strings>java Program16_Remove_duplicate_char
Enter a sentence
hello world!!
helo wrd!

*/