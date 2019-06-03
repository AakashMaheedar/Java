/*
	1) Given an element, how do you find out whether that element exist in a LinkedList or not.
	If it exist retrieve the position of that element?
*/
import java.util.*;
class LinkedList1
{
	public static void main(String args[])
	{
		LinkedList<String> list=new LinkedList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		if(list.contains("3"))
		{
			System.out.println(list.indexOf("3"));
		}
	}
}