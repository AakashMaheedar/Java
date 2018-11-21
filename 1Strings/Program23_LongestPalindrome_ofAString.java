import java.io.*;
import java.util.Scanner;
/*
	Java program to fing the longest length palindrome in a string
*/
class Program23_LongestPalindrome_ofAString
{
	public static String longestPalindrome(String word)
	{
		if(word.isEmpty())
		{
			return null;
		}
		if(word.length()==1)
		{
			return word;
		}
		String longest=word.substring(0,1);
		for(int i=0;i<word.length();i++)
		{
			String temp=PalindromeReturn(word,i,i);
				if(temp.length()>longest.length())
				longest=temp;
		
			temp=PalindromeReturn(word,i,i+1);
				if(temp.length()>longest.length())
				longest=temp;
		}
		return longest;
	}
	public static String PalindromeReturn(String word,int left,int right)
	{
		if(left>right)
			return null;	
		while(left>=0 && right<=word.length()-1&& word.charAt(left)==word.charAt(right))
		{
			left--;
			right++;
		}
	return word.substring(left+1,right);	
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a word : ");
		String word=scan.nextLine();
		System.out.println("The longest common subsequence "+longestPalindrome(word));
	}
}
/*
OUTPUT:
D:\GitHub\Java\1Strings>javac Program23_LongestPalindrome_ofAString.java

D:\GitHub\Java\1Strings>java Program23_LongestPalindrome_ofAString
Enter a word :
granna
The longest common subsequence anna

*/