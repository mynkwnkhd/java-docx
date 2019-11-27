package org.sunbeam.kdac;

import java.util.Scanner;

public class Program
{
	static Scanner sc = new Scanner(System.in);
	public static void acceptRecord( int[] number )
	{
		System.out.print("Enter element	:	");
		number[ 0 ] = sc.nextInt();
	}
	public static void printRecord( int[] number )
	{
		System.out.println("Popped element is : "+number[ 0 ] );
	}
	public static int menuList( )
	{
		System.out.println("0.Exit");
		System.out.println("1.Push");
		System.out.println("2.Pop");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void main(String[] args) 
	{
		
		try
		{
			throw new NullPointerException("abc");
		}
		catch( NullPointerException ex )
		{
			System.out.println(ex.getMessage());
		}
		int choice;
		int[] number = new int[ 1 ];
		Stack stk = new Stack();
		while( ( choice = Program.menuList( ) ) != 0 )
		{
			try 
			{
				switch( choice )
				{
				case 1:
					Program.acceptRecord(number);
					stk.push( number[ 0 ] );
					break;
				case 2:
					number[ 0 ] = stk.peek( );
					Program.printRecord(number);
					stk.pop( );
					break;
				}
			}
			catch (StackOverflowException | StackUnderflowException e) 
			{
				System.out.println(e.getMessage());
			}
		}
	}
}
