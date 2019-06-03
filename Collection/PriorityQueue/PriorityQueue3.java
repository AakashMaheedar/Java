/*
	Priority Queue introduction.
	=>One with the default Comparator   				- >PriorityQueue1.java 
	=>and another one with the customized comparator.	- >PriorityQueue2.java
*/
import java.util.*;
//Class Employee
class Employee implements Comparable<Employee>
{
	String name;
	int salary;
	public int compareTo(Employee e)
{
	if(salary>e.salary)return 1;
	else if(salary<e.salary)return -1;
	else return 0;
}
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

//driver class
class PriorityQueue3
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
		
		PriorityQueue<Employee> pqueue=new PriorityQueue<Employee>();
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