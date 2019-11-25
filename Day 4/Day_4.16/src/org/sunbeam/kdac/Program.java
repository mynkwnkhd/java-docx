package org.sunbeam.kdac;

import java.util.Arrays;
import java.util.Scanner;

class Employee
{
	private String name;
	private int empid;
	private float salary;
	public Employee() 
	{	}
	public Employee(String name, int empid, float salary)
	{
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() 
	{
		return String.format("%-15s%-5d%-10.2f", this.name, this.empid, this.salary);
	}
}
public class Program 
{
	static Scanner sc = new Scanner(System.in);
	public static Employee[] getEmployees( )
	{
		Employee[] arr = new Employee[ 3 ];
		for( int index = 0; index < arr.length; ++ index )
			arr[ index ] = new Employee();
		return arr;
	}
	private static void accept(Employee emp )
	{
		if( emp != null )
		{
			System.out.print("Name	:	");
			emp.setName(sc.nextLine());
			System.out.print("Empid	:	");
			emp.setEmpid(sc.nextInt());
			System.out.print("Salary	:	");
			emp.setSalary(sc.nextFloat());
			sc.nextLine();
		}
	}
	private static void acceptRecord(Employee[] employees)
	{
		if( employees != null )
		{
			for( int index = 0; index < employees.length; ++ index )
			{
				Program.accept(employees[ index ] );
			}
		}
	}
	private static void print(Employee emp)
	{
		if( emp != null )
		{
			System.out.println(emp.toString());
		}
	}
	private static void printRecord(Employee[] employees)
	{
		if( employees != null )
		{
			for( int index = 0; index < employees.length; ++ index )
			{
				Program.print(employees[ index ] );
			}
		}
	}
	public static void main(String[] args) 
	{
		Employee[] employees = Program.getEmployees();
		Program.acceptRecord( employees );
		Program.printRecord( employees );
	}
	
}
