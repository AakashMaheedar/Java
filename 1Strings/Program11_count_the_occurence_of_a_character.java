import  java.util.*;
/*
Java program to count the number of occurence of character in a string.
*/
class Program11_count_the_occurence_of_a_character
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);		
		System.out.println("Enter the line");
		String word=scan.nextLine();
		char k[]=word.toCharArray();
		System.out.println("enter  a charcter");
		char ch=scan.next().charAt(0);
		int count=0;
		for(Character l:k)
		{
			if(l==ch)
				count++;	
		}
		System.out.println("The occurenece of " + ch +"  is "+count+" times");
	}
}
/*
OUTPUT:
D:\GitHub\Java\1Strings>javac Program11_count_the_occurence_of_a_character.java

D:\GitHub\Java\1Strings>java Program11_count_the_occurence_of_a_character
Enter the line
hello world!! welcome to the world of java.
enter  a charcter
o
The occurenece of o  is 6 times

*/