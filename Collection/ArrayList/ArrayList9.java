/*
	9) How do you retrieve an element from a particular position of an ArrayList?
		->get()
*/
import java.util.*;
class ArrayList9
{
	public static void main(String args[])
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		System.out.println(list.get(0));
	}
}