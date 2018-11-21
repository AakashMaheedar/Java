import java.util.*;
/*
	java code to display the 1st unrepeated character
	
*/
class Program04_First_Unrepeated_Character
{
	public static char firstUnRep(String word)
	{
		char ch[]=word.toCharArray();
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		for(Character c: ch)
		{
			if(hm.containsKey(c))
			{
				hm.put(c,hm.get(c)+1);
			}
			else
			{
				hm.put(c,1);
			}
		}
		for(int i=0;i<word.length();i++)   //for loop iteration used instead of mapping coz hashmap sorts the key
		{
			char cj=word.charAt(i);
			if(hm.get(cj)==1)
			{
				return cj;
			}
		}
		return 0;
	}
	public static void main(String args[])
	{
		System.out.println(firstUnRep("hheellooWoorld"));
	}
}

/*
OUTPUT
	D:\GitHub\Java\1Strings>javac Program4_First_Unrepeated_Character.java

	D:\GitHub\Java\1Strings>java Program4_First_Unrepeated_Character
	W

*/