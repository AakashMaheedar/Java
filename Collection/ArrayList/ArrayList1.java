/*
1)Explain the different ways of constructing an ArrayList?
ArrayList can be created in 3 ways.

a) ArrayList() —> It creates an empty ArrayList with initial capacity of 10.

b) ArrayList(int initialCapacity) —> It creates an empty ArrayList with supplied initial capacity.

c) ArrayList(Collection c) —> It creates an ArrayList containing the elements of the supplied collection.
*/
import java.io.*;
import java.util.*;
class ArrayList1
{
	public static void main(String args[])
	{
		ArrayList<String> list1=new ArrayList<String>();
		ArrayList<String> list2=new ArrayList<String>(10);
		ArrayList<String> list3=new ArrayList<String>(list1);
	}
}