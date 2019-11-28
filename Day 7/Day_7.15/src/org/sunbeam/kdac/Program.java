package org.sunbeam.kdac;

@FunctionalInterface
interface Math
{
	int square( int number );
}
public class Program 
{
	public static void main(String[] args) 
	{
		//Math m = ( int number )-> number * number;
		//Math m = (  number )-> number * number;
		Math m = number -> number * number;
		int result = m.square(5);
		System.out.println("Result	:	"+result);
	}
}
