package org.sunbeam.kdac.test;

import java.util.Scanner;

import org.sunbeam.kdac.lib.Address;
import org.sunbeam.kdac.lib.Date;
import org.sunbeam.kdac.lib.Person;

public class Program 
{
	static Scanner sc = new Scanner(System.in);
	public static void acceptRecord( Date date )
	{
		System.out.print("Day	:	");
		
		System.out.print("Month	:	");
		
		System.out.print("Year	:	");
	}
	public static void acceptRecord( Address address )
	{
		System.out.print("City Name	:	");
		
		System.out.print("State Name	:	");
		
		System.out.print("Pincode	:	");
	}
	public static void acceptRecord( Person person )
	{
		System.out.print("Name	:	");
		
		System.out.println("Enter birth date");
		
		System.out.println("Enter Address");
		
	}
	public static void printRecord( Date date )
	{
		//TODO : use toString or getter
	}
	public static void printRecord( Address address )
	{
		//TODO : use toString or getter
	}
	public static void printRecord( Person person  )
	{
		//TODO : use toString or getter
	}
	public static int menuList( )
	{
		System.out.println("0.Exit");
		System.out.println("1.Date");
		System.out.println("2.Address");
		System.out.println("3.Person");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void main(String[] args) 
	{
		int choice;
		while( ( choice = Program.menuList( ) ) != 0 )
		{
			switch( choice )
			{
			case 1:
				Date date = new Date();
				Program.acceptRecord(date);
				Program.printRecord(date);
				break;
			case 2:
				Address address = new Address();
				Program.acceptRecord(address);
				Program.printRecord(address);
				break;
			case 3:
				Person person = new Person();
				Program.acceptRecord(person);
				Program.printRecord(person);
				break;
			}
		}
	}
}
