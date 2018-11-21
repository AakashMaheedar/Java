import java.util.regex.*;
import java.util.*;
/*
create a regular expression that accept 10 digit numeric character  starting with 7,8,9 only

*/
class Program07_phoneNumber_verification
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		String number=scan.nextLine();
		
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}",number));
	}
}
/*
OUTPUT:
D:\GitHub\Java\1Strings>javac Program7_phoneNumber_verification.java

D:\GitHub\Java\1Strings>java Program7_phoneNumber_verification
Enter a number
9123456789
true

D:\GitHub\Java\1Strings>java Program7_phoneNumber_verification
Enter a number
8123456780
true

D:\GitHub\Java\1Strings>java Program7_phoneNumber_verification
Enter a number
1234567890
false

*/