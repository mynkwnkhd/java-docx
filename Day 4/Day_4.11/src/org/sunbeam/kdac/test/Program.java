package org.sunbeam.kdac.test;

import java.util.Scanner;

import org.sunbeam.kdac.complex.Complex;

public class Program 
{
	static Scanner sc = new Scanner(System.in);
	private static void acceptRecord(Complex complex) 
	{
		System.out.print("Real Number	:	");
		complex.setReal(sc.nextInt());
		System.out.print("Imag Number	:	");
		complex.setImag(sc.nextInt());
	}	
	private static void printRecord(Complex complex) 
	{
		System.out.println("Real Number	:	"+complex.getReal());
		System.out.println("Imag Number	:	"+complex.getImag());
	}
	public static int menuList( )
	{
		System.out.println("0.Exit");
		System.out.println("1.Accept Record");
		System.out.println("2.Print Record");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void main(String[] args) 
	{
		int choice;
		Complex complex = new Complex();
		while( ( choice = Program.menuList( ) ) != 0 )
		{
			switch( choice )
			{
			case 1:
				Program.acceptRecord( complex );
				break;
			case 2:
				Program.printRecord( complex );
				break;
			}
		}
	}
}
