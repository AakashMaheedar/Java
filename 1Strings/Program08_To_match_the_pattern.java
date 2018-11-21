import java.util.regex.*;
import java.util.*;
import java.io.*;
/*
	regex expression to match the pattern against the string

*/
class Program08_To_match_the_pattern
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the pattern");
		Pattern ptn=Pattern.compile(scan.nextLine());
		System.out.println("Enter the text:");
		Matcher matcher=ptn.matcher(scan.nextLine());
		boolean found=false;
		while(matcher.find())
		{
			System.out.println("I found the text "+ matcher.group()+"start index : "+matcher.start()+" end index : "+matcher.end());
			found=true;
		}
		if(!found)
		{
			System.out.println("No match found");
		}
	}
}
/*
OUTPUT
D:\GitHub\Java\1Strings>javac Program8_To_match_the_pattern.java

D:\GitHub\Java\1Strings>java Program8_To_match_the_pattern
Enter the pattern
world
Enter the text:
hello world!!
I found the text worldstart index : 6 end index : 11

D:\GitHub\Java\1Strings>java Program8_To_match_the_pattern
Enter the pattern
task
Enter the text:
completing the following
No match found

*/