package org.sunbeam.kdac;

public class Program 
{
	public static void main(String[] args) 
	{
		Employee emp1 = new Employee("Abc", 13, 25000, 12, 8, 2001 );
		Employee emp2 = emp1.clone();
	}
}
