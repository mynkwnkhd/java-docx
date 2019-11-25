package org.sunbeam.kdac;

public class Program 
{
	public static void main(String[] args) 
	{
		Object[] arr = new Integer[ 3 ];
		arr[ 0 ] = new Integer(10);
		arr[ 1 ] = new Integer(20);
		arr[ 2 ] = new Double(30); //ArrayStoreException
	}
	public static void main3(String[] args) 
	{
		Object[] arr = new Integer[ 3 ];
		arr[ 0 ] = new Integer(10);
		arr[ 1 ] = new Integer(20);
		arr[ 2 ] = new Integer(30);
		for (Object object : arr)	
			System.out.println(object);
	}
	public static void main2(String[] args) 
	{
		Integer[] arr = new Integer[ 3 ];
		arr[ 0 ] = new Integer(10);
		arr[ 1 ] = new Integer(20);
		arr[ 2 ] = new Integer(30);
	}
	public static void sum( int... args )
	{
		int result = 0;
		for( int element : args )
		{
			result = result + element;
		}
		System.out.println("Result	:	"+result);
			
	}
	public static void main1(String[] args) 
	{
		Program.sum( );
		Program.sum(10 );
		Program.sum(10, 20);
		Program.sum(10, 20, 30 );
		Program.sum(10, 20, 30, 40 );
		Program.sum(10, 20, 30, 40, 50  );
		Program.sum(10, 20, 30, 40, 50, 60, 70  );
		Program.sum(10, 20, 30, 40, 50, 60, 70, 80, 90, 100  );
	}
}
