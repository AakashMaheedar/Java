import java.io.*;
import java.util.*;
/*
	FizzBuzz code
	1)if a number divisible by 15 return fizzbuzz
	2)if a number divisible by 3 return fizz
	3)if a number divisible by 5 return buzz
	4)if the number neither /3 nor /5 return the number itself
*/
class Program16_FIZZBUZZ_code
{
	public static String FizzBuzz(int number)
	{
		if(number%15==0)
			return "FizzBuzz";
		else if(number %3==0)
			return "Fizz";
		else if(number%5==0)
			return "Buzz";
		else
			return Integer.toString(number);
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		try
		{
		System.out.println("Enter a number");
		int number=scan.nextInt();
		System.out.println(FizzBuzz(number));
		}
		catch(Exception e)
		{
			System.out.println("Its not a number");
		}
	}
}
/*
OUTPUT:
D:\GitHub\Java\1Strings>javac Program16_FIZZBUZZ_code.java

D:\GitHub\Java\1Strings>java Program16_FIZZBUZZ_code
Enter a number
12345
FizzBuzz

D:\GitHub\Java\1Strings>java Program16_FIZZBUZZ_code
Enter a number
12
Fizz

D:\GitHub\Java\1Strings>java Program16_FIZZBUZZ_code
Enter a number
50
Buzz

*/