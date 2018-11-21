import java.util.*;
import java.io.*;
/*
//Java program to check if two String are anagram to each other
 //eg: string1:pots<-->string2:spot

*/
public class Program03_Anagrams
{
	public static boolean isAnagram(String word1,String word2)
	{
		if(word1.length()!=word2.length())
		{
			return false;
		}
		char[] ch=word1.toCharArray();
		for(Character c:ch)
		{	
			int index=word2.indexOf(c);
			if(index!=-1)
			{
				word2=word2.substring(0,index)+word2.substring(index+1);
			}
			else
			{
				return false;
			}
		}
		return word2.isEmpty();	
	}
	public static void main(String args[])
	{
		boolean check=isAnagram("pots","spot");
		System.out.println("The given words are anagram-(pots,spot) : "+ check);
		check=isAnagram("akash","aakash");
		System.out.println("The given words are anagram(akash,aakash) : "+ check);
	
	}
}
/*
Output:
	D:\GitHub\Java\1Strings>javac Program3_Anagrams.java

	D:\GitHub\Java\1Strings>java Program3_Anagrams
	The given words are anagram-(pots,spot) : true
	The given words are anagram(akash,aakash) : false

*/