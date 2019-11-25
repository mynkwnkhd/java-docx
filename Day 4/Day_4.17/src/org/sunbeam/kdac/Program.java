package org.sunbeam.kdac;

public class Program 
{
	public static void swap( int[] arr )
	{
		int temp = arr[ 0 ];
		arr[ 0 ] = arr[ 1 ];   
		arr[ 1 ]  = temp;
	}
	public static void main(String[] args) 
	{
		int x = 10;
		int y = 20;
		int[] arr = new int[ ] { x, y };
		Program.swap( arr );
		x = arr[ 0 ];	y = arr[ 1 ];
		System.out.println("x	:	"+x);
		System.out.println("y	:	"+y);
	}
}
