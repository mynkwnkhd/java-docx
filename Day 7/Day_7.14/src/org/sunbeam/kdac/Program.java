package org.sunbeam.kdac;

@FunctionalInterface
interface Math
{
	int sum( int num1, int num2 );
}
public class Program 
{
	public static void main(String[] args) 
	{
		//int sum( int num1, int num2 );
		
		//Math m = ( int num1, int num2 )-> num1 + num2;
		//Math m = ( int x, int y )-> x + y;
		Math m = (  num1,  num2 )-> num1 + num2;
		int result = m.sum(10, 20);
		System.out.println("Result	:	"+result);
		
	}
}
