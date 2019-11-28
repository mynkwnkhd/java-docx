package org.sunbeam.kdac;

@FunctionalInterface
interface Math
{
	int factorial( int number );
}
public class Program 
{
	public static void main(String[] args) 
	{
		Math m =  number -> {
			int result = 1;
			for( int count = 1; count <= number; ++ count )
				result = result * count;
			return result;
		};
		
		int result = m.factorial(5);
		System.out.println("Result	:	"+result);
	}
}
