/*
	8) How do you convert an ArrayList to Array?
		=>toArray()
*/
import java.util.*;
class ArrayList8
{
	public static void main(String args[])
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		Object arr[]=list.toArray();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
}