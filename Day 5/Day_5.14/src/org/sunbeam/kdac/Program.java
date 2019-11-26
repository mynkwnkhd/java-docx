package org.sunbeam.kdac;

public class Program 
{
	public static int convert( String str )throws NumberFormatException
	{
		return Integer.parseInt(str);
	}
	public static void print( ) throws InterruptedException
	{
		for( int count = 1; count <= 10; ++ count )
		{
			System.out.println(count);
			Thread.sleep(100);
		}
	}
	public static void main(String[] args) 
	{
		try
		{
			Program.print();
			
			String str = "125";
			int number = Program.convert(str);
			System.out.println(number);
		} 
		catch (NumberFormatException | InterruptedException ex) 
		{
			System.out.println(ex.getMessage());
		}
	}
}
