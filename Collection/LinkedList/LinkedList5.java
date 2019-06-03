/*
	5) How do you insert an element at the head and tail of a LinkedList?
		=>add(),addFirst(),addLast()
		=>offer(),offerFirst(),offerLast()
*/
import java.util.*;
class LinkedList5
{
	public static void main(String args[])
	{
		LinkedList<Integer> list=new LinkedList<Integer>();
		//adding using add method
		list.add(2);
		list.addFirst(1);
		list.addLast(3);
		System.out.println(list);
		LinkedList<Integer> list1=new LinkedList<Integer>();
		//adding using offer method
		list1.offer(2);
		list1.offerFirst(1);
		list1.offerLast(3);
		System.out.println(list1);
	}
}