package org.sunbeam.kdac;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Program
{
	public static void main(String[] args) 
	{
		//ArrayList<Integer> list = new ArrayList<>( );
		List<Integer> list = new ArrayList<Integer>( );	//Upcasting
		if( list instanceof ArrayList<Integer>)
		{	}
	}
	//Generic Method without generics
	public static void show( Object object )
	{
		System.out.println( object);
	}
	//Generic Method using generics
	public static <T> void display( T object )
	{
		System.out.println( object);
	}
	public static <T extends Number > void print( T object )
	{
		System.out.println( object);
	}
	public static void main1(String[] args) 
	{
		//Program.print( 'A' );	//Not OK
		Program.print( 10 );
		Program.print( 3.14 );
		//Program.print( "KDAC" );	//Not OK
		//Program.print( new Date() );	//Not OK
	}
}
