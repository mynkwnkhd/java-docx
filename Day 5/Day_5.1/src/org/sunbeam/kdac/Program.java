package org.sunbeam.kdac;
class Person
{
	private String name;
	private int age;
	public Person() 
	{
		//System.out.println("public Person()");
		this.name = "";
		this.age = 0;
	}
	public Person(String name, int age) 
	{
		//System.out.println("public Person(String name, int age)");
		this.name = name;
		this.age = age;
	}
	public void showRecord( )
	{
		System.out.println("Name	:	"+this.name);
		System.out.println("Age	:	"+this.age);
	}
}
class Employee extends Person
{
	private int empid;
	private float salary;
	public Employee()
	{
		//System.out.println("public Employee()");
		this.empid = 0;
		this.salary = 0;
	}
	public Employee(int empid, float salary) 
	{
		//System.out.println("public Employee(int empid, float salary) ");
		this.empid = empid;
		this.salary = salary;
	}
	public Employee(String name, int age, int empid, float salary) 
	{
		//System.out.println("public Employee(String name, int age, int empid, float salary)");
		this.empid = empid;
		this.salary = salary;
	}
	public void displayRecord( )
	{
		this.showRecord();
		System.out.println("Empid	:	"+this.empid);
		System.out.println("Salary	:	"+this.salary);
	}
}
public class Program
{
	public static void main(String[] args) 
	{
		Employee emp = new Employee( );
		emp.displayRecord();
	}
}
