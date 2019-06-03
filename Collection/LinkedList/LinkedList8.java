/*
	8) How do you use LinkedList as Stack (LIFO)?
		=>push() , pop()
*/
import java.util.*;
class LinkedList8
{
	public static void main(String args[])
	{
		LinkedList<Integer> stack=new LinkedList<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		
	}
}