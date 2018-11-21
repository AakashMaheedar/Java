import java.io.*;
import java.util.*;
/*
	Java program to count the number of vowels,constants,digits,whitespace characters
*/
class Program10_Count_vowels_constant_specialChar
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String line=s.nextLine();
		int splchar,constants,vowels,whitespace,numbers;
		splchar=constants=vowels=whitespace=numbers=0;
		line.toLowerCase();
		for(int i=0;i<line.length();i++)
		{
			char ch=line.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				{
					++vowels;
				}	
			else if(ch>='a' &&ch<='z')
				{
					++constants;
				}
			else if(ch>='0'&&ch<='9')
				{
					++numbers;
				}
			else if(ch==' ')
			{
				++whitespace;
			}
			else
			{
				++splchar;
			}
		}
			System.out.println("The enter word is "+line);
			System.out.println("No.of vowels "+vowels);
			System.out.println("No.of constants"+constants);
			System.out.println("No.of digit "+numbers);
			System.out.println("No.of space"+whitespace);
			System.out.println("No.of spl char "+splchar);	
	
	}
}
/*
OUTPUT:
D:\GitHub\Java\1Strings>javac Program10_Count_vowels_constant_specialChar.java

D:\GitHub\Java\1Strings>java Program10_Count_vowels_constant_specialChar
hello world!! welcome to worls of java.
The enter word is hello world!! welcome to worls of java.
No.of vowels 11
No.of constants19
No.of digit 0
No.of space6
No.of spl char 3


*/