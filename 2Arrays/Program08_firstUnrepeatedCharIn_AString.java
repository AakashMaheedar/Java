import java.util.*;
import java.io.*;
/*
	To print the first unrepeated character in a String.
*/
class Program08_firstUnrepeatedCharIn_AString
{
	public static String FirstUnrepeatedChar(String word)
	{
		char[] ch=word.toCharArray();
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		for(Character entry:ch)
		{
			if(hm.containsKey(entry))
			{
				hm.put(entry,hm.get(entry)+1);
			}
			else
			{		
				hm.put(entry,1);
			}
		}
		for(int i=0;i<word.length();i++)
		{
			char cj=word.charAt(i);
			if(hm.get(cj)==1)
			{
				return "The first Unrepeated character "+cj;
			}
		}
	return " No unrepeated character";
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a word");
		String str=scan.nextLine();
		System.out.println(FirstUnrepeatedChar(str));
	}
}
/*
OUTPUT:
D:\GitHub\Java\2Arrays>javac Program08_firstUnrepeatedCharIn_AString.java

D:\GitHub\Java\2Arrays>java Program08_firstUnrepeatedCharIn_AString
Enter a word
aakash
The first Unrepeated character k

D:\GitHub\Java\2Arrays>java Program08_firstUnrepeatedCharIn_AString
Enter a word
sastra
The first Unrepeated character t

*/