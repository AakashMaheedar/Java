import java.io.*;
import java.util.*;
/*
	Java program to print the permutation of the string
	Eg : xy length:2
		* hence 2! 	
		*displays xy and yx
*/
class Program14_Find_Permutation
{
	public static void Permutation(String word)
	{
		Permutation("",word);
	}
	private static void Permutation(String perm,String word)
	{	
		
		 if(word.isEmpty())
		{
			System.err.println(perm+word);
		}
		else
		{
			for(int i=0;i<word.length();i++)
			{
				Permutation(perm+word.charAt(i),word.substring(0,i)+word.substring(i+1,word.length()));
			}
		}
	}
	
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word=scan.nextLine();
		//method 1
		System.out.println("The permuation are: ");
		Permutation(word);
	}
}
/*
OUTPUT:
D:\GitHub\Java\1Strings>javac Program14_Find_Permutation.java

D:\GitHub\Java\1Strings>java Program14_Find_Permutation
Enter a word:
car
The permuation are:
car
cra
acr
arc
rca
rac

*/