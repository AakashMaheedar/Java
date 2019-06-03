/*
	11)How do you append an element at the end of an ArrayList?			
	12) How do you insert an element at a particular position of an 
	ArrayList
	18) How do you insert more than one element at a particular position of an ArrayList?
*/
import java.util.*;
class ArrayList11
{
	public static void printList(ArrayList<String> list)
	{
		for(String obj : list)
		{
			System.out.print(obj + " ");
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		System.out.println("initial list");
		printList(list);
		//insert an element a particular position.
		
		list.add(0,"0");
		
		//insert an element at the end of the list
		list.add("4");
		printList(list);
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("5");
		list2.add("6");
		list2.add("7");
		System.out.println("list");
		list.addAll(5,list2);
		printList(list);
	}
}