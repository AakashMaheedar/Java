/*
	Priority Queue introduction.
	=>One with the default Comparator 
	=>and another one with the customized comparator.
*/
import java.util.*;
class PriorityQueue1
{
	public static void main(String args[])
	{
		PriorityQueue<Integer> pqueue=new PriorityQueue<Integer>();
		//to add element to PriorityQueue offer()
		pqueue.offer(25);
		pqueue.offer(15);
		pqueue.offer(5);
		pqueue.offer(35);
		pqueue.offer(45);
		pqueue.offer(55);
		System.out.println(pqueue);
		//to remove elemenet from priorityqueue poll()
		pqueue.poll();
		System.out.println(pqueue);
		pqueue.poll();
		System.out.println(pqueue);
		pqueue.poll();
		System.out.println(pqueue);
		pqueue.poll();
		System.out.println(pqueue);
		pqueue.poll();
		System.out.println(pqueue);
		pqueue.poll();
		System.out.println(pqueue);
		
			
	}
}