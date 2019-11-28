package org.sunbeam.kdac;

import java.util.Scanner;

interface Collection
{
	void accept( );
	int[] toArray( );
	void print( );
	static void swap( int[] arr )
	{
		int temp = arr[ 0 ];
		arr[ 0 ] = arr[ 1 ];
		arr[ 1 ] = temp;
	}
	default void sort( )
	{
		int[] arr =  this.toArray();
		for( int i = 0; i < arr.length - 1; ++ i )
		{
			for( int j = i; j < arr.length; ++ j )
			{
				if( arr[ i ] > arr[ j ]  )
				{
					int[] temp = new int[ ] { arr[ i ], arr[ j ] };
					Collection.swap(temp);
					arr[ i ] = temp[ 0 ]; arr[ j ] = temp[ 1 ];
				}
			}
		}
	}
}
class Array implements Collection
{
	private int[] arr;
	public Array() 
	{
		this( 5 );
	}
	public Array( int size ) 
	{
		this.arr = new int[ size ];
	}
	@Override
	public void accept() 
	{
		try( Scanner sc = new Scanner(System.in))
		{
			for( int index = 0; index < this.arr.length; ++ index )
			{
				System.out.print("Enter element	:	");
				this.arr[ index ] = sc.nextInt();
			}
		}
	}
	@Override
	public int[] toArray() 
	{
		return this.arr;
	}
	@Override
	public void sort() 
	{
		System.out.println("Array.sort()");
		for( int i = 0; i < this.arr.length - 1; ++ i )
		{
			for( int  j = 0; j < this.arr.length - 1 - i; ++ j )
			{
				if( this.arr[ j ] > this.arr[ j + 1 ] )
				{
					int[] temp = new int[ ] { arr[ j ], arr[ j + 1 ]  };
					Collection.swap(temp);
					arr[ j ] = temp[ 0 ];	arr[ j + 1 ] = temp[ 1 ];
				}
			}
		}
	}
	@Override
	public void print() 
	{
		for( int index = 0; index < this.arr.length; ++ index )
			System.out.print(this.arr[ index ]+"	");
		System.out.println();
	}
}
public class Program 
{
	public static void main(String[] args) 
	{
		Collection c = new Array();
		c.accept();
		c.sort();
		c.print();
	}
}
