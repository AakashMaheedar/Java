/*
	7) How do you retrieve but not remove the elements of a LinkedList from both the ends?
		=>peek(),peekFirst(),getFirst()
		=>peekLast(),getLast()
*/
import java.util.*;
class LinkedList7
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
		System.out.println(list);
		System.out.println(list.peek());
		System.out.println(list.peekFirst());
		System.out.println(list.getFirst());
		System.out.println(list);
		System.out.println(list.peekLast());
		System.out.println(list.getLast());
	}
}