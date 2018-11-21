import java.io.*;
import java.util.*;
/*
	Java program to sort list of Strings based on length
*/
class Program22_SortingWordsOfString_basedOnLength
{
	public static void Sort(String word)
	{
		String[] splitword=word.split("\\s");
		System.out.println();
		for(int i=0;i<splitword.length;i++)
		{
			for(int j=0;j<splitword.length-i-1;j++)
			{
				if((splitword[j].length())-((splitword[j+1]).length())>0)
				{
					String temp;
					temp=splitword[j+1];
					splitword[j+1]=splitword[j];
					splitword[j]=temp;
				}
			}	
		}
		System.out.println("The Sorted string is");
		for(int i=0;i<splitword.length;i++)
		{
			System.out.println(splitword[i] +"  ");
		}
		
		
	}
	public static void main(String args[])
	{
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a sentence  :");
		String word=scan.nextLine();
		
		Sort(word);
	}
}
/*
OUTPUT:
D:\GitHub\Java\1Strings>javac Program22_SortingWordsOfString_basedOnLength.java

D:\GitHub\Java\1Strings>java Program22_SortingWordsOfString_basedOnLength
Enter a sentence  :
My name is Khan

The Sorted string is
My
is
name
Khan
*/
