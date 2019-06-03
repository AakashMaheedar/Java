/*
	Priority Queue introduction.
	=>One with the default Comparator   				- >PriorityQueue1.java 
	=>and another one with the customized comparator.	- >PriorityQueue2.java
*/
import java.util.*;
//Class Employee
class Employee
{
	String name;
	int salary;
	public Employee(String name , int salary)
	{
		this.name=name;
		this.salary=salary;
	}
	public String toString()
	{
		return name+" : "+salary;
	}
	
}
//class Comparator
class MyComparator implements Comparator<Employee>
{
	public int compare(Employee e1,Employee e2)
	{
		return e1.salary-e2.salary;
	}
	
}

//driver class
class PriorityQueue2
{
	public static void PrintEmp(PriorityQueue<Employee> e)
	{
		for(Employee emp : e)
		{
			System.out.println(emp);
		}
	}
	public static void main(String args[])
	{
		MyComparator comparator=new MyComparator();
		PriorityQueue<Employee> pqueue=new PriorityQueue<Employee>(7,comparator);
		pqueue.offer(new Employee("aakash1",70000));
		pqueue.offer(new Employee("aakash2",55000));
		pqueue.offer(new Employee("aakash3",60000));
		pqueue.offer(new Employee("aakash4",40000));
		pqueue.offer(new Employee("aakash5",30000));
		PrintEmp(pqueue);
		pqueue.poll();
		pqueue.poll();
		pqueue.poll();
		//pqueue.poll();
		PrintEmp(pqueue);
	}
	
}