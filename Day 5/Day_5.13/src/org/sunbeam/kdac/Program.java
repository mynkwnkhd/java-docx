package org.sunbeam.kdac;

public class Program 
{
	/*public static void print( )
	{
		try 
		{
			for( int count = 1; count <= 10; ++ count  )
			{
				System.out.println("Count	:	"+count);
				Thread.sleep(500 );
			}
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}*/
	public static void print( ) throws InterruptedException
	{
		for( int count = 1; count <= 10; ++ count  )
		{
			System.out.println("Count	:	"+count);
			Thread.sleep(500 );
		}	
	}
	public static void main(String[] args) 
	{
		Program.print();
	}
}
