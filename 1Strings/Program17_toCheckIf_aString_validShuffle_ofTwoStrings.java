import java.io.*;
import java.util.*;
/*
How to check if a string is avalid shuffle of two strings
*/
class Program17_toCheckIf_aString_validShuffle_ofTwoStrings
{
	public static boolean checkIfValid(String w1,String w2,String w3)
	{
		//System.out.println(w1.length()+" "+w2.length()+" ''+w3.length());
		if(w1.length()+w2.length() != w3.length())
		{
			return false;
		}
		int i,j,k;
		i=j=k=0;
		for(k=0;k<w3.length();k++)
		{
			if(i<w1.length()&&w1.charAt(i)==w3.charAt(k))
			{
				i++;
				
			}
			else if(j<w2.length()&&w2.charAt(j)==w3.charAt(k))
			{
				j++;
			}
			else
			{
				return false;
			}
		}

		return true;
	}
	public static void main(String args[])
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter 1st word:");
	String w1=scan.nextLine();
	System.out.println("Enter 2nd word:");
	String w2=scan.nextLine();
	System.out.println("Enter combinated word:");
	String w3=scan.nextLine();
	scan.close();
	System.out.println("The interleaving is valid : "+checkIfValid(w1,w2,w3));
	}
}
/*
OUTPUT:
D:\GitHub\Java\1Strings>javac Program17_toCheckIf_aString_validShuffle_ofTwoStrings.java

D:\GitHub\Java\1Strings>java Program17_toCheckIf_aString_validShuffle_ofTwoStrings
Enter 1st word:
hello
Enter 2nd word:
world
Enter combinated word:
helloworld
The interleaving is valid : true

D:\GitHub\Java\1Strings>javac Program17_toCheckIf_aString_validShuffle_ofTwoStrings.java

D:\GitHub\Java\1Strings>java Program17_toCheckIf_aString_validShuffle_ofTwoStrings
Enter 1st word:
check
Enter 2nd word:
teck
Enter combinated word:
checkcheck
The interleaving is valid : false

*/
