import java.util.*;
/*
	Book entry Example using hashmap 
*/

class Program01_Book_Entry.java

{
	int id;
	float cost;
	String author,name,publication;
	public Book(int id,String author,String name,String publication,float cost)
	{
		this.id=id;
		this.author=author;
		this.name=name;
		this.publication=publication;
		this.cost=cost;
	}
	public String toString()
	{
		return "BookTitle :"+name+" Author name: "+author+" Publication: "+ publication+" Cost : "+cost;
	}
}
class Program1_Book_Entry
{
	public static void main(String args[])
	{
		Book b1=new Book(101,"J.K.Rowling","Harry potter","WizardingWorld",600);
		Book b2=new Book(102,"J.K.Rowling","Fantastic Beast","WizardingWorld",600);
	HashMap<Integer,Book> hm=new HashMap<Integer,Book>();
	hm.put(1,b1);
	hm.put(2,b2);
	System.out.println("Printing the content og the mapping in hm map");
	for(Map.Entry<Integer,Book> map:hm.entrySet())
	{
		int key=map.getKey();
		String b=map.toString();
		System.out.println(key+" "+b);
	}
	}
}
/*
OUTPUT:
D:\GitHub\Java\1Strings>javac Program01_Book_Entry.java

D:\GitHub\Java\1Strings>java Program01_Book_Entry
Printing the content og the mapping in hm map
1 1=BookTitle :Harry potter Author name: J.K.Rowling Publication: WizardingWorld Cost : 600.0
2 2=BookTitle :Fantastic Beast Author name: J.K.Rowling Publication: WizardingWorld Cost : 600.0

*/