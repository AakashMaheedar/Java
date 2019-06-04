import java.io.*;
import java.util.*;
class Pattern05
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int num=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				num=num+1;
				System.out.print(num+" ");
			}
			System.out.println();
		}
	}
}
/*
I/O
5

*/