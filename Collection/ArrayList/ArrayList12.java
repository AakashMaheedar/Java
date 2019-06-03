/*
	13) How do you remove an element from a particular position of an ArrayList?
	14) How do you remove the given element from an ArrayList?
	15) How do you remove all elements of an ArrayList at a time?
*/
import java.util.*;
class ArrayList12
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
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");
		System.out.println("Initial list :");
		printList(list);
		list.remove(3);   //based on index
		System.out.println("modified list -based on index :");
		printList(list);
		if(list.contains("4"))
		{
			list.remove("4");  //based on element
		}
		System.out.println("modified list -based on element:");
		printList(list);
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("5");
		list2.add("6");
		list.removeAll(list2);  //remove based on Object ... removes list 2 contents in list1
		System.out.println("modified list-remove based on Object :");
		printList(list);
		list.clear();
		System.out.println("modified list - removes all list element ");
		System.out.println("list is empty" + list.isEmpty());

	}
}