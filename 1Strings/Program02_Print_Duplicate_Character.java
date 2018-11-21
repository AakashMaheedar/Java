import java.io.*;
import java.util.*;
/*
	java program to print the number of duplicate characters in a String.
		*two things to be done-using one static method printDupChar
		1)get character array from the string - toCharArray()
		2)use HashMap to store character and count.
*/

public class Program02_Print_Duplicate_Character
{
	public static void printDupChar(String word)
	{
		//1st objective to get the char array from the string
		char[] characters=word.toCharArray();
		//2nd objective build HashMap
		Map<Character,Integer> m=new HashMap<Character,Integer>();
		for(Character ch : characters)
			if(m.containsKey(ch))
			{
				m.put(ch,m.get(ch)+1);	
			}
			else
			{
			m.put(ch,1);
			}
		//Iterate through the HashMap to print the duplicate character.
		System.out.println("the Duplicate character in word : "+word);
		
		for(Map.Entry<Character,Integer> entry:m.entrySet())
		{
			if(entry.getValue()>1)
			{
			System.out.printf("%s : %d %n",entry.getKey(),entry.getValue());
			}
		}
	}
	public static void main(String args[])
	{
		printDupChar("aakash");
		printDupChar("sastra");
	}
	
}
/*
OUTPUT:
	D:\GitHub\Java\1Strings>javac Program02_Print_Duplicate_Character.java

	D:\GitHub\Java\1Strings>java Program02_Print_Duplicate_Character
	the Duplicate character in word : aakash
	a : 3
	the Duplicate character in word : sastra
	a : 2
	s : 2


*/
