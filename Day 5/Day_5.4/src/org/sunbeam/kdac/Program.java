package org.sunbeam.kdac;
class Person
{
	public void showRecord( )
	{
		System.out.println("Person.showRecord");
	}
	public void printRecord( )
	{
		System.out.println("Person.showRecord");
	}
}
class Employee extends Person
{
	public void displayRecord( )
	{
		System.out.println("Employee.displayRecord");
	}
	public void printRecord( )
	{
		System.out.println("Employee.printRecord");
	}
}
public class Program
{
	public static void main(String[] args) 
	{
		Person p = new Employee(); //Upcasting
		p.printRecord();
	}
	public static void main3(String[] args) 
	{
		Person p = new Employee();	//Upcasting
		//p.showRecord(); //OK
		//p.displayRecord( ); //NOt OK
		Employee emp = (Employee) p;	//Downcasting
		emp.displayRecord(); //OK
	}
	public static void main2(String[] args) 
	{
		Employee emp = new Employee();
		emp.showRecord(); //OK
		emp.displayRecord(); //OK
	}
	public static void main1(String[] args) 
	{
		Person p = new Person();
		p.showRecord();//OK
		//p.displayRecord( );	//Not OK
	}
}
