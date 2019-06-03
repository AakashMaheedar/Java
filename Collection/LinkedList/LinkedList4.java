/*
4) Write a Java program which implements LinkedList as a Queue (FIFO)?
Use the offer() and poll() methods which make LinkedList to work as a Queue
*/
import java.util.*;
class LinkedList4
{
	public static void main(String args[])
	{
		LinkedList<Integer> queue=new LinkedList<Integer>();
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue);
		
	}
}