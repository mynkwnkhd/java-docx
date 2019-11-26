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
		catch (ArithmeticException | InputMismatchException ex)
		{
			System.out.println("Inside ArithmeticException | InputMismatchException catch block");
			ex.printStackTrace();
		}
	}
}
