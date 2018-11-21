import java.io.*;
import java.util.*;
/*
	Java program to replace one char with another in the entire line.
		*replaceAll()
			=>String.replaceAll(String regex,String input);
	Note:
		single ' ' - is refered as character 
		double " "- is refered as String in java.
*/
class Program13_replace_a_char_with_another
{
	public static void Method1(String word,char c1,char c2)
	{
		//method1 to replace using replaceAll method - immutable
		//replacing a char by another
		System.out.println("Method1");
		String str=word.replaceAll(c1+"",c2+"");
		System.out.println("The orginal String :  "+ word);
		System.out.println("The modified String : "+str );
	}
	public static void Method2(String word,String str1,String str2)
	{
		//method1 to replace using replaceAll method - immutable
		//replacing a substring by another
		System.out.println("Method2");
		String s1=String.valueOf(str1);
		String s2=String.valueOf(str2);
		String str=word.replaceAll(s1,s2);
		System.out.println("The orginal String :  "+ word);
		System.out.println("The modified String : "+str );
	}
	public static void Method3(String word)
	{
		//method1 to replace using replaceAll method - immutable
		//replacing by regular expression 
		//replaces all whiteSpace character with %20
		System.out.println("Method3");
		String str=word.replaceAll("\\s","%20");
		System.out.println("The orginal String :  "+ word);
		System.out.println("The modified String : "+str );
	}
	
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		String word="",str1="",str2="";
		System.out.println("Enter a sentence");
		 word=scan.nextLine();
		//Method1
		System.out.println("char to be replaced");
		char c1=scan.next().charAt(0);
		
		System.out.println("char to be replace with");
		
		char c2=scan.next().charAt(0);
		
		Method1(word,c1,c2);
		//Method2
		
		System.out.println("Word to be replaced");
		str1=scan.next();
		System.out.println("Word to be replace with");
		str2=scan.next();
		scan.close();
		
		Method2(word,str1,str2);
		//Method3
		Method3(word);
				
	}
}
/*
OUTPUT:
D:\GitHub\Java\1Strings>java Program13_replace_a_char_with_another
Enter a sentence
i like apple but i like coffee more!!
char to be replaced
i
char to be replace with
u
Method1
The orginal String :  i like apple but i like coffee more!!
The modified String : u luke apple but u luke coffee more!!
Word to be replaced
like
Word to be replace with
love
Method2
The orginal String :  i like apple but i like coffee more!!
The modified String : i love apple but i love coffee more!!
Method3
The orginal String :  i like apple but i like coffee more!!
The modified String : i%20like%20apple%20but%20i%20like%20coffee%20more!!

*/