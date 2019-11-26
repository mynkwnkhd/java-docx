package org.sunbeam.kdac;
class Person
{
	String name = "Abc";
	int age = 23;
}
class Employee extends Person
{
	int empid = 6152;
	float salary = 45000.50f;
}
public class Program
{
	public static void main(String[] args) 
	{
		Person p = new Person();	//OK
		
		System.out.println(p.name);	//OK
		System.out.println(p.age);	//OK
		
		Employee emp = (Employee) p;	//Downcasting : ClassCastException
		
	}
	public static void main3(String[] args) 
	{
		Person p = new Employee();	//UpCasting
		
		System.out.println(p.name);	//OK
		System.out.println(p.age);	//OK
		
		Employee emp = (Employee) p;	//Downcasting
		
		System.out.println(emp.empid);	// Ok
		System.out.println(emp.salary);	// OK
	}
	public static void main2(String[] args) 
	{
		Employee emp = new Employee();
		//Person p = ( Person )emp; //Upcasting
		Person p = emp; //Upcasting
		
		System.out.println(p.name);	//OK
		System.out.println(p.age);	//OK
		//System.out.println(p.empid);	//Not Ok
		//System.out.println(p.salary);	//Not OK
	}
	public static void main1(String[] args) 
	{
		Employee emp = new Employee();
		System.out.println(emp.name);	//OK
		System.out.println(emp.age);	//Ok
		System.out.println(emp.empid);	//Ok
		System.out.println(emp.salary);	//OK
	}
}
