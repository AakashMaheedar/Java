import java.io.*;
import java.util.regex.*;
import java.util.*;
/*
	Java program to demonstrate to check if a string is a 6 digit number or not.

*/
class Program09_Check_if_numberIsOf_6digit
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		//regular expression to find a enter sring is a number or not.
		/*Pattern pattern=Pattern.compile(".*[^0-9].*");
		System.out.println("Enter a text");
		String matcher=scan.nextLine();
		System.out.println("Thus the input is a number"+matcher+" "+(!pattern.matcher(matcher).matches()));
		*/
		//regular expression to find i.e the entered string is a valid 6 digit number
		Pattern pattern2=Pattern.compile("[0-9]{6}");
		System.out.println("Enter the number");
		String number=scan.nextLine();
		System.out.println("The entered number "+number +"is valid : "+ pattern2.matcher(number).matches());
	}
}
/*
OUTPUT:
D:\GitHub\Java\1Strings>javac Program9_Check_if_numberIsOf_6digit.java

D:\GitHub\Java\1Strings>java Program9_Check_if_numberIsOf_6digit
Enter the number
123456
The entered number 123456is valid : true

D:\GitHub\Java\1Strings>java Program9_Check_if_numberIsOf_6digit
Enter the number
qwer432
The entered number qwer432is valid : false

*/