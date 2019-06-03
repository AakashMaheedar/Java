/*
	7) How do you get the position of a particular element in an ArrayList?
		=>indexOf()
		=>lastIndexOf()
*/
import java.io.*;
import java.util.*;
class ArrayList7
{
	public static void main(String args[])
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("c");
		list.add("c++");
		list.add("java");
		list.add("c");
		System.out.println(list.indexOf("c"));
		System.out.println(list.lastIndexOf("c"));
		
	}
}