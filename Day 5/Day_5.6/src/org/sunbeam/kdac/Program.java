package org.sunbeam.kdac;
class Employee
{
	private String name;
	private int empid;
	private float salary;
	public Employee(String name, int empid, float salary)
	{
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	}
	//Employee this = emp1
	//Object obj = emp2 //upcasting
	@Override
	public boolean equals(Object obj) 
	{
		if( obj != null )
		{
			Employee other = (Employee) obj;
			if( this.empid == other.empid )
				return true;
		}
		return false;
	}
	
}
public class Program
{
	public static void main(String[] args) 
	{
		int num1 = 10;
		int num2 = 10;
		if( num1.equals( num2 ) )
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	}
	public static void main3(String[] args) 
	{
		Employee emp1 = new Employee("Sandeep", 33, 45000);
		Employee emp2 = new Employee("Sandeep", 33, 45000);
		if( emp1.equals(emp2) )
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		//Output : Equal
	}
	public static void main2(String[] args) 
	{
		Employee emp1 = new Employee("Sandeep", 33, 45000);
		Employee emp2 = new Employee("Sandeep", 33, 45000);
		if( emp1 == emp2 )
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		//Output : Not Equal
	}
	public static void main1(String[] args) 
	{
		int num1 = 10;
		int num2 = 10;
		if( num1 == num2 )
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		//Output : Equal
	}
}
