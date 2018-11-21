import java.io.*;
import java.util.*;
/*
	How to check is string contains another string in JAVA
		1)boolean contains() -->text.contains("Pattern");
		2)boolean indexOf()  --> "HelloWorld".indexOf("World"); 
		3)boolean lastIndexOf()
*/
class Program18_toCheck_if_aStringASubstring_ofAnother
{
	
	public static void Method1(String word)
	{
		System.out.println("Method1");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a sentence to check if contained");

		String str=scan.nextLine();
		if(word.indexOf(str)>=0)
		{
		System.out.println("The String contains the subString is present , at index :"+word.indexOf(str)+"end index"+(word.indexOf(str)+str.length()-1) );
		}
		else
		{
			System.out.println("The String doesnt contains the subString"   );
		}
	}
	//METHOD2 ->using contains
	public static void Method2(String word)
	{
		System.out.println("Method2");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a sentence to check if contained");
		String str=scan.nextLine();
		if(word.contains(str))
		{
		System.out.println("The String contains the subString is present , at index :"+word.indexOf(str)+"end index"+(word.indexOf(str)+str.length()-1) );
		}
		else
		{
			System.out.println("The String doesnt contains the subString"   );
		}
	}

	public static void main(String args[])
	{
		//Method1 using indexOf()
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String text=scan.nextLine();
		Method1(text);
		//Method2 using Contains
		Method2(text);
	}
}
/*
OUTPUT:
D:\GitHub\Java\1Strings>javac Program18_toCheck_if_aStringASubstring_ofAnother.java

D:\GitHub\Java\1Strings>java Program18_toCheck_if_aStringASubstring_ofAnother
Enter a sentence
hello world
Method1
Enter a sentence to check if contained
hello
The String contains the subString is present , at index :0end index4
Method2
Enter a sentence to check if contained
hello
The String contains the subString is present , at index :0end index4

D:\GitHub\Java\1Strings>java Program18_toCheck_if_aStringASubstring_ofAnother
Enter a sentence
hello world
Method1
Enter a sentence to check if contained
helm
The String doesnt contains the subString
Method2
Enter a sentence to check if contained
helm
The String doesnt contains the subString

*/