/*
	6) How do you remove the elements of a LinkedList from both the ends?
		=>pollLast() and removeLast()
		=>pollFirst() and removeFirst()
		=>poll() and remove()
*/
import java.util.*;
class LinkedList6
{
	public static void main(String args[])
	{
		LinkedList<String> list=new LinkedList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");
		list.add("7");
		System.out.println(list);
		//removing elements from list at first
		list.remove();
		System.out.println(list);
		list.poll();
		System.out.println(list);
		list.pollFirst();
		System.out.println(list);
		list.removeFirst();
		
		System.out.println(list);
		//removing elements from list at end
		list.pollLast();
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
	}
}