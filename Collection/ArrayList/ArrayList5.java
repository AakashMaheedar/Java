/*
	5) How do you find out whether the given ArrayList is empty or not?
		=>isEmpty()
*/
import java.io.*;
import java.util.*;
class ArrayList5
{
	public static void main(String args[])
	{
		ArrayList<String> list=new ArrayList<String>();
		if(list.isEmpty())
		{
			System.out.println("List is Empty");
		}
		else
		{
			System.out.println("List is not Empty");
		}
	}
}