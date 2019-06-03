/*
3) How do you join an ArrayList at the end of a LinkedList?
*/
import java.util.*;
class LinkedList3
{
	public static void main(String args[])
	{
		//Creating Linked list
		LinkedList<String> linklist=new LinkedList<String>();
		linklist.add("1");
		linklist.add("2");
		linklist.add("3");
		System.out.println(linklist);
		//Creating Array list
		ArrayList<String> arrlist=new ArrayList<String>();
		arrlist.add("4");
		arrlist.add("5");
		arrlist.add("6");
		System.out.println(arrlist);
		//combine linked list and arraylist
		linklist.addAll(arrlist);
		System.out.println(linklist);
	}
}