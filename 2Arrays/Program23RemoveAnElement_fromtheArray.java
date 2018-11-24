import java.io.*;
import java.util.*;
/*
	how to remove the given element in the array
*/
class Program23RemoveAnElement_fromtheArray
{
	public static void RemoveElementinArray(int arr1[],int count,int Remove)
	{
		int flag=0,loc=0;
		for(int i=0;i<count;i++)
		{
			if(arr1[i]==Remove)
			{
				flag=1;
				loc=i;
			}
		}
		for(int i=loc+1;i<count;i++)
		{
			arr1[i-1]=arr1[i];
		}
		count=count-1;
		
		if(flag==1)
		{
		System.out.println("Element after deleting...");
		for(int i=0;i<count;i++)
		{
			System.out.print(arr1[i]+" ");
		}
			
		}
		else
		{
		System.out.println("Element not found....");
		}
		
	}
	public static void main(String args[])
	{	
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array count:");
		int count=scan.nextInt();
		System.out.println("Entet the array elements: ");
		int arr1[]=new int[count];
		for(int i=0;i<count;i++)
		{
			arr1[i]=scan.nextInt();
		}
		
		System.out.println("Array before removal");
		for(int i=0;i<count;i++)
		{
			System.out.print(arr1[i]+" ");
		}

		System.out.println("");
		System.out.println("Enter the element to be removed : ");
		int removed=scan.nextInt();
		RemoveElementinArray(arr1,count,removed);
		
	}

}

/*

D:\GitHub\Java\2Arrays>javac Program23RemoveAnElement_fromtheArray.java

D:\GitHub\Java\2Arrays>java Program23RemoveAnElement_fromtheArray
Enter the array count:
5
Entet the array elements:
10 20 30 40 50
Array before removal
10 20 30 40 50
Enter the element to be removed :
30
Element after deleting...
10 20 40 50
D:\GitHub\Java\2Arrays>java Program23RemoveAnElement_fromtheArray
Enter the array count:
5
Entet the array elements:
10 20 30 40 50
Array before removal
10 20 30 40 50
Enter the element to be removed :
10
Element after deleting...
20 30 40 50
D:\GitHub\Java\2Arrays>java Program23RemoveAnElement_fromtheArray
Enter the array count:
5
Entet the array elements:
10 20 30 40 50
Array before removal
10 20 30 40 50
Enter the element to be removed :
50
Element after deleting...
10 20 30 40
D:\GitHub\Java\2Arrays>java Program23RemoveAnElement_fromtheArray
Enter the array count:
5
Entet the array elements:
10 20 30 40 50
Array before removal
10 20 30 40 50
Enter the element to be removed :
60
Element not found....

D:\GitHub\Java\2Arrays>
*/