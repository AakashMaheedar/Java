import java.util.*;
import java.io.*;
/*
	1)java program to convert a string to an integer
		*method1 - Integer.parseInt(String str)
		*method2 - Integer.valueOf()
	2)java program to covert an integer to string
		*method1 - using plus operator
		*method2 - String.valueOf()
*/
class Program12_Convert_intToString_and_viceVersa
{
	public static void main(String args[])
	{
		System.out.println("Conerting string to interger method1");
		Scanner scan=new Scanner(System.in);
		String word=scan.nextLine();
		int number=Integer.parseInt(word);
		System.out.println("the int format of the word is : "+number);
		//2nd method
		System.out.println("Conerting string to interger method2");
		word=scan.nextLine();
		number=Integer.valueOf(word);
		System.out.println("the int format of the word is : "+number);
		//int to String method1
		System.out.println("Converting a number to String");
		int num2=scan.nextInt();
		String word3=""+num2;
		System.out.println("The string format of the entered number is "+word3);
		//int to String method2
		System.out.println("Converting a number to String method2");
		 int num3=scan.nextInt();
		String word4=String.valueOf(num3);
		System.out.println("The string format of the entered number is "+word4);
		
	}
}
/*
OUTPUT:
D:\GitHub\Java\1Strings>javac Program12_Convert_intToString_and_viceVersa.java

D:\GitHub\Java\1Strings>java Program12_Convert_intToString_and_viceVersa
Conerting string to interger method1
12345
the int format of the word is : 12345
Conerting string to interger method2
123456789
the int format of the word is : 123456789
Converting a number to String
1234
The string format of the entered number is 1234
Converting a number to String method2
12345
The string format of the entered number is 12345

*/