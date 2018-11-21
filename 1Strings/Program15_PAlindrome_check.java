import java.io.*;
import java.util.*;
/*
	Java program to find whether two strings are palondrome to each other
	1)reverse the string 
		1)iteration method-reverse1
		2)recursion method-reverse2
	2)check if equal
*/
class Program15_PAlindrome_check
{
	public static String reverse1(String word)
	{
		char ch[]=word.toCharArray();
		StringBuffer sb=new StringBuffer();
		for(int i=ch.length-1;i>=0;i--)
		{
			sb.append(ch[i]);	
		}
	return sb.toString();
	}
	public static String reverse2(String word)
	{
		if(word.length()<2)
		{
			return word;
		}
		return reverse2(word.substring(1))+word.charAt(0);
	}
	public static boolean isPalindrome(String text)
	{
		String rev=reverse2(text);
		if(text.equals(rev))
		{
			return true;
		}
	return false;
	}
	public static void main(String args[])
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a word");
		String word=scan.nextLine();
		System.out.println("Entered string : "+word);
		System.out.println("Reversed string : "+reverse2(word));
		System.out.println("palindrome check : "+isPalindrome(word));	
	}
}
/*
OUTPUT:
D:\GitHub\Java\1Strings>javac Program15_PAlindrome_check.java

D:\GitHub\Java\1Strings>java Program15_PAlindrome_check
Enter a word
malayalam
Entered string : malayalam
Reversed string : malayalam
palindrome check : true

D:\GitHub\Java\1Strings>java Program15_PAlindrome_check
Enter a word
hello
Entered string : hello
Reversed string : olleh
palindrome check : false

*/