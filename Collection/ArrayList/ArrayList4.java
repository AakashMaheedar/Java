/*
	4) How do you find the number of elements present in an ArrayList?	
		=>size()
*/
import java.io.*;
import java.util.*;
class ArrayList4
{
	public static void main(String args[])
	{
		ArrayList<String> list1=new ArrayList<String>();
		System.out.println(list1.size());
		list1.add("1");
		list1.add("2");
		list1.add("3");
		list1.add("4");
		list1.trimToSize();
		System.out.println(list1.size());
		list1.add("5");
		System.out.println(list1.size());
	}
}