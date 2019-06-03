/*
	2) Write a Java program to traverse the elements of a LinkedList in reverse direction?
*/
import java.util.*;
class LinkedList2
{
	public static void main(String args[])
	{
		LinkedList<String> list=new LinkedList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		Iterator<String> itr=list.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}