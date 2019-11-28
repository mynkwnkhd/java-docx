package org.sunbeam.kdac;

@FunctionalInterface
interface Printable
{
	void print( );
}
public class Program 
{
	public static void showRecord( )
	{
		System.out.println("Inside showRecord");
	}
	public void displayRecord( )
	{
		System.out.println("Inside displayRecord");
	}
	public static void main(String[] args) 
	{
		//Printable p = ( )->System.out.println("hello");
		//Printable p = Program::showRecord;
		
		Program program = new Program();
		Printable p = program::displayRecord;
		p.print();
	}
}
