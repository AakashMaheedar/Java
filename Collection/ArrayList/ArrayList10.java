/*
	10) How do you replace a particular element in an ArrayList with the given element?
		->set()
*/
import java.util.*;
class ArrayList10
{
	public static void main(String args[])
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("1");
		list.add("5");
		list.add("6");
		System.out.println("List before update");
		for(String obj : list)
		{
			System.out.print(obj + " " );
		}
		System.out.println();
		list.set(3,"4");
		System.out.println("List after update");
		for(String obj : list)
		{
			System.out.print(obj + " " );
		}
		System.out.println();
		
	}
}