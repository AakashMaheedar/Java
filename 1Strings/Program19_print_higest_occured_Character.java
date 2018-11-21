import java.io.*;
import java.util.*;
/*
	java program to to find the highest occured character in the string
*/
class Program19_print_higest_occured_Character
{
	public static char HighestRepChar(String word)
	{
		int highest=0;
		char ret=' ';
		char ch[]=word.toCharArray();
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		for(Character c: ch)
		{
			if(hm.containsKey(c))
			{
				hm.put(c,hm.get(c)+1);
			}	
			else
			{
				hm.put(c,1);
			}
		}
		for(Map.Entry<Character,Integer> l:hm.entrySet())
		{
			if(l.getValue() >= highest)
			{
				ret=l.getKey();
				highest=l.getValue();
			}
		}
		return ret;
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a sentence/word:");
		String word=scan.nextLine();
		System.out.println("The Highest Repeated Character "+HighestRepChar(word));
	}
}
/*
OUTPUT:
D:\GitHub\Java\1Strings>java Program19_print_higest_occured_Character
Enter a sentence/word:
aloooooong
The Highest Repeated Character o

D:\GitHub\Java\1Strings>java Program19_print_higest_occured_Character
Enter a sentence/word:
sastra
The Highest Repeated Character s

*/