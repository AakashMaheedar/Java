import java.util.regex.*;
import java.util.*;
/*
	JavaRegular Expression
	create a regular expression to print a alpha numeric character of length 6
*/

class Program06_to_print_alphanumberCharacter_len6
{
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a String : ");
	String name1=s.nextLine();
	System.out.println(Pattern.matches("[a-zA-Z0-9]{6}",name1));		
	
	}
}
/*
OUTPUT:
D:\GitHub\Java\1Strings>javac Program6_to_print_alphanumberCharacter_len6.java

D:\GitHub\Java\1Strings>java Program6_to_print_alphanumberCharacter_len6
Enter a number :
123456
true

D:\GitHub\Java\1Strings>java Program6_to_print_alphanumberCharacter_len6
Enter a number :
123ert
true

D:\GitHub\Java\1Strings>javac Program6_to_print_alphanumberCharacter_len6.java

D:\GitHub\Java\1Strings>java Program6_to_print_alphanumberCharacter_len6
Enter a String :
12345
false

D:\GitHub\Java\1Strings>java Program6_to_print_alphanumberCharacter_len6
Enter a String :
123456
true

D:\GitHub\Java\1Strings>java Program6_to_print_alphanumberCharacter_len6
Enter a String :
sender
true

D:\GitHub\Java\1Strings>java Program6_to_print_alphanumberCharacter_len6
Enter a String :
123ert
true

D:\GitHub\Java\1Strings>java Program6_to_print_alphanumberCharacter_len6
Enter a String :
123456qwert
false
*/