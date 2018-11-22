import java.io.*;
import java.util.*;
/*
Program to find the missing number in an array
1)if one missing element
	actual_sum=(n.(n+1))/2
	missing_number=total_sum - actual_sum
*/
class Program01_To_print_the_MissingNumber
{
	public static int MissingNumbercount1(int num[],int count)
	{
		
		int total_sum=((count)*(count+1))/2;
		int actual_sum=0;
		for(int i : num)
		{
			actual_sum+=i;	
		}
	return total_sum-actual_sum;
	}
	//Missing number count is more than one..
	public static int MissingNumbercount_isMore(int num[],int count)
	{
		int misscount=count-num.length;
		BitSet bitset=new BitSet(count);
		for(int number:num)
		{
			bitset.set(number-1);
		}
		System.out.printf("The missing number in int array %s with count %d %n is",Array.toString(num),count);
		int lastMissingIndex=0;
		for(int i=0;i<misscount;i++)
		{
			lastMissingIndex=bitset.nextClearBit(lastMissingIndex);
			System.out.println(++lastMissingIndex);
		}	
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[10];
		System.out.println("Enter ur option:\n"+"option 1:if Missing no count is only 1\n"+"option 2:Missing no count is more than 1\n"+"Enter ur option");
		int choice=scan.nextInt();
		if(choice==1)
		{
		Random r=new Random();
		int except=r.nextInt(10)+1;   //to generate a random number i.e element to as missed max :10 min:1=>(10-1)+1 [1...10]
		System.out.println("Except "+except);
		
		System.out.println("Element in the array : ");
		int n=0;
		for(int i=0;i<10;i++)
		{
			n=i+1;
			if(n!=except)
				{
				arr[i]=n;
				System.out.print(arr[i]+" ");
				}
		}
		System.out.println("The missing element is : "+ MissingNumbercount1(arr,10));
		}
		if(choice==2)
		{
			Random rand=new Random();
		ArrayList<Integer> al=new ArrayList<Integer>();
		System.out.println("Enter a rand count of number to be missed:");
		int random_count=0,total_count=25;
		random_count=scan.nextInt();
		//Code snippet to generated a random set of skipping numbers
		while(al.size()<random_count)
		{
			int a=rand.nextInt(total_count)+1;
			if(!al.contains(a))
				al.add(a);
		}
		/*
		System.out.println("The missed elements");
		for(int i=0;i<al.size();i++)
		{
			System.out.print(al.get(i)+" ");
		}*/
		System.out .println("");
		int count=total_count-random_count;
		ArrayList<Integer> number=new ArrayList<Integer>();
		int i=0;
		while(number.size()<count && i<total_count)
		{
			int num=i+1;
			if(!al.contains(num))
				number.add(num);
		i++;
		}
		System.out.println("The array elements to be passed for test");
		for( i=0;i<number.size();i++)
		{
			System.out.print(number.get(i)+ " ");
		}
		System.out .println("\n Missed elements ");
		MissedoutElements(number,total_count);

		}
				
	}
}