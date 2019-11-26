package org.sunbeam.kdac;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program 
{
	public static void main(String[] args) 
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Num1	:	");
			int num1 = sc.nextInt();
			System.out.print("Num2	:	");
			int num2 = sc.nextInt();
			
			int result = num1 / num2;
			System.out.println("Result	:	"+result);
		}
		catch (ArithmeticException ex)
		{
			System.out.println("Inside ArithmeticException catch block");
			//System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		catch( InputMismatchException ex )
		{
			System.out.println("Inside catch block for InputMismatchException ");
			ex.printStackTrace();
		}
	}
}
