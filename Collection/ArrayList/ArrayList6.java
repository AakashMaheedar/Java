/*
	6) How do you check whether the given element is present in an ArrayList or not?
		=>contains()
*/
import java.io.*;
import java.util.*;
class ArrayList6
{
	public static void main(String args[])
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		boolean result=list.contains("thre");
		if(result)
		{
			System.out.println("three is in the list : "+result);
		}
		else
		{
			System.out.println("three is in the list : "+result);
		}
	}
}