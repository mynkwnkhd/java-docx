package org.sunbeam.kdac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;




public class Program 
{
	static Scanner sc = new Scanner(System.in); 
	public static Employee[] getEmployees( )
	{
		Employee[] arr = new Employee[ 5 ];
		arr[ 0 ] = new Employee("Vikas",50,85000.50f);
		arr[ 1 ] = new Employee("Amol",20,80000.50f);
		arr[ 2 ] = new Employee("Prashant",10,75000.50f);
		arr[ 3 ] = new Employee("Rahul",40,70000.50f);
		arr[ 4 ] = new Employee("Sarang",30,65000.50f);
		return arr;
	}
	private static void acceptRecord(int[] empid) 
	{
		if( empid != null )
		{
			System.out.print("Enter empid	:	");
			empid[ 0 ] = sc.nextInt();
		}
	}
	private static void printRecord(Employee value)
	{
		if( value != null )
			System.out.println(value.toString());
		else
			System.out.println("Employee not found");
	}
	private static void printRecord(boolean removedStatus) 
	{
		if( removedStatus )
			System.out.println("Record is removed");
		else
			System.out.println("Record not found");
	}
	private static void printRecord(Employee[] arr) 
	{
		if( arr != null )
		{
			for (Employee emp : arr) 
				System.out.println(emp.toString());
			System.out.println();
		}
	}
	private static int menuList( )
	{
		System.out.println("0. Exit");
		System.out.println("1. Add Record");
		System.out.println("2. Find Record");
		System.out.println("3. Remove Record");
		System.out.println("4. Print Record(s)[ Sorted ]");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	private static int subMenuList( )
	{
		System.out.println("0. Exit");
		System.out.println("1. Sort By Name");
		System.out.println("2. Sort By Empid");
		System.out.println("3. Sort By Salary");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void main(String[] args) 
	{
		int choice;
		int[] empid = new int[ 1 ];
		ListTest test = new ListTest();
		//test.setEmpList(new ArrayList<Employee>());
		//test.setEmpList(new Vector<Employee>());
		test.setEmpList(new LinkedList<Employee>());
		while( ( choice = Program.menuList( ) ) != 0 )
		{
			switch( choice )
			{
			case 1:
				Employee[] employees = Program.getEmployees();
				test.addRecord( employees );
				break;
			case 2:
				Program.acceptRecord( empid );
				Employee value = test.findRecord( empid[ 0 ] );
				Program.printRecord(value);
				break;
			case 3:
				Program.acceptRecord( empid );
				boolean removedStatus = test.removeRecord( empid[ 0 ] );
				Program.printRecord(removedStatus);
				break;
			case 4:
				while( ( choice = Program.subMenuList( ) ) != 0 )
				{
					Comparator<Employee> comparator = null;
					switch( choice )
					{
					case 1:
						comparator = new SortByName();
						break;
					case 2:
						comparator = new SortByEmpid();
						break;
					case 3:
						comparator = new SortBySalary();
						break;
					}
					test.printRecord( comparator );
				}
				break;
			}
		}
	}
}
